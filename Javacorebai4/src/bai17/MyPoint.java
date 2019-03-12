
package bai17;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setXY(int x ,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return this.x + "" + this.y;
    }
    
    
    public double Distance(MyPoint m){
        int a = m.x - this.x;
        int b = m.y - this.y;
        return Math.sqrt( a*a + b*b);
       
    }

 
}
