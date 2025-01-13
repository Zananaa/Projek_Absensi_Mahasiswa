
package main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class FormAbsensi1 extends javax.swing.JPanel {
    
    
    
    public FormAbsensi1() {
        initComponents();
        
        FlatLightLaf.setup();
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/pdf3.svg");
        FlatSVGIcon exelIcon = new FlatSVGIcon("svg/exel2.svg");
        
        buttonPdf.setIcon(pdfIcon);
        buttonExel.setIcon(exelIcon);
        
        
       
        
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuUtamaAbsn = new javax.swing.JPanel();
        panelC1 = new customJar.PanelC();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textC1 = new customJar.TextC();
        buttonCari = new customJar.buttonRoundC();
        jScrollPane2 = new javax.swing.JScrollPane();
        custom1 = new customJar.Custom();
        buttonExel = new customJar.buttonRoundC3();
        buttonPdf = new customJar.buttonRoundC2();

        menuUtamaAbsn.setBackground(new java.awt.Color(255, 255, 255));
        menuUtamaAbsn.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        panelC1.setBackground(new java.awt.Color(198, 215, 231));
        panelC1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelC1.setRoundBottomLeft(20);
        panelC1.setRoundBottomRight(20);
        panelC1.setRoundTopLeft(20);
        panelC1.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Data Absensi Mahasiswa");

        javax.swing.GroupLayout panelC1Layout = new javax.swing.GroupLayout(panelC1);
        panelC1.setLayout(panelC1Layout);
        panelC1Layout.setHorizontalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelC1Layout.setVerticalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        textC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC1ActionPerformed(evt);
            }
        });

        buttonCari.setText("Cari");
        buttonCari.setAlignmentY(0.0F);
        buttonCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        custom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Npm", "Nama", "Hadir", "Izin", "Sakit", "Alpha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custom1.setRowHeight(50);
        custom1.setShowGrid(true);
        jScrollPane2.setViewportView(custom1);
        if (custom1.getColumnModel().getColumnCount() > 0) {
            custom1.getColumnModel().getColumn(0).setPreferredWidth(40);
            custom1.getColumnModel().getColumn(0).setMaxWidth(30);
            custom1.getColumnModel().getColumn(1).setResizable(false);
            custom1.getColumnModel().getColumn(2).setResizable(false);
            custom1.getColumnModel().getColumn(3).setPreferredWidth(50);
            custom1.getColumnModel().getColumn(3).setMaxWidth(50);
            custom1.getColumnModel().getColumn(4).setPreferredWidth(50);
            custom1.getColumnModel().getColumn(4).setMaxWidth(50);
            custom1.getColumnModel().getColumn(5).setPreferredWidth(50);
            custom1.getColumnModel().getColumn(5).setMaxWidth(50);
            custom1.getColumnModel().getColumn(6).setPreferredWidth(50);
            custom1.getColumnModel().getColumn(6).setMaxWidth(50);
        }

        buttonExel.setText("Exel");
        buttonExel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        buttonPdf.setText("PDF");

        javax.swing.GroupLayout menuUtamaAbsnLayout = new javax.swing.GroupLayout(menuUtamaAbsn);
        menuUtamaAbsn.setLayout(menuUtamaAbsnLayout);
        menuUtamaAbsnLayout.setHorizontalGroup(
            menuUtamaAbsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaAbsnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuUtamaAbsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuUtamaAbsnLayout.createSequentialGroup()
                        .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 472, Short.MAX_VALUE)
                        .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        menuUtamaAbsnLayout.setVerticalGroup(
            menuUtamaAbsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaAbsnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuUtamaAbsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaAbsnLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaAbsnLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(menuUtamaAbsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaAbsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaAbsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC1ActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customJar.buttonRoundC buttonCari;
    private customJar.buttonRoundC3 buttonExel;
    private customJar.buttonRoundC2 buttonPdf;
    private customJar.Custom custom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuUtamaAbsn;
    private customJar.PanelC panelC1;
    private customJar.TextC textC1;
    // End of variables declaration//GEN-END:variables
}
