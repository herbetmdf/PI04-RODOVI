package Metodos;

import Class.Relatorio;
import Conexao.Conexao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class RelatorioMetodo {
    
    Connection con = Conexao.conector();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    List<Relatorio> rela = new ArrayList<>();
    Relatorio reu= new Relatorio();
    
    public List<Relatorio> Relatorioss() {
        List<Relatorio> relatorios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM `PASSAGEM` WHERE `dataSaida` BETWEEN =? AND =? ");
            stmt.setDate(1, Date.valueOf(reu.getDataI()));
            stmt.setDate(2, Date.valueOf (reu.getDataF()));
            rs = stmt.executeQuery();
            while (rs.next()) {
                Relatorio relatorio =new Relatorio();
                
                relatorio.setId(rs.getInt("Id"));
                relatorio.setData(rs.getDate("dataSaida"));
                relatorio.setCidadeDestino(rs.getString("cidadeDestino"));
                relatorio.setValor(rs.getDouble("valorPassagem"));
                relatorios.add(relatorio);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return relatorios;

    }
    
        public void soma() throws SQLException {
   
        try {
            stmt = con.prepareStatement("SELECT sum(valorPassagem)FROM `PASSAGEM` WHERE `dataSaida` BETWEEN ? AND ?");
            stmt.setDate(1, Date.valueOf(reu.getDataI()));
            stmt.setDate(2, Date.valueOf (reu.getDataF()));
            rs = stmt.executeQuery();
            while (rs.next()) {
                reu.setValorToatl(rs.getDouble(1));
            }   

        } catch (SQLException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
        }

    }

 
    

	

}
