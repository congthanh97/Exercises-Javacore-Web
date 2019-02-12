
package baitaptrenlop;

/**
 *
 * Bai 5
 */
public class Rectangel {
    
     public static void main(String[] args) {
       Printrectangel(20,10);
         PrintRec(8, 10);
    }
     
    public static void Printrectangel(int w, int h){
        for(int i =0 ;i<h;i++){
            for(int j = 0 ;j<w;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
    public static void PrintRec(int w,int h){
        for(int i = 0 ;i < h; i++){
           for(int  j = 0; j< w; j++){
               if (i==0 || i== h-1 || j == 0 || j == w-1){
                   System.out.print("*");
               }
               else
                   System.out.print(" ");
           }
            System.out.println("");
        }
    }
    
}
