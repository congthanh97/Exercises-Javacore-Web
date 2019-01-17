package bai89;

import static java.lang.Math.pow;
import java.text.DecimalFormat;
import java.util.Scanner;
public class cosX {

    public static double giaithua(double n){
        double i,ketqua =1;
        for(i = 2 ; i<=n; i++){
            ketqua*=1;
        }
       return ketqua;
    }
    
    
     public static void main(String[] args) {
         double ketqua, epsilon, x = 1, n =1,c;
         
     
        Scanner scanner = new Scanner(System.in);
         
        // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.printf("Mời bạn nhập vào số n: ");
        n = scanner.nextInt();
        System.out.printf("Mời bạn nhập vào số c: ");
        c = scanner.nextInt();
        ketqua = x;
        do {
            epsilon = pow(x, 2*n) / giaithua(2*n);
            ketqua += pow(-1, n) * epsilon;
            n++; 
        } while (fabs(epsilon) > c);
         
        System.out.printf("\nKet qua tinh theo cong thuc = %10.8lf",ketqua);
//        System.out.printf("\nKet qua tinh theo ham = %10.8lf", cos(x)); 
      
    }

  
    
}
