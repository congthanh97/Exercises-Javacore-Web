
package exceptionjava.java.demo;
public class CheckInfor {
    
    public boolean checClassSV(String str) throws MyException{
//        if(str.matches("AT\\d{3}") || str.matches("CT\\d{3}") || str.matches("DT\\d{3}"))
        // hv[0-9]{3}
        if(str.matches("[ACD]T\\d{3}"))
             return true;
        else {
            throw new MyException("Sai định dạng   ");
        }
        
    }
    
    public boolean checkDiem(float dtb)throws MyException{
        if(dtb > 0 && dtb < 11) 
            return true;
        else{
            throw new MyException("Điểm tổng kết phải từ 1-10. Nhập lại !!!");
        }
        
        
    }
    
     public boolean checkMSV(String MSV)throws MyException{
        if(MSV.length() >= 8) 
            return true;
        else{
            throw new MyException("MSV có độ dài hơn 8 ký tự. Nhập lại !!!");
        }
        
        
    }
     
     public boolean checkAge(int age)throws MyException{
         if(age >=18 && age <100)
             return true;
         else{
              throw new MyException("18 < AGE <100 . Nhập lại !!!");
         }
     }
}
