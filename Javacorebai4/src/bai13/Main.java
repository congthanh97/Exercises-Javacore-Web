
package bai13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
           int choice;
       Scanner ip = new Scanner(System.in);
       //until u = new until();
        do {
            System.out.print("===================================\n");
            System.out.println("1. Tinh DT elip");
            System.out.println("2. Tinh DT Circle");
            System.out.println("3. Thoat");
            System.out.print("====================================\n");
            System.out.printf("Nhap vao lua chọn: ");
            choice = ip.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Tinh Dien Tich Elip!");
                   // dahinh dh = new dahinh();
                    Elip elip = new Elip();
                    System.out.print("Nhap vao A: ");
                    elip.setA(ip.nextInt());
                    System.out.print("Nhap vao B: ");
                    elip.setB(ip.nextInt());
                   
                    System.out.println("Dien tich elip la: "+elip.Tdt());
                    
                    break;
                }
                case 2:
                {
                    System.out.println("Tinh Dien Tich Circle");
                    circle c = new circle();
                    System.out.printf("Nhap vao ban kinh R: : ");
                    c.setR(ip.nextInt());
                    System.out.println("Dien tich hinh CN la: "+c.Tdt());
                    
                    break;
                }
               
                case 3:
                    System.exit(0);
            }
        } while (choice!=3);
        
        
        
    }
}
