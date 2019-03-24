/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.person;

import java.util.Scanner;

public class Person {
    private  String id;
    private  String name;
    Scanner scanner =  new Scanner(System.in);

    public Person() {
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public void input(){
        System.out.println("Nhap thon tin cua person");
        System.out.printf("Name: ");
        this.setName(scanner.nextLine());
        System.out.printf("Nhap vao id: ");
        this.setId(scanner.nextLine());
    }
}
