
package bai2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SimpleVim {
    protected Scanner scanner = new Scanner(System.in);
    
    public void createFile(String path) throws IOException{
        File file =  new File(path);
        if (file.exists()){
            System.out.println(file.getPath());
        } else {
            if(file.createNewFile()){
                System.out.println(file.getName()+ " File is created!");
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                System.out.print("Content: ");
                String content =  scanner.nextLine();
                System.out.print("Exit: ");
                String con =  scanner.nextLine();
                if(con.equals(":wq")){
                    bw.write(content);
                    bw.close();
                }
                else if( con.equals(":q")){
                    bw.close();    
                }  
            }
        }    
    }
    
     public void createAndWriteFile() {   
        try {
           System.out.print("Enter the path and name file create: ");
           String path= scanner.nextLine();
           File file = new File(path);
            if (file.createNewFile()){
                System.out.println(file.getName()+ " File is created!");
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);
                // Write in file
                System.out.print("Content: ");
                String content =  scanner.nextLine();
                System.out.print(" ");
                String con =  scanner.nextLine();
                
                if(con.equals(":wq")){
                    bw.write(content);
                    // Close connection
                    bw.close();
                }
                else if(con==":q"){
                     bw.close();   
                }
            }else{
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
     
    public void showFile(String path) throws IOException{
        BufferedReader br = null;
        File file = new File(path);
        try {
            FileReader fw = new FileReader(file.getAbsoluteFile());
             br = new BufferedReader(fw);
            String content = br.readLine();
            while(content != null){
                System.out.println(content);
                content = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
     }
    
}
