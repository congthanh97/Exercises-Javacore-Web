
package studentjdbc;
//import java.sql.Connection;
//import java.sql.*;
//
//import java.text.SimpleDateFormat;
//import static java.lang.System.exit;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
         
        boolean exit = false;
        // TODO code application logic here
         while (true) {
            Scanner input = new Scanner(System.in);
            ManagerStu qly = new ManagerStu();
            List<Student> list = qly.getAll();

            System.out.println("\n\t\t\t\t--MENU---");
            System.out.println("\t\t\t1. Danh sach");
            System.out.println("\t\t\t2. Them SV");
            System.out.println("\t\t\t3. Sua thong tin");
            System.out.println("\t\t\t4. Xoa SV");
            System.out.println("\t\t\t5. Thoat");
            System.out.print("\t\t==>Chon: ");
            int chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("\t\t\t\tList Student");
                     System.out.printf("\n%5s %20s %20s %20s\n","ID","Hoten","Address","PassWord");
                    for (Student sv : list) {
                        //System.out.println(sv);
                        System.out.format("%5d  | ", sv.getId());
                        System.out.format("%20s | ", sv.getName());
                        System.out.format("%20s |", sv.getAddress());
                        System.out.format("%20s%n",  sv.getPass());
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
                      // int  ad = pstmt.executeUpdate();
                    if(rs >0){
                        System.out.println("Add student successfull");
                    }else{
                        System.out.println("Add student not successfull");
                    }   
                   
                    break;
                case 3:
                    System.out.print("Nhap id: ");
                    int ID =  input.nextInt();
                    for (Student SV : list) {
                       if(SV.getId()==ID){
                            System.out.printf("Ten: ");
                            SV.setName(input.nextLine());
                            System.out.printf("pass: ");
                            SV.setPass(input.nextLine());
                            System.out.printf("address: ");
                            SV.setAddress(input.nextLine());

                            int Us = qly.update(SV);
                            if(Us >0){
                                System.out.println("Update student successfull");
                            }else{
                                System.out.println("Update student not successfull");
                            }       
                       }
                       else{
                           System.out.printf("not id %d in list \n",ID);
                           break;
                       }
                    }
                       
                    break;
                case 4:
                    System.out.print("nhap id Delete: ");
                    int id = input.nextInt();
                    int ds = qly.delete(id);
                    break;
                case 5:
                     System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if(exit){
                break;
            }
        }

    }
}
