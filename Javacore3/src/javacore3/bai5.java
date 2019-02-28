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

    public static void main(String[] args) {
        System.out.println("nhap vector a: ");
        System.out.printf("X = ");
        int X1 = nhap();
        System.out.printf("Y = ");
        int Y1 = nhap();
        System.out.printf("Z = ");
        int Z1 = nhap();
        System.out.println("Nhap vector b: ");
        System.out.printf("X = ");
        int X2 = nhap();
        System.out.printf("Y = ");
        int Y2 = nhap();
        System.out.printf("Z = ");
        int Z2 = nhap();
        int x,y,z,X,Y,Z;
        x = X1 + X2;
        y = Y1 + Y2;
        z = Z1 + Z2;
        X = X1 * X2;
        Y = Y1 * Y2;
        Z = Z1 * Z2;
        System.out.printf("Tong ( %d %d %d )\n",x,y,z);
        System.out.printf("Tich ( %d %d %d )\n",X,Y,Z);

    }
    
}
