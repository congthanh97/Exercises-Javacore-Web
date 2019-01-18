
package bai12;


public class hinhVuong extends hinhCN{
     private double canh;

    public hinhVuong(double canh) {
        this.canh = canh;
    }

    hinhVuong() {
        
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    
     @Override
    public double tinhDT(){
        return canh*canh;
    }
    
     @Override
   public double tinhCV(){
       return 4*canh;
   }
    
}
