
package bai1;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nhân viên trong công ty: ");
        int soNhanVien = scanner.nextInt();
        NhanVien[] nhanVien = new NhanVien[soNhanVien];
         
        //nhap thong tin cho nhan vien ;
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            nhanVien[i] = new luong();
            nhanVien[i].inputInfo();
            nhanVien[i].tinhLuong();
        }
         
        System.out.println("Thông tin của các nhân viên trong công ty: ");
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println(nhanVien[i].printInfo());
        }

    }
}
