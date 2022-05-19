package com.mycompany.iooj;
import javax.swing.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import java.util.GregorianCalendar;

public class Trainer extends javax.swing.JFrame {
    
    private int validation = -1;
    private String username;
    private String alias;
    private String currentdate;
    private Date currentdates;
    
    public Trainer() {
        initComponents();
    }

    public Trainer(String username,String alias) throws ParseException {
        initComponents();
        Labeltrainer.setText("Welcome back " + alias);
        //make the routine column uneditable
        Textroutine.setEditable(false);
        userTrainer ur = new userTrainer();
        this.username = username;
        this.alias = alias;
       
        //compare time
        GregorianCalendar cal = new GregorianCalendar();
        currentdate = cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.YEAR);
        SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
        currentdates = st.parse(currentdate);
        
        
        try{
        //extract all the content of txt file
        String [] info = ur.getfilecontent();
        DefaultTableModel tbm = (DefaultTableModel)Tableschedule.getModel();
        for (int infocount = 0;infocount<info.length;infocount++){
        String [] addinfo = info[infocount].split("~");
        
        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
        addinfo[3] = "-";
        if (addinfo[5].equals(username) && addinfo[6].equals("incomplete")){
            //check if the username aligns and the session has yet been completed
            if (currentdates.compareTo(st.parse(addinfo[1])) <=0){
                //add info into table
                tbm.addRow(addinfo);
                }
            }
        }
        
//rearrange the table rows
        //get the whole content of the table
        String [][] tobearrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
        for(int i =0; i<Tableschedule.getRowCount();i++){
            for(int j =0;j<Tableschedule.getColumnCount();j++){
                tobearrange[i][j] = String.valueOf(Tableschedule.getValueAt(i,j));
            }
        }

        for(int i =0; i<tobearrange.length;i++){
            for(int j =i+1;j<tobearrange.length;j++){

                String [] temporaryarray;
                //split both dates into day, month and year to be parse into specific format
                String[] date_one = tobearrange[i][1].split("/");
                String[] date_two = tobearrange[j][1].split("/");
                
                //parse the values into integer
                int day_one = Integer.parseInt(date_one[0]);
                int month_one = Integer.parseInt(date_one[1]);
                int year_one = Integer.parseInt(date_one[2]);
                
                int day_two = Integer.parseInt(date_two[0]);
                int month_two = Integer.parseInt(date_two[1]); 
                int year_two = Integer.parseInt(date_two[2]);
                
                //split the time 
                String[] time_one = tobearrange[i][2].split("-");
                String[] time_two = tobearrange[j][2].split("-");
                
                //split the start time into hour and minute
                String[] splittime_one = time_one[0].split(":");
                String[] splittime_two = time_two[0].split(":");
                
                //split the start time into hour and minute
                int hour_start = Integer.parseInt(splittime_one[0]);
                int hour_end = Integer.parseInt(splittime_one[1]);
                
                //split the end time into hour and minute
                int hour_two_start = Integer.parseInt(splittime_two[0]);
                int hour_two_end = Integer.parseInt(splittime_two[1]);      
                
                //combine the parsed start time into local date time format
                LocalDateTime time_first=LocalDateTime.of(year_one,month_one,day_one,hour_start, hour_end, 00);
                LocalDateTime time_second=LocalDateTime.of(year_two,month_two,day_two,hour_two_start, hour_two_end, 00);
                
                //compare the time and place the earlier start time first
                if (time_first.compareTo(time_second) >=0){
                    temporaryarray = tobearrange[i];
                    tobearrange[i] = tobearrange[j];
                    tobearrange[j] = temporaryarray;
                    
                }
            }
        }
        
        //remove all of the rows in the table
        int numberofrowneededtoberemove = tbm.getRowCount();
        if(tbm.getRowCount()>-1){
            for(int i = 0;i<numberofrowneededtoberemove; i++){
            tbm.removeRow(0);
            }
        }
        
        //add the rearranged row
        for (int i = 0;i <tobearrange.length;i++){
                tbm.addRow(tobearrange[i]);
            }
//rearrange the row
        
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        //make the table uneditable
        Tableschedule.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grouplog = new javax.swing.ButtonGroup();
        Paneltrainer = new javax.swing.JPanel();
        Labeltrainer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tableschedule = new javax.swing.JTable();
        Buttonmodify = new javax.swing.JButton();
        Buttonback = new javax.swing.JButton();
        Buttonlog = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Textstartlog = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        Textendlog = new javax.swing.JTextArea();
        Labellogstart = new javax.swing.JLabel();
        Labellogend = new javax.swing.JLabel();
        Checkstatus = new javax.swing.JCheckBox();
        Checkprevioussession = new javax.swing.JCheckBox();
        Checktoday = new javax.swing.JCheckBox();
        Textroutine = new javax.swing.JTextArea();
        Labelroutine = new javax.swing.JLabel();
        Buttonclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Labeltrainer.setText("-");

        Tableschedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Date", "Time", "Routine", "Customer", "Trainer"
            }
        ));
        Tableschedule.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tableschedule);

        Buttonmodify.setText("MODIFY");
        Buttonmodify.setActionCommand(" MODIFY LOG");
        Buttonmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonmodifyActionPerformed(evt);
            }
        });

        Buttonback.setText("BACK");
        Buttonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonbackActionPerformed(evt);
            }
        });

        Buttonlog.setText("SHOW LOG");
        Buttonlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonlogActionPerformed(evt);
            }
        });

        Textstartlog.setColumns(20);
        Textstartlog.setLineWrap(true);
        Textstartlog.setRows(5);
        Textstartlog.setPreferredSize(new java.awt.Dimension(230, 84));
        jScrollPane2.setViewportView(Textstartlog);

        Textendlog.setColumns(20);
        Textendlog.setLineWrap(true);
        Textendlog.setRows(5);
        Textendlog.setPreferredSize(new java.awt.Dimension(230, 84));
        jScrollPane3.setViewportView(Textendlog);

        Labellogstart.setText("Pre-session log:");

        Labellogend.setText("Post-session log:");

        Checkstatus.setText("Session Completed");

        Grouplog.add(Checkprevioussession);
        Checkprevioussession.setText("Show all sessions");
        Checkprevioussession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckprevioussessionActionPerformed(evt);
            }
        });

        Grouplog.add(Checktoday);
        Checktoday.setText("Show sessions for the day");
        Checktoday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChecktodayActionPerformed(evt);
            }
        });

        Textroutine.setColumns(20);
        Textroutine.setRows(5);

        Labelroutine.setText("Routines:");

        Buttonclear.setText("CLEAR FILTER");
        Buttonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PaneltrainerLayout = new javax.swing.GroupLayout(Paneltrainer);
        Paneltrainer.setLayout(PaneltrainerLayout);
        PaneltrainerLayout.setHorizontalGroup(
            PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneltrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labeltrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PaneltrainerLayout.createSequentialGroup()
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaneltrainerLayout.createSequentialGroup()
                                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Buttonback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Checkprevioussession, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Buttonlog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(PaneltrainerLayout.createSequentialGroup()
                                        .addComponent(Checktoday, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Buttonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Labellogstart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PaneltrainerLayout.createSequentialGroup()
                                .addComponent(Labellogend)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(PaneltrainerLayout.createSequentialGroup()
                                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PaneltrainerLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Buttonmodify, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Checkstatus))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Labelroutine)
                    .addComponent(Textroutine, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PaneltrainerLayout.setVerticalGroup(
            PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PaneltrainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Labeltrainer)
                .addGap(6, 6, 6)
                .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneltrainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Checkprevioussession)
                            .addComponent(Checktoday, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Buttonlog, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buttonback, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PaneltrainerLayout.createSequentialGroup()
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Labellogstart)
                            .addComponent(Labelroutine))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PaneltrainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaneltrainerLayout.createSequentialGroup()
                                .addComponent(Textroutine, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addGroup(PaneltrainerLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Labellogend)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Checkstatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buttonmodify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneltrainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Paneltrainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonbackActionPerformed
        this.setVisible(false);
        userTrainer trainer = new userTrainer();
        trainer.setUsername(username);
        trainer.setAlias(alias);
        new Trainermainpage(trainer.outinfo()).setVisible(true);  
        
    }//GEN-LAST:event_ButtonbackActionPerformed

    private void ButtonmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonmodifyActionPerformed
        //ensure a row is selected
        if (Tableschedule.getSelectedRow() != -1){
            
            //ensure that the row is not chanegd during modification
            if (validation == Tableschedule.getSelectedRow()){
                
                //change the status of the sessions
                String status ;
                if (Checkstatus.isSelected()){
                    status = "complete";
                }else{
                    status = "incomplete";
                }

                int column = 0;
                int row = Tableschedule.getSelectedRow();
                
                //get the specific session id of the session
                String value = Tableschedule.getModel().getValueAt(row, column).toString();
                
                //contain the information needed to update the file
                String modifiedcontent = value+"~"+Textstartlog.getText()+"~"+Textendlog.getText()+"~"+status;

                userTrainer ur = new userTrainer ();
                try{
                    //update the txt file
                    ur.modifylog(modifiedcontent);
                    JOptionPane.showMessageDialog(null,"Successfully Modified");
                    
                    //update the table to reflect the changes
                    DefaultTableModel tbm = (DefaultTableModel)Tableschedule.getModel();
                    //remove all of the rows
                    int numberofrowneededtoberemove = tbm.getRowCount();
                    if(tbm.getRowCount()>-1){
                    for(int i = 0;i<numberofrowneededtoberemove; i++){
                    tbm.removeRow(0);
                    }
                     }
                    
                    //show only sessions that are incomplete
                    if (Checkprevioussession.isSelected() == false && Checktoday.isSelected() == false){
                                Textstartlog.setText("");
                                Textendlog.setText("");
                                Textroutine.setText("");
                                Checkstatus.setSelected(false);
                                GregorianCalendar cal = new GregorianCalendar();
                                currentdate = cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.YEAR);
                                SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
                                try{
                                currentdates = st.parse(currentdate);
                                }catch (ParseException e){
                                    JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
                                }
                        try{
                            //get all of the content of the file
                            String [] info = ur.getfilecontent();

                            for (int i = 0;i <info.length;i++){
                            String [] add = info[i].split("~");

                            //add[0] = String.format("%04d",Integer.parseInt(add[0]));
                            add[3] = "-";

                            try{
                            if (add[5].equals(username) && add[6].equals("incomplete")){
                                if (currentdates.compareTo(st.parse(add[1])) <=0){
                                    //add the content into the table
                                    tbm.addRow(add);
                                }

                            }
                            }catch (ParseException e){
                                JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
                            }

                            }
                        }
                        catch (IOException e){
                        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        
//////////////reaarange content
                        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
                        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
                            for(int j =0;j<Tableschedule.getColumnCount();j++){
                                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
                            }
                        }
                        //rearrange the array
                        String [][] arrange2 = ur.rearrangecontent(arrange);
                        
                            int numberofrow = tbm.getRowCount();
                            if(tbm.getRowCount()>-1){
                                for(int i3 = 0;i3<numberofrow; i3++){
                                tbm.removeRow(0);
                                }
                            }
                            
                            for (int i4 = 0;i4 <arrange.length;i4++){
                                    tbm.addRow(arrange2[i4]);
                                }
//////////////////////////////////////////////////////////// 
                        
                        
                    }
                    //show previous sessions as well
                    else if(Checkprevioussession.isSelected() == true && Checktoday.isSelected() == false){
                        
                        Textstartlog.setText("");
                        Textendlog.setText("");
                        Textroutine.setText("");
                        Checkstatus.setSelected(false);


                        try{
                        String [] info = ur.getfilecontent();
                        numberofrowneededtoberemove = tbm.getRowCount();
                        if(tbm.getRowCount()>-1){
                            for(int i = 0;i<numberofrowneededtoberemove; i++){
                            tbm.removeRow(0);
                            }
                        }
                        for (int i = 0;i <info.length;i++){
                        String [] add = info[i].split("~");

                        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
                        add[3] = "-";

                        if (add[5].equals(username)){
                            tbm.addRow(add);
                        }
                        }
//////////////reaarange content
                        
                        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
                        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
                            for(int j =0;j<Tableschedule.getColumnCount();j++){
                                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
                            }
                        }

                        //rearrange the array
                        String [][] arrange2 = ur.rearrangecontent(arrange);
                        
                            int numberofrow = tbm.getRowCount();
                            if(tbm.getRowCount()>-1){
                                for(int i3 = 0;i3<numberofrow; i3++){
                                tbm.removeRow(0);
                                }
                            }
                            
                            for (int i4 = 0;i4 <arrange.length;i4++){
                                    tbm.addRow(arrange2[i4]);
                                }
//////////////////////////////////////////////////////////// 
                        
                        }
                        catch (IOException e){
                        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    //show today's sessions only
                    }else if(Checkprevioussession.isSelected() == false && Checktoday.isSelected() == true){
                        
                                Textstartlog.setText("");
                                Textendlog.setText("");
                                Textroutine.setText("");
                                Checkstatus.setSelected(false);
                                
                                GregorianCalendar cal = new GregorianCalendar();
                                currentdate = cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.YEAR);
                                SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
                                try{
                                currentdates = st.parse(currentdate);
                                }catch (ParseException e){
                                    JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
                                }
                                
                                try{
                                String [] info = ur.getfilecontent();
                                numberofrowneededtoberemove = tbm.getRowCount();
                                if(tbm.getRowCount()>-1){
                                    for(int i = 0;i<numberofrowneededtoberemove; i++){
                                    tbm.removeRow(0);
                                    }
                                }
                                for (int i = 0;i <info.length;i++){
                                String [] add = info[i].split("~");

                                //add[0] = String.format("%04d",Integer.parseInt(add[0]));
                                add[3] = "-";
                                
                                        try{
                                        if (add[5].equals(username) && add[6].equals("incomplete")){
                                            if (currentdates.compareTo(st.parse(add[1])) ==0){
                                                tbm.addRow(add);
                                            }

                                        }
                                        }catch (ParseException e){
                                            JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
                                        }
                                }
                                
//////////////reaarange content
                        
                        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
                        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
                            for(int j =0;j<Tableschedule.getColumnCount();j++){
                                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
                            }
                        }

                        //rearrange the array
                        String [][] arrange2 = ur.rearrangecontent(arrange);
                        
                            int numberofrow = tbm.getRowCount();
                            if(tbm.getRowCount()>-1){
                                for(int i3 = 0;i3<numberofrow; i3++){
                                tbm.removeRow(0);
                                }
                            }
                            
                            for (int i4 = 0;i4 <arrange.length;i4++){
                                    tbm.addRow(arrange2[i4]);
                                }
//////////////////////////////////////////////////////////// 
                                
                                
                                }
                                catch (IOException e){
                                JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
                                }
                    }
                }
                catch(IOException e){
                    JOptionPane.showMessageDialog(null,"Invalid file","Error",JOptionPane.ERROR_MESSAGE);
                }

            }
            else{
                JOptionPane.showMessageDialog(null,"You have to click the show log button to view the info","Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null,"Nothing was selected","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonmodifyActionPerformed

    private void ButtonlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonlogActionPerformed
        
        if (Tableschedule.getSelectedRow() != -1){
            userTrainer ur = new userTrainer();
            try{
                int column = 0;
                int row = Tableschedule.getSelectedRow();
                String value = Tableschedule.getModel().getValueAt(row, column).toString();
                
                String logvalue = ur.displayspecificlog(value);
                String [] splitlog = logvalue.split("~");
                
                Textstartlog.setText(splitlog[7]);
                Textendlog.setText(splitlog[8]);
                Textroutine.setText(splitlog[3]);
                
                if (splitlog[1].equals("complete")){
                    Checkstatus.setSelected(true);
                }else{
                    Checkstatus.setSelected(false);
                }
               
                validation = Tableschedule.getSelectedRow();

            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
        
        else{
            JOptionPane.showMessageDialog(null,"No role selected","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonlogActionPerformed

    private void CheckprevioussessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckprevioussessionActionPerformed
        if (Checkprevioussession.isSelected()){
        Textstartlog.setText("");
        Textendlog.setText("");
        Textroutine.setText("");
        Checkstatus.setSelected(false);
        try{
        userTrainer ur = new userTrainer();
        String [] info = ur.getfilecontent();
        DefaultTableModel tbm = (DefaultTableModel)Tableschedule.getModel();
        int numberofrowneededtoberemove = tbm.getRowCount();
        if(tbm.getRowCount()>-1){
            for(int i = 0;i<numberofrowneededtoberemove; i++){
            tbm.removeRow(0);
            }
        }
        for (int i = 0;i <info.length;i++){
        String [] add = info[i].split("~");
        
        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
        add[3] = "-";
        
        if (add[5].equals(username)){
            tbm.addRow(add);
        }
        }

        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
            for(int j =0;j<Tableschedule.getColumnCount();j++){
                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
            }
        }

        String [][] arrange2 = ur.rearrangecontent(arrange);

            int numberofrow = tbm.getRowCount();
            if(tbm.getRowCount()>-1){
                for(int i3 = 0;i3<numberofrow; i3++){
                tbm.removeRow(0);
                }
            }

            for (int i4 = 0;i4 <arrange.length;i4++){
                    tbm.addRow(arrange2[i4]);
                }
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        }

        
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckprevioussessionActionPerformed

    private void ButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonclearActionPerformed
    Grouplog.clearSelection();
        Textstartlog.setText("");
        Textendlog.setText("");
        Textroutine.setText("");
        Checkstatus.setSelected(false);
        
        GregorianCalendar cal = new GregorianCalendar();
        currentdate = cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.YEAR);
        SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
        try{
        currentdates = st.parse(currentdate);
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        try{
        userTrainer ur = new userTrainer();
        String [] info = ur.getfilecontent();
        DefaultTableModel tbm = (DefaultTableModel)Tableschedule.getModel();
        int numberofrowneededtoberemove = tbm.getRowCount();
        if(tbm.getRowCount()>-1){
        for(int i = 0;i<numberofrowneededtoberemove; i++){
            tbm.removeRow(0);
            }
        }
        
        for (int i = 0;i <info.length;i++){
        String [] add = info[i].split("~");

        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
        add[3] = "-";

        try{
        if (add[5].equals(username) && add[6].equals("incomplete")){
            if (currentdates.compareTo(st.parse(add[1])) <=0){
                tbm.addRow(add);
            }

        }
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
//////////////reaarange content
        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
            for(int j =0;j<Tableschedule.getColumnCount();j++){
                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
            }
        }

        //rearrange the array
        String [][] arrange2 = ur.rearrangecontent(arrange);

            int numberofrow = tbm.getRowCount();
            if(tbm.getRowCount()>-1){
                for(int i3 = 0;i3<numberofrow; i3++){
                tbm.removeRow(0);
                }
            }

            for (int i4 = 0;i4 <arrange.length;i4++){
                    tbm.addRow(arrange2[i4]);
                }
//////////////////////////////////////////////////////////// 
        
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_ButtonclearActionPerformed

    private void ChecktodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChecktodayActionPerformed
        if (Checktoday.isSelected()){
        Textstartlog.setText("");
        Textendlog.setText("");
        Textroutine.setText("");
        Checkstatus.setSelected(false);
        
        GregorianCalendar cal = new GregorianCalendar();
        currentdate = cal.get(GregorianCalendar.DAY_OF_MONTH)+"/"+(cal.get(GregorianCalendar.MONTH)+1)+"/"+cal.get(GregorianCalendar.YEAR);
        SimpleDateFormat st = new SimpleDateFormat("dd/MM/yyyy");
        try{
        currentdates = st.parse(currentdate);
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        try{
        userTrainer ur = new userTrainer();
        String [] info = ur.getfilecontent();
        DefaultTableModel tbm = (DefaultTableModel)Tableschedule.getModel();
        int numberofrowneededtoberemove = tbm.getRowCount();
        if(tbm.getRowCount()>-1){
            for(int i = 0;i<numberofrowneededtoberemove; i++){
            tbm.removeRow(0);
            }
        }
        for (int i = 0;i <info.length;i++){
        String [] add = info[i].split("~");
        
        //add[0] = String.format("%04d",Integer.parseInt(add[0]));
        add[3] = "-";
        
        try{
        if (add[5].equals(username) && add[6].equals("incomplete")){
            if (currentdates.compareTo(st.parse(add[1])) ==0){
                tbm.addRow(add);
            }

        }
        }catch (ParseException e){
            JOptionPane.showMessageDialog(null,"Conversion failed","Error",JOptionPane.ERROR_MESSAGE);
        }
                                
        }
        
 //////////////reaarange content                
        String [][] arrange = new String [Tableschedule.getRowCount()][Tableschedule.getColumnCount()];
        for(int ii =0; ii<Tableschedule.getRowCount();ii++){
            for(int j =0;j<Tableschedule.getColumnCount();j++){
                arrange[ii][j] = String.valueOf(Tableschedule.getValueAt(ii,j));
            }
        }

        //rearrange the array
        String [][] arrange2 = ur.rearrangecontent(arrange);

            int numberofrow = tbm.getRowCount();
            if(tbm.getRowCount()>-1){
                for(int i3 = 0;i3<numberofrow; i3++){
                tbm.removeRow(0);
                }
            }

            for (int i4 = 0;i4 <arrange.length;i4++){
                    tbm.addRow(arrange2[i4]);
                }
//////////////////////////////////////////////////////////// 
        
        
        }
        catch (IOException e){
        JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_ChecktodayActionPerformed

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
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trainer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonback;
    private javax.swing.JButton Buttonclear;
    private javax.swing.JButton Buttonlog;
    private javax.swing.JButton Buttonmodify;
    private javax.swing.JCheckBox Checkprevioussession;
    private javax.swing.JCheckBox Checkstatus;
    private javax.swing.JCheckBox Checktoday;
    private javax.swing.ButtonGroup Grouplog;
    private javax.swing.JLabel Labellogend;
    private javax.swing.JLabel Labellogstart;
    private javax.swing.JLabel Labelroutine;
    private javax.swing.JLabel Labeltrainer;
    private javax.swing.JPanel Paneltrainer;
    private javax.swing.JTable Tableschedule;
    private javax.swing.JTextArea Textendlog;
    private javax.swing.JTextArea Textroutine;
    private javax.swing.JTextArea Textstartlog;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
