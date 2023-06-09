/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.abastecendo.informacoes;

/**
 *
 * @author Aluno TDS
 */
public class RegisterUser extends javax.swing.JDialog {

    /**
     * Creates new form registerDialog
     */
    public RegisterUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        registerLB = new javax.swing.JLabel();
        emailPhoneJL = new javax.swing.JLabel();
        confirmEmailJL = new javax.swing.JLabel();
        robotBox = new javax.swing.JCheckBox();
        nameJTF = new javax.swing.JTextField();
        emailOrPhoneJTF = new javax.swing.JTextField();
        confirmEmailOrPhoneJTF = new javax.swing.JTextField();
        nameJL = new javax.swing.JLabel();
        yearsOld = new javax.swing.JCheckBox();
        continueJB = new javax.swing.JButton();
        passwordJL = new javax.swing.JLabel();
        passwrodJTF = new javax.swing.JTextField();
        confirmPasswordJTF = new javax.swing.JLabel();
        confirmJTF = new javax.swing.JTextField();
        lastNameJTF = new javax.swing.JTextField();
        lastNameJL = new javax.swing.JLabel();

        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jCheckBox1.setText("Tenho mais de 18 anos idade ou mais e aceito os termos");
        jCheckBox1.setToolTipText("");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        registerLB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        registerLB.setText("Register");

        emailPhoneJL.setText("Email or Phone");

        confirmEmailJL.setText("Confirm E-mail or Phone");

        robotBox.setText("I'm not a robot");
        robotBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                robotBoxActionPerformed(evt);
            }
        });

        nameJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTFActionPerformed(evt);
            }
        });

        emailOrPhoneJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailOrPhoneJTFActionPerformed(evt);
            }
        });

        nameJL.setText("Name");

        yearsOld.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        yearsOld.setText("I'm 18 year old  or more and accept the terms of service");
        yearsOld.setToolTipText("");
        yearsOld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsOldActionPerformed(evt);
            }
        });

        continueJB.setText("Continue");
        continueJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueJBActionPerformed(evt);
            }
        });

        passwordJL.setText("Password");

        passwrodJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwrodJTFActionPerformed(evt);
            }
        });

        confirmPasswordJTF.setText("Confirm Password");

        confirmJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJTFActionPerformed(evt);
            }
        });

        lastNameJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameJTFActionPerformed(evt);
            }
        });

        lastNameJL.setText("Last Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameJL)
                                    .addComponent(lastNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(robotBox)
                            .addComponent(yearsOld, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailPhoneJL)
                            .addComponent(confirmEmailJL)
                            .addComponent(passwordJL)
                            .addComponent(confirmPasswordJTF)
                            .addComponent(confirmJTF)
                            .addComponent(confirmEmailOrPhoneJTF)
                            .addComponent(passwrodJTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailOrPhoneJTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(continueJB, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(registerLB)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(registerLB)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJL)
                    .addComponent(lastNameJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailPhoneJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailOrPhoneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(confirmEmailJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmEmailOrPhoneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwrodJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmPasswordJTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(robotBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yearsOld)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(continueJB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void robotBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_robotBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_robotBoxActionPerformed

    private void nameJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTFActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yearsOldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsOldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsOldActionPerformed

    private void continueJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueJBActionPerformed
        // TODO add your handling code here:
        UserLogIn form = new UserLogIn();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_continueJBActionPerformed

    private void passwrodJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwrodJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwrodJTFActionPerformed

    private void confirmJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmJTFActionPerformed

    private void lastNameJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameJTFActionPerformed

    private void emailOrPhoneJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailOrPhoneJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailOrPhoneJTFActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegisterUser dialog = new RegisterUser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmEmailJL;
    private javax.swing.JTextField confirmEmailOrPhoneJTF;
    private javax.swing.JTextField confirmJTF;
    private javax.swing.JLabel confirmPasswordJTF;
    private javax.swing.JButton continueJB;
    private javax.swing.JTextField emailOrPhoneJTF;
    private javax.swing.JLabel emailPhoneJL;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lastNameJL;
    private javax.swing.JTextField lastNameJTF;
    private javax.swing.JLabel nameJL;
    private javax.swing.JTextField nameJTF;
    private javax.swing.JLabel passwordJL;
    private javax.swing.JTextField passwrodJTF;
    private javax.swing.JLabel registerLB;
    private javax.swing.JCheckBox robotBox;
    private javax.swing.JCheckBox yearsOld;
    // End of variables declaration//GEN-END:variables
}
