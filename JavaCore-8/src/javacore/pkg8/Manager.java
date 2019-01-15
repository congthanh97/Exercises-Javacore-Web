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
public class Manager {
    Scanner sc=new Scanner(System.in);
    
    private Content[] content;
    int n,size=10;
    public Manager(){
        content=new Content[size];
        n++;
        
    }
    public void Input(){
        int choice;
        do{
            System.out.println("1.Paper");
            System.out.println("2.Book");
            System.out.println("3.Thesis");
            System.out.printf("CHOICE TYPE:");
            choice=sc.nextInt();
            switch (choice){
                case 1:Paper p=new Paper();
                       p.Input();
                       content[n++]=p;
                       break;
                case 2:Book b=new Book();
                b.Input();
                content[n++]=b;
                break;
                case 3:Thesis t=new Thesis();
                t.Input();
                content[n++]=t;break;     
                
            }break;
        }while(choice<=3);
    }
    public void Show(){
        int i;
        System.out.println("=====PAPER=====");
        for(i=0;i<content.length;i++){
            if(content[i] instanceof Paper){
                System.out.println(content[i]);
            }
        }
        System.out.println("=====BOOK=====");
        for(i=0;i<content.length;i++){
            if(content[i] instanceof Book){
                System.out.println(content[i]);
            }
        }
        System.out.println("=====THESIS=====");
        for(i=0;i<content.length;i++){
            if(content[i] instanceof Thesis){
                System.out.println(content[i]);
            }
        }
    }
    public void Search(String Title){
        int i;
        boolean found=false;
        for( i=0;i<content.length;i++){
            if(content[i] instanceof Paper && content[i].getTitle().equals(Title)){
                System.out.println("FOUND");
                System.out.println(content[i]);
                found=true;
            }
            else if(content[i] instanceof Book && content[i].getTitle().equals(Title)){
                System.out.println("Found");
                System.out.println(content[i]);
                found=true;
            }
            else if (content[i] instanceof Thesis && content[i].getTitle().equals(Title)){
                System.out.println("FOUND");
                System.out.println(content[i]);
                found=true;
            }
        }
    }
}
