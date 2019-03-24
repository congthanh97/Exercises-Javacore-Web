
package demo.com.person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     System.out.print("Student ? Employee ? (S|E) ");
        String c = new Scanner(System.in).nextLine();
        Manager instance = null;
        if (c.toUpperCase().equals("S")) {
            instance = new StudentManager() ;
        } else if (c.toUpperCase().equals("E")) {
            instance = new EmployeeManager();
        } else {
            System.out.println("Not valid");
        }

        if (instance != null) {
            Menu menu = new Menu(instance);
            menu.display();
        } 
       
    }
    
}
