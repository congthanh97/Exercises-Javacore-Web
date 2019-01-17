/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai56;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Triangle {
    private int a;
    private int b;
    private int c;
    Scanner ip = new Scanner(System.in);
    
    public Triangle(){
        
    }
    public Triangle(int a,int b,int c){
        
    }
    
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getB(){
        return b;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getC(){
        return c;               
    }
    public void setC(int c){
        this.c = c;
    }
    
    public void Input(){
        System.out.print("Nhập a: ");
        a = ip.nextInt();
        System.out.print("Nhập b: ");
        b = ip.nextInt();
        System.out.print("Nhập c: ");
        c = ip.nextInt();
    }
   
    public void checkTriangle(int a,int b,int c){ 
    if( a<b+c && b<a+c && c<a+b ){
        if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b)
            System.out.println("Đây là tam giác vuông !");
        if(a==b && b==c)
            System.out.println("Đây là tam giác đều !");
        else if(a==b || a==c || b==c)
            System.out.println("Đây là tam giác cân !");
        else if(a*a > b*b+c*c || b*b > a*a+c*c || c*c > a*a+b*b)    
            System.out.println("Day la tam giac tu");
        else
            System.out.println("Day la tam giac nhon");
    }
    else
            System.out.println("Ba canh a, b, c khong phai la ba canh cua mot tam giac");
    }
    
    public double Tinhdientich(){
        double p =  (this.a+this.b+this.c)/2;
        return  Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
    }
    
    public int TinhchuVi(){
        return (this.a+this.b+this.c)/2;
    }
}
