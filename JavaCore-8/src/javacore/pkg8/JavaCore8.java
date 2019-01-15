/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.pkg8;

import java.util.Scanner;

/**
 *
 * @author 8470p
 */
public class JavaCore8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager m=new Manager();
        int choice;
        String search;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.Add");
            System.out.println("2.List");
            System.out.println("3.Search");
            System.out.println("4.Exit");
            System.out.printf("CHOICE:");
            choice=sc.nextInt();
            switch(choice){
                case 1:m.Input();break;
                case 2:m.Show();break;
                case 3:System.out.printf("Title:");
                m.Search(new Scanner(System.in).nextLine());break;
            }
        }while (true);
        
    }
    
}
