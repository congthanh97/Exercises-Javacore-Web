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
public class bai6 {
    
    
 
    public static int tongdong(int [][] matrixA,int x)
    {
            int sum=0;
            for(int j=0;j<matrixA.length;j++)
                    sum=sum+matrixA[x][j];
            return sum;
    }
    public static int tongcot(int [][] matrixA,int x)
    {
            int sum=0;
            for(int i=0;i<matrixA.length;i++)
                sum=sum+matrixA[i][x];
            return sum;
    }

    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
        System.out.printf("cot n: ");
        int n =  input.nextInt();
        System.out.printf("dong m: ");
        int m = input.nextInt();
        System.out.println("Nhap ma tran A");
        int[][] matrixA = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma tran A");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(matrixA[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        //tong dong
        for(int x =0;x<n;x++){
            System.out.printf("Tong dong %d  la %d\n",x,tongdong(matrixA, x));
        }
        
        //tong cot
        for (int x = 0; x < m; x++) {
           System.out.printf("Tong cot %d  la %d\n",x,tongcot(matrixA, x));
        }
     
    }
    
}
