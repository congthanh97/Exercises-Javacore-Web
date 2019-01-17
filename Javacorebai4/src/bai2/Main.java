/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import bai1.NhanVien;
import bai1.luong;
import java.util.Scanner;
import javax.rmi.CORBA.Stub;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class Main {
  public static void main(String[] args) {
      int n;
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Nhap so sinh vien: ");
      n = scanner.nextInt();
      Student[] student = new Student[n];
      System.out.println(student.toString());
      
      for(int i = 0 ;i<n ; i++){
          System.out.println("Nhap sinh vien thu: "+(i+1));
          student[i] =  new  Student();
          student[i].add();
      }
      
      for(int i = 0 ;i<n ;i++ ){
           System.out.println("\t\t\tDanh sach");
          
           System.out.println(student[i].toString());
           
      }
          
      
    }
}
