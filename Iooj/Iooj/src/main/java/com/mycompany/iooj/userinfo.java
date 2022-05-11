package com.mycompany.iooj;
import java.io.*;

public class userinfo {
    
    public userinfo(String username){
        this.username = username;
    }
    public userinfo(){};
    
    private String username;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String validateusername(){
        String validateusername = null;
        String lineofinfo;
        try{
            BufferedReader input = new BufferedReader (new FileReader("userinfo.txt"));
            while((lineofinfo = input.readLine())!=null){
                String [] answer = lineofinfo.split(",");
                if (answer[0].equals(username)){
                    validateusername = (answer[0]);
                    break;
                }
            }
                return validateusername;
            }catch (IOException e){
                return validateusername;
            }
    }
    
    public String[] addmoretoarray (String [] sample){
        String [] addone = new String [sample.length+1];
            for (int i = 0;i <sample.length;i++){
            addone[i] = sample[i];
            }
        return addone;
    }
}
