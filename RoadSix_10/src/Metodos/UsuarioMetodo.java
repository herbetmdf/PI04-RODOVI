package Metodos;
import Conexao.Conexao;
import Class.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UsuarioMetodo {
    
        Connection con = Conexao.conector();
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
    // Metodo Logar Ok
    public boolean logar(String nome, String senha) throws SQLException {

        boolean aces = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE login= ? and senha= ?");
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                
                aces = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioMetodo.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            stmt.close();
            rs.close();			
        }
            return aces;
    }
    //Metodo Adcionar Ok
    public void adcionar(Usuario user) throws SQLException {
        
        try {
            stmt = con.prepareStatement("INSERT INTO USUARIO (nome,cargo,login,senha,email)VALUES(?,?,?,?,?)");
            stmt.setString(1,user.getNome() );
            stmt.setString(2, user.getCargo());
            stmt.setString(3, user.getLogin() );
            stmt.setString(4, user.getSenha() );
            stmt.setString(5, user.getEmail());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
     			
        } 
        
    }
    //Metodo excluir Ok
    public void excluir(Usuario user) throws SQLException{

            String del= "delete from USUARIO where nome=?";
            try {
                stmt=con.prepareStatement(del);
                stmt.setString(1, user.getProcura());
                stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Usuario apagado");
                  
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,e);
            		
        }
        }
    // Metodo para consulta Ok
    public void consultar(Usuario user) throws SQLException{
        String consult = "select * from USUARIO where nome =? ";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setString(1, user.getProcura());
            stmt.executeQuery();
            rs = stmt.executeQuery();
            if(rs.next()){
                user.setNome(rs.getString(1));
                user.setCargo(rs.getString(2));
                user.setLogin(rs.getString(3));
                user.setEmail(rs.getString(5));
               
            } else {
                user.setNome(null);
                user.setCargo(null);
                user.setLogin(null);
                user.setEmail(null);
                JOptionPane.showMessageDialog(null,"Esse usuario não existe");
            }
            
        } catch (SQLException e) {

        }
    }
    // Metodo atualizar Ok
    public void atualizar(Usuario user) throws SQLException {
        try {
            stmt = con.prepareStatement("UPDATE USUARIO set nome=?, cargo=?, login=?, email=? where nome=?");
            stmt.setString(1, user.getNome());
            stmt.setString(2, user.getCargo() );
            stmt.setString(3, user.getLogin() );
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getProcura());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        }
    }
    
}
    
    

