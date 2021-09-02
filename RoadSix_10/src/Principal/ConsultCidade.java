package Principal;
import Class.Cidade;
import Metodos.CidadeMetodo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConsultCidade extends javax.swing.JInternalFrame {
	Cidade city = new Cidade();
	CidadeMetodo cityM = new CidadeMetodo();
	
        
    private static ConsultCidade instancia = null;
    
    public ConsultCidade() {
        initComponents();
      
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(150, 100);
    }
	
    
    public static ConsultCidade getInstancia() {
        if(instancia == null) {
            instancia = new ConsultCidade();
        }
        return instancia;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        procuraNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        ShowADM = new javax.swing.JLabel();
        editar = new javax.swing.JButton();
        excluirFuncionario = new javax.swing.JButton();
        procurar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        ShowNome = new javax.swing.JTextField();
        quant = new javax.swing.JLabel();
        ShowLogin1 = new javax.swing.JLabel();
        ShowLogin = new javax.swing.JLabel();
        ShowEmail = new javax.swing.JLabel();
        ShowNome1a = new javax.swing.JTextField();
        uf_edit = new javax.swing.JComboBox<>();

        jLabel2.setText("Pesquisar Sigla:");

        jLabel3.setText("Sigla Cidade:");

        jLabel4.setText("UF:");

        procuraNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Nome Cidade:");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
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

        ShowLogin.setToolTipText("");

        uf_edit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "TO" }));
        uf_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uf_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(83, 83, 83)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(quant)
                                                .addGap(41, 41, 41)
                                                .addComponent(ShowADM))
                                            .addComponent(ShowEmail)
                                            .addComponent(ShowNome, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(excluirFuncionario))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Cancelar)
                                                .addGap(45, 45, 45))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ShowNome1a, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ShowLogin1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(uf_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(ShowLogin))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(procuraNome, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(procurar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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
                    .addComponent(editar)
                    .addComponent(excluirFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ShowLogin1)
                    .addComponent(ShowNome1a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ShowLogin)
                    .addComponent(uf_edit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ShowEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ShowADM)
                            .addComponent(quant))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Cancelar)
                        .addGap(0, 29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarNome

	    try {
		city.setIdCidade(procuraNome.getText());
		cityM.consultar(city);
	
	    } catch (Exception exx) {
		
	    }
		ShowNome.setText(city.getNomeCidade());
		ShowNome1a.setText(city.getIdCidade());
		uf_edit.setSelectedItem(city.getUf());
                //ShowNome2.setText(city.getUf());
    }//GEN-LAST:event_procurarNome

    private void excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir
	    city.setIdCidade(procuraNome.getText());
		try {
			cityM.excluir(city);
		} catch (SQLException ex) {
			Logger.getLogger(ConsultCidade.class.getName()).log(Level.SEVERE, null, ex);
		}
    }//GEN-LAST:event_excluir
    
    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        
	
	if(ShowNome1a.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Esta cidade não existe");
        } else {
		try {
			city.setNomeCidade(ShowNome.getText());
			city.setIdCidade(ShowNome1a.getText());
			city.setUf((String) uf_edit.getSelectedItem());
			cityM.alterar(city);
		} catch (SQLException ex) {
			Logger.getLogger(ConsultCidade.class.getName()).log(Level.SEVERE, null, ex);
		}	
        }
    }//GEN-LAST:event_editar

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
      
        ShowNome.setText(null);
        ShowNome1a.setText(null);
	uf_edit.setSelectedItem(null);
	procuraNome.setText(null);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

        private void procuraNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraNomeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_procuraNomeActionPerformed

    private void uf_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uf_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uf_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel ShowADM;
    private javax.swing.JLabel ShowEmail;
    private javax.swing.JLabel ShowLogin;
    private javax.swing.JLabel ShowLogin1;
    private javax.swing.JTextField ShowNome;
    private javax.swing.JTextField ShowNome1a;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluirFuncionario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField procuraNome;
    private javax.swing.JButton procurar;
    public javax.swing.JLabel quant;
    private javax.swing.JComboBox<String> uf_edit;
    // End of variables declaration//GEN-END:variables
}
