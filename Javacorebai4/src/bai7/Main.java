/*
Xây dựng lớp Phân số (Fraction) có các thành phần sau:
* Các thuộc tính: Tử số, mẫu số.
* Hàm tạo không đối số và hai đối số để khởi tạo giá trị cho tử số và mẫu số.* Các phương thức setter và getter.
* Các phương thức:
- Nhập phân số
- In Phân số
- Rút gọn phân số
- Nghịch đảo phân số
- add(), sub(), mul(), div()
*/
package bai7;


public class Main {
     public static void main(String[] args) {
        Fraction phanSo1=new Fraction(3,4);    // tạo phân số có tử = 3 và mẫu = 4
        Fraction phanSo2=new Fraction(4,8); // tạo phân số có tử = 4 và mẫu = 8
         
        // gọi phương thức cộng, trừ, nhân, chia 2 phân số
        phanSo1.AddFraction(phanSo2);
        phanSo1.SubFraction(phanSo2);
        phanSo1.MulFraction(phanSo2);
        phanSo1.DivFraction(phanSo2);
    }
}
