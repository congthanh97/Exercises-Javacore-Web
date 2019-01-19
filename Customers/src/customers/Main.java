package customers;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
 
    
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ManagerCustomers customersManager = new ManagerCustomers();
        int customersId;
 
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                customersManager.add();
                break;
            case "2":
                customersId = customersManager.inputId();
                customersManager.editId(customersId);
                break;
            case "3":
                customersId = customersManager.inputId();
                customersManager.deleteId(customersId);
                break;
            case "4":
                customersManager.Search();
                break;
            case "5":
                customersManager.show();
                break;
            case "0":
                System.out.println("exited!");
                exit = true;
                break;
            default:
                System.out.println("invalid! please choose action in below menu:");
                break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }
    }
 
     public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add Customers.");
        System.out.println("2. Edit Customers by id.");
        System.out.println("3. Delete Customers by id.");
        System.out.println("4. Search");
        System.out.println("5. Show Customers.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
