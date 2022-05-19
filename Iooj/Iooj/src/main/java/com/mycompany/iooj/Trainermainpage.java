package com.mycompany.iooj;

import java.text.ParseException;

public class Trainermainpage extends javax.swing.JFrame {
    private String information;
    private String username;
    private String alias;
    
    public Trainermainpage() {
        initComponents();
    }
    
    //retrive entire list
    public Trainermainpage(String information) {
        this.information = information;
        String [] userinformation = this.information.split(",");
        userTrainer trainer = new userTrainer();
        trainer.setUsername(userinformation[0]);
        trainer.setAlias(userinformation[1]);
        initComponents();

        Labelwelcome.setText("Welcome back " + trainer.getAlias() );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Paneltrainermainpage = new javax.swing.JPanel();
        Labelwelcome = new javax.swing.JLabel();
        Buttonview = new javax.swing.JButton();
        Buttonpay = new javax.swing.JButton();
        Buttonbak = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labelwelcome.setText("-");

        Buttonview.setText("VIEW SCHEDULE");
        Buttonview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonviewActionPerformed(evt);
            }
        });

        Buttonpay.setText("MANAGE PAYMENT");
        Buttonpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpayActionPerformed(evt);
            }
        });

        Buttonbak.setText("BACK");
        Buttonbak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbakActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneltrainermainpageLayout = new javax.swing.GroupLayout(Paneltrainermainpage);
        Paneltrainermainpage.setLayout(PaneltrainermainpageLayout);
        PaneltrainermainpageLayout.setHorizontalGroup(
            PaneltrainermainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltrainermainpageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneltrainermainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneltrainermainpageLayout.createSequentialGroup()
                        .addComponent(Buttonview, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Buttonpay, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Labelwelcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buttonbak, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PaneltrainermainpageLayout.setVerticalGroup(
            PaneltrainermainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltrainermainpageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Labelwelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaneltrainermainpageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buttonpay, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(Buttonview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addComponent(Buttonbak, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneltrainermainpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneltrainermainpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonviewActionPerformed
        this.setVisible(false);
        String [] userinformation = information.split(",");
        try{
        new Trainer(userinformation[0],userinformation[1]).setVisible(true);
        }
        catch(ParseException e){}
    }//GEN-LAST:event_ButtonviewActionPerformed

    private void ButtonpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpayActionPerformed
        String [] userinformation = information.split(",");
        this.setVisible(false);
        new userPayment(userinformation[0],userinformation[1]).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonpayActionPerformed

    private void ButtonbakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbakActionPerformed
    this.setVisible(false);
    new logIn().setVisible(true);
    }//GEN-LAST:event_ButtonbakActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainermainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonbak;
    private javax.swing.JButton Buttonpay;
    private javax.swing.JButton Buttonview;
    private javax.swing.JLabel Labelwelcome;
    private javax.swing.JPanel Paneltrainermainpage;
    // End of variables declaration//GEN-END:variables
}
