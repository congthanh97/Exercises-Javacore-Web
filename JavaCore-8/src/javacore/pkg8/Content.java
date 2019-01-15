/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore.pkg8;

import java.util.Scanner;

/**
 *
 * @author 8470p
 */
public class Content {
    private String id,author,title,count;
    Scanner sc=new Scanner(System.in);
    public Content(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "id=" + id + ", author=" + author + ", title=" + title + ", count=" + count ;
    }
    public void Input(){
        System.out.printf("ID:");
        this.setId(sc.nextLine());
        System.out.printf("Author:");
        this.setAuthor(sc.nextLine());
        System.out.printf("Title:");
        this.setTitle(sc.nextLine());
        System.out.printf("Count:");
        this.setCount(sc.nextLine());
    }
    
}
