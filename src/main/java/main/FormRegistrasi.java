package main;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;


public class FormRegistrasi extends javax.swing.JFrame {
    int xx,xy;
    
    public FormRegistrasi() {
        initComponents();
        FlatSVGIcon openIcon = new FlatSVGIcon("svg/eye-open.svg");
        FlatSVGIcon hideIcon = new FlatSVGIcon("svg/eye-hide.svg");
        openPass.setIcon(openIcon);
        hidePass.setIcon(hideIcon);
        
         hidePass.setVisible(true);
    }
    
     void bersih(){
        t_username.setText("Username");
        t_password.setText("........");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLeft = new javax.swing.JPanel();
        bgRight = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelC1 = new customJar.PanelC();
        openPass = new javax.swing.JLabel();
        hidePass = new javax.swing.JLabel();
        t_username = new customJar.TextC();
        btnRegis = new rojerusan.RSMaterialButtonRectangle();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t_password = new customJar.TextPassC();
        lblOpsi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        bgLeft.setBackground(new java.awt.Color(206, 225, 236));

        bgRight.setBackground(new java.awt.Color(50, 106, 181));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\PBO 2\\bahan_projek\\src\\main\\java\\img\\online-learning.png")); // NOI18N

        javax.swing.GroupLayout bgRightLayout = new javax.swing.GroupLayout(bgRight);
        bgRight.setLayout(bgRightLayout);
        bgRightLayout.setHorizontalGroup(
            bgRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRightLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        bgRightLayout.setVerticalGroup(
            bgRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgRightLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        panelC1.setBackground(new java.awt.Color(245, 248, 249));
        panelC1.setRoundBottomLeft(25);
        panelC1.setRoundBottomRight(25);
        panelC1.setRoundTopLeft(25);
        panelC1.setRoundTopRight(25);
        panelC1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                openPassMouseClicked(evt);
            }
        });
        panelC1.add(openPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 30, 30));

        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassMouseClicked(evt);
            }
        });
        panelC1.add(hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 30, 30));

        t_username.setBackground(new java.awt.Color(185, 215, 246));
        t_username.setForeground(new java.awt.Color(153, 153, 153));
        t_username.setText("Username");
        t_username.setSelectedTextColor(new java.awt.Color(51, 204, 255));
        t_username.setSelectionColor(new java.awt.Color(0, 51, 153));
        t_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_usernameFocusLost(evt);
            }
        });
        t_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_usernameActionPerformed(evt);
            }
        });
        panelC1.add(t_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 230, 30));

        btnRegis.setText("Registrasi");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });
        panelC1.add(btnRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 260, 39));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\PBO 2\\bahan_projek\\src\\main\\java\\img\\user (1).png")); // NOI18N
        panelC1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Kuliah\\Semester 5\\PBO 2\\bahan_projek\\src\\main\\java\\img\\key.png")); // NOI18N
        panelC1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 81, -1, -1));

        t_password.setForeground(new java.awt.Color(51, 51, 51));
        t_password.setText("Password");
        t_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                t_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                t_passwordFocusLost(evt);
            }
        });
        t_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t_passwordKeyPressed(evt);
            }
        });
        panelC1.add(t_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 230, 30));

        lblOpsi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblOpsi.setForeground(new java.awt.Color(0, 51, 255));
        lblOpsi.setText("Have Account?");
        lblOpsi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOpsiMouseClicked(evt);
            }
        });
        panelC1.add(lblOpsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 20));

        javax.swing.GroupLayout bgLeftLayout = new javax.swing.GroupLayout(bgLeft);
        bgLeft.setLayout(bgLeftLayout);
        bgLeftLayout.setHorizontalGroup(
            bgLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLeftLayout.createSequentialGroup()
                .addComponent(bgRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        bgLeftLayout.setVerticalGroup(
            bgLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLeftLayout.createSequentialGroup()
                .addComponent(bgRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bgLeftLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(panelC1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(bgLeft);

        setSize(new java.awt.Dimension(827, 375));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_usernameActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
        MenuUtama menu = new MenuUtama();
        menu.setVisible(true);
        menu.revalidate();
        
        dispose();
    }//GEN-LAST:event_btnRegisActionPerformed

    private void openPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_openPassMouseClicked
        openPass.setVisible(false);
        hidePass.setVisible(true);
        t_password.setEchoChar('*');
    }//GEN-LAST:event_openPassMouseClicked

    private void t_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusGained
        String pass= t_password.getText();
        if(pass.equals("Password")){
            t_password.setText("");
        }
    }//GEN-LAST:event_t_passwordFocusGained

    private void t_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_passwordFocusLost
        String pass = t_password.getText();
        if(pass.equals("")||pass.equals("Password")){
            t_password.setText("Password");
        }
    }//GEN-LAST:event_t_passwordFocusLost

    private void t_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_passwordKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnRegis.requestFocus();
        }
    }//GEN-LAST:event_t_passwordKeyPressed

    private void t_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusGained
        String user= t_username.getText();
        if(user.equals("Username")){
            t_username.setText("");
        }
    }//GEN-LAST:event_t_usernameFocusGained

    private void t_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_t_usernameFocusLost
        String user = t_username.getText();
        if(user.equals("")||user.equals("Username")){
            t_username.setText("Username");
        }
    }//GEN-LAST:event_t_usernameFocusLost

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getXOnScreen();
        this.setLocation(x = xx, y = xy);
    }//GEN-LAST:event_formMouseDragged

    private void lblOpsiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOpsiMouseClicked
        FormLogin menuLogin = new FormLogin();
        menuLogin.setVisible(true);
        menuLogin.revalidate();
        
        dispose();
    }//GEN-LAST:event_lblOpsiMouseClicked

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked
       openPass.setVisible(true);
       hidePass.setVisible(false);
       t_password.setEchoChar((char)0);
    }//GEN-LAST:event_hidePassMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegistrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgLeft;
    private javax.swing.JPanel bgRight;
    private rojerusan.RSMaterialButtonRectangle btnRegis;
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblOpsi;
    private javax.swing.JLabel openPass;
    private customJar.PanelC panelC1;
    private customJar.TextPassC t_password;
    private customJar.TextC t_username;
    // End of variables declaration//GEN-END:variables
}
