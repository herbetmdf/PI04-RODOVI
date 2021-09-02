package Principal;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class TelaPrincipal1 extends javax.swing.JFrame {

    public TelaPrincipal1() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagens/background.png"));
        Image img = icon.getImage();
        Painel = new javax.swing.JDesktopPane() {
            public void paintComponent (Graphics g) {
                g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fechar = new javax.swing.JLabel();
        addFunc = new javax.swing.JLabel();
        editFunc = new javax.swing.JLabel();
        addVeic = new javax.swing.JLabel();
        editVeic = new javax.swing.JLabel();
        addCidade = new javax.swing.JLabel();
        EditCidade = new javax.swing.JLabel();
        addPass = new javax.swing.JLabel();
        editPass = new javax.swing.JLabel();
        Relatorio = new javax.swing.JLabel();
        abrirInfo = new javax.swing.JLabel();
        addRota = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(37, 47, 53));

        Painel.setPreferredSize(new java.awt.Dimension(1140, 640));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Versão 1.0");

        Painel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(54, 68, 76));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fechar(evt);
            }
        });

        fechar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fechar.setForeground(new java.awt.Color(229, 229, 229));
        fechar.setText("X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fechar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addFunc.png"))); // NOI18N
        addFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addFunc(evt);
            }
        });

        editFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editFunc.png"))); // NOI18N
        editFunc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editFunc(evt);
            }
        });

        addVeic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addVeic.png"))); // NOI18N
        addVeic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addVeic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirAddVeiculo(evt);
            }
        });

        editVeic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editVeic.png"))); // NOI18N
        editVeic.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editVeic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirEditVeic(evt);
            }
        });

        addCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AddCidade.png"))); // NOI18N
        addCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCidade(evt);
            }
        });

        EditCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/EditCidade.png"))); // NOI18N
        EditCidade.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EditCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditCidade(evt);
            }
        });

        addPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/addPass.png"))); // NOI18N
        addPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abriPassagem(evt);
            }
        });

        editPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/editPass.png"))); // NOI18N
        editPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirConsultaPassagem(evt);
            }
        });

        Relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/relatorio.png"))); // NOI18N
        Relatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirRelatorio(evt);
            }
        });

        abrirInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/info.png"))); // NOI18N
        abrirInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        abrirInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirInfo(evt);
            }
        });

        addRota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rota.png"))); // NOI18N
        addRota.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addRota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abrirTelaRotas(evt);
            }
        });

        jLabel2.setText("Adicionar Funcionário");

        jLabel3.setText("Consultar Funcionário");

        jLabel4.setText("Adicionar Veiculo");

        jLabel5.setText("Consultar Veiculo");

        jLabel6.setText("Adicionar Cidade");

        jLabel7.setText("Consultar Cidades");

        jLabel8.setText("Venda Passagem");

        jLabel10.setText("Rota");

        jLabel11.setText("Relatório");

        jLabel12.setText("Informção");

        jLabel14.setText("Consulta Passagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(addFunc)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(editFunc)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(145, 145, 145))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addVeic)
                                .addGap(35, 35, 35)
                                .addComponent(editVeic)
                                .addGap(43, 43, 43)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addCidade)
                                .addGap(63, 63, 63)
                                .addComponent(EditCidade))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7)))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPass)
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35)
                        .addComponent(editPass)
                        .addGap(71, 71, 71)
                        .addComponent(addRota)
                        .addGap(46, 46, 46)
                        .addComponent(Relatorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(143, 143, 143)
                        .addComponent(jLabel5)
                        .addGap(434, 434, 434)
                        .addComponent(jLabel14)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(88, 88, 88)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrirInfo)
                    .addComponent(jLabel12))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 1418, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EditCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editVeic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addVeic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(abrirInfo)
                        .addGap(12, 12, 12))
                    .addComponent(addPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addRota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel10)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrirTelaRotas(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirTelaRotas
        if(!TelaRotas.getInstancia().isVisible()){
            Painel.add(TelaRotas.getInstancia());
            TelaRotas.getInstancia().setVisible(true);
        } else {
            TelaRotas.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirTelaRotas

    private void abrirInfo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirInfo
        if(!TelaSobre.getInstancia().isVisible()){
            Painel.add(TelaSobre.getInstancia());
            TelaSobre.getInstancia().setVisible(true);
        } else {
            TelaSobre.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirInfo

    private void abrirRelatorio(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirRelatorio
        if(!TelaRelatorio.getInstancia().isVisible()){
            Painel.add(TelaRelatorio.getInstancia());
            TelaRelatorio.getInstancia().setVisible(true);
        } else {
            TelaRelatorio.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirRelatorio

    private void abrirConsultaPassagem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirConsultaPassagem
        if(!ConsultaPassagem.getInstancia().isVisible()){
            Painel.add(ConsultaPassagem.getInstancia());
            ConsultaPassagem.getInstancia().setVisible(true);
        } else {
            ConsultaPassagem.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirConsultaPassagem

    private void abriPassagem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abriPassagem
        if(!TelaPassagem.getInstancia().isVisible()){
            Painel.add(TelaPassagem.getInstancia());
            TelaPassagem.getInstancia().setVisible(true);
        } else {
            TelaPassagem.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abriPassagem

    private void EditCidade(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditCidade
        if(!ConsultCidade.getInstancia().isVisible()){
            Painel.add(ConsultCidade.getInstancia());
            ConsultCidade.getInstancia().setVisible(true);
        } else {
            ConsultCidade.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_EditCidade

    private void addCidade(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCidade
        if(!AddCidade.getInstancia().isVisible()){
            Painel.add(AddCidade.getInstancia());
            AddCidade.getInstancia().setVisible(true);
        } else {
            AddCidade.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_addCidade

    private void abrirEditVeic(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirEditVeic
        if(!ConsultVeiculo.getInstancia().isVisible()){
            Painel.add(ConsultVeiculo.getInstancia());
            ConsultVeiculo.getInstancia().setVisible(true);
        } else {
            ConsultVeiculo.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirEditVeic

    private void abrirAddVeiculo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abrirAddVeiculo
        if(!AddVeiculos.getInstancia().isVisible()){
            Painel.add(AddVeiculos.getInstancia());
            AddVeiculos.getInstancia().setVisible(true);
        } else {
            AddVeiculos.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_abrirAddVeiculo

    private void editFunc(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editFunc
        if(!ConsultFuncionario.getInstancia().isVisible()){
            Painel.add(ConsultFuncionario.getInstancia());
            ConsultFuncionario.getInstancia().setVisible(true);
        } else {
            ConsultFuncionario.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_editFunc

    private void addFunc(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFunc
        if(!AddFuncionario.getInstancia().isVisible()){
            Painel.add(AddFuncionario.getInstancia());
            AddFuncionario.getInstancia().setVisible(true);
        } else {
            AddFuncionario.getInstancia().requestFocus();
        }
    }//GEN-LAST:event_addFunc

    private void fechar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fechar
        dispose();
    }//GEN-LAST:event_fechar

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EditCidade;
    public static javax.swing.JDesktopPane Painel;
    private javax.swing.JLabel Relatorio;
    private javax.swing.JLabel abrirInfo;
    private javax.swing.JLabel addCidade;
    private javax.swing.JLabel addFunc;
    private javax.swing.JLabel addPass;
    private javax.swing.JLabel addRota;
    private javax.swing.JLabel addVeic;
    private javax.swing.JLabel editFunc;
    private javax.swing.JLabel editPass;
    private javax.swing.JLabel editVeic;
    private javax.swing.JLabel fechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
