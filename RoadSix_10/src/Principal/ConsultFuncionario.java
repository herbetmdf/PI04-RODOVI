package Principal;
import Class.Usuario;
import Conexao.Conexao;
import Metodos.UsuarioMetodo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsultFuncionario extends javax.swing.JInternalFrame {
    Usuario user = new Usuario();
    UsuarioMetodo user_metodo = new UsuarioMetodo();
    
    private static ConsultFuncionario instancia = null;
    
    public ConsultFuncionario() {
        initComponents();
        conexao = Conexao.conector();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(150, 100);
    }
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static ConsultFuncionario getInstancia() {
        if(instancia == null) {
            instancia = new ConsultFuncionario();
        }
        return instancia;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ShowCargo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        procuraNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        excluirFuncionario = new javax.swing.JButton();
        procurar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ShowNome = new javax.swing.JTextField();
        ShowLogin = new javax.swing.JTextField();
        ShowEmail = new javax.swing.JTextField();

        ShowCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Sem Cargo)", "Adminstrador", "Técnico de TI", "Vendedor", "Motorista" }));
        ShowCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowCargoActionPerformed(evt);
            }
        });

        jLabel2.setText("Pesquisar nome:");

        jLabel3.setText("Cargo:");

        jLabel4.setText("Login:");

        jLabel5.setText("E-mail:");

        procuraNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome:");

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar(evt);
            }
        });

        excluirFuncionario.setText("Excluir");
        excluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluir(evt);
            }
        });

        procurar.setText("Pesquisar");
        procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procurarNome(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        ShowNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(procuraNome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(procurar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ShowNome)
                            .addComponent(ShowLogin)
                            .addComponent(ShowEmail)
                            .addComponent(ShowCargo, 0, 210, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(excluirFuncionario))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cancelar)
                                .addGap(44, 44, 44)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(procuraNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(procurar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1)
                    .addComponent(excluirFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ShowCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ShowLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ShowEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancelar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarNome

        user.setProcura(procuraNome.getText());
        try {
            user_metodo.consultar(user);
            ShowNome.setText(user.getNome());
            ShowCargo.setSelectedItem(user.getCargo());
            ShowLogin.setText(user.getLogin());
            ShowEmail.setText(user.getEmail());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_procurarNome

    private void excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir
        try {
            user_metodo.excluir(user);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_excluir
    
    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        if(ShowNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Esse usuario não existe");
        } else {
            user.setProcura(procuraNome.getText());
        user.setNome(ShowNome.getText());
        user.setCargo((String)ShowCargo.getSelectedItem());
        user.setLogin(ShowLogin.getText());
        user.setEmail(ShowEmail.getText());
            try {
                user_metodo.atualizar( user);
            } catch (SQLException ex) {
                Logger.getLogger(ConsultFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_editar

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        procuraNome.setText(null);
        ShowNome.setText(null);
        ShowCargo.setSelectedItem(null);
        ShowLogin.setText(null);
        ShowEmail.setText(null);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

        private void ShowCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCargoActionPerformed
                //Esta função não faz nada, mas por algum motivo, remove-la
                //ou comenta-la faz o programa não abrir mais e eu não sei o
                //porquê
        }//GEN-LAST:event_ShowCargoActionPerformed

    private void ShowNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowNomeActionPerformed

    private void procuraNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procuraNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JComboBox<String> ShowCargo;
    private javax.swing.JTextField ShowEmail;
    private javax.swing.JTextField ShowLogin;
    private javax.swing.JTextField ShowNome;
    private javax.swing.JButton excluirFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField procuraNome;
    private javax.swing.JButton procurar;
    // End of variables declaration//GEN-END:variables
}
