package Metodos;
import Class.Veiculo;
import Conexao.Conexao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class VeiculoMetodo {
    
    Connection con = Conexao.conector();
    PreparedStatement stmt = null;
    ResultSet rs = null;
   public void adcionar(Veiculo vec) throws SQLException {
        
        try {
            stmt = con.prepareStatement("INSERT INTO VEICULO (id,Placa,motorista,modelo,dataCompra,qtdPoltrona) VALUES(?,?,?,?,?,?)");
            stmt.setInt(1,vec.getNumero());
            stmt.setString(2, vec.getPlaca());
            stmt.setString(3, vec.getMotorista() );
            stmt.setString(4, vec.getModelo());
            stmt.setString(5, vec.getDataCompra());
            stmt.setInt(6, vec.getQtdPoltronas());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
       // finally{
         //   con.close();
        //}
        
    } 
    public void excluir(Veiculo vec){
            String del= "delete from VEICULO where id=?";
            try {
                stmt=con.prepareStatement(del);
                stmt.setInt(1, vec.getNumero());
                stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Veiculo apagado");
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,"Esse usuario não existe ");
            }
        }
    public void consultar(Veiculo vec){
        String consult = "select * from VEICULO where id =? ";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setInt(1, vec.getNumero());
            rs= stmt.executeQuery();
	    if(rs.next()){
                vec.setPlaca(rs.getString(2));
		vec.setMotorista(rs.getString(3));
		vec.setModelo(rs.getString(4));
		vec.setDataCompra(rs.getString(5));
		vec.setPol(rs.getString(6));
            } else {
                vec.setPlaca(null);
		vec.setMotorista(null);
		vec.setModelo(null);
		vec.setDataCompra(null);
		vec.setPol(null);
                JOptionPane.showMessageDialog(null,"Esse usuario não existe");
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null,e); 
        }
    }
    public void atualizar(Veiculo vec){
		
        try {
            stmt = con.prepareStatement("UPDATE VEICULO set Motorista=? where id =?");
            stmt.setInt(2, vec.getNumero());
            stmt.setString(1, vec.getMotorista());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }	
        
    }
    public void consultarId(Veiculo vec) throws SQLException{
        String consult = "SELECT * FROM `VEICULO` WHERE Id=(SELECT max(Id) FROM VEICULO) ";
        try {
            stmt=con.prepareStatement(consult);
            rs = stmt.executeQuery();
            if(rs.next()){
                vec.setNumero(rs.getInt(1));
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null," Veiculo não cadastrado no sistema!"); 
        }finally{
            stmt.close();
            rs.close();			
        }
    }
    public void consultarPlaca(Veiculo vec){
        String consult = "select * from VEICULO where Placa =? ";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setString(1, vec.getPlaca());
            rs= stmt.executeQuery();
	    if(rs.next()){
		vec.setQtdPoltronas(rs.getInt(6));
            } else {
                JOptionPane.showMessageDialog(null,"Esse veiculo não existe");
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null,e); 
        }
    }
    
}

	

