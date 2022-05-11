package com.mycompany.iooj;
import javax.swing.*;
import java.io.*;


public class resetPassword extends javax.swing.JFrame {
    
    private String username;

    public resetPassword() {
        initComponents();
    }
    public resetPassword(String username) {
        initComponents();
        this.username = username;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelreset = new javax.swing.JPanel();
        Labelpassword = new javax.swing.JLabel();
        Labelconfirmpassword = new javax.swing.JLabel();
        Buttonreset = new javax.swing.JButton();
        Buttonback = new javax.swing.JButton();
        Textpassword = new javax.swing.JPasswordField();
        Textconfirmpassword = new javax.swing.JPasswordField();
        Checkagree = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelpassword.setText("PASSWORD");

        Labelconfirmpassword.setText("CONFIRM PASSWORD");

        Buttonreset.setText("RESET");
        Buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonresetActionPerformed(evt);
            }
        });

        Buttonback.setText("BACK");
        Buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbackActionPerformed(evt);
            }
        });

        Checkagree.setText("I Have Agreeded To Change The Password");

        javax.swing.GroupLayout PanelresetLayout = new javax.swing.GroupLayout(Panelreset);
        Panelreset.setLayout(PanelresetLayout);
        PanelresetLayout.setHorizontalGroup(
            PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelresetLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelresetLayout.createSequentialGroup()
                        .addComponent(Buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buttonreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelresetLayout.createSequentialGroup()
                        .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelconfirmpassword)
                            .addComponent(Labelpassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Textpassword)
                            .addComponent(Textconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Checkagree))
                .addGap(33, 33, 33))
        );
        PanelresetLayout.setVerticalGroup(
            PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelresetLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelpassword))
                .addGap(29, 29, 29)
                .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelconfirmpassword)
                    .addComponent(Textconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Checkagree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelresetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonreset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbackActionPerformed
        this.setVisible(false);
        new logIn().setVisible(true);  
    }//GEN-LAST:event_ButtonbackActionPerformed

    private void ButtonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonresetActionPerformed
        if (Textpassword.getPassword().length ==0 && Textconfirmpassword.getPassword().length ==0){
            JOptionPane.showMessageDialog(null,"Incompelete Info","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            if (String.valueOf(Textpassword.getPassword()).equals(String.valueOf(Textpassword.getPassword()))){
                if(Checkagree.isSelected()){
                    userlogin un = new userlogin(username);
                    un.resetpassword(String.valueOf(Textpassword.getPassword()));
                    this.setVisible(false);
                    new logIn().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Action has yet been agreeded","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Unalligned password","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_ButtonresetActionPerformed


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
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonback;
    private javax.swing.JButton Buttonreset;
    private javax.swing.JCheckBox Checkagree;
    private javax.swing.JLabel Labelconfirmpassword;
    private javax.swing.JLabel Labelpassword;
    private javax.swing.JPanel Panelreset;
    private javax.swing.JPasswordField Textconfirmpassword;
    private javax.swing.JPasswordField Textpassword;
    // End of variables declaration//GEN-END:variables
}
