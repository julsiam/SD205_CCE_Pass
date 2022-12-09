/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sd_205_mongodb;

import java.awt.Frame;

/**
 *
 * @author User
 */
public class Suggestion extends javax.swing.JFrame {

    /**
     * Creates new form Suggestion
     */
    public Suggestion() {
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        homeBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        minimize = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        closeBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel6.setText("Sign-out");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 20, 80, 30));

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Services", "Birth Certificate", "Marriage Certificate", "CENOMAR", "Death Certificate", "Business Permit", "Scholarship", "Voters Certificate", "Appointment", "Suggestions" }));
        jComboBox1.setBorder(null);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 120, 30));

        homeBtn.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        homeBtn.setText("Home");
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 60, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 10, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 1130, 10));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Suggestions");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 350, 60));

        minimize.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        minimize.setText("-");
        minimize.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });
        jPanel1.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 30, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 20, 20, 30));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel19.setText("Sign-in");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 60, 30));

        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeBtn.setText("X");
        closeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1500, 0, 30, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("Your Information");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Email Address");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, 130, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 250, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel11.setText("First Name");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel12.setText("Middle Name");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 130, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 250, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 250, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 250, 10));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 110, 250, 10));

        jTextField4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField4.setBorder(null);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 250, 30));

        jTextField8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField8.setBorder(null);
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 250, 30));

        jTextField11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField11.setBorder(null);
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 250, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 1340, 260));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel2.setText("Type of Suggestion");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setText("Details");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 210, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel13.setText("Subject");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 130, -1));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 960, 10));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 960, 10));

        jTextField5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField5.setBorder(null);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 960, 30));

        jTextField12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jTextField12.setBorder(null);
        jPanel3.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 960, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 1340, 260));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 3));
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 740, 90, 30));

        backBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn1.setText("Comment");
        backBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 51), 3));
        backBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtn1MouseClicked(evt);
            }
        });
        jPanel1.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 740, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1540, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizeActionPerformed

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void backBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtn1MouseClicked

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
            java.util.logging.Logger.getLogger(Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Suggestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Suggestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton minimize;
    // End of variables declaration//GEN-END:variables
}
