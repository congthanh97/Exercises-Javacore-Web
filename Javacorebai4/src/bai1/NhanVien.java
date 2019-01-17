
package bai1;

 
import java.util.Scanner;
 
public class NhanVien {
    private String maNhanVien, hoTen, diachi;
    private int tuoi;
    protected double luong;
    protected  int sogio;
    Scanner scanner = new Scanner(System.in);
     
    public NhanVien() {
        super();
    }
 
    public NhanVien(String maNhanVien, String hoTen, String diachi, int tuoi, double luong, int sogio) {
        super();
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.luong = luong;
        this.sogio = sogio;

    }
 
    public String getMaNhanVien() {
        return maNhanVien;
    }
 
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }
 
    public String getHoTen() {
        return hoTen;
    }
 
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 
    public String getDiachi() {
        return diachi;
    }
 
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

 
    public int getTuoi() {
        return tuoi;
    }
 
    public void setTuoi(int tuoi) {
        this.tuoi =  tuoi;
    }
 
    public double getLuong() {
        return luong;
    }
 
    public void setLuong(double luong) {
        this.luong = luong;
    }
    public int getSogio() {
          return sogio;
      }

      public void setSogio(int sogio) {
          this.sogio =  sogio;
      }
 
     
    public void inputInfo() {
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = scanner.nextLine();
        System.out.print("Nhập họ tên nhân viên: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhập Dia chi: ");
        diachi = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = scanner.nextInt();
        System.out.print("Nhap luong:");
        luong = scanner.nextDouble();
        System.out.print("Nhập số giờ: ");
        sogio = scanner.nextInt();
    }
     
    public int tinhLuong() {
        return 0;
    }
     
    public String printInfo() {
        //return "Mã nhân viên: " + this.maNhanVien + ", họ tên nhân viên: " + this.hoTen + ", số điện thoại: " + this.soDienThoai + ", mail: " + this.mail + ", tuổi: " + this.tuoi + ", lương cơ bản: " + this.luongCoBan;
    return "Ma nhan vien: "+this.maNhanVien+ "\tHoten: "+this.hoTen+"\tSodienthoai: "+this.diachi+"\ttuoi: "+this.tuoi+"\tluong: "+this.luong;
   
    }

}