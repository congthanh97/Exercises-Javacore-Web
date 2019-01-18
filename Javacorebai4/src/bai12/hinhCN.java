/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * author Anonymous
 */
public class hinhCN extends hinhbinhhanh{
    private double Dai;
    private double Rong;

    public hinhCN(double Dai, double Rong) {
        this.Dai = Dai;
        this.Rong = Rong;
    }

    hinhCN() {
        //To change body of generated methods, choose Tools | Templates.
    }

    
    public double getDai() {
        return Dai;
    }

    
    public void setDai(double Dai) {
        this.Dai = Dai;
    }

      
    public double getRong() {
        return Rong;
    }

      
    public void setRong(double Rong) {
        this.Rong = Rong;
    }
    

    
    @Override
    public double tinhDT() {
        return Dai*Rong;
    }
    
    
    @Override
    public double tinhCV(){
        return 2*(Dai+Rong);
    }

  
    
}
