/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai17;

/**
 *
 * @author Anonymous
 */
public class Main {
    public static void main(String[] args) {
        MyPoint p1=new MyPoint(3,0);
        MyPoint p2=new MyPoint(5,4);
        double a = p1.Distance(p2);
        System.out.println(p1.Distance(p2));
       // System.out.println(p1.Distance(5,6));
       circle c = new circle(p1.getX(),p1.getY(),3);
        System.out.println(c.GetArea());
    }
}
