/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.bai6;

import java.io.Serializable;

/**
 *
 * @author Anonymous
 */
public class Person  implements Serializable{
    private int id;
    private String name;
    private byte age;
    private String address;
    private int Phone;
  
    public Person(){
        
    }
    
    public Person(int id, String name, byte age, String address,int Phone) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
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

}