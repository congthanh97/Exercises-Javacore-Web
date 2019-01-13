/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore3;


import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class bai2{
    
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
    
    public static int chiahet3(int [] A,int n) {
        System.out.println("Các phần tử chia hết cho 3 là: ");
        for (int i = 1; i <=n; i++) {
            if (A[i] % 3 == 0) {
                System.out.printf(A[i] + "\t");
            }
        }
        return 0;
    }
    public static int FoundMax(int[] A,int n) {
        int max = A[1];
        for(int i = 1 ;i<=n;i++){
            if(max < A[i])
                max = A[i];
        }
        return max;

        
    }
    
    public static int FoundMin(int[] A,int n) {
        int min = A[1];
        for(int i = 1 ;i<=n;i++){
            if(min > A[i])
                min = A[i];
        }
        return min;

        
    }
    public static void main(String[] args) {
       int[] A = new int[100];
       System.out.printf("nhap so nguyen N: ");
       int n = nhap();
       for (int  i = 1;i<=n;i++){
            System.out.printf("A[" + i + "] : ");
            A[i] = nhap(); 
       }
        chiahet3(A, n);
        System.out.println("\n");
        System.out.println("Max: "+FoundMax(A, n));
        System.out.println("Mix: "+FoundMin(A, n));
       
        
    }
}
