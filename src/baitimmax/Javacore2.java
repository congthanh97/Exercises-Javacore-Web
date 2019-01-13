/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitimmax;

import java.util.Scanner;


/**
 *
 * @author Anonymous
 */
public class Javacore2 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
       int a = -1,max = 0;
        do {
           System.out.printf("nhap a : ");
           a = input.nextInt();
           if(a >=max){
               max  = a;
           }
        } while (a != 0);
        System.out.printf("max : " +max);
        System.out.println("\n");
       
    }
              
}
