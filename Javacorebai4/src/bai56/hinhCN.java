
package bai56;

import java.util.Scanner;

public class hinhCN{ 
    private double cDai;
    private double cRong;
    Scanner ip = new Scanner(System.in);

    public hinhCN(double cDai, double cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    hinhCN() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public double getcDai() {
        return cDai;
    }

    public void setcDai(double cDai) {
        this.cDai = cDai;
    }

    public double getcRong() {
        return cRong;
    }

    public void setcRong(double cRong) {
        this.cRong = cRong;
    }
    public void Input(){
        System.out.printf("Nhap vao chieu dai: ");
        cDai = ip.nextDouble();
        System.out.printf("Nhap vao chieu rong: ");
        cRong = ip.nextDouble();
    }

   // @Override
    public double TinhDT() {
        return this.cDai*this.cRong;
    }
    
    public double Tinhchu(){
        return 2*(this.cDai+this.cRong);
    }
    
}
