/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore3;


import java.util.Scanner;

public class bai3{
    
    public static int nhap(){
        Scanner input = new Scanner(System.in);
        boolean check  = false;
        int n = 0;
        while(!check){
            System.out.printf(" ");
            try{
                n = input.nextInt();
                check = true;
            }catch(Exception e){
                System.out.printf("Nhap so khong nhap chu cai,Moi ban nhap lai");
                input.nextLine();
            }
        }
        return (n);
    }
    
    public static int FoundA(int [] A,int a,int n) {
        System.out.printf("Vị trí là: ");
        for (int i = 1; i <=n; i++) {
            if (A[i] == a) {
                System.out.printf(i + "\t");
            }
        }
        return 0;
    }
    
    
    
     public static void main(String[] args) {
       int[] A = new int[100];
       System.out.printf("nhap so nguyen N: ");
       int n = nhap();
       for (int  i = 1;i<=n;i++){
            System.out.printf("A[" + i + "] : ");
            A[i] = nhap(); 
       }
       while(true){
            System.out.printf("nhap so nguyen A can tim: ");
            int a = nhap();
            FoundA(A, a, n);
            System.out.println("\n");
        }
    }
    
}
