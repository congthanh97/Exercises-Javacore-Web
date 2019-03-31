
package exceptionjava.java.demo;

import java.util.Collections;
import java.util.Scanner;


public class StudentManager {
    private Scanner scanner;         
    private Student[] list = null;
    private  int crr =  0;
    private static final int MAX = 20;
    
    public StudentManager() {
         this.list = new Student[MAX];
          this.scanner = new Scanner(System.in);
    }
    
   
    public void add() {  
        String classsv = inputClass();
        String msv =  inputMsv();
        int age =  inputAge();
        float point = inputPoint();
        Student s= new  Student(msv,point,age,classsv);
        this.list[crr] = s;
        this.crr++;
    }
    
    
    public void show() {
        System.out.println("\n\t\t\tDanh sach person\n");
        System.out.printf("\n%10s %25s %20s \n","MSV","ClassSV","DiemSV");
        for(Student sv: list){
            if (sv == null) continue;
            System.out.format("%10s  | ", sv.getMsv());
            System.out.format("%20s | ", sv.getClassSv());
            System.out.format("%20s%n ",sv.getDiemTB());
        }
    }
    
    
    public String inputClass(){
        boolean flag=false;
        Student stu = new Student();
        String classSV = null;
        do{
            try {
                System.out.print("Nhập ClassSV: ");
                classSV = scanner.nextLine();
                if(new CheckInfor().checClassSV(classSV)) {
                    flag = true;
                    stu.setClassSv(classSV);
                }                   
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!flag);
        return classSV;  
    }
     public String inputMsv(){
        boolean flag=false;
        Student stu = new Student();
        String msv = null;
        do{
            try {
                System.out.print("Nhập MSV: ");
                msv = scanner.nextLine();
                if(new CheckInfor().checkMSV(msv)) {
                    flag = true;
                    stu.setMsv(msv);
                }                   
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while(!flag);
        return msv;  
    }
     public int inputAge(){
        boolean flag=false;
        Student stu = new Student();
        int age = 0;
          do {                
                try {
                    System.out.printf("Age: ");
                    age = scanner.nextInt();
                    if(new CheckInfor().checkAge(age)){
                        flag = true;
                        stu.setAge(age);
                    }
                } catch (Exception e) {
                     System.out.println(e.getMessage());
                }
            } while (!flag);
          return age;
     }
     public float inputPoint(){
         boolean flag=false;
        Student stu = new Student();
        float point = 0;
         do {                
                try {
                    System.out.printf("Point: ");
                    point =  scanner.nextFloat();
                    if(new CheckInfor().checkDiem(point)){
                        flag = true;
                        stu.setDiemTB(point);
                    }
                } catch (Exception e) {
                     System.out.println(e.getMessage());
                }
            } while (!flag);
         return point;
     }
     
      public void showTop(int num) {
        Student[] arr = this.getOrderList();
        System.out.printf("----TOP %d----\n", num);
        System.out.printf("\n%10s %25s %20s \n","MSV","ClassSV","DiemSV");
        for(Student sv: arr){
            if (sv == null) continue;
            System.out.format("%10s  | ", sv.getMsv());
            System.out.format("%20s | ", sv.getClassSv());
            System.out.format("%20s%n ",sv.getDiemTB());
        }
    }

    private Student[] getOrderList() {
        Student[] arr = list;
        for (int i = 0; i < this.crr - 1; i++) {
            for (int j = i + 1; j < this.crr; j++) {
                if (arr[i].getDiemTB()< arr[j].getDiemTB()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }   
        }
        return arr;
    }
}