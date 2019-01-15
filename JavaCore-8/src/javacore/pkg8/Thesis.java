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
public class Thesis extends Content{
    private String year,school,faculity;
    public Thesis(){
        
    }

    public Thesis(String year, String school, String faculity) {
        this.year = year;
        this.school = school;
        this.faculity = faculity;
    }

    

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getFaculity() {
        return faculity;
    }

    public void setFaculity(String faculity) {
        this.faculity = faculity;
    }

    @Override
    public String toString() {
        return super.toString()+"year=" + year + ", school=" + school + ", faculity=" + faculity + '}';
    }
    @Override 
    public void Input(){
        super.Input();
        System.out.printf("School:");
        this.setSchool(sc.nextLine());
        System.out.printf("Faculity:");
        this.setFaculity(sc.nextLine());
        System.out.printf("Year:");
        this.setYear(sc.nextLine());
    }
}
