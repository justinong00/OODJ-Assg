package com.mycompany.iooj;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class signUp extends javax.swing.JFrame {

    public signUp() {
        initComponents();
    }
    public signUp(String username,String role){
        initComponents();
        Textusername.setText(username);
        Comborole.setSelectedItem(role);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelsignup = new javax.swing.JPanel();
        Labelusername = new javax.swing.JLabel();
        Labelalias = new javax.swing.JLabel();
        Labelpassword = new javax.swing.JLabel();
        Labelconfirmpassword = new javax.swing.JLabel();
        Labeleamail = new javax.swing.JLabel();
        Textusername = new javax.swing.JTextField();
        Textalias = new javax.swing.JTextField();
        Textemail = new javax.swing.JTextField();
        Labelrole = new javax.swing.JLabel();
        Comborole = new javax.swing.JComboBox<>();
        Textpassword = new javax.swing.JPasswordField();
        Textconfirmpassword = new javax.swing.JPasswordField();
        Buttonsignup = new javax.swing.JButton();
        Buttonback = new javax.swing.JButton();
        Labelcontact = new javax.swing.JLabel();
        Textcontact = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelusername.setText("USERNAME");

        Labelalias.setText("ALIAS");

        Labelpassword.setText("PASSWORD");

        Labelconfirmpassword.setText("CONFIRM PASSWORD");

        Labeleamail.setText("EMAIL");

        Labelrole.setText("ROLE");

        Comborole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Trainer", "Manager" }));

        Buttonsignup.setText("SIGN UP");
        Buttonsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsignupActionPerformed(evt);
            }
        });

        Buttonback.setText("BACK");
        Buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbackActionPerformed(evt);
            }
        });

        Labelcontact.setText("CONTACT");

        javax.swing.GroupLayout PanelsignupLayout = new javax.swing.GroupLayout(Panelsignup);
        Panelsignup.setLayout(PanelsignupLayout);
        PanelsignupLayout.setHorizontalGroup(
            PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelsignupLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labelpassword)
                    .addComponent(Labelconfirmpassword)
                    .addComponent(Labeleamail, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelalias)
                    .addComponent(Labelusername)
                    .addComponent(Labelrole)
                    .addComponent(Labelcontact))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelsignupLayout.createSequentialGroup()
                        .addComponent(Buttonback, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buttonsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Textpassword)
                    .addComponent(Textemail)
                    .addComponent(Textconfirmpassword)
                    .addComponent(Textalias)
                    .addGroup(PanelsignupLayout.createSequentialGroup()
                        .addComponent(Comborole, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Textusername)
                    .addComponent(Textcontact))
                .addGap(20, 20, 20))
        );
        PanelsignupLayout.setVerticalGroup(
            PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelsignupLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textalias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelalias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labeleamail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textconfirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelconfirmpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelcontact, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Textcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comborole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelrole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PanelsignupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panelsignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsignupActionPerformed
        //check all the information are given 
        Pattern pattern = Pattern.compile("\\d{10}");

        if (Textusername.getText().equals("")||Textpassword.getPassword().length==0||Textconfirmpassword.getPassword().length==0||Textalias.getText().equals("")||Textemail.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Incompelete Info","Error",JOptionPane.ERROR_MESSAGE);
        } 
        else{
            usersignup signup = new usersignup(Textusername.getText()); 
            String verifyusername = signup.infovalidation();
            if (verifyusername != null){
                JOptionPane.showMessageDialog(null,"Username has been selected, please choose another one","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                //ensure that both line of password is the same
                if (String.valueOf(Textpassword.getPassword()).equals(String.valueOf(Textconfirmpassword.getPassword()))){
                    //ensure that the email is logically correct
                    if (Textemail.getText().endsWith("@gmail.com")){
                            //check contact format
                        Matcher matcher = pattern.matcher(Textcontact.getText());
                        if(matcher.matches()){
                            //pass in private variables
                            signup.setUsername(Textusername.getText());
                            signup.setAlias(Textalias.getText());
                            signup.setPassword(String.valueOf(Textpassword.getPassword()));
                            signup.setRole(Comborole.getSelectedItem().toString());
                            signup.setContact(Textcontact.getText());
                            signup.setEmail(Textemail.getText());
                            //sign up users
                            signup.signinuser();
                            JOptionPane.showMessageDialog(null,"You have successfully signed in");
                            //return back to log in page
                            this.setVisible(false);
                            new logIn().setVisible(true); 
                        }else{
                            JOptionPane.showMessageDialog(null,"Invalid contact entered","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Invalid email entered","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"Unalligned password","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_ButtonsignupActionPerformed

    private void ButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbackActionPerformed
        this.setVisible(false);
        new logIn().setVisible(true);
    }//GEN-LAST:event_ButtonbackActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonback;
    private javax.swing.JButton Buttonsignup;
    private javax.swing.JComboBox<String> Comborole;
    private javax.swing.JLabel Labelalias;
    private javax.swing.JLabel Labelconfirmpassword;
    private javax.swing.JLabel Labelcontact;
    private javax.swing.JLabel Labeleamail;
    private javax.swing.JLabel Labelpassword;
    private javax.swing.JLabel Labelrole;
    private javax.swing.JLabel Labelusername;
    private javax.swing.JPanel Panelsignup;
    private javax.swing.JTextField Textalias;
    private javax.swing.JPasswordField Textconfirmpassword;
    private javax.swing.JTextField Textcontact;
    private javax.swing.JTextField Textemail;
    private javax.swing.JPasswordField Textpassword;
    private javax.swing.JTextField Textusername;
    // End of variables declaration//GEN-END:variables
}
