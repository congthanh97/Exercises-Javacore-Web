/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai89;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class sinX {
    public static void main(String[] args) {
        int n = readConsole("nhap n (n >= 3): ", 3);
        int x = readConsole("nhap x (x > 0): ", 1);
 
        double y = solutionFormula(x, n);
 
        System.out.printf("Answer:%s%5s = %.5f;", System.lineSeparator(), "y", y);
    }
 
    public static double solutionFormula(int x, int n) {
        double result = 0;
        if (n >= 3) {
            for (int i = 3; i <= n; i++) {
                result += Math.pow(-1, n - 1) * Math.pow(x, 2 * n - 1) / factorial(2 * n - 1);
            }
        }
        return Math.sin(result);
    }
 
    public static int factorial(int number) {
        int result = 1;
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }
        return result;
    }
 
    public static int readConsole(String text, int startRange) {
        Scanner read = new Scanner(System.in);
        boolean correct = false;
        int result = 0;
        while (!correct) {
            System.out.print(text);
            try {
                result = Integer.parseInt(read.nextLine());
                if (!(correct = result >= startRange)) {
                    System.out.printf("Incorrect number. Number >= %s. Try again...%s", startRange, System.lineSeparator());
                }
            } catch (NumberFormatException e) {
                System.out.println("Incorrect value. The value is not number. Try again...");
            }
        }
        return result;
    }
    
}
