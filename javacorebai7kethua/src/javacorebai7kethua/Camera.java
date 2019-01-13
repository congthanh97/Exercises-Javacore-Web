
package javacorebai7kethua;

import java.io.Serializable;
/*Trong trường hợp này chúng ta sử dụng file
*để lưu trữ và truy xuất các đối tượng sinh vien. 
*Nên lớp Camera phải được thêm implements Serializable.
*/
public class Camera extends Product implements Serializable{
     private boolean hasWifi;

    public boolean isHasWifi() {
        return hasWifi;
    }

    public void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }
    
    public Camera()
    {
        super();
        hasWifi = true;
    }

    public Camera(boolean hasWifi, int id, String Name, double price, int quantity) {
        super(id, Name, price, quantity);
        this.hasWifi = hasWifi;
    }


    @Override
    public void addNew() {
        
       super.addNew();
        System.out.printf("Co wifi hay khong? ");
        this.setHasWifi(ip.nextBoolean());
    }
    
    
}
