/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author Anonymous
 */
public class checkInpor {
    public static boolean checkSNT(int SNT){
        if(SNT>1){
            for(int i=2;i<=Math.sqrt(SNT);i++){ 
                if(SNT%i==0) 
                    return false;
            }
            return true;
        }
        else 
            return false;
 }
    
   public boolean check(int SNT) throws MyException{
       if (checkSNT(SNT)) {
           return  true;     
       }
       else{
            throw new MyException("nhap lai khong phai so nguyen to");
       }
   }
   
   public boolean checkNext(int SNT)throws MyException{
       if (checkSNT(SNT)) {
           return  true;     
       }
       return false;
   }
    
}
