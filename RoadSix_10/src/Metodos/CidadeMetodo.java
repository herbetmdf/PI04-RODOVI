
package Metodos;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Class.Cidade;

   
public class CidadeMetodo {
        Connection con = Conexao.conector();
        PreparedStatement stmt = null;
        ResultSet rs = null;
    
    public void adcionar(Cidade city) throws SQLException {  
	    String add = "INSERT INTO CITY (nomeCidade,idCidade,uf) VALUES(?,?,?)";
        try {
            stmt = con.prepareStatement(add);
            stmt.setString(1, city.getNomeCidade() );
            stmt.setString(2, city.getIdCidade());
            stmt.setString(3, city.getUf());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            stmt.close();
            rs.close();			
        }      
    } 
    
    public void excluir(Cidade city)throws SQLException{

            String del= "delete from CITY where idCidade=?";
            try {
                stmt=con.prepareStatement(del);
                stmt.setString(1, city.getIdCidade());
                stmt.executeUpdate();
                        JOptionPane.showMessageDialog(null," Usuario apagado");
                  
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,e);
            }finally{
            stmt.close();
            rs.close();			
		} 
	}
    
    public void consultar(Cidade city) throws SQLException{
        String consult = "select * from CITY where idCidade=? ";
        try {
            stmt=con.prepareStatement(consult);
            stmt.setString(1, city.getIdCidade());
            rs=stmt.executeQuery();
            if(rs.next()){
               city.setNomeCidade(rs.getString(1));
	       city.setIdCidade(rs.getString(2));
	       city.setUf(rs.getString(3));
            } else {
               city.setNomeCidade(null);
	       city.setIdCidade(null);
	       city.setUf(null);
              
                JOptionPane.showMessageDialog(null,"Esta cidade não existe");
            }
        } catch (SQLException e) {
           		
        } 
    }
 
    public void alterar (Cidade cit)throws SQLException{
        String altera= " update CITY set nomeCidade=?,idCidade=?,uf=? where idCidade=?";
        
	try {
            stmt=con.prepareStatement(altera);
            stmt.setString(1,cit.getNomeCidade());
	    stmt.setString(2,cit.getIdCidade());
            stmt.setString(3,cit.getUf());
	    stmt.setString(4,cit.getIdCidade());
            stmt.executeUpdate();	
           JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }    
}
/**
// Metodo para consulta Ok
    private void consulta(){
        Conexao.conector();
	String consult= "select *  from CIDADE  where idCidade =? ";
	try {
            pst=conexao.prepareStatement(consult);
            pst.setString(1,user.getIdCidade());
            rs = pst.executeQuery();
            if (rs.next()){
		user.setIdCidade(rs.getString(1));
		user.setNomeCidade(rs.getString(2));
		user.setUf(rs.getString(3));
		
		} else {
                    JOptionPane.showMessageDialog(null," Veiculoo não localizado!");
		}
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);
	}
	}
// Metodo para adcionar Ok
    private void adcionar(){
        Conexao.conector();
        String add= " insert into CIDADE (nomeCidade,idcidade,uf) VALUES (?,?,?)";
        try {
            pst=conexao.prepareStatement(add);
            pst.setString(1,user.getNomeCidade());
            pst.setString(2,user.getIdCidade());
            pst.setString(3,user.getUf());
           
            int addd = pst.executeUpdate();
            if(addd >0){
                JOptionPane.showMessageDialog(null," Cidade cadastrada!");
		user.setNomeCidade(null);
		user.setIdCidade(null);
		user.setUf(null);
		
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Cidade já existe");
        }
	}
// Metodo para altera rOk
    private void alterar(){
        Conexao.conector();
        String alterar= " update CIDADE set nomeCidade=?,idCidade=?,uf=? where nomeCidade=?";
        try {
            pst=conexao.prepareStatement(alterar);
            pst.setString(1,user.getIdCidade());
            pst.setString(2,user.getNomeCidade());
            pst.setString(3,user.getUf());
            int alt = pst.executeUpdate();	
            if(alt>0){
                JOptionPane.showMessageDialog(null," Cidade alterada!");
                user.setIdCidade(null);
                user.setNomeCidade(null);
                user.setUf(null);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Cidade não alterada");
        }
    }
// Metodo para excluir Ok
    private void excluir(){
        Conexao.conector();
        int confirmar = JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir esse usuario ? ","Atenção!!!", JOptionPane.YES_NO_OPTION );
        if(confirmar == JOptionPane.YES_NO_OPTION){
            String del= "delete from CIDADE where idCidade=?";
            try {
                pst=conexao.prepareStatement(del);
                pst.setString(1, user.getUf());
                int ex = pst.executeUpdate();
                if(ex>0){
                    JOptionPane.showMessageDialog(null," Usuario apagado");
                }
            } catch (SQLException e) {
                JOptionPane.showConfirmDialog(null,"Esse usuario não existe ");
            }
        }
    }**/
