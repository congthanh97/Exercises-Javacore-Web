package jdbc1;

import java.sql.Connection;
import java.sql.*;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Scanner input = new Scanner(System.in);
            ManagerStu qly = new ManagerStu();

            System.out.println("---MENU---");
            System.out.println("1. Danh sach");
            System.out.println("2. Them SV");
            System.out.println("3. Sua thong tin");
            System.out.println("4. Xoa SV");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");
            int chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    List<Student> list = qly.getAll();
                    for (Student sv : list) {
                        System.out.println(sv);
                    }
                    break;
                case 2:
                    Student sv = new Student();
                    System.out.print("Ten: ");
                    sv.setName(input.nextLine());
                    System.out.print("pass: ");
                    sv.setPass(input.nextLine());
                    System.out.print("address: ");
                    sv.setAddress(input.nextLine());

                    int rs = qly.add(sv);
                    System.out.println("Ket qua: " + rs);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
