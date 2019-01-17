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
public class tinhtongSn2 {
     public static void main(String[] args) {
      int n, sum = 0;
        Scanner scanner = new Scanner(System.in);
         
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
            sum = sum + i * i;
        }
         
        System.out.println("Tổng = " + sum);
    
    }
    
}
