
package Principal;

import Class.DateMath;
import Class.Passagem;
import Class.Rota;
import Conexao.Conexao;
import Metodos.PassagemMetodo;
import Metodos.RotaMetodo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaPassagem extends javax.swing.JInternalFrame {
    
    Connection con = Conexao.conector();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    Passagem pass = new Passagem();
    PassagemMetodo passM = new PassagemMetodo();
    Rota rota = new Rota();
    RotaMetodo rota_m = new RotaMetodo();
    DateMath dates = new DateMath();
    
    private static TelaPassagem instancia = null;
    public static TelaPassagem getInstancia() {
        if(instancia == null) {
            instancia = new TelaPassagem();
        } return instancia;
    }
    public TelaPassagem() {
        initComponents();
        this.setLocation(300, 10);
        try {
            passM.consultarId(pass);
            ShowID.setText(String.valueOf(pass.getIdPassagem()+1));
        } catch (Exception e) {
        }
        Fillcombo();
    }
    public void Fillcombo(){
        try{
            stmt = con.prepareStatement("SELECT * FROM CITY");
            rs = stmt.executeQuery();
            while(rs.next()){
                String name = rs.getString("nomeCidade");
                cbOrigem.addItem(name);
                cbDestino.addItem(name);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame4 = new javax.swing.JInternalFrame();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        ShowID4 = new javax.swing.JLabel();
        campoNome4 = new javax.swing.JTextField();
        campoCPF4 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        cancelar4 = new javax.swing.JToggleButton();
        confirmar4 = new javax.swing.JToggleButton();
        checarRota4 = new javax.swing.JToggleButton();
        jLabel55 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        cbDestino4 = new javax.swing.JComboBox<>();
        cbOrigem4 = new javax.swing.JComboBox<>();
        ShowData4 = new javax.swing.JLabel();
        ShowIDPolt4 = new javax.swing.JLabel();
        ShowPlaca4 = new javax.swing.JLabel();
        ShowHora4 = new javax.swing.JLabel();
        ShowDispPolt4 = new javax.swing.JLabel();
        ShowValor4 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ShowID = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cancelar = new javax.swing.JToggleButton();
        confirmar = new javax.swing.JToggleButton();
        checarRota = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbDestino = new javax.swing.JComboBox<>();
        cbOrigem = new javax.swing.JComboBox<>();
        ShowDat = new javax.swing.JLabel();
        ShowIDPolt = new javax.swing.JLabel();
        ShowPlaca = new javax.swing.JLabel();
        ShowHor = new javax.swing.JLabel();
        ShowDispPolt = new javax.swing.JLabel();
        ShowValor = new javax.swing.JLabel();
        ano = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        dia = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        IDVIAGEM = new javax.swing.JLabel();

        jLabel45.setText("ID:");

        jLabel46.setText("Nome:");

        jLabel47.setText("CPF:");

        jLabel48.setText("Placa Veiculo:");

        jLabel49.setText("Data de Saída:");

        jLabel50.setText("Hora:");

        jLabel51.setText("Origem:");

        jLabel52.setText("Destino:");

        jLabel53.setText("Valor:");

        ShowID4.setText("ShowID");

        jLabel54.setText("ID Poltrona:");

        cancelar4.setText("Cancelar");
        cancelar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar4(evt);
            }
        });

        confirmar4.setText("Confirmar");
        confirmar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmar4ActionPerformed(evt);
            }
        });

        checarRota4.setText("Checar Rota");
        checarRota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRota4ActionPerformed(evt);
            }
        });

        jLabel55.setText("Poltronas Disp.:");

        cbDestino4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestino4receberValor1(evt);
            }
        });

        cbOrigem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrigem4receberValor1(evt);
            }
        });

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame4Layout.createSequentialGroup()
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                .addGap(0, 3, Short.MAX_VALUE)
                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel54)
                                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addComponent(jLabel45)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ShowID4))
                                                    .addComponent(jLabel49))
                                                .addGap(21, 21, 21)
                                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(ShowData4)
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addComponent(ShowIDPolt4)
                                                        .addGap(259, 259, 259)
                                                        .addComponent(ShowDispPolt4))
                                                    .addComponent(ShowPlaca4)
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addGap(145, 145, 145)
                                                        .addComponent(jLabel55)))))
                                        .addGap(43, 43, 43))
                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                        .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(79, 79, 79)
                                                .addComponent(checarRota4))
                                            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addComponent(jLabel51)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cbOrigem4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel52)
                                                        .addGap(18, 18, 18))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame4Layout.createSequentialGroup()
                                                        .addGap(41, 41, 41)
                                                        .addComponent(jLabel48)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addComponent(jLabel50)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(ShowHora4))
                                                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                                        .addComponent(jLabel53)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ShowValor4))
                                                    .addComponent(cbDestino4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(9, 9, 9))))
                            .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                    .addComponent(cancelar4)
                                    .addGap(156, 156, 156)
                                    .addComponent(confirmar4))
                                .addGroup(jInternalFrame4Layout.createSequentialGroup()
                                    .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel46)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoCPF4, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                        .addComponent(campoNome4))))))
                    .addGroup(jInternalFrame4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(ShowID4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(cbOrigem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(cbDestino4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checarRota4)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(ShowData4)
                    .addComponent(ShowHora4))
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLabel55)
                    .addComponent(ShowIDPolt4)
                    .addComponent(ShowDispPolt4))
                .addGap(34, 34, 34)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel48)
                    .addComponent(ShowPlaca4)
                    .addComponent(ShowValor4))
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(campoNome4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCPF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addGap(29, 29, 29)
                .addGroup(jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmar4)
                    .addComponent(cancelar4))
                .addGap(50, 50, 50))
        );

        jLabel1.setText("ID:");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Placa Veiculo:");

        jLabel5.setText("Data de Saída:");

        jLabel6.setText("Hora:");

        jLabel7.setText("Origem:");

        jLabel8.setText("Destino:");

        jLabel9.setText("Valor:");

        ShowID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowID.setText("ShowID");

        jLabel11.setText("Id Poltrona :");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar(evt);
            }
        });

        confirmar.setText("Confirmar");
        confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarActionPerformed(evt);
            }
        });

        checarRota.setText("Checar Rota");
        checarRota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRotaActionPerformed(evt);
            }
        });

        jLabel10.setText("Poltronas Disp.:");

        cbDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDestinoreceberValor1(evt);
            }
        });

        cbOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrigemreceberValor1(evt);
            }
        });

        ShowDat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowDat.setText("1");

        ShowIDPolt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowIDPolt.setText("1");

        ShowPlaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowPlaca.setText("1");

        ShowHor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowHor.setText("1");

        ShowDispPolt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowDispPolt.setText("1");

        ShowValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ShowValor.setText("1");

        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ano", "2020", "2021", "2022", "2023", "2024", "2025" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mês", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });

        jLabel12.setText("Data:");

        jLabel13.setText("ID Viagem:");

        IDVIAGEM.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDVIAGEM.setText("jLabel14");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29))
                            .addComponent(jSeparator6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(checarRota))
                            .addComponent(jSeparator1))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ShowID)
                                .addGap(156, 156, 156)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDVIAGEM)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ShowPlaca)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9)
                                                .addGap(8, 8, 8))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ShowDat, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(ShowIDPolt, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)))))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ShowDispPolt)
                                        .addComponent(ShowHor))
                                    .addComponent(ShowValor, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNome)
                            .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confirmar)
                        .addGap(104, 104, 104))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ShowID)
                    .addComponent(jLabel13)
                    .addComponent(IDVIAGEM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checarRota)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ShowDat, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(ShowHor))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(ShowIDPolt, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowDispPolt))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(ShowValor, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPlaca))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(confirmar))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar
        cbOrigem.setSelectedItem(null);
        cbDestino.setSelectedItem(null);
        ShowDat.setText(null);
        ShowDispPolt.setText(null);
        ShowHor.setText(null);
        ShowIDPolt.setText(null);
        ShowPlaca.setText(null);
        ShowValor.setText(null);
        campoCPF.setText(null);
        campoNome.setText(null);
        dia.setSelectedItem(null);
        mes.setSelectedItem(null);
        ano.setSelectedItem(null);
        dispose();
    }//GEN-LAST:event_cancelar

    private void cbDestinoreceberValor1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestinoreceberValor1

    }//GEN-LAST:event_cbDestinoreceberValor1

    private void cbOrigemreceberValor1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrigemreceberValor1
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrigemreceberValor1

    private void checarRotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRotaActionPerformed
        String dv = String.valueOf(ano.getSelectedItem())+"-"+String.valueOf(mes.getSelectedItem())+"-"+ String.valueOf(dia.getSelectedItem());
        rota.setDataviagem(dv);
        rota.setOrigem((String) cbOrigem.getSelectedItem());
        rota.setDestino((String) cbDestino.getSelectedItem());
        rota_m.consultarRota(rota);
        if(rota.getPoltronaD()>0){
        ShowDat.setText(rota.getData());
        ShowHor.setText(rota.getHora());
        ShowIDPolt.setText(String.valueOf(rota.getPoltronaV()+1));
        ShowDispPolt.setText(String.valueOf(rota.getPoltronaD()-1));
        ShowPlaca.setText(rota.getPlaca());
        ShowValor.setText(String.valueOf(rota.getValor()));
        IDVIAGEM.setText(rota.getId());
        }else{
        JOptionPane.showMessageDialog(null,"Não á mais vaga para essa data consulte outra data!");
        cbOrigem.setSelectedItem(null);
        cbDestino.setSelectedItem(null);
        ShowDat.setText(null);
        ShowDispPolt.setText(null);
        ShowHor.setText(null);
        ShowIDPolt.setText(null);
        ShowPlaca.setText(null);
        ShowValor.setText(null);
        campoCPF.setText(null);
        campoNome.setText(null);
        dia.setSelectedItem(null);
        mes.setSelectedItem(null);
        ano.setSelectedItem(null);
        }
        
    }//GEN-LAST:event_checarRotaActionPerformed

    private void confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarActionPerformed
        
        
            pass.setNome(campoNome.getText());
            pass.setCpf(campoCPF.getText());
            pass.setVeiculo(ShowPlaca.getText());
            pass.setPoltrona(Integer.valueOf(ShowDispPolt.getText()));
            pass.setDataSaida(ShowDat.getText());
            pass.setHoraSaida(ShowHor.getText());
            pass.setCidadeOrigem((String)cbOrigem.getSelectedItem());
            pass.setCidadeDestino((String)cbDestino.getSelectedItem());
            pass.setValorPassagem(Float.valueOf(ShowValor.getText()));
            rota.setId(IDVIAGEM.getText());
            rota.setOrigem((String) cbOrigem.getSelectedItem());
            rota.setDestino((String) cbDestino.getSelectedItem());
            rota.setPoltronaV(Integer.valueOf(ShowIDPolt.getText()));
            rota.setPoltronaD(Integer.valueOf(ShowDispPolt.getText()));
        try { 
            rota_m.atualizarRota(rota);
            passM.venda(pass);
            ShowDat.setText(null);
            ShowDispPolt.setText(null);
            ShowHor.setText(null);
            ShowIDPolt.setText(null);
            ShowPlaca.setText(null);
            ShowValor.setText(null);
            campoCPF.setText(null);
            campoNome.setText(null);
        } catch (SQLException ex) {
            Logger.getLogger(TelaPassagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_confirmarActionPerformed

    private void cancelar4(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar4
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelar4

    private void confirmar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmar4ActionPerformed

    private void checarRota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRota4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checarRota4ActionPerformed

    private void cbDestino4receberValor1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDestino4receberValor1
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDestino4receberValor1

    private void cbOrigem4receberValor1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrigem4receberValor1
        // TODO add your handling code here:
    }//GEN-LAST:event_cbOrigem4receberValor1

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDVIAGEM;
    private javax.swing.JLabel ShowDat;
    private javax.swing.JLabel ShowData4;
    private javax.swing.JLabel ShowDispPolt;
    private javax.swing.JLabel ShowDispPolt4;
    private javax.swing.JLabel ShowHor;
    private javax.swing.JLabel ShowHora4;
    private javax.swing.JLabel ShowID;
    private javax.swing.JLabel ShowID4;
    private javax.swing.JLabel ShowIDPolt;
    private javax.swing.JLabel ShowIDPolt4;
    private javax.swing.JLabel ShowPlaca;
    private javax.swing.JLabel ShowPlaca4;
    private javax.swing.JLabel ShowValor;
    private javax.swing.JLabel ShowValor4;
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoCPF4;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoNome4;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JToggleButton cancelar4;
    private javax.swing.JComboBox<Object> cbDestino;
    private javax.swing.JComboBox<Object> cbDestino4;
    private javax.swing.JComboBox<Object> cbOrigem;
    private javax.swing.JComboBox<Object> cbOrigem4;
    private javax.swing.JToggleButton checarRota;
    private javax.swing.JToggleButton checarRota4;
    private javax.swing.JToggleButton confirmar;
    private javax.swing.JToggleButton confirmar4;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> mes;
    // End of variables declaration//GEN-END:variables
}
