package com.mycompany.iooj;
import javax.swing.*;
import java.io.*;
import java.util.GregorianCalendar;

public class userlogin extends userinfo {

    private String alias;
    private String role;

    
    public userlogin(String username){
        super(username);
    }
    
    public Boolean verifyrole(String username,String role){
        String lineofrole;
        String rolecheck = role;
        String findusername = username;
        Boolean validate = false;
        
        try{
        BufferedReader input = new BufferedReader (new FileReader("userinfo.txt"));
        while((lineofrole = input.readLine())!=null){  
            String [] answer = lineofrole.split(",");
            if (answer[0].equals(findusername) && answer[4].equals(rolecheck)){
                validate = true;
                this.role = answer[4];
                break;
            }
        }
            return validate;
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
            return validate;
        }
    }
    
    public Boolean verifypassword(String username,String password){
        String lineofpassword;
        String findusername = username;
        String passwordcheck = password;
        Boolean validate = false;
        
        try{
        BufferedReader input = new BufferedReader (new FileReader("userinfo.txt"));
        while((lineofpassword = input.readLine())!=null){
            String [] answer = lineofpassword.split(",");
            if (answer[0].equals(findusername) && answer[2].equals(passwordcheck)){
                validate = true;
                alias = answer[1];
                break;
            }
        }
            return validate;
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
            return validate;
        }
    }

    public void resetpassword(String password){
        
        String Lineofpassword;
        String [] answer = new String[0];
        int count = 0;
        try{
        BufferedReader input = new BufferedReader (new FileReader("userinfo.txt"));
        while((Lineofpassword = input.readLine())!=null)
        {
            answer = addmoretoarray(answer);
            answer[count] = Lineofpassword;
            String [] check = Lineofpassword.split(",");
            if (check[0].equals(getUsername())){
                check[2] = password;
                answer[count] = (check[0] +","+check[1]+","+check[2]+","+check[3]+","+check[4]);
            }
            count++;
        }
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        
        try{
        BufferedWriter output = new BufferedWriter (new FileWriter("userinfo.txt"));
        output.write("");
        output.close();
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"Unable to Update file","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        for(int number = 0;number <answer.length;number++){
            try{
            BufferedWriter updatefile = new BufferedWriter (new FileWriter("userinfo.txt",true));
            updatefile.write(answer[number]);
            updatefile.newLine();
            updatefile.close();
            }
            catch(IOException e){
            JOptionPane.showMessageDialog(null,"Unable to rewrite file","Error",JOptionPane.ERROR_MESSAGE);  
            }
        }
        JOptionPane.showMessageDialog(null,"Successfully modified!");
    }
    
    public String redirectpage(){
        return (role+","+alias);
    }
    
    public void logtime(String state){
        GregorianCalendar cal = new GregorianCalendar();
        try{
            BufferedWriter output = new BufferedWriter (new FileWriter("loggings.txt",true));
            output.write(getUsername() + " " +state+" at "+String.valueOf(cal.getTime()));
            output.newLine();
            output.close();
        }
        catch (IOException e){
            JOptionPane.showMessageDialog(null,"Unable to locate file","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
