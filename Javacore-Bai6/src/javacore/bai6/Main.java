/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bai6;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Main{

      public static Scanner scanner = new Scanner(System.in);
 
    
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ManagerPerson managerPerson = new ManagerPerson();
        int personId;
 
        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
            case "1":
                managerPerson.add();
                break;
            case "2":
                personId = managerPerson.inputId();
                managerPerson.editId(personId);
                break;
            case "3":
                personId = managerPerson.inputId();
                managerPerson.deleteId(personId);
                break;
            case "4":
                managerPerson.Search();
                break;
            case "5":
                //managerPerson.sortPersonNameG();
               // managerPerson.sort();
                managerPerson.show();
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
        System.out.println("1. Add Person.");
        System.out.println("2. Edit Person by id.");
        System.out.println("3. Delete Person by id.");
        System.out.println("4. Search");
        System.out.println("5. Show Person.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
