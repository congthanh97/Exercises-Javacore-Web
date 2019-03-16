/***
 * Cong tru nhan chia so phuc
 */
package bai8;


public class ComplexNumber {
    private int a;
    private int b;

    public ComplexNumber() {
    }

    public ComplexNumber(int a, int b) {
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
    
    public String AddComplexNumber(ComplexNumber m){
      int c =  m.a + this.a;
      int d =  m.b + this.b;
      return (c + "+" + d + "i");
    }
    
    public String SubComplexNumber(ComplexNumber m){
      int c =  m.a - this.a;
      int d =  m.b - this.b;
      return (c + " + " + d + " i ");
    }
    
    public String MulComplexNumber(ComplexNumber m){
        int c =  m.a * this.a - m.b * this.b;
        int d =  m.a * this.b + m.b * this.a;
        return (c + " + " + d + "i");
    }
    
    public String DivComplexNumber(ComplexNumber m){
        int c =  (this.a * m.a + this.b * m.b) / (this.a * this.a + this.b * this.b);
        int d =  (this.a * m.b - this.b * m.a) / (this.a * this.a + this.b * this.b);
        return (c + " + " + d + " i ");
    }
}
