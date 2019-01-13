/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class GiaiPT2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       float a;
       float b;
       float c;
       Scanner s = new Scanner(System.in);
       System.out.println("nhap a: ");;
       a  = s.nextFloat();
       System.out.println("nhap b: ");
       b  = s.nextFloat();
       System.out.println("nhap c: ");
       c  = s.nextFloat();
       if(a == 0){
           if((b==0)&&(c==0)){
               System.out.println("Phuong trinh vo so nghiem:");
           }
           else if((b==0)&&(c!=0)){
               System.out.println("Phuong trinh vo  nghiem:");
           }
           else if ((b!=0)&&(c==0))
           {
               System.out.println("Phuong trinh vo nghiem");
           }
           else if((b!=0)&&(c!=0))
           {
               float x = (float) -c/b;
               System.out.println("phuong trinh co 1 nghiem x = " +x);
           }
       }
       else{
            float delta=b*b-4*a*c ;
            if (delta<0)
                System.out.println("Phuong trinh vo nghiem");
            if (delta==0)
            {
                    float  x1 = (float) -b/(2*a);
                    System.out.println("Phuong trinh co nghiem kep : x1 = x2 = " +x1);
            }
            if (delta>0)
            {
                    float x1=(float) ((-b+sqrt(delta))/(2*a));
                    float x2=(float) ((-b-sqrt(delta))/(2*a));
                    System.out.println("Phuong trinh co 2 nghiem phan biet");
                    System.out.println("x1 = " +x1);
                    System.out.println("x2 = " +x2);
            }
       } 
    }
}

