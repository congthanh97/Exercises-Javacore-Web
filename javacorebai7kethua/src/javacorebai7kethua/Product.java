/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorebai7kethua;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Product implements Serializable{
   private int id;
    private String Name;
    private double price;
    private int quantity;
    static Scanner ip = new Scanner(System.in);
    
    public Product()
    {
        Name = "";
        id = 0;
        price = 0;
        quantity = 0;
        
    }
    public  Product(int id,String Name,double price,int quantity)
    {
        this.id = id;
        this.Name = Name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    public void addNew()
    {
        System.out.printf("Name: ");
        this.setName(ip.nextLine());
        System.out.printf("Nhap vao id: ");
        this.setId(Integer.parseInt(ip.nextLine()));
        
        System.out.printf("price: ");
        this.setPrice((ip.nextDouble()));
        System.out.printf("quatity: ");
        this.setQuantity(ip.nextInt());
        
    }
    
}
