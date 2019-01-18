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
public class bai1 {

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
    public static void main(String[] args) {
       int[] A = new int[100];
       int S1 = 0,S2=0,S3=0;
       System.out.printf("nhap so nguyen N: ");
       int n = nhap();
       for (int  i = 1;i<=n;i++){
            System.out.printf("A[" + i + "] : ");
            A[i] = nhap(); 
       }
      for(int i=1;i<=n;i++){
          S1 +=A[i]; 
          if(A[i]%2==0){
              S2 += A[i];
          }else{
              S3 += A[i];
          }
      }
        System.out.printf("S1: %d\n",S1);
        System.out.printf("S2: %d\n",S2);
        System.out.printf("S3: %d\n",S3);
               
    }
    
}
