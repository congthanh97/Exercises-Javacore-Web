/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class doixung {
     public static void main(String[] args){
         int num,r,sum=0,temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Input n = ");
        input = new Scanner(System.in);
        num = input.nextInt();
        for(temp=num;num!=0;num=num/10){
         r=num%10;
         sum=sum*10+r;
    }
    if(temp==sum)
             System.out.println("is a palindrome");
    else
             System.out.println("is not a palindrome");
     }
    
    
}
