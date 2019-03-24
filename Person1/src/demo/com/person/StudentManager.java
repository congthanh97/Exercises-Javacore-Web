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
public class StudentManager extends Manager{
   
    private Student[] listS = null;
    private  int crr =  0;
    private static final int MAX = 30;

    public StudentManager() {
    this.listS =  new Student[MAX];
    }
    
    
    
    @Override
    public void add() { 
        Student st = new Student();
        st.input();
        this.listS[crr] = st;
        this.crr++;
    }

    @Override
    public void show() {
        System.out.println("\n\t\t\tDanh sach person\n");
        System.out.printf("\n%5s %25s %20s \n","ID","Hoten","Mail");
        for(Student sv: listS){
            if (sv == null) continue;
            System.out.format("%5s  | ", sv.getId());
            System.out.format("%20s | ", sv.getName());
            System.out.format("%20s%n | ",sv.getMail());
            
        }
    }

    @Override
    public void search(String name) {  
        System.out.println("\t\t\t====Result====");
         boolean check = false;
        System.out.println("\n\t\t\tDanh sach person\n");
        System.out.printf("\n%5s %23s %20s \n","ID","Hoten","Mail");
        for(Student student: listS){
            if (student == null) continue;
            if(student.getName().equals(name))
            {
                System.out.format("%5s  | ", student.getId());
                System.out.format("%20s | ", student.getName());
                System.out.format("%20s%n | ",student.getMail());
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found !!");
        }
    }
    
    
}
