/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dentalclinic;

import java.awt.Color;

/**
 *
 * @author Maggie
 */
public class dentalLoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form dentalLoginFrame
     */
    public dentalLoginFrame() {
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

        jPanel2 = new javax.swing.JPanel();
        guestTxt = new javax.swing.JLabel();
        empTxt = new javax.swing.JLabel();
        guestBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        empBtn = new javax.swing.JButton();
        userLoginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        guestTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        guestTxt.setForeground(new java.awt.Color(120, 139, 255));
        guestTxt.setText("Guest");
        jPanel2.add(guestTxt);
        guestTxt.setBounds(280, 340, 80, 25);

        empTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        empTxt.setForeground(new java.awt.Color(120, 139, 255));
        empTxt.setText("Employee / Admin");
        jPanel2.add(empTxt);
        empTxt.setBounds(280, 400, 160, 50);

        guestBtn.setBorderPainted(false);
        guestBtn.setContentAreaFilled(false);
        guestBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guestBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guestBtnMouseExited(evt);
            }
        });
        jPanel2.add(guestBtn);
        guestBtn.setBounds(210, 320, 300, 60);

        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(exitBtn);
        exitBtn.setBounds(40, 40, 50, 60);

        empBtn.setBorderPainted(false);
        empBtn.setContentAreaFilled(false);
        empBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                empBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                empBtnMouseExited(evt);
            }
        });
        jPanel2.add(empBtn);
        empBtn.setBounds(210, 390, 300, 70);

        userLoginBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maggie\\Desktop\\ClearView Images\\userLogin.png")); // NOI18N
        jPanel2.add(userLoginBG);
        userLoginBG.setBounds(0, 0, 710, 530);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guestBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestBtnMouseEntered
        guestTxt.setForeground(Color.decode("#4b64b7"));
    }//GEN-LAST:event_guestBtnMouseEntered

    private void guestBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestBtnMouseExited
        guestTxt.setForeground(Color.decode("#788bff"));
    }//GEN-LAST:event_guestBtnMouseExited

    private void empBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseEntered
        empTxt.setForeground(Color.decode("#4b64b7"));
    }//GEN-LAST:event_empBtnMouseEntered

    private void empBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseExited
        empTxt.setForeground(Color.decode("#788bff"));
    }//GEN-LAST:event_empBtnMouseExited

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
            java.util.logging.Logger.getLogger(dentalLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dentalLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dentalLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dentalLoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dentalLoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empBtn;
    private javax.swing.JLabel empTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton guestBtn;
    private javax.swing.JLabel guestTxt;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel userLoginBG;
    // End of variables declaration//GEN-END:variables
}
