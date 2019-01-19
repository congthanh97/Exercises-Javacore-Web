/*
 *FRACTION.
 */
package bai7;

public class Fraction {
    private int tu;
    private int mau;
    
    
    public Fraction(){
        
    }
    
    public Fraction(int tu,int mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    public int getTu(){
        return tu;
    }
    
    public void setTu(int tu){
        this.tu = tu;
    }
    
    public int getMau(){
        return mau;
    }
    
    public void setMau(int mau){
        this.mau = mau;
    }
    
    
    public int FoundUTLN(int a ,int b){
        while(a!=b){
            if(a > b){
                a -= b;
            }
            else{
                b -= a;
            }
        }
        return a;
    }
     public void toiGianFraction() {
        int i = FoundUTLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
    
    public void  showFraction(){
        System.out.println(FoundUTLN(getTu(), getMau())+"/"+FoundUTLN(getTu(),getTu()));
    }
    
    
     public void AddFraction(Fraction ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTong = new Fraction(ts, ms);
        phanSoTong.toiGianFraction();
        System.out.println("T?ng hai phân s? = " + phanSoTong.tu + "/" + phanSoTong.mau);
    }
      
    public void SubFraction(Fraction ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoHieu = new Fraction(ts, ms);
        phanSoHieu.toiGianFraction();
        System.out.println("Hi?u hai phân s? = " + phanSoHieu.tu + "/" + phanSoHieu.mau);
    }
     
    public void MulFraction(Fraction ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Fraction phanSoTich = new Fraction(ts, ms);
        phanSoTich.toiGianFraction();
        System.out.println("Tích hai phân s? = " + phanSoTich.tu + "/" + phanSoTich.mau);
    }
     
    public void DivFraction(Fraction ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Fraction phanSoThuong = new Fraction(ts, ms);
        phanSoThuong.toiGianFraction();
        System.out.println("Thuong hai phân s? = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
    }

    
    
    
}
