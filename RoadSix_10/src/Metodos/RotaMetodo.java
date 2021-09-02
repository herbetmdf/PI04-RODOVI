package Metodos;

import Class.Rota;
import Class.Veiculo;
import Conexao.Conexao;
//import com.oracle.jrockit.jfr.DataType;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class RotaMetodo {
    Connection con = Conexao.conector();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    public void adcionarRota(Rota ro) {
        
        try {
            stmt = con.prepareStatement("INSERT INTO ROTA (Origem,Destino,placa,Poltrona,Data,Hora,valor,Vendadispo) VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1,ro.getOrigem());
            stmt.setString(2,ro.getDestino());
            stmt.setString(3,ro.getPlaca());
            stmt.setInt(4,ro.getPoltrona());
            stmt.setString(5,ro.getData());
            stmt.setString(6, ro.getHora()); 
            stmt.setDouble(7,ro.getValor());
            stmt.setInt(8,ro.getPoltrona());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } 
        
    } 
    public void excluirRota(Rota ro){
            String del= "delete from ROTA where id=?";
            try {
                stmt=con.prepareStatement(del);
                 stmt.setString(1,ro.getId());
                stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Veiculo apagado");
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,e);
            }
        }
    public void consultarRota(Rota ro){
        String consult = "SELECT * FROM ROTA WHERE Origem = ? AND Destino = ? AND Data= ?";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setString(1,ro.getOrigem());
            stmt.setString(2,ro.getDestino());
            stmt.setString(3,ro.getDataviagem());
            rs= stmt.executeQuery();
	    if(rs.next()){
                ro.setId(String.valueOf(rs.getInt(1)));
                ro.setOrigem(rs.getString(2));
                ro.setDestino(rs.getString(3));
                ro.setPlaca(rs.getString(4));
                ro.setData(rs.getString(6));
                ro.setHora(rs.getString(7));
                ro.setValor(rs.getDouble(8));
                ro.setPoltronaV(rs.getInt(9));
                ro.setPoltronaD( rs.getInt(10));
            } else {
                ro.setOrigem(null);
                ro.setDestino(null);
                ro.setPlaca(null);
                ro.setData(null);
                ro.setHora(null);
                ro.setValor(null);
                ro.setPoltronaV(0);
                ro.setPoltronaD(0);
                JOptionPane.showMessageDialog(null,"Não consta rota Para essa data!");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e); 
        }
    }
    public void atualizarRota(Rota ro){
		
        try {
            stmt = con.prepareStatement("UPDATE ROTA set Poltronav=?, Vendadispo=? where Id=?");
            stmt.setInt(1,ro.getPoltronaV());
            stmt.setInt(2,ro.getPoltronaD());
            stmt.setInt(3, Integer.valueOf(ro.getId()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }	
        
    }
}
