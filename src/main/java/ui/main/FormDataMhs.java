
package ui.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.MahasiswaDAO;
import entities.Mahasiswa;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class FormDataMhs extends javax.swing.JPanel{

    public FormDataMhs() {
        initComponents();
        setTableAction();
        loadData();
        
        FlatLightLaf.setup();
        FlatSVGIcon tambahIcon = new FlatSVGIcon("svg/add.svg");
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/pdf3.svg");
        FlatSVGIcon exelIcon = new FlatSVGIcon("svg/exel2.svg");
        
        btnTambah.setIcon(tambahIcon);
        buttonPdf.setIcon(pdfIcon);
        buttonExel.setIcon(exelIcon);
    }

    public void refreshData() {
        loadData();
    }

    public void searchMahasiswa(String keyword) {
        DefaultTableModel model = (DefaultTableModel) custom1.getModel();
        model.setRowCount(0); // Clear existing data

        MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
        List<Mahasiswa> mahasiswas = mahasiswaDAO.searchMahasiswas(keyword);

        for (Mahasiswa mhs : mahasiswas) {
            model.addRow(new Object[]{mhs.getId(), mhs.getNpm(), mhs.getNama(), mhs.getKelas(), mhs.getSemester()});
        }
    }

    private void loadData() {
        MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
        List<Mahasiswa> mahasiswaList = mahasiswaDAO.getAllMahasiswas();
        DefaultTableModel model = (DefaultTableModel) custom1.getModel();
        model.setRowCount(0);

        for (Mahasiswa mahasiswa : mahasiswaList) {
            Object[] row = {
                    mahasiswa.getId(),
                    mahasiswa.getNpm(),
                    mahasiswa.getNama(),
                    mahasiswa.getKelas(),
                    mahasiswa.getSemester(),
                    new JButton(new FlatSVGIcon("svg/edit.svg")) // Tombol edit
            };
            model.addRow(row);
        }
    }
   
    private void setTableAction() {
          TableColumnModel columnModel = custom1.getColumnModel();
          columnModel.getColumn(5).setCellRenderer(new ButtonPanelRenderer());
    
          JButton editButton = new JButton(new FlatSVGIcon("svg/edit.svg"));
          editButton.setBackground(null); 
          editButton.setBackground(Color.GREEN);// Ubah warna latar belakang tombol edit

          JButton deleteButton = new JButton(new FlatSVGIcon("svg/delete.svg"));
          deleteButton.setBackground(null); // Ubah warna latar belakang tombol delete
          deleteButton.setBackground(Color.red);
          columnModel.getColumn(5).setCellEditor(new ButtonPanelEditor(custom1));
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
        JTable table;

        public ButtonPanelEditor(JTable table){
            this.table = table;
            this.editButton = new JButton(new FlatSVGIcon("svg/edit.svg"));
            this.editButton.setBackground(Color.GREEN);
            this.editButton.addActionListener(this);

            this.deleButton =  new JButton(new FlatSVGIcon("svg/delete.svg"));
            this.deleButton.setBackground(Color.red);
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
            int row = table.getSelectedRow();

             if(e.getSource() == editButton){
                Long studentId = (Long) table.getValueAt(row, 0);
                MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
                Mahasiswa mahasiswa = mahasiswaDAO.getMahasiswaById(studentId);

                FormEditMhs formEditMhs = new FormEditMhs((FormDataMhs) table.getParent().getParent().getParent().getParent(), mahasiswa);
                formEditMhs.setVisible(true);
            } else if(e.getSource() == deleButton){
                 int confirm = JOptionPane.showConfirmDialog(null, "Apakah kamu ingin menghapus data ini?", "Delete Confirmation", JOptionPane.YES_NO_OPTION);
                 if (confirm == JOptionPane.YES_OPTION) {
                     Long studentId = (Long) table.getValueAt(row, 0);
                     MahasiswaDAO mahasiswaDAO = new MahasiswaDAO();
                     mahasiswaDAO.deleteMahasiswa(studentId);
                     ((FormDataMhs) table.getParent().getParent().getParent().getParent()).refreshData();
                 }
            }
            
            fireEditingStopped();
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuUtamaMhs = new JPanel();
        panelC1 = new ui.customJar.PanelC();
        jLabel1 = new javax.swing.JLabel();
        btnTambah = new ui.customJar.buttonRoundC();
        jLabel2 = new javax.swing.JLabel();
        textC1 = new ui.customJar.TextC();
        buttonCari = new ui.customJar.buttonRoundC();
        jScrollPane2 = new javax.swing.JScrollPane();
        custom1 = new ui.customJar.Custom();
        buttonExel = new ui.customJar.buttonRoundC3();
        buttonPdf = new ui.customJar.buttonRoundC2();

        setBackground(new Color(255, 255, 255));

        menuUtamaMhs.setBackground(new Color(255, 255, 255));
        menuUtamaMhs.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        panelC1.setBackground(new Color(198, 215, 231));
        panelC1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelC1.setRoundBottomLeft(20);
        panelC1.setRoundBottomRight(20);
        panelC1.setRoundTopLeft(20);
        panelC1.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Data Mahasiswa");

        btnTambah.setText("Tambah");
        btnTambah.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnTambah.setRoundedCorner(50);
        btnTambah.setStrokWidth(3);
        btnTambah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelC1Layout = new javax.swing.GroupLayout(panelC1);
        panelC1.setLayout(panelC1Layout);
        panelC1Layout.setHorizontalGroup(
            panelC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelC1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))))
        );

        textC1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                textC1ActionPerformed(evt);
            }
        });

        buttonCari.setText("Cari");
        buttonCari.setAlignmentY(0.0F);
        buttonCari.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buttonCari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                buttonCariActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new Color(255, 255, 255));

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
                false, false, false, true, false, true
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

        buttonExel.setText("Exel");
        buttonExel.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        buttonPdf.setText("PDF");

        javax.swing.GroupLayout menuUtamaMhsLayout = new javax.swing.GroupLayout(menuUtamaMhs);
        menuUtamaMhs.setLayout(menuUtamaMhsLayout);
        menuUtamaMhsLayout.setHorizontalGroup(
            menuUtamaMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaMhsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuUtamaMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuUtamaMhsLayout.createSequentialGroup()
                        .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1025, Short.MAX_VALUE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        menuUtamaMhsLayout.setVerticalGroup(
            menuUtamaMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuUtamaMhsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(menuUtamaMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaMhsLayout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuUtamaMhsLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(menuUtamaMhsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textC1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonExel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaMhs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuUtamaMhs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textC1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_textC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textC1ActionPerformed

    private void buttonCariActionPerformed(ActionEvent evt) {//GEN-FIRST:event_buttonCariActionPerformed
        // TODO add your handling code here:
        String keyword = textC1.getText();
        searchMahasiswa(keyword);
    }//GEN-LAST:event_buttonCariActionPerformed

    private void btnTambahActionPerformed(ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        FormTambahMhs menuTambah = new FormTambahMhs(this);
        menuTambah.setVisible(true);
        menuTambah.revalidate();
        
    }//GEN-LAST:event_btnTambahActionPerformed

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.customJar.buttonRoundC btnTambah;
    private ui.customJar.buttonRoundC buttonCari;
    private ui.customJar.buttonRoundC3 buttonExel;
    private ui.customJar.buttonRoundC2 buttonPdf;
    private ui.customJar.Custom custom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private JPanel menuUtamaMhs;
    private ui.customJar.PanelC panelC1;
    private ui.customJar.TextC textC1;
    // End of variables declaration//GEN-END:variables
}
