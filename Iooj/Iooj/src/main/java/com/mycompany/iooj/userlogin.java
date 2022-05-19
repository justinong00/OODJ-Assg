package com.mycompany.iooj;
import javax.swing.*;
import java.io.*;
import java.util.GregorianCalendar;
import java.util.Timer;

public class userlogin extends userinfo {
    int seconds;
    Timer mytimer = new Timer();

    public userlogin(String username,String password,String role){
        super(username,password,role);
    }
    public userlogin(){
    }

    public void resetpassword(){
        String Lineofpassword;
        String [] correctline = new String[0];
        int count = 0;
        
        try{
            BufferedReader readfile = new BufferedReader (new FileReader("userinfo.txt"));
            //extract the line from txt file based on the username
            while((Lineofpassword = readfile.readLine())!=null)
            {
                correctline = addmoretoarray(correctline);
                correctline[count] = Lineofpassword;
                String [] checkpassword = Lineofpassword.split(",");
                if (checkpassword[0].equals(getUsername())){
                    checkpassword[2] = getPassword();
                    correctline[count] = (checkpassword[0] +","+checkpassword[1]+","+checkpassword[2]+","+checkpassword[3]+","+checkpassword[4]);
                }
                //the cycle continues even when the password is changed to ensure all data after this row is still recorded
                count++;
            }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }

        try{
            //clear everything for the rewrite
            BufferedWriter clearfile = new BufferedWriter (new FileWriter("userinfo.txt"));
            clearfile.write("");
            clearfile.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Unable to Update file","Error",JOptionPane.ERROR_MESSAGE);
        }
        for(int linenumber = 0;linenumber <correctline.length;linenumber++){
            try{
                BufferedWriter updatefile = new BufferedWriter (new FileWriter("userinfo.txt",true));
                updatefile.write(correctline[linenumber]);
                updatefile.newLine();
                updatefile.close();
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"Unable to update file","Error",JOptionPane.ERROR_MESSAGE);  
            }
        }
        JOptionPane.showMessageDialog(null,"Successfully modified!");
    }
    
    public void logtime(String role){
        GregorianCalendar cal = new GregorianCalendar();
        try{
            BufferedWriter output = new BufferedWriter (new FileWriter("loggings.txt",true));
            output.write(getUsername() + "~"+role+"~"+String.valueOf(cal.getTime()));
            output.newLine();
            output.close();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Unable to locate file","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //forces the system to stop if continuous 3 attempts is done incorrectly
    public boolean incorrectlogin (int numberoftimes){
        boolean executed = false;
        seconds =0;
        if (numberoftimes <=0){
            JOptionPane.showMessageDialog(null,("Continuous error detected, try again after 10 seconds"),"Error",JOptionPane.ERROR_MESSAGE);
            executed = true;
        }else{
            JOptionPane.showMessageDialog(null,("You have " + numberoftimes + " chances left"),"Error",JOptionPane.ERROR_MESSAGE);
        }
        
        return executed;
    }

}
