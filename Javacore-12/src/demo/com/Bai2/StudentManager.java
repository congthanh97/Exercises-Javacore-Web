/*
 * add,edit,delete ,update student
 */
package demo.com.Bai2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<Student> studentList;
    private StudentRW studentRW;
     
  
    public StudentManager() {
        studentRW = new StudentRW();
        studentList = studentRW.read();
    }
    
  
    public void add() {
        int id = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + id);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        int Phone = inputPhone();
        float dmTB = inputDmTB();
        Student student = new Student(id, name, age, address, Phone , dmTB);
        studentList.add(student);
        studentRW.write(studentList);
    }
    
    public void AddThem(){
        System.out.println("Enter the id to insert later: ");
        int id = inputId();
        int ID = (studentList.size() > 0) ? (studentList.size() + 1) : 1;
        System.out.println("student id = " + ID);
        String name = inputName();
        byte age = inputAge();
        String address = inputAddress();
        int Phone = inputPhone();
        float dmTB = inputDmTB();
        Student student = new Student(ID, name, age, address, Phone , dmTB);
        studentList.add(id,student);
        studentRW.write(studentList);
    
    }
 

    
    public void editId(int id){
        boolean isExisted  = false;
        int size = studentList.size();
        for(int i =0; i<size; i++){
            if (studentList.get(i).getID() == id) {
                isExisted = true;
                studentList.get(i).setName(inputName());
                studentList.get(i).setAge(inputAge());
                studentList.get(i).setAddress(inputAddress());
                studentList.get(i).setPhone(inputPhone());
                studentList.get(i).setDmTB(inputDmTB());
            }
            
        }
        if (!isExisted) {
            System.err.printf("id %d not existed ",id);
        }else{
            studentRW.write(studentList);
        }
    }
    
    public void deleteId(int id){
       Student student = null;
        int size = studentList.size();
        for (int i = 0; i < size; i++) {
            if (studentList.get(i).getID() == id) {
                student = studentList.get(i);
                break;
            }
        }
        if (student != null) {
            studentList.remove(student);
            studentRW.write(studentList);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }  
    }
    
    
     /**
     * sort student by name
     */
    public void sortStudentName() {
        Collections.sort(studentList, new SortStudentName());
       // Collections.sort(studentList, cmprtr);
    }
 
    /**
     * sort student by DmTB
     */
    public void sortStudentDmTB() {
        Collections.sort(studentList, new SortStudentDmTB());
    }
    
    /**
     * sort student by id
     */
     public void sortStudentId(){
        Collections.sort(studentList, new SortStudentId());
    }
 
    /**
     * show list student to screen
     */
    public void show() {
         System.out.printf("\n%5s %23s %10s %21s %13s %15s\n","ID","Hoten","tuoi","Diachi"," Diemthi","Phone");
        for (Student student : studentList) {
            System.out.format("%5d  | ", student.getID());
            System.out.format("%20s | ", student.getName());
            System.out.format("%5d  | ", student.getAge());
            System.out.format("%20s | ", student.getAddress());
            System.out.format("%10.1f  |", student.getDmTB());
            System.out.format("%15d%n", student.getPhone());
        }
    }
    
    /**
     * Search theo ten student
     * @return 
     */
    public void Search()
    {
        String Name;
        int size = studentList.size();
        System.out.println("Enter the name you want to find: ");
        Name = inputName();
        System.out.printf("Search by name: %s",Name);
        System.out.printf("\n%5s %23s %10s %21s %13s %15s\n","ID","Hoten","tuoi","Diachi"," Diemthi","Phone");
        for (int i = 0; i < size; i++) {
            if(studentList.get(i).getName().equals(Name))
            {
                System.out.format("%5d  | ", studentList.get(i).getID());
                System.out.format("%20s | ", studentList.get(i).getName());
                System.out.format("%5d  | ", studentList.get(i).getAge());
                System.out.format("%20s | ", studentList.get(i).getAddress());
                System.out.format("%10.1f  |", studentList.get(i).getDmTB());
                System.out.format("%15d%n", studentList.get(i).getPhone());
            }
        }
    }
    
    //input data
    public int inputId() {
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    
    private String inputName(){
        System.out.printf("Input name: ");
        return scanner.nextLine();
    }
    
    private String inputAddress(){
        System.out.printf("Input Address: ");
        return scanner.nextLine();
    }
    
    private byte inputAge() {
        System.out.printf("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((scanner.nextLine()));
                if (age < 0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.printf("invalid! Input student id again: ");
            }
        }
    }
     
    private int inputPhone() {
        System.out.printf("Input Phone: ");
        while (true) {
            try {
                int phone = Integer.parseInt((scanner.nextLine()));
                if (phone < 0 && phone > 11) {
                    throw new NumberFormatException();
                }
                return phone;
            } catch (NumberFormatException ex) {
                System.out.printf("invalid! Input student id again: ");
            }
        }
    }
    
    private float inputDmTB(){
        System.out.printf("Input Diem TB: ");
        while (true) {
            try {
                float dmTB =  Float.parseFloat((scanner.nextLine()));
                if (dmTB < 0.0 && dmTB > 10.0) {
                    throw new NumberFormatException();
                }
                return dmTB;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }

     // getter && setter
    public List<Student> getStudentList() {
        return studentList;
    }
 
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }


  
}
