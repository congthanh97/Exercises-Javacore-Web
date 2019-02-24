package javacore3;



import java.util.Scanner;

public class bai8 {
    
    public static int MatranK(int [][] A)
    {
            int i, j;
            for(i=0; i<3; i++)
            {
                if(A[i][i] !=0)
                {
                    return 0;
                }
            }
            for(i=0; i<3; i++)
            {   
                for(j=i+1; j<3; j++)
                {
                    if((A[i][j] !=0) || (A[j][i] !=0))
                    {
                        return 0;
                    }
                }
            }
        return 1;
    }
   public static int Checkdonvi(int [][] A)
    {
            int i, j;
            for(i=0; i<3; i++)
            {
                if(A[i][i] !=1)
                {
                    return 0;
                }
            }
            for(i=0; i<3; i++)
            {   
                for(j=i+1; j<3; j++)
                {
                    if((A[i][j] !=0) || (A[j][i] !=0))
                    {
                        return 0;
                    }
                }
            }
        return 1;
    }   
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma tran matrixA");
        int[][] matrixA = new int[10][10];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("A["+i+"]"+"[" +j+"] :" );
                matrixA[i][j] = input.nextInt();
            }
        }
        
        //check matran don vi
        if(Checkdonvi(matrixA)==0){
            System.out.println("khong phai ma tran don vi");
        }
        else if(Checkdonvi(matrixA)==1){
            System.out.println("Ma tran don vi");
        }
       
        
        //Check matran khong
        if(MatranK(matrixA)==1){
            System.out.println("khong phai ma tran kog");
        }
        else if(MatranK(matrixA)==0){
            System.out.println("Ma tran khong");
        }
        
        //ma tran doi xung;
        
        
        int count = 0;
            boolean flag = true;
//            for (int i = 0; i < n; i++) {
//                if (matrix[i][n-i-1] != matrix[n-i-1][i]) {
//                    flag = false;
//                    break;
//                }
//                count++;
//            }
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d\n",i);
                for (int j = i+1; j < 3; j++) {
                    System.err.printf("%d\n",j);
//                    if (i == j ) continue;
                    if (matrixA[i][j] != matrixA[j][i]) {
                        flag = false;
                        break;
                    } 
                    count++;
                }
            }
            System.out.println("================");
            System.out.println("count = " + count);
            if (flag) System.out.println("Ma tran doi xung");
            else System.out.println("Ma tran khong doi xung");
      
    }
    
}
