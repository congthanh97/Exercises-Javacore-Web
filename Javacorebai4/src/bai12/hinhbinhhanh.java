package bai12;
public class hinhbinhhanh extends dahinh{
    private double h;
    private double cDai;
    private double cRong;

    public hinhbinhhanh(double cDai, double cRong) {
        this.cDai = cDai;
        this.cRong = cRong;
    }

    hinhbinhhanh() {
       
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
    
    public double getH(){
        return h;
    }
    public void setH(double h){
        this.h=h;
    }
    
    @Override
    public double tinhCV(){
        return (2*(cDai+cRong));
    }
    

    @Override
    public double tinhDT() {
        return (h*cDai);
    }

   
    
}
