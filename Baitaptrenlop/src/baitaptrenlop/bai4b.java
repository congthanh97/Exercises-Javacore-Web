/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrenlop;

import static baitaptrenlop.bai4.nhap;
import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Anonymous
 */
public class bai4b {
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
            for(int j=0;j<=n-i;j++)
                System.out.printf(" ");
            for(int j=0;j<2*i+1;j++)
                if(i==0 || i==(n-1)){
                    System.out.print("*");
                }
                else{
                    if(j==0 || j==(2*i)){
                        System.out.printf("*");
                    }
                    else{
                        System.out.printf(" ");
                    }
                }
               System.out.println("");
        } 
    }
 
     
     
    
}
