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
public class EmployeeManager extends Manager{
     
    private Employee[] listE = null;
    private  int crr =  0;
     private static final int MAX = 20;

    public EmployeeManager() {
         this.listE = new Employee[MAX];
    }
    
    
    
    @Override
    public void add() {  
        Employee em = new Employee();
        em.input();
        this.listE[crr] = em;
        this.crr++;
    }

    @Override
    public void show() {
//        System.out.println("\n\t\t\tDanh sach person\n");
//        System.out.printf("\n%5s %25s %20s \n","ID","Hoten","Salary");
//        for(Employee employee: listE){
//            if(employee == null) continue;
//            System.out.format("%5d  | ",  employee.getId());
//            System.out.format("%20s | ",  employee.getName());
//            System.out.format("%20d%n  | ", employee.getSalary());
//        }
         System.out.println("\n\t\t\tDanh sach person\n");
        System.out.printf("\n%5s %25s %20s \n","ID","Hoten","Salary");
        for(Employee sv: listE){
            if (sv == null) continue;
            System.out.format("%5s  | ", sv.getId());
            System.out.format("%20s | ", sv.getName());
            System.out.format("%20s%n | ",sv.getSalary());
            
        }
    }

     @Override
    public void search(String name) {  
        System.out.println("\t\t\t====Result====");
         boolean check = false;
        System.out.println("\n\t\t\tDanh sach person\n");
        System.out.printf("\n%5s %25s %20s \n","ID","Hoten","Salary");
        for(Employee em: listE){
            if (em == null) continue;
            if(em.getName().equals(name))
            {
                System.out.format("%5s  | ", em.getId());
                System.out.format("%20s | ", em.getName());
                System.out.format("%20s%n | ",em.getSalary());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found !!");
        }
    }
}
