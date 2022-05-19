package com.mycompany.iooj;
import java.io.*;
import javax.swing.*;

public class usersignup extends userinfo{
    
    public usersignup(String username){
        super(username);
    }
    public usersignup(){
        
    }
    public void signinuser(){
            try{
            BufferedWriter signupuser = new BufferedWriter (new FileWriter("userinfo.txt",true));
            signupuser.write(getUsername() + "," + getAlias() + "," + getPassword()+ "," + getEmail() + "," +getRole() + "," + getContact());
            signupuser.newLine();
            signupuser.close();
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"Invalid File","Error",JOptionPane.ERROR_MESSAGE);
            }
    }
    @Override
    public String infovalidation(){
        String lineofinfo;
        String validateusername = null;
        try{
            BufferedReader input = new BufferedReader (new FileReader("userinfo.txt"));
            while((lineofinfo = input.readLine())!=null){
                String [] usernamecheck = lineofinfo.split(",");
                if (usernamecheck[0].equals(getUsername())){
                    validateusername = (usernamecheck[0]);
                    break;
                    }
            }
                return validateusername;
        }catch (IOException e)
            {
                return validateusername;
            }
    }
}
