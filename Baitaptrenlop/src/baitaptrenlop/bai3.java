package baitaptrenlop;

import java.util.Scanner;

public class bai3 {

    public static int nhap() {
        Scanner input = new Scanner(System.in);
        boolean check = false;
        int n = 0;
        while (!check) {
            System.out.println(" ");
            try {
                n = input.nextInt();
                check = true;
            } catch (Exception e) {
                System.out.printf("Nhap so khong nhap chu cai,Moi ban nhap lai: ");
                input.nextLine();
            }
        }
        return (n);
    }

    public static void main(String[] args) {
        System.out.printf("nhap menh gia doi tien (N>1000): ");
        int n = nhap();
        int n1 = n / 100;
        //System.out.println(n1);
        int n2 = n / 200;
        //System.out.println(n2);
        int n3 = n / 500;
        //System.out.println(n3);
        for (int i = 0; i <= n3; i++) {
            for (int j = 0; j <= n2; j++) {
                for (int l = 0; l <= n1; l++) {
                    if ((500 * i + 200 * j + 100 * l == n)) {
                        System.out.printf("100 + 200 + 500 :%d %d %d\n",l,j,i);
                    }
                }
            }
        }

    }
}
