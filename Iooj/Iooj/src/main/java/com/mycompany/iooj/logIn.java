package com.mycompany.iooj;
import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class logIn extends javax.swing.JFrame {
    
    private int numberoftimes;
    public logIn() {
        numberoftimes = 3;
        initComponents();
        Buttonforgot.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panellogin = new javax.swing.JPanel();
        Labelusername = new javax.swing.JLabel();
        Labelpassword = new javax.swing.JLabel();
        Textusername = new javax.swing.JTextField();
        Labelrole = new javax.swing.JLabel();
        Comborole = new javax.swing.JComboBox<>();
        Textpassword = new javax.swing.JPasswordField();
        Buttonsignup = new javax.swing.JButton();
        Buttonlogin = new javax.swing.JButton();
        Buttonforgot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelusername.setText("USERNAME");

        Labelpassword.setText("PASSWORD");

        Labelrole.setText("ROLE");

        Comborole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Trainer", "Manager" }));

        Buttonsignup.setText("SIGN UP");
        Buttonsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsignupActionPerformed(evt);
            }
        });

        Buttonlogin.setText("LOGIN");
        Buttonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonloginActionPerformed(evt);
            }
        });

        Buttonforgot.setText("FORGOT PASSWORD");
        Buttonforgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonforgotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelloginLayout = new javax.swing.GroupLayout(Panellogin);
        Panellogin.setLayout(PanelloginLayout);
        PanelloginLayout.setHorizontalGroup(
            PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelloginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Buttonforgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelloginLayout.createSequentialGroup()
                        .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelpassword)
                            .addComponent(Labelusername)
                            .addComponent(Labelrole))
                        .addGap(68, 68, 68)
                        .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Textpassword)
                            .addComponent(Textusername)
                            .addGroup(PanelloginLayout.createSequentialGroup()
                                .addComponent(Comborole, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 135, Short.MAX_VALUE))))
                    .addGroup(PanelloginLayout.createSequentialGroup()
                        .addComponent(Buttonsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buttonlogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        PanelloginLayout.setVerticalGroup(
            PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelloginLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Textusername, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comborole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelrole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58)
                .addGroup(PanelloginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Buttonlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buttonsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Buttonforgot, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panellogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsignupActionPerformed

    if(Textusername.getText().equals("")){
        this.setVisible(false);
        new signUp().setVisible(true);
    }else{
        this.setVisible(false);
        new signUp(Textusername.getText(),Comborole.getSelectedItem().toString()).setVisible(true);
    }

        
    }//GEN-LAST:event_ButtonsignupActionPerformed

    private void ButtonforgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonforgotActionPerformed
        this.setVisible(false);
        new resetPassword(Textusername.getText()).setVisible(true);          
    }//GEN-LAST:event_ButtonforgotActionPerformed

    private void ButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonloginActionPerformed
        //check credentials validations
        String returnprompt;

        if (Textusername.getText().equals("")||Textpassword.getPassword().equals("")){
          JOptionPane.showMessageDialog(null,"Incompelete Info","Error",JOptionPane.ERROR_MESSAGE);
          Textpassword.setText("");
        }
        else
        {
          //initiate credentials verifications
          userlogin login = new userlogin(Textusername.getText(),String.valueOf(Textpassword.getPassword()),Comborole.getSelectedItem().toString());
          
          returnprompt = login.infovalidation();
          
          //check if username exist
            if (returnprompt.equals("correct"))
            {                   
                this.setVisible(false);
                if (Comborole.getSelectedItem().toString().equals("Customer")){
                    login.logtime("Customer");
                    JOptionPane.showMessageDialog(null,"Nothing here","Error",JOptionPane.ERROR_MESSAGE);

                }
                else if (Comborole.getSelectedItem().toString().equals("Trainer")){
                    login.logtime("Trainer");
                    new Trainermainpage(login.outinfo()).setVisible(true);
                }
                else if (Comborole.getSelectedItem().toString().equals("Manager")){
                    login.logtime("Manager");
                    JOptionPane.showMessageDialog(null,"nothing here","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else if(returnprompt.equals("incorrect password")){
                JOptionPane.showMessageDialog(null,"Incorrect password","Error",JOptionPane.ERROR_MESSAGE);
                Textpassword.setText("");
                Buttonforgot.setVisible(true);
                numberoftimes--;
                    boolean checking = login.incorrectlogin(numberoftimes);
                    if (checking){
                        try{
                            TimeUnit.SECONDS.sleep(10);
                            JOptionPane.showMessageDialog(null,"Try again now");
                            numberoftimes=3;
                        }catch(InterruptedException e){
                            JOptionPane.showMessageDialog(null,"Error occured","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
            }else if (returnprompt.equals("Incorrect role")){  
                JOptionPane.showMessageDialog(null,("No " + Comborole.getSelectedItem().toString() + " named " + Textusername.getText()),"Error",JOptionPane.ERROR_MESSAGE);
                numberoftimes--;
                    boolean checking = login.incorrectlogin(numberoftimes);
                    if (checking){
                        try{
                            TimeUnit.SECONDS.sleep(10);
                            JOptionPane.showMessageDialog(null,"Try again now");
                            numberoftimes=3;
                        }catch(InterruptedException e){
                            JOptionPane.showMessageDialog(null,"Error occured","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }   
            }else if (returnprompt.equals("username does not exist")){
                JOptionPane.showMessageDialog(null,"Incorrect Username","Error",JOptionPane.ERROR_MESSAGE);
                Textusername.setText("");
                Textpassword.setText("");
                numberoftimes--;
                    boolean checking = login.incorrectlogin(numberoftimes);
                    if (checking){
                            try{
                                TimeUnit.SECONDS.sleep(10);
                                JOptionPane.showMessageDialog(null,"Try again now");
                                numberoftimes=3;

                            }catch(InterruptedException e){
                                JOptionPane.showMessageDialog(null,"Error occured","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
            }               
        }         
    }//GEN-LAST:event_ButtonloginActionPerformed

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
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonforgot;
    private javax.swing.JButton Buttonlogin;
    private javax.swing.JButton Buttonsignup;
    private javax.swing.JComboBox<String> Comborole;
    private javax.swing.JLabel Labelpassword;
    private javax.swing.JLabel Labelrole;
    private javax.swing.JLabel Labelusername;
    private javax.swing.JPanel Panellogin;
    private javax.swing.JPasswordField Textpassword;
    private javax.swing.JTextField Textusername;
    // End of variables declaration//GEN-END:variables
}
