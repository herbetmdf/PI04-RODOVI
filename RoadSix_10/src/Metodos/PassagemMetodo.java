package Metodos;

import Class.Passagem;
import Conexao.Conexao;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class PassagemMetodo {
   
    Connection con = Conexao.conector();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    
// Metodo para adcionar Ok
    public void venda( Passagem ven) throws SQLException {
        try {
            stmt = con.prepareStatement("INSERT INTO PASSAGEM (Nome,CPF,veiculo,poltrona,dataSaida,horaSaida,cidadeOrigem,cidadeDestino,valorPassagem)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,ven.getNome());
            stmt.setString(2, ven.getCpf());
            stmt.setString(3, ven.getVeiculo() );
            stmt.setInt(4, ven.getPoltrona());
            stmt.setString(5, ven.getDataSaida());
            stmt.setString(6,ven.getHoraSaida());
            stmt.setString(7, ven.getCidadeOrigem());
            stmt.setString(8, ven.getCidadeDestino());
            stmt.setFloat(9, ven.getValorPassagem());
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Venda efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Venda não pode ser feita devido "+ex);
        } 
    } 
// Metodo para excluir Ok
    public void excluir(Passagem ven) throws SQLException{
            String del= "delete from PASSAGEM where id=?";
            try {
                stmt=con.prepareStatement(del);
                stmt.setInt(1, ven.getIdPassagem());
                stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Passagem apagada!");
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,"Esse passagem não existe!");
            }finally{
            stmt.close();
            rs.close();			
        }
        }
// Metodo para consulta Ok
    public void consultar(Passagem ven) throws SQLException{
        String consult = "select * from PASSAGEM where Id =? ";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setInt(1, ven.getIdPassagem());
            rs = stmt.executeQuery();
            if(rs.next()){
                ven.setNome(rs.getString(2));
                ven.setCpf(rs.getString(3));
                ven.setVeiculo(rs.getString(4));
                ven.setPoltrona(rs.getInt(5));
                ven.setDataSaida(String.valueOf(rs.getDate(10)));
                ven.setHoraSaida(rs.getString(6));
                ven.setCidadeOrigem(rs.getString(7));
                ven.setCidadeDestino(rs.getString(8));
                ven.setValorPassagem(rs.getFloat(9));
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null," Veiculo não cadastrado no sistema!"); 
        }finally{
            stmt.close();
            rs.close();			
        }
    }
    public void consultarId(Passagem ven) throws SQLException{
        String consult = "SELECT * FROM `PASSAGEM` WHERE Id=(SELECT max(Id) FROM PASSAGEM) ";
        try {
            stmt=con.prepareStatement(consult);
            rs = stmt.executeQuery();
            if(rs.next()){
                ven.setIdPassagem(rs.getInt(1));
            }
            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null," Veiculo não cadastrado no sistema!"); 
        }finally{
            stmt.close();
            rs.close();			
        }
    }
    public void atualizar(Passagem ven) throws SQLException {
        try {
            stmt = con.prepareStatement("UPDATE USUARIO set Nome=?,CPF=?,veiculo=?,poltrona=?,dataSaida=?,horaSaida=?,cidadeOrigem=?,cidadeDestino=?,valorPassagem=?");
            stmt.setString(1,ven.getNome());
            stmt.setString(2, ven.getCpf());
            stmt.setString(3, ven.getVeiculo() );
            stmt.setInt(4, ven.getPoltrona());
            stmt.setString(5,  ven.getDataSaida());
            stmt.setString(6,ven.getHoraSaida());
            stmt.setString(7, ven.getCidadeOrigem());
            stmt.setString(8, ven.getCidadeDestino());
            stmt.setFloat(9, ven.getValorPassagem());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }finally{
            stmt.close();
            rs.close();			
        } 
    }
}

