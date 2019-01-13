/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacorebai7kethua;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class Smartphone extends Product implements Serializable{
    private boolean hasCamera;
    private int sim;

    

    public boolean isHasCamera() {
        return hasCamera;
    }

    public void setHasCamera(boolean hasCamera) {
        this.hasCamera = hasCamera;
    }

    public int getSim() {
        return sim;
    }

    public void setSim(int sim) {
        this.sim = sim;
    }

    public static Scanner getIp() {
        return ip;
    }

    public static void setIp(Scanner ip) {
        Product.ip = ip;
    }

    public Smartphone() {
        super();
        hasCamera = true;
        sim = 0;
    }
    
    public Smartphone(boolean hasCamera, int sim, int id, String Name, double price, int quantity) {
        super(id, Name, price, quantity);
        this.hasCamera = hasCamera;
        this.sim = sim;
    }
    

    @Override
    public void addNew() {
        super.addNew(); 
        System.out.printf("HasCamera: ");
        this.setHasCamera(ip.nextBoolean());
        System.out.printf("Sim: ");
        this.setSim(ip.nextInt());
    }


    
    
    
}
