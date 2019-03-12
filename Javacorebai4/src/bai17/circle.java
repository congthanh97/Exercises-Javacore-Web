
package bai17;

public class circle extends MyPoint{
    private int r;

    public circle() {
    }

    public circle(int r, int x, int y) {
        super(x, y);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    
    @Override
     public String toString(){
        return "("+this.getX() +";"+this.getY()+ ")"+"R: "+this.r;
     }
     
     public double GetArea(){
         return (this.r*this.r*Math.PI);
     }
}
