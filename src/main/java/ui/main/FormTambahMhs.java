/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.main;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author asus
 */
public class FormTambahMhs extends JFrame {

    public FormTambahMhs() {
        initComponents();
        
        UIManager.put( "CheckBox.arc", 0 );
        UIManager.put( "TextComponent.arc", 999 );
    }

    private void Flatlaf(){
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelC1 = new ui.customJar.PanelC();
        jLabel1 = new javax.swing.JLabel();
        jLabelNpm = new javax.swing.JLabel();
        jLabelKelas = new javax.swing.JLabel();
        jLabelSemester = new javax.swing.JLabel();
        jLabelNama = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        cbKelas = new javax.swing.JComboBox<>();
        buttonRoundC1 = new ui.customJar.buttonRoundC();
        textNpm = new javax.swing.JTextField();
        TextNama = new javax.swing.JTextField();
        buttonRoundC22 = new ui.customJar.buttonRoundC2();

        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelC1.setBackground(new java.awt.Color(198, 215, 231));
        panelC1.setRoundBottomLeft(30);
        panelC1.setRoundBottomRight(30);
        panelC1.setRoundTopLeft(30);
        panelC1.setRoundTopRight(30);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setText("Tambah Mahasiswa");

        jLabelNpm.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelNpm.setText("NPM :");

        jLabelKelas.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelKelas.setText("Kelas :");

        jLabelSemester.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelSemester.setText("Semester :");

        jLabelNama.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabelNama.setText("Nama :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonRoundC1.setText("Simpan");
        buttonRoundC1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        textNpm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNpmActionPerformed(evt);
            }
        });

        buttonRoundC22.setText("Batal");
        buttonRoundC22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelC1Layout = new javax.swing.GroupLayout(panelC1);
        panelC1.setLayout(panelC1Layout);
        panelC1Layout.setHorizontalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonRoundC1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRoundC22, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelC1Layout.createSequentialGroup()
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelC1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelKelas)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC1Layout.createSequentialGroup()
                                    .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC1Layout.createSequentialGroup()
                                            .addComponent(jLabelNama)
                                            .addGap(33, 33, 33))
                                        .addGroup(panelC1Layout.createSequentialGroup()
                                            .addComponent(jLabelNpm)
                                            .addGap(39, 39, 39)))
                                    .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(textNpm, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                        .addComponent(TextNama))))
                            .addGroup(panelC1Layout.createSequentialGroup()
                                .addComponent(jLabelSemester)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelC1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1)))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        panelC1Layout.setVerticalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNpm, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNpm))
                .addGap(44, 44, 44)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNama)
                    .addComponent(TextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKelas))
                .addGap(44, 44, 44)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSemester))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRoundC1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonRoundC22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        setSize(new java.awt.Dimension(771, 466));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textNpmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNpmActionPerformed

    }//GEN-LAST:event_textNpmActionPerformed
    
     public static void main(String args[]) {
        FlatLightLaf.setup();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTambahMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextNama;
    private ui.customJar.buttonRoundC buttonRoundC1;
    private ui.customJar.buttonRoundC2 buttonRoundC22;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelNpm;
    private javax.swing.JLabel jLabelSemester;
    private javax.swing.JPanel jPanel1;
    private ui.customJar.PanelC panelC1;
    private javax.swing.JTextField textNpm;
    // End of variables declaration//GEN-END:variables
}
