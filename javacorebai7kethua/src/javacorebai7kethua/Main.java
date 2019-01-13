
package javacorebai7kethua;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Main {
    public static Scanner scanner = new Scanner(System.in);
  
    public static void main(String[] args) {
      String choose = null;
        boolean exit = false;
        StoreManager storeManager = new StoreManager();
 
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                storeManager.addProduct();
                break;
            case "2":
                  storeManager.showSmartPhone();
                break;
            case "3":
                storeManager.showCamera();
                break;
            case "4":
//                storeManager.sortStudentDmTB();
                break;
            case "5":
                storeManager.DeleteId();
                break;
            case "6":
                storeManager.EditId();
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
        System.out.println("1. addProduct");
        System.out.println("2. List smartphone");
        System.out.println("3. List Camera");
        System.out.println("4. Search");
        System.out.println("5. DeleteId");
        System.out.println("6. editId");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
