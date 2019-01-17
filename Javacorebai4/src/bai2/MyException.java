/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Anonymous
 */
public class MyException extends Exception{
   public MyException(String msg) {
        super(msg);
//        System.out.println("Mã sinh viên có dạng HVxxx(x là số) !!! ");
    }
    
    public MyException(String msg, Throwable cause) {
        super(msg, cause);
    }
}