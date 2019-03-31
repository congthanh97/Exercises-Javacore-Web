
package exceptionjava.java.demo;

public class MyException  extends Exception{
    
    
    public MyException(String msg) {
        super(msg);
    }
    
    public MyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
