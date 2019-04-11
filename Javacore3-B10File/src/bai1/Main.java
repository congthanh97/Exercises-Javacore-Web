
package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        FileUtils File =  new FileUtils();
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("====================================");
            System.out.println("Xin mời bạn chon: ");
            System.out.println("1: Browse Dir");
            System.out.println("2: Browse file");
            System.out.println("3: Browse pic");
            System.out.println("4: last Modify Time");
            System.out.println("5: Exit");
            System.out.println("====================================");
            System.out.print("Choice: ");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice) {
                    case 1:
                        File.BrowseDirectory();
                        break;
                    case 2:
                        File.BrowseFile();
                        break;
                    case 3:
                        File.BrowsePic();
                        break;
                    case 4:
                        File.lastModifyTime();
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
