/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrenlop;

import java.util.Scanner;

public class bai1 {
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
        
        System.out.print("Nhap so: ");
        int n =  nhap();
        if(n <10 || n >99){
             System.out.printf("Error");
            
         }
         else{
             int donvi =  n %10;
             int chuc  = n /10;
             if (chuc == 2){
                 System.out.printf("Hai");
             }
             else if (chuc == 3){
                 System.out.printf("Ba");
             }
             else if (chuc == 4){
                 System.out.printf("Bon");
             }
             else if (chuc == 5){
                 System.out.printf("Năm");
             }
             else if (chuc == 6){
                 System.out.printf("Sáu");
             }
             else if (chuc == 7){
                 System.out.printf("Bảy");
             }
             else if (chuc == 8){
                 System.out.printf("Hai");
             }
             else if (chuc == 9){
                 System.out.printf("Hai");
             }
             else{
                 System.out.printf("Mười");
             }
             
             
             //Don vi
             
             if (donvi == 1){
                 System.out.printf("Một");
             }
             else if (donvi == 2){
                 System.out.printf("Hai");
            }
            else if (donvi == 3){
                 System.out.printf("Ba");
            }
            else if (donvi == 4){
                 System.out.printf("Bon");
            }
            else if (donvi == 5){
                 System.out.printf("Năm");
            }
            else if (donvi == 6){
                 System.out.printf("Sáu");
            }
            else if (donvi == 7){
                 System.out.printf("Bảy");
            }
            else if (donvi == 8){
                 System.out.printf("Tam");
            }
            else if (donvi == 9){
                 System.out.printf("chin");
            }
         }
          
        
        
        
    }
    
}
