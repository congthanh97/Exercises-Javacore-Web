
package bai1;
public class luong extends NhanVien{
    
 
    public luong() {
        super();
    }


    @Override
    public int tinhLuong() {
        if(this.sogio >= 200){
            this.luong += this.luong*0.2;
        }
        if(this.sogio >=100 && this.sogio <200){
            this.luong += this.luong*0.1;
        }
        else{
            this.luong = this.luong;
        }
        
        return (int) this.luong;
    }

}
