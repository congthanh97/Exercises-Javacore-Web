/**
 * Main Matrix
 */
package classmatrix;

public class Main {
    public static void main(String[] args) {
        int[][] m1Values = { {1,0,0}, {0,1,0}, {0,0,1} };
        int[][] m2Values = { {3,1,5}, {2,1,4}, {2,2,2} };
        
        Matrix m1 = new Matrix(3, 3, m1Values );
        Matrix m2 = new Matrix(3, 3, m2Values );
        
        //check MaTrix 1 DX
        boolean isDx = m1.checkDX();
        m1.printMatrix();
        if (isDx) System.out.println("Ma tran 1 doi xung");
        else System.out.println("Ma tran 1 khong doi xung");
        
        //check Matrix 2 DX
        boolean isDx2 = m2.checkDX();
        m2.printMatrix();
        if (isDx2) System.out.println("Ma tran 2 doi xung");
        else System.out.println("Ma tran 2 khong doi xung");
        
        //Add Matrix
        Matrix sum = m1.add(m2);
        System.out.println("Sum Matrix");
        sum.printMatrix();
        
        //Mul Matrix
        Matrix Mul =  m1.Mul(m2);
        System.out.println("Mul Matrix");
        Mul.printMatrix();
        
        
        //check Don vi Matran 1
        
        
        boolean isDV2 = m2.Checkdonvi();
        //m1.printMatrix();
        if (isDV2) System.out.println("Ma tran 1 la mt don vi");
        else System.out.println("Ma tran 1 k phai ma tran don vi");
        
        
//        
//        //check DV Matran 2
//        int isDV2 = m2.Checkdonvi();
//          if(isDV2==0){
//            System.out.println("khong phai ma tran don vi");
//        }
//        else if(isDV2==1){
//            System.out.println("Ma tran don vi");
//        }
//          
//        Matrix checksum =  m1.add(m2);
//        int isDV3 =  checksum.Checkdonvi();
//        if(isDV3==0){
//            System.out.println("khong phai ma tran don vi");
//        }
//        else if(isDV3==1){
//            System.out.println("Ma tran don vi");
//        }
        //check Matrankhong
        boolean isMTK1 = m1.MatranK();
        if(isMTK1){
            System.out.println("Matrix 1 khong phai ma tran kog");
        }
        else{
            System.out.println("Matrix 1 la Ma tran khong");
        }
        
    
    
    }
    
}
