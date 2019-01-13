/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class tinhtongSn7 {
     public static void main(String[] args) {
       int n, sum = 0, count = 1;
        Scanner scanner = new Scanner(System.in);
         
        
        System.out.println("Tính tổng S(n) = 1 + 1.2 + 1.2.3 + … + 1.2…n: ");
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
            count *= i;
            sum += count;
        }
         
        System.out.println("Tổng = " + sum);
    
    }
}
