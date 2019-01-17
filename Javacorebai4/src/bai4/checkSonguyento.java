
package bai4;

import java.util.Scanner;

public class checkSonguyento {
    private int SNT;
    private int SNTnext;
    
    public checkSonguyento(){
        
    }
    public checkSonguyento(int SNT,int SNTnext){
        this.SNT =  SNT;
        this.SNTnext = SNTnext;
    }
    
    public int getSNT(){
        return SNT;
    }
    
    public void setSNT(int SNT){
        this.SNT = SNT;
    }
    public int getSNTnext(){
        return SNTnext;
    }
    
    public void setSNTnext(int SNTnext){
        this.SNTnext = SNTnext;
    }
 
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {            
            int SNT;
            do {                
                try {
                    System.out.printf("Enter number: ");
                    SNT = scanner.nextInt();
                    if (new checkInpor().checkSNT(SNT)) {
                        flag = true;
                        setSNT(SNT);
                    }
//                    for(int i= SNT;i<2*SNT;i++){
//                        if (new checkInpor().checkSNT(i+1)) {
//                            flag =  true;
//                            setSNTnext(i+1);
//                            break;
//                        }
//                     }
                   for(int i = SNT;i<2*SNT;i++){
                       if (new checkInpor().checkNext(i+1)) {
                           flag = true;
                           setSNTnext(i+1);
                           break;
                       }
                   }
                } catch (Exception e) {
                      System.out.println(e.getMessage());
                }
            } while (!flag);
            flag =  false;
        } while (flag);
    }
    @Override
    public String toString(){
        return "SNT: "+SNT+"\tNext: "+SNTnext;
    }
//    public void FoundSNTNext(int SNT){
//        boolean flag = false;
//        do {            
//            do {                
//                
//            } while (!flag);
//        } while (flag);
//    
//    
//    }
//    
     
}
