/*
* Xây dựng lớp đa giác, hình bình hành thừa kế từ đa giác, hình chữ nhật thừa kế từ
* hình bình hành và hình vuông thừa kế từ hình chữ nhật. Nhập vào các thuộc tính
* cần thiết của mỗi hình và tính chu vi, diện tích của hình đó
 */
package bai12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         int choice;
       Scanner ip = new Scanner(System.in);
       //until u = new until();
        do {
            System.out.print("===================================\n");
            System.out.println("1. Tinh CV&DT hinh Vuong");
            System.out.println("2. Tinh CV&DT hinh CN");
            System.out.println("3. Tinh CV&DT hinh Binh Hanh");
            System.out.println("4. Thoat");
            System.out.print("====================================\n");
            System.out.printf("Nhap vao lua chọn: ");
            choice = ip.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Tinh Dien Tich & Chu Vi Hinh Vuong!");
                   // dahinh dh = new dahinh();
                    hinhVuong hv = new hinhVuong();
                    System.out.print("Nhap vao canh hinh vuong: ");
                    hv.setCanh(ip.nextDouble());
                    //hv.tinhDT();
                    System.out.println("Dien tich hinh vuong la: "+hv.tinhDT());
                    System.out.println("Chu vi Hinh vuong la: "+hv.tinhCV());
                    break;
                }
                case 2:
                {
                    System.out.println("Tinh Dien Tich & Chu Vi Hinh CN!");
                    hinhCN hcn = new hinhCN();
                    System.out.printf("Nhap vao chieu dai: ");
                    hcn.setDai(ip.nextDouble());
                    System.out.printf("Nhap vao chieu rong: ");
                    hcn.setRong(ip.nextDouble());
                    System.out.println("Dien tich hinh CN la: "+hcn.tinhDT());
                    System.out.println("Chu vi hinh CN la:"+hcn.tinhCV());
                    break;
                }
                case 3:
                {
                    System.out.println("Tinh Dien Tich & Chu Vi Hinh Binh Hanh!");
                    hinhbinhhanh hbh =  new hinhbinhhanh();
                    System.out.printf("Nhap vao chieu dai: ");
                    hbh.setcDai(ip.nextDouble());
                    System.out.printf("Nhap vao chieu rong: ");
                    hbh.setcRong(ip.nextDouble());
                    System.out.printf("Nhap vao chieu cao: ");
                    hbh.setH(ip.nextDouble());
                    System.out.println("Dien tich hinh binh hanh la: "+hbh.tinhDT());
                    System.out.println("Chu vi hinh binh hanh la: "+hbh.tinhCV());
                    break;
                }
                case 4:
                    System.exit(0);
                    
                
            }
        } while (choice!=4);
        
        
        
    }
}
