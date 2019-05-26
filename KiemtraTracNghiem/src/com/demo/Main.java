
package com.demo;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner  input =  new Scanner(System.in);
      Connection conn = DbConnector.getConnection();
      Model m =  new Model();
      while(true){
          System.out.printf("Nhap Email: ");
          String email =  input.nextLine();
          System.out.printf("Pass: ");
          String pass =  input.nextLine();
          boolean check = m.auth(email, pass);
          if(check){
              System.out.println("Login thanh cong");
//              m.Question();
//              m.answers();
              m.Check();
              break;
          }
          else{
              System.out.println("Login khong thanh cong ");
          }
      }
      
      
    }
    
}
