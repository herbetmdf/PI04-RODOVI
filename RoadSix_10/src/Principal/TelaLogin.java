package Principal;

import Conexao.Conexao;
import java.sql.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import Metodos.UsuarioMetodo;
import Class.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class TelaLogin extends javax.swing.JFrame {
    
    ResultSet rs = null;
    PreparedStatement pst = null;
    Connection conexao = null;
    UsuarioMetodo userMet = new UsuarioMetodo();
    Usuario userClass = new Usuario();
    
    public void logar(){
	// variavel que consulta 
	String login= "select * from USUARIO where login =? and senha =?";
	try {
            pst = conexao.prepareStatement(login); 
		pst.setString(1, username.getText());
		pst.setString(2, senha.getText());
		rs= pst.executeQuery();
		if (rs.next()){
                    TelaPrincipal1 inicio = new TelaPrincipal1();
                    inicio.setVisible(true);
                    this.dispose();
                    conexao.close();
		} else {
                    JOptionPane.showMessageDialog(null,"Usuário ou senha inválida");
		}		
	} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
	}
    }
    
    public TelaLogin() {
        initComponents();
        conexao = Conexao.conector();
        // status de conexão no canto esquedo
	if (conexao != null){ 
            status_c.setText("Conectado");
        } else {
            status_c.setText("Sem conexão");
	}
        //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        setSize(963, 640);
        setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        status_c = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechar(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("X");
        jPanel2.add(jLabel5);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(710, 110, 40, 30);

        senha.setBackground(new java.awt.Color(0, 0, 0));
        senha.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(senha);
        senha.setBounds(440, 290, 220, 30);

        username.setBackground(new java.awt.Color(0, 0, 0));
        username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(username);
        username.setBounds(440, 180, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 160, 55, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/psswd_icon.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 270, 55, 64);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                log_in(evt);
            }
        });

        jLabel3.setText("Log In");
        jPanel1.add(jLabel3);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 360, 130, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Banco de Dados:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 620, 120, 20);

        status_c.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        status_c.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(status_c);
        status_c.setBounds(150, 620, 290, 20);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/background_login.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 970, 641);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_in(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_log_in
  
        logar();
    }//GEN-LAST:event_log_in

    private void fechar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechar
        dispose();
    }//GEN-LAST:event_fechar

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel status_c;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
