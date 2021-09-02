package Principal;
import Class.Veiculo;

import Conexao.Conexao;

import Metodos.VeiculoMetodo;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultVeiculo extends javax.swing.JInternalFrame {
    
	Veiculo vei = new Veiculo();
	VeiculoMetodo vecM = new VeiculoMetodo();
	Connection conexao = null;
	Connection con = Conexao.conector();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
    private static ConsultVeiculo instancia = null;
    
    public ConsultVeiculo() {
        initComponents();
        conexao = Conexao.conector();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(150, 100);
        FillcomboMotorista();
    }
    
    
    public static ConsultVeiculo getInstancia() {
        if(instancia == null) {
            instancia = new ConsultVeiculo();
        }
        return instancia;
    }
    
    public void FillcomboMotorista(){
        try{
            stmt = con.prepareStatement("SELECT * FROM USUARIO WHERE cargo = 'Motorista' ");
            rs = stmt.executeQuery();
            while(rs.next()){
                String nameMoto = rs.getString("nome");
                cbMotorista.addItem(nameMoto);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        procuraNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        ShowADM = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        excluirFuncionario = new javax.swing.JButton();
        procurar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quant = new javax.swing.JLabel();
        ShowLogin1 = new javax.swing.JLabel();
        ShowLogin = new javax.swing.JLabel();
        ShowEmail = new javax.swing.JLabel();
        cbMotorista = new javax.swing.JComboBox<>();

        jLabel2.setText("Pesquisar Veiculo (Id):");

        jLabel3.setText("Placa:");

        jLabel4.setText("Modelo:");

        jLabel5.setText("Data Compra:");

        procuraNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procuraNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Motorista:");

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

        jLabel1.setText("Quantidade Poltrona:");

        ShowLogin.setToolTipText("");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ShowLogin1)
                                    .addComponent(ShowLogin)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(quant)
                                                .addGap(41, 41, 41)
                                                .addComponent(ShowADM))
                                            .addComponent(ShowEmail))
                                        .addGap(210, 210, 210))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(83, 83, 83)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(excluirFuncionario))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(Cancelar)
                                        .addGap(48, 48, 48)))))))
                .addContainerGap(50, Short.MAX_VALUE))
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
                    .addComponent(jLabel6)
                    .addComponent(jButton1)
                    .addComponent(excluirFuncionario)
                    .addComponent(cbMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ShowLogin1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ShowLogin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ShowEmail))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ShowADM)
                    .addComponent(Cancelar)
                    .addComponent(quant))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procurarNome(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procurarNome
        //vei.setMotorista(null);
	//vei.setPlaca(null);
	//vei.setModelo(null);
	//vei.setDataCompra(null);
	//vei.setQtdPoltronas(0);
        vei.setNumero(Integer.valueOf(procuraNome.getText()));
	    try {
		vecM.consultar(vei);
		
	    } catch (Exception exx) {
		
	    }
		cbMotorista.setSelectedItem(vei.getMotorista());
		ShowLogin1.setText(vei.getPlaca());
		ShowLogin.setText(vei.getModelo());
		ShowEmail.setText(vei.getDataCompra());
		quant.setText(vei.getPol());
      
    }//GEN-LAST:event_procurarNome

    private void excluir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluir
	    vecM.excluir(vei);
    }//GEN-LAST:event_excluir
    
    private void editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar
        if(cbMotorista.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null,"Esse usuario não existe");
        } else {
                vei.setNumero(Integer.valueOf(procuraNome.getText()));
		vei.setMotorista((String)cbMotorista.getSelectedItem());
		vecM.atualizar(vei);
        }
    }//GEN-LAST:event_editar

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        procuraNome.setText(null);
        cbMotorista.setSelectedItem(null);
        ShowLogin1.setText(null);
        ShowLogin.setText(null);
        ShowEmail.setText(null);
        quant.setText(null);
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed

        private void procuraNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procuraNomeActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_procuraNomeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel ShowADM;
    private javax.swing.JLabel ShowEmail;
    private javax.swing.JLabel ShowLogin;
    private javax.swing.JLabel ShowLogin1;
    private javax.swing.JComboBox<String> cbMotorista;
    private javax.swing.JButton excluirFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField procuraNome;
    private javax.swing.JButton procurar;
    public javax.swing.JLabel quant;
    // End of variables declaration//GEN-END:variables
}
