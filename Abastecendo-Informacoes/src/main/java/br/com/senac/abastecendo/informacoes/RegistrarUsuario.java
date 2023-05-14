/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.com.senac.abastecendo.informacoes;

/**
 *
 * @author Aluno TDS
 */
public class RegistrarUsuario extends javax.swing.JDialog {

    /**
     * Creates new form registerDialog
     */
    public RegistrarUsuario(java.awt.Frame parent, boolean modal) {
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
        cadastrarNomeLabel = new javax.swing.JLabel();
        emailTelefoneJL = new javax.swing.JLabel();
        confirmEmailLabel = new javax.swing.JLabel();
        roboBox = new javax.swing.JCheckBox();
        nomeJTF = new javax.swing.JTextField();
        emailOuTelefoneJTF = new javax.swing.JTextField();
        confirmeEmailOuTelefone = new javax.swing.JTextField();
        nomeJL = new javax.swing.JLabel();
        idadeBox = new javax.swing.JCheckBox();
        continueButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        senhaJTF = new javax.swing.JTextField();
        confirmeSenhaJTF = new javax.swing.JLabel();
        senhaJTF1 = new javax.swing.JTextField();
        nomeJTF1 = new javax.swing.JTextField();
        sobrenomeJL = new javax.swing.JLabel();

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

        cadastrarNomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastrarNomeLabel.setText("Cadastrar-se");

        emailTelefoneJL.setText("Email ou telefone");

        confirmEmailLabel.setText("Confirme o E-mail ou telefone");

        roboBox.setText("Não sou um robô.");
        roboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roboBoxActionPerformed(evt);
            }
        });

        nomeJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJTFActionPerformed(evt);
            }
        });

        emailOuTelefoneJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailOuTelefoneJTFActionPerformed(evt);
            }
        });

        nomeJL.setText("Nome");

        idadeBox.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        idadeBox.setText("Tenho 18 anos de idade ou mais e aceito os termos");
        idadeBox.setToolTipText("");
        idadeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeBoxActionPerformed(evt);
            }
        });

        continueButton.setText("Continuar");
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Senha");

        senhaJTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaJTFActionPerformed(evt);
            }
        });

        confirmeSenhaJTF.setText("Confirme a senha");

        senhaJTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaJTF1ActionPerformed(evt);
            }
        });

        nomeJTF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeJTF1ActionPerformed(evt);
            }
        });

        sobrenomeJL.setText("Sobrenome");

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
                                    .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomeJL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sobrenomeJL)
                                    .addComponent(nomeJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(roboBox)
                            .addComponent(idadeBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailTelefoneJL)
                            .addComponent(confirmEmailLabel)
                            .addComponent(jLabel1)
                            .addComponent(confirmeSenhaJTF)
                            .addComponent(senhaJTF1)
                            .addComponent(confirmeEmailOuTelefone)
                            .addComponent(senhaJTF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailOuTelefoneJTF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(cadastrarNomeLabel)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(cadastrarNomeLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJL)
                    .addComponent(sobrenomeJL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTelefoneJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailOuTelefoneJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(confirmEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmeEmailOuTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaJTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmeSenhaJTF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaJTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(roboBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idadeBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(continueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roboBoxActionPerformed

    private void nomeJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJTFActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idadeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeBoxActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        // TODO add your handling code here:
        LogInUsuario form = new LogInUsuario();
            form.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_continueButtonActionPerformed

    private void senhaJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaJTFActionPerformed

    private void senhaJTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaJTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaJTF1ActionPerformed

    private void nomeJTF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeJTF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeJTF1ActionPerformed

    private void emailOuTelefoneJTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailOuTelefoneJTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailOuTelefoneJTFActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistrarUsuario dialog = new RegistrarUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel cadastrarNomeLabel;
    private javax.swing.JLabel confirmEmailLabel;
    private javax.swing.JTextField confirmeEmailOuTelefone;
    private javax.swing.JLabel confirmeSenhaJTF;
    private javax.swing.JButton continueButton;
    private javax.swing.JTextField emailOuTelefoneJTF;
    private javax.swing.JLabel emailTelefoneJL;
    private javax.swing.JCheckBox idadeBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nomeJL;
    private javax.swing.JTextField nomeJTF;
    private javax.swing.JTextField nomeJTF1;
    private javax.swing.JCheckBox roboBox;
    private javax.swing.JTextField senhaJTF;
    private javax.swing.JTextField senhaJTF1;
    private javax.swing.JLabel sobrenomeJL;
    // End of variables declaration//GEN-END:variables
}
