package com.mycompany.iooj;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class userPayment extends javax.swing.JFrame {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private int rowselected = -1;
    private double ensurepayment = 0;
    private String username;
    private String alias;
    public userPayment() {
    initComponents();
    }
    public userPayment(String username,String alias) {
        initComponents();
        this.username = username;
        this.alias = alias;
        Textamount.setEditable(false);
        Textchange.setEditable(false);
        DefaultTableModel tbm = (DefaultTableModel)Tablesessions.getModel();
        Tablesessions.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panelpayment = new javax.swing.JPanel();
        Buttoncalculate = new javax.swing.JButton();
        Labelpaidamount = new javax.swing.JLabel();
        Labelamount = new javax.swing.JLabel();
        Textpaidamount = new javax.swing.JTextField();
        Textamount = new javax.swing.JTextField();
        Buttonpay = new javax.swing.JButton();
        Labelchange = new javax.swing.JLabel();
        Textchange = new javax.swing.JTextField();
        Labelcustomer = new javax.swing.JLabel();
        Textusername = new javax.swing.JTextField();
        Buttonsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablesessions = new javax.swing.JTable();
        Buttonshowamount = new javax.swing.JButton();
        Buttonback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buttoncalculate.setText("CALCULATE");
        Buttoncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtoncalculateActionPerformed(evt);
            }
        });

        Labelpaidamount.setText("PAID AMOUNT:");

        Labelamount.setText("AMOUNT:");

        Buttonpay.setText("PAY");
        Buttonpay.setActionCommand(" MODIFY LOG");
        Buttonpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonpayActionPerformed(evt);
            }
        });

        Labelchange.setText("CHANGE:");

        Labelcustomer.setText("Enter Customer Name:");

        Buttonsearch.setText("SEARCH");
        Buttonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelpaymentLayout = new javax.swing.GroupLayout(Panelpayment);
        Panelpayment.setLayout(PanelpaymentLayout);
        PanelpaymentLayout.setHorizontalGroup(
            PanelpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelpaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Buttoncalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buttonpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Textusername)
                    .addComponent(Buttonsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Textchange)
                    .addComponent(Textpaidamount)
                    .addComponent(Textamount)
                    .addGroup(PanelpaymentLayout.createSequentialGroup()
                        .addGroup(PanelpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelamount)
                            .addComponent(Labelpaidamount))
                        .addContainerGap(251, Short.MAX_VALUE))
                    .addGroup(PanelpaymentLayout.createSequentialGroup()
                        .addGroup(PanelpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labelcustomer)
                            .addComponent(Labelchange))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PanelpaymentLayout.setVerticalGroup(
            PanelpaymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelpaymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Labelcustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Textusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Buttonsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(Labelamount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Textamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Labelpaidamount)
                .addGap(3, 3, 3)
                .addComponent(Textpaidamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Labelchange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Textchange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Buttoncalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Buttonpay, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tablesessions.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Customer", "Trainer"
            }
        ));
        Tablesessions.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tablesessions);

        Buttonshowamount.setText("SHOW AMOUNT");
        Buttonshowamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonshowamountActionPerformed(evt);
            }
        });

        Buttonback.setText("BACK");
        Buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Buttonback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Buttonshowamount, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panelpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panelpayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Buttonshowamount, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(Buttonback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonpayActionPerformed
        if (Tablesessions.getSelectedRow()!=-1){
            if(rowselected == Tablesessions.getSelectedRow()){
                if(Double.parseDouble(Textpaidamount.getText()) == ensurepayment){
                    int column = 0;
                    int row = Tablesessions.getSelectedRow();
                    String value = Tablesessions.getModel().getValueAt(row, column).toString();
                    userTrainer ur = new userTrainer();
                    try{
                        ur.completepayment(value);
                        JOptionPane.showMessageDialog(null,"Successfull Payment");
                        
                            if (Textusername.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"No name was inputted","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        else{

                        DefaultTableModel tbm = (DefaultTableModel)Tablesessions.getModel();
                        int numberofrowneededtoberemove = tbm.getRowCount();
                        if(tbm.getRowCount()>-1){
                            for(int i = 0;i<numberofrowneededtoberemove; i++){
                            tbm.removeRow(0);
                        }
                        }

                        try{
                        String [] info = ur.show();

                        for (int i = 0;i <info.length;i++){
                        String [] add = info[i].split("~");

                        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
                        String [] price = {add[0],add[4],add[5]};
                            if(add[4].equals(Textusername.getText()) && add[10].equals("unpaid")){
                                        tbm.addRow(price);
                            }

                        }
                        }
                        catch (IOException e){
                        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        }
                        Textpaidamount.setText("");
                        Textamount.setText("");
                        Textchange.setText("");
                        
                    }
                    catch(IOException e){
                        JOptionPane.showMessageDialog(null,"Process failed","Error",JOptionPane.ERROR_MESSAGE);
                    }


                }
                else{
                    JOptionPane.showMessageDialog(null,"Amount modified please recalculate to proceed","Error",JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null,"You have changed the row, please recalculate value","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonpayActionPerformed

    private void ButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbackActionPerformed
        this.setVisible(false);
        new Trainermainpage(username,alias).setVisible(true);

    }//GEN-LAST:event_ButtonbackActionPerformed

    private void ButtonshowamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonshowamountActionPerformed
                
        if (Tablesessions.getSelectedRow() != -1){
            userTrainer ur = new userTrainer();
            try{
                int column = 0;
                int row = Tablesessions.getSelectedRow();
                String value = Tablesessions.getModel().getValueAt(row, column).toString();
                
                String logvalue = ur.showlog(value);
                String [] splitlog = logvalue.split("~");
                Textamount.setText(splitlog[4]);
                rowselected = Tablesessions.getSelectedRow();
                
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
        
        else{
            JOptionPane.showMessageDialog(null,"No role selected","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonshowamountActionPerformed

    private void ButtoncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtoncalculateActionPerformed
        
        if (Tablesessions.getSelectedRow()!=-1){
            if(rowselected == Tablesessions.getSelectedRow()){
                if(Textpaidamount.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"No amount inputted","Error",JOptionPane.ERROR_MESSAGE);
                }
                else{
                    try{ 
                        double change = Double.parseDouble(Textpaidamount.getText()) - Double.parseDouble(Textamount.getText());
                        if (change < 0){
                            JOptionPane.showMessageDialog(null,"Insufficient amount","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            Textchange.setText(String.valueOf(df.format(change)));
                            ensurepayment = Double.parseDouble(Textpaidamount.getText());
                        }
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(null,"Invalid number inputted","Error",JOptionPane.ERROR_MESSAGE);
                    }

                }
            }else{
                JOptionPane.showMessageDialog(null,"You have changed the row, please recalculate value","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        else{
            JOptionPane.showMessageDialog(null,"No row selected","Error",JOptionPane.ERROR_MESSAGE);
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtoncalculateActionPerformed

    private void ButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonsearchActionPerformed
        if (Textusername.getText().equals("")){
            JOptionPane.showMessageDialog(null,"No name was inputted","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            
        userTrainer ur = new userTrainer();
        DefaultTableModel tbm = (DefaultTableModel)Tablesessions.getModel();
        int numberofrowneededtoberemove = tbm.getRowCount();
        if(tbm.getRowCount()>-1){
            for(int i = 0;i<numberofrowneededtoberemove; i++){
            tbm.removeRow(0);
        }
        }

        try{
        String [] info = ur.show();
        
        for (int i = 0;i <info.length;i++){
        String [] add = info[i].split("~");
        
        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
        String [] price = {add[0],add[4],add[5]};
            if(add[4].equals(Textusername.getText()) && add[10].equals("unpaid") && add[5].equals(username)){
                        tbm.addRow(price);
            }

        }
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_ButtonsearchActionPerformed

   
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
            java.util.logging.Logger.getLogger(userPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonback;
    private javax.swing.JButton Buttoncalculate;
    private javax.swing.JButton Buttonpay;
    private javax.swing.JButton Buttonsearch;
    private javax.swing.JButton Buttonshowamount;
    private javax.swing.JLabel Labelamount;
    private javax.swing.JLabel Labelchange;
    private javax.swing.JLabel Labelcustomer;
    private javax.swing.JLabel Labelpaidamount;
    private javax.swing.JPanel Panelpayment;
    private javax.swing.JTable Tablesessions;
    private javax.swing.JTextField Textamount;
    private javax.swing.JTextField Textchange;
    private javax.swing.JTextField Textpaidamount;
    private javax.swing.JTextField Textusername;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
