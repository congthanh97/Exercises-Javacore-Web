/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;


/**
 *
 * @author Anonymous
 */
public class fibonaci {
     /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        int n;
        System.out.println("dãy số fibonacci < n: ");
         Scanner input = new Scanner(System.in);
        System.out.print("Input n = ");
        input = new Scanner(System.in);
        n = input.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.printf(fibonacci(i) + " ");
        }
        System.out.println("\n");
    }
     
    /**
     * Tính số fibonacci thứ n
     * 
     * @param n: chỉ số của số fibonacci tính từ 0 
     *           vd: F0 = 0, F1 = 1, F2 = 1, F3 = 2
     * @return số fibonacci thứ n
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
