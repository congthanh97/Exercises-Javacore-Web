/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore3;

import java.util.Random;
import java.util.Scanner;

public class bai4{
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
      public static void sortASC(int [] A) {
        int temp = A[0];
        for (int i = 0 ; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }
    public static void sortDec(int [] A) {
        int temp = A[0];
        for (int i = 0 ; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }
        }
    }
    public static int CountChan(int [] A){
        int count = 0 ;
         for (int i = 0 ; i < A.length - 1; i++) {
             if (A[i] %2 ==0 ) {
                 count ++;
             }
         }
         return count;
    }
     public static int CountLe(int [] A){
        int count = 0 ;
         for (int i = 0 ; i < A.length - 1; i++) {
             if (A[i] %2 !=0 ) {
                 count ++;
             }
         }
         return count;
    }
         
     public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int i;
        
        System.out.println("Nhap so ph tu cua mang n: ");
        int n = nhap();
        int [] a =  new int[n+1];
        Random rd = new Random();
        for(i = 0;i< n; i++){
           a[i] = rd.nextInt(1000);
            System.out.println("phan tu " +(i+1)+" = " + a[i]);
        }
        //sap xep 
        sortASC(a);
        System.out.println("Dãy số được sắp xếp tăng dần: ");
        show(a);
        sortDec(a);
        System.out.println("\nDãy số được sắp xếp giam dần: ");
        show(a);
        
        //dem so chan trong mang
        System.out.println("\nDay so chan la: " +CountChan(a));
        System.out.println("\nDay so chan la: " +CountLe(a));
        
        
    }
    
}
