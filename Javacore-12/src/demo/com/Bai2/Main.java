/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.Bai2;

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
        StudentManager studentManager = new StudentManager();
        int studentId;
 
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                studentManager.add();
                break;
            case "2":
                studentId = studentManager.inputId();
                studentManager.editId(studentId);
                break;
            case "3":
                studentId = studentManager.inputId();
                studentManager.deleteId(studentId);
                break;
            case "4":
                studentManager.sortStudentDmTB();
                break;
            case "5":
                studentManager.sortStudentName();
                break;
            case "6":
                studentManager.sortStudentId();
                break;
            case "7":
                studentManager.AddThem();
                break;
            case "8":
                studentManager.Search();
                break;
            case "9":
                studentManager.show();
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
 
    /**
     * create menu
     */
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add students.");
        System.out.println("2. Edit students by id.");
        System.out.println("3. Delete students by id.");
        System.out.println("4. Sort students by DMTB.");
        System.out.println("5. Sort students by name.");
        System.out.println("6. Sort student by id");
        System.out.println("7. Add students after id");
        System.out.println("8. Search");
        System.out.println("9. Show students.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
