/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore3;

import java.util.Scanner;


/**
 *
 * @author Anonymous
 */
public class bai5 {
     public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check  = false;
        int n = 0;
        while(!check){
            System.out.println(" ");
            try{
                n = input.nextInt();
                check = true;
            }catch(Exception e){
                System.out.println("Nhap so khong nhap chu cai,Moi ban nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    public void Vector1(){
        int x1,y1,z1;
        x1 = nhap();
        y1 = nhap();
        z1 = nhap();
    }
    public static void main(String[] args) {
       //Vector1();
        
        
    }
    
}
