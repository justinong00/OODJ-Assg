package com.mycompany.iooj;
import java.io.*;
import javax.swing.*;

public class usersignup extends userinfo{
    
    public usersignup(String username){
        super(username);
    }
    
    public void updateuserinfo(String username,String alias,String password,String email,String role){
            try{
            BufferedWriter output = new BufferedWriter (new FileWriter("userinfo.txt",true));
            output.write(username + "," + alias + "," + password+ "," + role + "," + email);
            output.newLine();
            output.close();
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null,"Invalid F","Error",JOptionPane.ERROR_MESSAGE);
            }
    }
}
