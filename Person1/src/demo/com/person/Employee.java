/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.person;

/**
 *
 * @author Anonymous
 */
public class Employee extends Person{
    private double salary;

    public Employee() {
    }
    
    
    public Employee(double salary, String id, String name) {
        super(id, name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.printf("Nhap salary: ");
        this.setSalary(Double.parseDouble(scanner.nextLine()));
        
    }
//     @Override
//    public String toString() {
//        return "Student{id=" + this.getId() + "name=" + this.getName() + "email=" + salary + '}';
//    }
}
