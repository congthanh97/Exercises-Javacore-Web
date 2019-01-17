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
public class bai7 {
      public static void main(String[] args) {
        
//        Matrix a = new Matrix(3, 3);
//        a.input();
//        Matrix b = new Matrix(3, 3);
//        b.input();
//        
//        
//        Matrix c = a.add(b);
//        System.out.println(c.getValues());
//        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma tran A");
        
        int[][] matrixA = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Nhap ma tran B");
        
        int[][] matrixB = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Tong 2 ma tran");
        int[][] matrixC = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        
    }
    
}
