/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore10file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class file {
    Scanner scanner = new Scanner(System.in);
    
    public void BrowseFile(){
        File f = null;
      File[] paths;
      
      try {  
      
          System.out.println("Browse File path: ");
          String pathFile =  scanner.nextLine();
         f = new File(pathFile);
         
         // returns pathnames for files and directory
         paths = f.listFiles();        
         // for each pathname in pathname array
         for(File path:paths) {
            // prints file and directory paths
            System.out.println(path);
         }
      } catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
    }
   
    
    
    public void CreateFile() {   
        try {
           System.out.print("Enter the path Create you want to Create: ");
           String path= scanner.nextLine();
           File file = new File(path);
            if (file.createNewFile()){
                System.out.println(file.getName()+ " File is created!");
                FileWriter fw = new FileWriter(file.getAbsoluteFile());
                BufferedWriter bw = new BufferedWriter(fw);

                // Write in file
                System.out.print("Content: ");
                String content =  scanner.nextLine();
                bw.write(content);

                // Close connection
                bw.close();
            }else{
                System.out.println("File already exists.");
            }

           
        } catch (Exception e) {
          
        }
    }
    
    public void Delete(){
        System.out.print("Enter the path file you want to delete: ");
        String path = scanner.nextLine();
        File file1 = new File(path);
         if(file1.isFile()) 
        { 
            file1.delete();
            System.out.println(file1.getName()+ " \tFile deleted successfully"); 
        } 
         else
        { 
            System.out.println("Not file or directory"); 
        } 
    }
    
    public void RenameFile(){
        System.out.printf("Enter the path.The old file name you want to Rename: ");
        String path1 = scanner.nextLine();
        File oldfile =new File(path1);
        //
        System.out.printf("Enter the path.The new  file name you want to create: ");
        String path2 =  scanner.nextLine();
        File newfile =new File(path2);
        if(oldfile.renameTo(newfile)){
                System.out.println("Rename succesful");
        }else{
                System.out.println("Rename failed");
        }
        
    }
   
}
