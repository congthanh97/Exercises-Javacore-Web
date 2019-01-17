/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;


public class UCBC {
  public static int nhap()
  {
    Scanner s = new Scanner(System.in);
    boolean check= false;
        int n = 0;
        while(!check){
            System.out.println(" ");
            try{
                n= s.nextInt(); 
                check= true;
            }catch(Exception e){
                System.out.println("Ban phai nhap so! hay nhap lai..."); 
                s.nextLine();
                    }
        }
      return (n);
    
}
public static int UCLN(int a, int b){
        while(a!=b){
            if(a>b)
                a= a-b;
            else
                b= b-a;
        }
        return (a);
    }
    public static void main(String[] args) {
        int a;
        int b;
         Scanner s = new Scanner(System.in);
           System.out.printf("Nhap a: ");
           a  = nhap();
           System.out.printf("Nhap b: "); 
           b = nhap();
           System.out.println("Uoc chung lon nhat cua "+a+" va "+b+" la: "+UCLN(a,b)); 
           System.out.println("Boi chung nho nhat cua "+a+" va "+b+" la: "+((a*b)/UCLN(a,b)));
    
    }
}
  