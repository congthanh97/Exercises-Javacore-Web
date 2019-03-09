/*
 Viết class NhanVien gồm các thuộc tính:
+ Tên
+ Tuổi
+ Địa chỉ
+ Tiền lương (kiểu double)
+Tổng số giờ làm (kiểu int)
Constructor không tham số. Constructor đầy đủ tham số. Các hàm get/set
Và các phương thức:
- void inputInfo() : Nhập các thông tin cho nhân viên từ bàn phím
- void printInfo() : in ra tất cả các thông tin của nhân viên
- double tinhThuong(): Tính toán và trả về số tiền thưởng của nhân viên theo
công thức sau:
Nếu tổng số giờ làm của nhân viên >=200 thì thưởng = lương * 20%
Nếu tổng số giờ làm của nhân viên <200 và >=100 thì thưởng = lương * 10%
Nếu tổng số giờ làm của nhân viên <100 thì thưởng = 0
*/
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
