/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dentalclinic;

/**
 *
 * @author Maggie
 */
public class guestSignupFrame extends javax.swing.JFrame {

    /**
     * Creates new form guestSignupFrame
     */
    public guestSignupFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        signupUsername = new javax.swing.JTextField();
        signupName = new javax.swing.JTextField();
        signupRePassword = new javax.swing.JPasswordField();
        signupPassword = new javax.swing.JPasswordField();
        signupBtn = new javax.swing.JButton();
        returnBtn = new javax.swing.JButton();
        guestSignupBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        signupUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupUsername.setBorder(null);
        jPanel1.add(signupUsername);
        signupUsername.setBounds(740, 340, 300, 30);

        signupName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupName.setBorder(null);
        jPanel1.add(signupName);
        signupName.setBounds(740, 240, 300, 30);

        signupRePassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupRePassword.setBorder(null);
        jPanel1.add(signupRePassword);
        signupRePassword.setBounds(740, 530, 300, 30);

        signupPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        signupPassword.setBorder(null);
        jPanel1.add(signupPassword);
        signupPassword.setBounds(740, 430, 300, 30);

        signupBtn.setBorderPainted(false);
        signupBtn.setContentAreaFilled(false);
        signupBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(signupBtn);
        signupBtn.setBounds(790, 610, 160, 40);

        returnBtn.setBorderPainted(false);
        returnBtn.setContentAreaFilled(false);
        returnBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(returnBtn);
        returnBtn.setBounds(40, 50, 70, 50);

        guestSignupBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maggie\\Desktop\\ClearView Images\\guestSignup.png")); // NOI18N
        jPanel1.add(guestSignupBG);
        guestSignupBG.setBounds(0, 0, 1172, 710);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1172, 708));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(guestSignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guestSignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guestSignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guestSignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guestSignupFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guestSignupBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton signupBtn;
    private javax.swing.JTextField signupName;
    private javax.swing.JPasswordField signupPassword;
    private javax.swing.JPasswordField signupRePassword;
    private javax.swing.JTextField signupUsername;
    // End of variables declaration//GEN-END:variables
}
