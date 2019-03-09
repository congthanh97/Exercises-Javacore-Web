/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydate;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Anonymous
 */
public class Main {

    public static void main(String[] args) {
   
   Mydate mydate = new Mydate(2004, 2, 9);
   //mydate.previousDay();
//   //mydate.nextDay();
//    System.out.println(mydate.getChi(2018, 3,3 ));
//    System.out.println(mydate.getCan(2019, 3, 3));
  // mydate.nextMonth();
//    n.getDay();
     //   System.out.println(n.getDay()+ "/" + n.getMonth() + "/" + n.getYear() );
    System.out.println(mydate.toString());
//    try {
//            // TODO code application logic here
//            test d = new test(1, 1, 2019);
//            d.addDay(61);
//            d.print(0);
//            
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }
    
}
