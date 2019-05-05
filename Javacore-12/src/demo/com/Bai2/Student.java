/*
 *Lớp này để lưu thông tin cho mỗi sinh viên. 
 */
 
package demo.com.Bai2;
import java.io.Serializable;

public class Student implements Serializable{
    private int id;
    private String name;
    private byte age;
    private String address;
    private int Phone;
    /* điểm trung bình của sinh viên*/
    private float dmTB;
    public Student(){
        
    }
    
    public Student(int id, String name, byte age, String address,int Phone, float dmTB) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.dmTB = dmTB;
        this.Phone = Phone;
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public byte getAge(){
        return age;
    }
    
    public void setAge(byte age){
        this.age = age;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public int getPhone(){
        return Phone;
    }
    
    public void setPhone(int Phone){
        this.Phone = Phone;
    }
    
    public float getDmTB(){
        return dmTB;
    }
    public void setDmTB(float dmTB){
        this.dmTB = dmTB;
    }

}
