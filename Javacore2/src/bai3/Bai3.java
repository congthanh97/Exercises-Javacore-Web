/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
//Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước
import java.util.Scanner;

public class Bai3 {
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
    public static boolean checkSNT(int n){
        if(n>1){
            for(int i=2;i<=Math.sqrt(n);i++){ 
                if(n%i==0) 
                    return false;
            }
            return true;
        }
        else 
            return false;
 }
    public static void check(int n){
        if(checkSNT(n)){
            System.out.println(n+ " la so nguyen to" );
        }
        else
            System.out.println(n+ "khong phai so nguyen to ");
    }
    
    public static void TimkiemLietke(int n){
        int i=2;
        int count=0;
        while(count < n){
            if(checkSNT(i)){
                System.out.print(" " +i);
                count++; 
            }i++;    
        }
      
        System.out.println("\n");
//        System.out.print("Co tong " + count + " nguyen to ung voi n = " +n);
        
    }
    public static void main(String[] args) {
        System.out.printf("nhap n : ");
        int n = nhap();
          check(n);
        System.out.println("list so nguyen to dau tien cua  " + n + " la: ");
      
        
        TimkiemLietke(n);
        System.out.println("\n");
    }
    
}
