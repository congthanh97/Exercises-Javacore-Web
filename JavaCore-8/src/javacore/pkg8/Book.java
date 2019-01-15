/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.pkg8;

/**
 *
 * @author 8470p
 */
public class Book extends Content{
    private String publisher,version,year;
    public void Book(){
        
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString()+ "publisher=" + publisher + ", version=" + version + ", year=" + year + '}';
    }
    @Override
    public void Input(){
        super.Input();
        System.out.printf("Publisher:");
        this.setPublisher(sc.nextLine());
        System.out.printf("Version:");
        this.setVersion(sc.nextLine());
        
        System.out.printf("Year:");
        this.setYear(sc.nextLine());
    }
    
}
