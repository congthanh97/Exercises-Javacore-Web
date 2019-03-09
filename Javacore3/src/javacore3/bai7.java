
package javacore3;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class bai7 {
    
    public static int det2x2(int [][] matrixA){
        return matrixA[0][0] *matrixA[1][1] - matrixA[0][1]*matrixA[1][0];
    }
    
      public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ma tran A");
        
        int[][] matrixA = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Nhap ma tran B");
        
        int[][] matrixB = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        
       
        int[][] matrixC = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        int [][] matrixD =  new int[3][3];
        for(int i = 0; i<3; i++){
            for(int j=0; j<3; j++){
                matrixD[i][j]=0;
                for(int k=0; k < 3;k++){
                    matrixD[i][j] += matrixA[i][k] *matrixB[k][j];
                }                    
            }
        }
        //matran nhap
         System.out.println("Ma tran A");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(matrixA[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        System.out.println("Ma tran B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(matrixB[i][j]+ "\t");
            }
            System.out.println("");
        }
        
        //hien thi ma tran tong 
        System.out.println("Tong 2 ma tran");
        //System.out.println("Ma tran tong: ");
        for(int i=0; i<3; i++){
            for(int j=0;j <3;j++){
                System.out.printf(matrixC[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("Tich 2 ma tran");
        //System.out.println("Ma tran tong: ");
        for(int i=0; i<3; i++){
            for(int j=0;j <3;j++){
                System.out.printf(matrixD[i][j] + "\t");
            }
            System.out.println("");
        }
        
        
        //dinh thuc
        
        int a = matrixA[0][0];
        int b = matrixA[0][1];
        int c = matrixA[0][2];
        
        int [][] A1 ={
            {matrixA[1][1],matrixA[1][2]},
            {matrixA[2][1],matrixA[2][2]}
        };
        int [][] A2 = {
            {matrixA[1][0],matrixA[1][2]},
            {matrixA[2][0],matrixA[2][2]}
        };
        int [][] A3 ={
            {matrixA[1][0],matrixA[1][1]},
            {matrixA[2][0],matrixA[2][1]}
        };
        
        int det = ( a*det2x2(A1) - b*det2x2(A2) + c*det2x2(A3));
          System.out.println("Định thưc ma trix A: "+det);
    }
      
    
}
