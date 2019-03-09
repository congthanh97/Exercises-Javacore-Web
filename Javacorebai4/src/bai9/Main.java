
package bai9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Chuong tinh tinh 2 vector");
        System.err.println("Nhap vector 1");
        Vector vector1 =  new Vector(1,2);
        Vector vector2 = new  Vector(3,4);
        
        
//        System.out.printf("x  = ");
        ManagerVT  managerVT1 =  new ManagerVT();
        managerVT1.inputVT1();
        managerVT1.inputVT2();
        managerVT1.add();
        managerVT1.PrintVT();
        //
        managerVT1.sub();
        managerVT1.PrintVT();
        
        //mul
        managerVT1.mul();
        managerVT1.PrintVT();
        
        
        //System.out.println(managerVT1.add());
    }
 
   
}
