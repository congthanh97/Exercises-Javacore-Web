
package bai1;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class FileUtils {
    protected Scanner scanner = new Scanner(System.in);
    private File f = null;
    private File[] paths;
    
    public void BrowseDirectory(){
        try {  
            System.out.print("Path: ");
            String pathFile =  scanner.nextLine();
            f = new File(pathFile);
            // returns pathnames for files and directory 
            if (f.isDirectory()) {
                paths = f.listFiles();  
                for(File path:paths) {
                    if(path.isDirectory()){
                        System.out.println(path);
                    }  
                }
            }
        }catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
    }
    public void BrowseFile(){
        try {  
            System.out.println("Browse File path: ");
            String pathFile =  scanner.nextLine();
            f = new File(pathFile);

            // returns pathnames for files and directory 
          //  if (f.isDirectory()) {
                paths = f.listFiles();  
                for(File path:paths) {
                    if(path.isFile()){
                        System.out.println(path);
                    }
                    // prints file and directory paths
                    
                }
        }catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
        }
    }
    public void BrowsePic(){
        String file;
        try {  
            System.out.println("Path: ");
            String pathFile =  scanner.nextLine();
            f = new File(pathFile);
            // returns pathnames for files and directory 
                paths = f.listFiles();  
                for(File path:paths) {
                  
                    if(path.isFile()){
                        file =  path.getName();
                       if (file.endsWith(".jpg") || file.endsWith(".png")||file.endsWith(".jpeg"))
                        {
                            System.out.println(file);
                        }
                    }  
                }
        }catch(Exception e) {
         // if any error occurs
         e.printStackTrace();
      }
    }
    
   public void lastModifyTime(){
        System.out.println("Path: ");
        String pathFile =  scanner.nextLine();
        File apath = new File(pathFile);
 
        // Kiểm tra sự tồn tại.
        System.out.println("Path exists? " + apath.exists());
 
        if (apath.exists()) {
            // Kiểm tra kích thước file (Theo đơn vị byte):
            System.out.println("Length (bytes): " + apath.length());
 
            // Thời điểm sửa lần cuối (mili giây)
            long lastMofifyInMillis = apath.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);
 
            System.out.println("Last modify date: " + lastModifyDate);
            
        }     
   }
}
