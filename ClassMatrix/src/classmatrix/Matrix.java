/*
*
*Ma trix cong nhan 2 ma tran
*kiểm tra đối xứng không
*Kiểm tra co phai ma trân không hay không
*tong hang tong cot;
*/
package classmatrix;


public class Matrix {
    private  int col;
    private  int row;
    private  int [][] Matrix;

    public Matrix() {
    }

    public Matrix(int col, int row, int[][] Matrix) {
        this.col = col;
        this.row = row;
        this.Matrix = Matrix;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatrix() {
        return Matrix;
    }

    public void setMatrix(int[][] Matrix) {
        this.Matrix = Matrix;
    }
    
    
    //cong Matrix;
     public Matrix add(Matrix m) {
        // Kiem tra kich thuoc
        Matrix result = new Matrix(this.col, this.row, this.Matrix);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                result.Matrix[i][j] = m.Matrix[i][j] + this.Matrix[i][j];
            }
        }
        return result;
    }
     
     
     
    // Nhan Matrix
      public Matrix Mul(Matrix m) {
        // Kiem tra kich thuoc
        Matrix result = new Matrix(this.col, this.row, this.Matrix);

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                result.Matrix[i][j] = 0;
                for(int k = 0 ;k < this.row;k++){
                    result.Matrix[i][j] = m.Matrix[i][k] * this.Matrix[k][j];
                }
            }
        }
        return result;
    }
      
      
     //check doi xứng
       public boolean checkDX() {
        boolean flag = true;
        if(this.row != this.col){
            System.out.println("Row = Col");
            return flag;
        }
        else{
            for (int i = 0; i < this.row; i++) {
                for (int j = i+1; j < this.col; j++) {
                    if (this.Matrix[i][j] != this.Matrix[j][i]) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        return flag;
    }
    
       
    //sum Col
    public int sumCol(int x){
        int sum=0;
        for(int i=0;i<this.Matrix.length;i++)
            sum=sum+this.Matrix[i][x];
        return sum;
    }
    
    //Sum Row
    public int sumRow(int x){
        int sum=0;
        for(int j=0;j<this.Matrix.length;j++)
            sum=sum+this.Matrix[x][j];
        return sum;
    }
     
    
    //Check Matran khong:
    
    public boolean MatranK()
    {
        int i, j;
        boolean flag = true;
        if (this.col != this.row){
            System.out.println("Col = Row");
            flag = false;
        }else{
            
            for(i=0; i<this.row; i++)
            {

                for(j=0; j<this.col; j++)
                {
                    if((this.Matrix[i][i] !=0 )||(this.Matrix[i][j] !=0) || (this.Matrix[j][i] !=0))
                    {
                        flag =  false;
                        break;
                    }
                }

            }
           
        }
        return flag;
    }
    
    //check Matran don vi
    public boolean Checkdonvi()
    {
        boolean flag = true;
        for(int i=0; i<this.row; i++)
        {
            for(int j = 0 ; j<this.col; j++){
                if((this.Matrix[i][i]!=1) || (this.Matrix[i][j] !=0) || (this.Matrix[j][i] !=0)){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
    
    
   
   //Print matrix
   public void printMatrix() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.col; j++) {
                System.out.print(this.Matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
   
}
