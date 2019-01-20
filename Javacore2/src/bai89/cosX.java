package bai89;

import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cosX {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap do:  ");
        double x = input.nextDouble(); // đơn vị là độ
        // đổi đơn vị sang rad
        double xRad = x * Math.PI / 180;
        
        double ERR = 0.0000001;
        double dif = 0;
        double cosx = 0;
        int i = 0;
        do {
            dif = Math.pow(-1, i) * (Math.pow(xRad, 2*i) / factori(2*i));
            cosx += dif;
            i++;
        } while(Math.abs(dif) > ERR);
        
        System.out.println("===========================");
        System.out.println("cos("+x+") = " + cosx);
    }
    
    public static int factori(int n) {
        if (n == 0 || n == 1) return 1;
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        return gt;
    }
    public static long factori(long n) {
        if (n == 0 || n == 1) return 1;
        return n * factori(n - 1);
    }
    
}