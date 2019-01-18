/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore9exception;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Main {

    public static void main(String[] args) throws MyException {
        Scanner input = new Scanner(System.in);
        
        //StudentManager sm = new StudentManager();
        Student sm = new Student();
        while(true) {
            try{
                System.out.println("----Xếp Loại Student----");
                System.out.println("1.   Student");
                System.out.println("2.   Exit");
                System.out.print("Chọn: ");
                int c = Integer.parseInt(input.nextLine());
                switch(c) {
                    case 1:
                        sm.add();
                        System.out.println(sm.toString());
                        break;
                    case 2:
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
