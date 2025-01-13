
package main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class FormRekap extends javax.swing.JPanel {

    public FormRekap() {
        initComponents();
        setTableAction();
        
        FlatSVGIcon tambahIcon = new FlatSVGIcon("svg/add.svg");
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/pdf3.svg");
        FlatSVGIcon exelIcon = new FlatSVGIcon("svg/exel2.svg");
        
        buttonRoundC1.setIcon(tambahIcon);
        buttonPdf.setIcon(pdfIcon);
        buttonExel.setIcon(exelIcon);
    }

    private void Flatlaf(){
        FlatLightLaf.setup();
    }
    
    private void setTableAction() {
          TableColumnModel columnModel = custom1.getColumnModel();
          columnModel.getColumn(5).setCellRenderer(new FormDataMhs.ButtonPanelRenderer());
    
          JButton editButton = new JButton(new FlatSVGIcon("svg/edit.svg"));
          editButton.setBackground(null); 
          editButton.setBackground(Color.GREEN);// Ubah warna latar belakang tombol edit

          JButton deleteButton = new JButton(new FlatSVGIcon("svg/delete.svg"));
          deleteButton.setBackground(null); // Ubah warna latar belakang tombol delete
          deleteButton.setBackground(Color.red);
          columnModel.getColumn(5).setCellEditor(new FormDataMhs.ButtonPanelEditor(editButton, deleteButton));
    }
    
    static class ButtonPanelRenderer extends JPanel implements TableCellRenderer{
        public ButtonPanelRenderer(){
            setBackground(Color.WHITE);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            removeAll();
          
            JButton editButton = new JButton(new FlatSVGIcon("svg/edit.svg"));
            editButton.setBackground(Color.GREEN);
            JButton deleteButton = new JButton(new FlatSVGIcon("svg/delete.svg"));
            deleteButton.setBackground(Color.red);
            
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            layout.setHorizontalGroup(
                    layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton)
                            .addGap(10)
                            .addComponent(deleteButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            
            );
            layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(editButton)
                            .addComponent(deleteButton)
            );

            return this;
        }
    }
    
    static  class  ButtonPanelEditor extends AbstractCellEditor implements TableCellEditor, ActionListener{
        JPanel  panel;
        JButton editButton;
        JButton deleButton;

        public ButtonPanelEditor(JButton editButton, JButton deleButton){
            this.editButton = editButton;
            this.editButton.addActionListener(this);
            this.deleButton = deleButton;
            this.deleButton.addActionListener(this);
            panel = new JPanel();
            
            javax.swing.GroupLayout layout = new  javax.swing.GroupLayout(panel);
            panel.setLayout(layout);
            
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            layout.setHorizontalGroup(
                    layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton)
                            .addGap(10)
                            .addComponent(deleButton)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(editButton)
                            .addComponent(deleButton)
            );
            
        }

        @Override
        public Object getCellEditorValue() {
            return ""; 
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            return panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
             if(e.getSource() == editButton){
                System.out.println("Edit Button berhasil");
            } else if(e.getSource() == deleButton){
                System.out.println("Delete Button berhasil");
            }
            
            fireEditingStopped();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuUtamaRkp = new javax.swing.JPanel();
        panelC1 = new customJar.PanelC();
        jLabel1 = new javax.swing.JLabel();
        buttonRoundC1 = new customJar.buttonRoundC();
        jLabel2 = new javax.swing.JLabel();
        textC1 = new customJar.TextC();
        buttonPdf = new customJar.buttonRoundC();
        buttonExel = new customJar.buttonRoundC();
        buttonCari = new customJar.buttonRoundC();
        jScrollPane2 = new javax.swing.JScrollPane();
        custom1 = new customJar.Custom();

        menuUtamaRkp.setBackground(new java.awt.Color(255, 255, 255));
        menuUtamaRkp.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        panelC1.setBackground(new java.awt.Color(198, 215, 231));
        panelC1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelC1.setRoundBottomLeft(20);
        panelC1.setRoundBottomRight(20);
        panelC1.setRoundTopLeft(20);
        panelC1.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Data Rekap Absensi");

        buttonRoundC1.setText("Tambah");
        buttonRoundC1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonRoundC1.setRoundedCorner(50);
        buttonRoundC1.setStrokWidth(3);
        buttonRoundC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRoundC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelC1Layout = new javax.swing.GroupLayout(panelC1);
        panelC1.setLayout(panelC1Layout);
        panelC1Layout.setHorizontalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRoundC1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelC1Layout.setVerticalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelC1Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(buttonRoundC1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        textC1.setText("textC1");
        textC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textC1ActionPerformed(evt);
            }
        });

        buttonPdf.setText("PDF");
        buttonPdf.setAlignmentY(0.0F);
        buttonPdf.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        buttonExel.setText("EXCEL");
        buttonExel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

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
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Npm", "Nama", "Kelas", "Semester", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        custom1.setRowHeight(50);
        custom1.setShowGrid(true);
        jScrollPane2.setViewportView(custom1);
        if (custom1.getColumnModel().getColumnCount() > 0) {
            custom1.getColumnModel().getColumn(0).setPreferredWidth(30);
            custom1.getColumnModel().getColumn(0).setMaxWidth(30);
            custom1.getColumnModel().getColumn(1).setResizable(false);
            custom1.getColumnModel().getColumn(2).setResizable(false);
            custom1.getColumnModel().getColumn(3).setResizable(false);
            custom1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout menuUtamaRkpLayout = new javax.swing.GroupLayout(menuUtamaRkp);
        menuUtamaRkp.setLayout(menuUtamaRkpLayout);
        menuUtamaRkpLayout.setHorizontalGroup(
            menuUtamaRkpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaRkpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuUtamaRkpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuUtamaRkpLayout.createSequentialGroup()
                        .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 478, Short.MAX_VALUE)
                        .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        menuUtamaRkpLayout.setVerticalGroup(
            menuUtamaRkpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaRkpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuUtamaRkpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaRkpLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaRkpLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(menuUtamaRkpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaRkp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaRkp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRoundC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRoundC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRoundC1ActionPerformed

    private void textC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC1ActionPerformed

    private void buttonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customJar.buttonRoundC buttonCari;
    private customJar.buttonRoundC buttonExel;
    private customJar.buttonRoundC buttonPdf;
    private customJar.buttonRoundC buttonRoundC1;
    private customJar.Custom custom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel menuUtamaRkp;
    private customJar.PanelC panelC1;
    private customJar.TextC textC1;
    // End of variables declaration//GEN-END:variables
}
