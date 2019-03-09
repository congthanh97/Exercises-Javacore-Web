/**
 * cong nhan,tru vector;
 */
package bai9;

import java.util.Scanner;

public class ManagerVT {
   // Scanner input  =  new Scanner(System.in);
    Vector vector  =  new Vector();
    Vector vector1 =  new  Vector();
    Vector vector2 =  new Vector();
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
   
    public void inputVT1(){
        System.out.println("Nhap thong tin cho vector 1: ");
        System.out.printf("X: ");
        int x =  nhap();
        vector.setX(x);
        System.out.printf("Y: ");
        int y  = nhap();
        vector.setY(y);
        
        //System.out.println(vector.getX()+","+ vector.getY());
    }

    public void inputVT2(){
        System.out.println("Nhap thong tin cho vector 2: ");
        System.out.printf("X: ");
        int x =  nhap();
        vector1.setX(x);
        System.out.printf("Y: ");
        int y  = nhap();
        vector1.setY(y);
        
        //System.out.println(vector.getX()+","+ vector.getY());
    }
   public void  add(){
       int x = vector.getX() +  vector1.getX();
       vector2.setX(x);
       int  y =  vector.getY() +  vector1.getY();
       vector2.setY(y);
   }
   
   public void sub(){       
       int x = vector.getX() -  vector1.getX();
       vector2.setX(x);
       int  y =  vector.getY() -  vector1.getY();
       vector2.setY(y);
   }
   
   public void mul(){
       int  x = vector.getX() *  vector1.getX();
       vector2.setX(x);
       int  y =  vector.getY() *  vector1.getY();
       vector2.setY(y);
   }
   
   public void PrintVT(){  
       System.out.println("Vector ("+vector2.getX()+ ","+ vector2.getY()+ ")");
   }
   
    
}
