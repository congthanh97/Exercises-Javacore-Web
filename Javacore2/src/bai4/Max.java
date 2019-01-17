/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Max {
 
  public static void main(String []agrs)
  {
      int n,max=0,min=999999999;
      do
      {
          System.out.print("Nhap vao 1 so nguyen ");
          Scanner sc =new Scanner(System.in);
          n=sc.nextInt();
          if(n>max)
              max=n;
          if(n<min&&n!=0)
              min=n;
      }while(n!=0);
      System.out.print("Ban da nhap vao so 0 kt thuc chuong trinh \nSo lon nha la "+max+"\nSo nho nhat la "+min+"\n");
  }
}
