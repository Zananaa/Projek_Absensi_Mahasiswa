
package ui.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import ui.main.FormDataMhs;
import ui.main.FormTambahNilai;

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

public class FormNilai extends JPanel {

    public FormNilai() {
        initComponents();
        setTableAction();
        
        FlatLightLaf.setup();
        FlatSVGIcon tambahIcon = new FlatSVGIcon("svg/add.svg");
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/pdf3.svg");
        FlatSVGIcon exelIcon = new FlatSVGIcon("svg/exel2.svg");
        
        btnTambah.setIcon(tambahIcon);
        buttonPdf.setIcon(pdfIcon);
        buttonExel.setIcon(exelIcon);
       
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

        menuUtamaNilai = new JPanel();
        panelC3 = new ui.customJar.PanelC();
        jLabel4 = new javax.swing.JLabel();
        btnTambah = new ui.customJar.buttonRoundC();
        jScrollPane2 = new javax.swing.JScrollPane();
        custom1 = new ui.customJar.Custom();
        jLabel2 = new javax.swing.JLabel();
        textC1 = new ui.customJar.TextC();
        buttonCari = new ui.customJar.buttonRoundC();
        buttonPdf = new ui.customJar.buttonRoundC2();
        buttonExel = new ui.customJar.buttonRoundC3();

        menuUtamaNilai.setBackground(new Color(255, 255, 255));
        menuUtamaNilai.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        panelC3.setBackground(new Color(198, 215, 231));
        panelC3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelC3.setRoundBottomLeft(20);
        panelC3.setRoundBottomRight(20);
        panelC3.setRoundTopLeft(20);
        panelC3.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel4.setText("Nilai Mahasiswa");

        btnTambah.setText("Tambah");
        btnTambah.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnTambah.setRoundedCorner(50);
        btnTambah.setStrokWidth(3);
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelC3Layout = new javax.swing.GroupLayout(panelC3);
        panelC3.setLayout(panelC3Layout);
        panelC3Layout.setHorizontalGroup(
            panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelC3Layout.setVerticalGroup(
            panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC3Layout.createSequentialGroup()
                .addGroup(panelC3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelC3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane2.setBackground(new Color(255, 255, 255));

        custom1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
        }

        textC1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                textC1ActionPerformed(evt);
            }
        });

        buttonCari.setText("Cari");
        buttonCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonCari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        buttonPdf.setText("PDF");

        buttonExel.setText("Exel");
        buttonExel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        javax.swing.GroupLayout menuUtamaNilaiLayout = new javax.swing.GroupLayout(menuUtamaNilai);
        menuUtamaNilai.setLayout(menuUtamaNilaiLayout);
        menuUtamaNilaiLayout.setHorizontalGroup(
            menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(panelC3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuUtamaNilaiLayout.createSequentialGroup()
                        .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuUtamaNilaiLayout.createSequentialGroup()
                        .addGap(975, 975, 975)
                        .addComponent(jLabel2)
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuUtamaNilaiLayout.setVerticalGroup(
            menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaNilaiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuUtamaNilaiLayout.createSequentialGroup()
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuUtamaNilaiLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(menuUtamaNilaiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaNilai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCariActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCariActionPerformed

    private void textC1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_textC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC1ActionPerformed

    private void btnTambahActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        FormTambahNilai menuNilai = new FormTambahNilai();
        menuNilai.setVisible(true);
        menuNilai.revalidate();
    }//GEN-LAST:event_btnTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.customJar.buttonRoundC btnTambah;
    private ui.customJar.buttonRoundC buttonCari;
    private ui.customJar.buttonRoundC3 buttonExel;
    private ui.customJar.buttonRoundC2 buttonPdf;
    private ui.customJar.Custom custom1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private JPanel menuUtamaNilai;
    private ui.customJar.PanelC panelC3;
    private ui.customJar.TextC textC1;
    // End of variables declaration//GEN-END:variables
}
