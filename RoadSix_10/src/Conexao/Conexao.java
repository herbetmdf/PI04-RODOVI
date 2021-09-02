package Conexao;
import java.sql.*;
public class Conexao {
	// metodo de conecção com o cbanco de dados 
	public  static Connection conector(){
		java.sql.Connection conexao = null;
		// Chama o driver de conecção 
		String driver = "com.mysql.cj.jdbc.Driver";
		
		// Armazenando informaçao do banco de dados
		String url = "jdbc:mysql://187.73.58.186:3306/rodoviaria";
		
		//nome de um usuário de seu BD
		String user = "jaikon";  
		
		//sua senha de acesso
		String password = "2203jaikoN";
		
		// conecção com o banco 
		try {
		Class.forName(driver);
		conexao = DriverManager.getConnection(url, user, password);
		return  conexao;
		} catch (ClassNotFoundException | SQLException e) {
			System.out.print(e);
			return null;
		}
                
	} 
        
}
