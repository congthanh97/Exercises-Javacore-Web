/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.person;


public class Student extends Person{
    private  String mail;

    public Student() {
    }

    public Student(String mail, String id, String name) {
        super(id, name);
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.printf("Nhap email: ");
        this.setMail(scanner.nextLine());
    }
    
//     @Override
//    public String toString() {
//        return "Student{id=" + this.getId() + "name=" + this.getName() + "email=" + mail + '}';
//    }
    
}
