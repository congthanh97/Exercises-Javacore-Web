/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai89;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class SinXX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do:  ");
        double x = input.nextDouble(); // don v? là d?
        // d?i don v? sang rad
        double xRad = x * Math.PI / 180;
        
        double ERR = 0.0000001;
        double dif = 0;
        double sinx = 0;
        int i = 0;
        do {
            dif = Math.pow(-1, i) * (Math.pow(xRad, 2*i+1) / factori(2*i+1));
            sinx += dif;
            i++;
        } while(Math.abs(dif) > ERR);
        
        System.out.println("===========================");
        System.out.println("sin("+x+") = " + sinx);
    }
    
    public static long factori(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factori(n - 1);
    }
    
}
