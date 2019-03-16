package bai8;

public class Main {
    
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(5,3);
        ComplexNumber n2 = new ComplexNumber(5,3);
        System.out.println(n1.AddComplexNumber(n2));
        System.out.println(n1.SubComplexNumber(n2));
        System.out.println(n1.MulComplexNumber(n2));
        System.out.println(n2.DivComplexNumber(n2));
        
        
    }
}
