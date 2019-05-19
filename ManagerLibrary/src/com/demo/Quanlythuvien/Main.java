package com.demo.Quanlythuvien;

import java.sql.ResultSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        boolean exit = false;
        // TODO code application logic here

        while (true) {
            Scanner input = new Scanner(System.in);
            Manager qly = new Manager();
            //  List<Student> list = qly.getAll();

            System.out.println("\n\t\t\t\t--------------MENU--------------");
            System.out.println("\t\t\t1. Bai5: Hien thi ten khoa và các độc giả và sắp xếp theo khoa");
            System.out.println("\t\t\t2. Bai6: Tìm nhưng đọc giả mượn sách Toán vào ngày 1/1/2018");
            System.out.println("\t\t\t3. Bài7: Hiển thị tên số thẻ ,tên sách của tất cả các độc giả mượn sách trong tháng 1/2018 ");
            System.out.println("\t\t\t4. Bai8:Danh sách các sách không ai mượn");
            System.out.println("\t\t\t5. Bai9: Cho biết đọc giả Anh mượn sách bao nhiêu lần");
            System.out.println("\t\t\t6. Bai10: Danh sách tên,số thể các độc giả chưa trả sách");
            System.out.print("\t\t==>Chon: ");
            int chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    qly.bai5();
                    break;
                case 2:
                    try {
                        System.out.print("Nhap ten sach: ");
                        String name = input.nextLine();
                        System.out.print("Nhap ngay muon (dd/mm/yyyy): ");
                        String date = input.nextLine();

                        ResultSet rs = qly.Bai6(name, date);
                        System.out.println("Ten");
                        while (rs.next()) {
                            System.out.println(rs.getString("ten"));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    break;
                case 3:
                    try {
                        //Process p = new Process();

                        System.out.print("Nhap ngay start(dd/mm/yyyy): ");
                        String date1 = input.nextLine();
                        System.out.print("Nhap ngay end (dd/mm/yyyy): ");
                        String date2 = input.nextLine();

                        ResultSet rs = qly.bai7(date1, date2);
                        System.out.printf("\n%10s %10s %10s \n","Ten doc gia","So the","Ten sach");
                        while (rs.next()) {
                            System.out.println(rs.getString(1)+"\t" +rs.getString(2)+"\t "+rs.getString(3));
                            
                        }
                        
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    qly.bai8();
                    break;
                case 5:
                    try {
                        //Process p = new Process();
                        
                        System.out.print("Nhap ten : ");
                        String name = input.nextLine();
                        ResultSet rs = qly.bai9(name);
                        System.out.println("So lan");
                        while (rs.next()) {
                            System.out.println(rs.getString(1));
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    qly.bai10();
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
        }

    }

}
