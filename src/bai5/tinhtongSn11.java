/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class tinhtongSn11 {
      public static void main(String[] args) {
       int n, s = 0,p = 0;
        Scanner scanner = new Scanner(System.in);
         
        
        System.out.println("Tính tổng S(n) = 1 + 1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+…+n): ");
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        // n còn nhỏ hơn 1 thì còn nhập lại
        do {
            System.out.printf("Mời bạn nhập vào số n: ");
            n = scanner.nextInt();
        } while (n < 1);
         
        /*
         * tính giá trị của biểu thức
         * i còn nhỏ hơn hoặc bằng n thì còn thực hiện thân vòng lặp
         */
        for (int i = 1; i <= n; i++) {
            p += i;
            s += 1.0/p;
        }
        System.out.print(p);
         
        System.out.printf("Tổng = " + decimalFormat.format(s));
        System.out.println("\n");
    
    }
    
}
