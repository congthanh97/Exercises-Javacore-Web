
package bai13;


public class Elip extends Point{
    private int a;
    private int b;

    public Elip() {
    }

    public Elip(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    @Override
    public double Tdt(){
        return this.a*this.b*Math.PI;     
    }
    
}
