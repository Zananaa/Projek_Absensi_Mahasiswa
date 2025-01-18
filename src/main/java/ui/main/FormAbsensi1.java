
package ui.main;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import dao.AbsensiDAO;
import entities.Absensi;
import entities.Mahasiswa;
import org.hibernate.Session;
import utils.HibernateUtil;

import javax.swing.*;
import javax.swing.event.TableModelListener;

import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.List;


public class FormAbsensi1 extends javax.swing.JPanel {


    private JTable custom2;
    
    public FormAbsensi1() {
        initComponents();
        
        FlatLightLaf.setup();
        FlatSVGIcon pdfIcon = new FlatSVGIcon("svg/pdf3.svg");
        FlatSVGIcon exelIcon = new FlatSVGIcon("svg/exel2.svg");
        
        buttonPdf.setIcon(pdfIcon);
        buttonExel.setIcon(exelIcon);
        
        loadMahasiswaData();
    }

    private void loadMahasiswaData() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Mahasiswa> mahasiswaList = session.createQuery("from Mahasiswa", Mahasiswa.class).list();
            DefaultTableModel model = (DefaultTableModel) custom1.getModel();
            model.setRowCount(0); // Clear existing data
            LocalDate today = LocalDate.now();
            AbsensiDAO absensiDAO = new AbsensiDAO();

            for (Mahasiswa mahasiswa : mahasiswaList) {
                Absensi absensi = absensiDAO.getAbsensiByMahasiswaAndDate(mahasiswa, today.toString());
                boolean hadir = absensi != null && absensi.isHadir();
                boolean izin = absensi != null && absensi.isIzin();
                boolean sakit = absensi != null && absensi.isSakit();
                boolean alpha = absensi != null && absensi.isAlpha();
                model.addRow(new Object[]{mahasiswa.getId(), mahasiswa.getNpm(), mahasiswa.getNama(), hadir, izin, sakit, alpha});
            }

            TableModelListener listener = e -> {
                int row = e.getFirstRow();
                int column = e.getColumn();
                if (column >= 3 && column <= 6) {
                    handleCheckboxSelection(row, column);
                }
            };
            model.addTableModelListener(listener);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleCheckboxSelection(int row, int column) {
        DefaultTableModel model = (DefaultTableModel) custom1.getModel();
        TableModelListener[] listeners = model.getTableModelListeners();
        for (TableModelListener listener : listeners) {
            model.removeTableModelListener(listener);
        }

        for (int i = 3; i <= 6; i++) {
            if (i != column) {
                model.setValueAt(false, row, i);
            }
        }

        String npm = (String) model.getValueAt(row, 1);
        boolean hadir = (Boolean) model.getValueAt(row, 3);
        boolean izin = (Boolean) model.getValueAt(row, 4);
        boolean sakit = (Boolean) model.getValueAt(row, 5);
        boolean alpha = (Boolean) model.getValueAt(row, 6);

        Mahasiswa mahasiswa = getMahasiswaByNpm(npm);
        if (mahasiswa != null) {
            saveAbsensi(mahasiswa, hadir, izin, sakit, alpha);
        }

        for (TableModelListener listener : listeners) {
            model.addTableModelListener(listener);
        }
    }

    private Mahasiswa getMahasiswaByNpm(String npm) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Mahasiswa where npm = :npm", Mahasiswa.class)
                    .setParameter("npm", npm)
                    .uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void saveAbsensi(Mahasiswa mahasiswa, boolean hadir, boolean izin, boolean sakit, boolean alpha) {
        AbsensiDAO absensiDAO = new AbsensiDAO();
        LocalDate today = LocalDate.now();
        Absensi absensi = new Absensi(mahasiswa, today.toString(), hadir, izin, sakit, alpha);
        absensiDAO.saveOrUpdateAbsensi(absensi);
    }


    private void showRiwayatAbsensi(Mahasiswa mahasiswa) {
        JFrame frame = new JFrame("Riwayat Absensi");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setContentPane(new FormRiwayatAbsensi(mahasiswa));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        menuUtamaAbsn = new javax.swing.JPanel();
        panelC1 = new ui.customJar.PanelC();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textC1 = new ui.customJar.TextC();
        buttonCari = new ui.customJar.buttonRoundC();
        jScrollPane2 = new JScrollPane();
        custom1 = new ui.customJar.Custom();
        buttonExel = new ui.customJar.buttonRoundC3();
        buttonPdf = new ui.customJar.buttonRoundC2();

        menuUtamaAbsn.setBackground(new java.awt.Color(255, 255, 255));
        menuUtamaAbsn.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        panelC1.setBackground(new java.awt.Color(198, 215, 231));
        panelC1.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelC1.setRoundBottomLeft(20);
        panelC1.setRoundBottomRight(20);
        panelC1.setRoundTopLeft(20);
        panelC1.setRoundTopRight(20);

        custom1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = custom1.getSelectedRow();
                    String npm = (String) custom1.getValueAt(row, 1);
                    Mahasiswa mahasiswa = getMahasiswaByNpm(npm);
                    if (mahasiswa != null) {
                        showRiwayatAbsensi(mahasiswa);
                    }
                }
            }
        });

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

        custom1.setModel(new DefaultTableModel(
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
                Object.class, Object.class, Object.class, Boolean.class, Boolean.class, Boolean.class, Boolean.class
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
    private ui.customJar.buttonRoundC buttonCari;
    private ui.customJar.buttonRoundC3 buttonExel;
    private ui.customJar.buttonRoundC2 buttonPdf;
    private ui.customJar.Custom custom1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private JScrollPane jScrollPane2;
    private javax.swing.JPanel menuUtamaAbsn;
    private ui.customJar.PanelC panelC1;
    private ui.customJar.TextC textC1;
    // End of variables declaration//GEN-END:variables
}
