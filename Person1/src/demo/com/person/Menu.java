/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.person;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Menu {
    
    private Manager manager = null;

    public Menu(Manager manager) {
        this.manager = manager;
    }

    public void display() {
        int c = 0;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Add");
            System.out.println("2. Show");
            System.out.println("3. Search ");
            System.out.println("4. Exit");
            System.out.print("Choose (1-4) > ");
            Scanner input = new Scanner(System.in);
            c = Integer.parseInt(input.nextLine());
            switch (c) {
                case 1:
                    this.manager.add();
                    break;
                case 2:
                    this.manager.show();
                    break;
                case 3:
                    System.out.print("Name > ");
                    String name = input.nextLine();
                    this.manager.search(name);
                    break;
//                case 4:
//                    System.exit(0);
//                    break;
            }
        } while (c < 4 && c > 0);
    }
    
}
