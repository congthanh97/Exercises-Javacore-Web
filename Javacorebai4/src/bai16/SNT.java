
package bai16;

import java.util.Scanner;

public class SNT {
    private int a;

    public SNT() {
    }

    public SNT(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    public static boolean checkSNT(int x){
        if(x>1){
            for(int i=2;i<=Math.sqrt(x);i++){ 
                if(x%i==0) 
                    return false;
            }
            return true;
        }
        else 
            return false;
 }
    
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        boolean flag=false;
         do{
            int x;
             do {
                try {
                    System.out.print("Nhập X: ");
                    x = scanner.nextInt();
                    if(checkSNT(x)) {
                        flag = true;
                       setA(x);
                    }
                    else{
                        System.out.println("Khong phai so nguyen to");
                    }
                    
                } catch (Exception e) {
                    System.out.println("error");
                }
            }while(!flag);
             flag =  false;
         }while(flag);
    }
}
