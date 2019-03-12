/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13;

public class circle extends Elip{
    
    private int r;

    public circle() {
    }

    public circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double Tdt(){
        return this.r*this.r*Math.PI;
    }
    
}
