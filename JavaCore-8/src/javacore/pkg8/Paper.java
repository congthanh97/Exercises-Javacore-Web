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
public class Paper extends Content{
    private String journal,year;
    public void Paper(){
        
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    @Override

    public String toString() {
        return super.toString()+"journal=" + journal + ", year=" + year + '}';
    }
    @Override
    public void Input(){
        super.Input();
        System.out.printf("Journal:");
        this.setJournal(sc.nextLine());
        System.out.printf("Year:");
        this.setYear(sc.nextLine());
    }
    
}
