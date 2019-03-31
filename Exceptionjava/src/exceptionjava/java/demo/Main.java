
package exceptionjava.java.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        //StudentManager sm = new StudentManager();
        StudentManager stu = new StudentManager();
        while(true) {
            try{
                System.out.println("----Xếp Loại Student----");
                System.out.println("1.   Student");
                System.out.println("2.   List");
                System.out.println("3.   Top3");
                System.out.println("4.   Exit");
                System.out.print("Chọn: ");
                int c = Integer.parseInt(input.nextLine());
                switch(c) {
                    case 1:
                        stu.add();
                        //System.out.println(stu.toString());
                        break;
                    case 2:
                        stu.show();
                        break;
                    case 3: 
                        stu.showTop(1);
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("not found!!!");
                }
            }
            catch(java.lang.NumberFormatException e){
                System.out.println("error!!!");
            }
        }
    }
}
