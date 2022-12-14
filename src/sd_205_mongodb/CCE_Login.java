/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sd_205_mongodb;

import javax.swing.JFrame;

/**
 *
 * @author Student.Admin
 */
public class CCE_Login extends javax.swing.JFrame {

    /**
     * Creates new form CCE_Login
     */
    public CCE_Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        minimizebtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        signin = new javax.swing.JLabel();
        signup = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        signinbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 32, -1, 79));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Enter OTP-cuate 1.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 168, 403, 461));

        minimizebtn.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        minimizebtn.setForeground(new java.awt.Color(102, 102, 102));
        minimizebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizebtn.setText("-");
        minimizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizebtnMouseClicked(evt);
            }
        });
        jPanel1.add(minimizebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 30, 30));

        closebtn.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        closebtn.setForeground(new java.awt.Color(102, 102, 102));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setText("x");
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
        });
        jPanel1.add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 10, 30, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 153, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 204, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 1090, 10));

        signin.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        signin.setText("Sign in");
        signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinMouseClicked(evt);
            }
        });
        jPanel1.add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 60, -1, -1));

        signup.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signup.setText("Sign up");
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 60, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 204, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 50, 20, 40));

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 5, true));

        emailField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        emailField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 1, true));
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passwordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 1, true));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel6.setText("Email:");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel7.setText("Password:");

        signinbtn.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        signinbtn.setForeground(new java.awt.Color(0, 204, 0));
        signinbtn.setText("SIGN IN");
        signinbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(362, 362, 362))
                    .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addComponent(passwordField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(signinbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signinbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 820, 550));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 290, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinMouseClicked
        CCE_Login a = new CCE_Login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signinMouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        CCE_Registration a = new CCE_Registration();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupMouseClicked

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void minimizebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizebtnMouseClicked

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
            java.util.logging.Logger.getLogger(CCE_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CCE_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CCE_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CCE_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CCE_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebtn;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel minimizebtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel signin;
    private javax.swing.JButton signinbtn;
    private javax.swing.JLabel signup;
    // End of variables declaration//GEN-END:variables
}
