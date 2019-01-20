/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrenlop;

import java.util.Scanner;

public class bai4 {
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
                System.out.printf("Nhap so khong nhap chu cai,Moi ban nhap lai: ");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.printf("Nhap: ");
        int n =  nhap();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i-1;j++)
                System.out.printf(" ");
            for(int j=0;j<2*i+1;j++)
                System.out.printf("*");
            System.out.printf("\n");
        } 
    }
}
