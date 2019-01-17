/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai56;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Main {
    public static void main(String[] args) {
       int choice;
       Scanner ip = new Scanner(System.in);
       //until u = new until();
        do {
            System.out.print("===================================\n");
            System.out.println("1. Hinh tam giac");
            System.out.println("2. Hinh CN");
            System.out.println("4. Thoat");
            System.out.print("====================================\n");
            System.out.printf("Nhap vao lua chọn: ");
            choice = ip.nextInt();
            switch(choice)
            {
                case 1:
                {
                   System.out.println("Tam giac");
                   Triangle triangle = new Triangle();
                   triangle.Input();
                   triangle.checkTriangle(triangle.getA(), triangle.getB(), triangle.getC());
                   System.out.println("Chu vi tam giac: "+triangle.TinhchuVi());
                   System.out.println("Dien tich tam giac: "+triangle.Tinhdientich());
                    
                   break;
                }
                case 2:
                {
                    System.out.println("Tinh chu vi va Dien Tich Hinh CN!");
                    hinhCN hcn = new hinhCN();
                    hcn.Input();
                    System.out.println("Dien tich hinh CN la: "+hcn.TinhDT());
                    System.out.println("Chu vi hinh CN la: "+hcn.Tinhchu());
                    break;
                }
                case 3:
                    System.exit(0);
                    
                
            }
        } while (choice!=4);
        
    }
    
}
