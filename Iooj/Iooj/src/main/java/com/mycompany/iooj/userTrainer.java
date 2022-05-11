package com.mycompany.iooj;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;

public class userTrainer extends userinfo{
    public userTrainer(){};
    
    public String [] show () throws IOException{
        BufferedReader input = new BufferedReader (new FileReader("sessions.txt"));
        String Line;
        String [] validate = new String [0];
        while((Line = input.readLine())!=null){
            validate = addmoretoarray(validate);
            validate[validate.length-1] = Line;
        }
       return validate;
    }
    
    public String showlog(String rowname) throws IOException{
        BufferedReader loginput = new BufferedReader (new FileReader("sessions.txt"));
        String Line;
        String validate = null;
        /*for(int i = 0;i < rownum;i++)
        {
            loginput.readLine();
        }
        Line = loginput.readLine();*/
        int count = 0;
        while((Line = loginput.readLine())!=null)
        {

            String [] check = Line.split("~");
            if (rowname.equals(check[0])){
                String [] answer = Line.split("~");
                validate = answer[7] + "~" + answer[8] + "~" + answer[3] + "~" + answer[6] + "~" + answer[9];
            }
            count++;
        }

        return validate;
    }
    
    public void modifylog(String modifiedcontent) throws IOException{
        String [] rowcheck = modifiedcontent.split("~");
        userinfo user = new userinfo();
        BufferedReader input = new BufferedReader (new FileReader("sessions.txt"));
        String Line;
        String [] answer = new String[0];
        int count = 0;
        while((Line = input.readLine())!=null)
        {
            answer = user.addmoretoarray(answer);
            answer[count] = Line;
            String [] check = Line.split("~");
            if (rowcheck[0].equals(check[0])){
                check[7] = rowcheck[1];
                check[8] = rowcheck[2];
                check[6] = rowcheck[3];
                answer[count] = (check[0]+"~"+check[1]+"~"+check[2]+"~"+check[3]+"~"+check[4]+"~"+check[5]+"~"+check[6]+"~"+check[7]+"~"+check[8]+"~"+check[9]+"~"+check[10]);
            }
            count++;
        }
        
        try{
        BufferedWriter output = new BufferedWriter (new FileWriter("sessions.txt"));
        output.write("");
        output.close();
        }
        catch(IOException e){
        System.out.println("not cleared");JOptionPane.showMessageDialog(null,"Failed to Cleared","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        for(int number = 0;number <answer.length;number++){
            try{
            BufferedWriter outputagn = new BufferedWriter (new FileWriter("sessions.txt",true));
            outputagn.write(answer[number]);
            outputagn.newLine();
            outputagn.close();
            }
            catch(IOException e){
            JOptionPane.showMessageDialog(null,"Failed","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }
    }
    
    public void completepayment(String customerid)throws IOException{
        userinfo user = new userinfo();
        BufferedReader input = new BufferedReader (new FileReader("sessions.txt"));
        String Line;
        String [] answer = new String[0];
        int count = 0;
        while((Line = input.readLine())!=null)
        {
            answer = user.addmoretoarray(answer);
            answer[count] = Line;
            String [] check = Line.split("~");
            
            if (String.format("%04d",Integer.parseInt(check[0])).equals(customerid)){
                check[10] = "paid";
                answer[count] = (check[0]+"~"+check[1]+"~"+check[2]+"~"+check[3]+"~"+check[4]+"~"+check[5]+"~"+check[6]+"~"+check[7]+"~"+check[8]+"~"+check[9]+"~"+check[10]);
            }
            count++;
        }
        
        try{
        BufferedWriter output = new BufferedWriter (new FileWriter("sessions.txt"));
        output.write("");
        output.close();
        }
        catch(IOException e){
        System.out.println("not cleared");JOptionPane.showMessageDialog(null,"Failed to Cleared","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        for(int number = 0;number <answer.length;number++){
            try{
            BufferedWriter outputagn = new BufferedWriter (new FileWriter("sessions.txt",true));
            outputagn.write(answer[number]);
            outputagn.newLine();
            outputagn.close();
            }
            catch(IOException e){
            JOptionPane.showMessageDialog(null,"Failed","Error",JOptionPane.ERROR_MESSAGE); 
            }
        }

    }
    
    public String [][] rearrangearray(String [][] arr){
        String [][] arred = arr;

        for(int i =0; i<arred.length;i++){
            for(int j =i+1;j<arred.length;j++){

                String [] tempt;
                String[] year = arred[1].toString().split("/");
                String[] secondyear = arred[j][1].split("/");
                int day1 = Integer.parseInt(year[0]);
                int month1 = Integer.parseInt(year[1]);
                int year1 = Integer.parseInt(year[2]);
                
                int day2 = Integer.parseInt(secondyear[0]);
                int month2 = Integer.parseInt(secondyear[1]); 
                int year2 = Integer.parseInt(secondyear[2]);
                
                String[] time = arred[i][2].split("-");
                String[] secondtime = arred[j][2].split("-");
                String[] splittime = time[0].split(":");
                String[] splitsecondtime = secondtime[0].split(":");
                int time1 = Integer.parseInt(splittime[0]);
                int time2 = Integer.parseInt(splittime[1]);
                int secondtime1 = Integer.parseInt(splitsecondtime[0]);
                int secondtime2 = Integer.parseInt(splitsecondtime[1]);              
                LocalDateTime time_1=LocalDateTime.of(year1,month1,day1,time1, time2, 00);
                LocalDateTime time_2=LocalDateTime.of(year2,month2,day2,secondtime1, secondtime2, 00);

                if (time_1.compareTo(time_2) >=0){
                    tempt = arred[i];
                    arred[i] = arred[j];
                    arred[j] = tempt;
                    
                }
            }
        }
        return arred;
    }
}
