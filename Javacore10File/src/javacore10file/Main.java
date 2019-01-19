/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore10file;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.util.Scanner;

public class Main {

   public static void main(String[] args){
        // TODO code application logic here
        file File =  new file();
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("====================================");
            System.out.println("Xin mời bạn chon: ");
            System.out.println("1: Browse file");
            System.out.println("2: Create file");
            System.out.println("3: Delete file");
            System.out.println("4: Rename file");
            System.out.println("5: Exit");
            System.out.println("====================================");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                    case 1:
                        
                        File.BrowseFile();
                        break;
                    case 2:
                        File.CreateFile();
                        break;
                    case 3:
                        File.Delete();
                        break;
                    case 4:
                        File.RenameFile();
                        break;
                        
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Error!!!");
            }
        }while (true);           
            
    }
}
