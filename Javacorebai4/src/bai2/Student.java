/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

public class Student{
    private String Msv;
    private float diemTB;
    private int age;
    private String classSv;
    public String rank;

    public Student() {
    }

    public Student(String Msv, float diemTB, int age,String classSv,String rank) {
        this.Msv = Msv;
        this.diemTB = diemTB;
        this.age = age;
    }


    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv
                = Msv;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    public String getClassSV(){
        return  classSv;
    }
    
    public void setClassSv(String classSv){
        this.classSv =  classSv;
    }
    
    public String getRank() {
        return rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
        
    
    
    public void add(){
        Scanner scanner = new Scanner(System.in);
        boolean flag=false;
        do{
            String Msv;
            int age;
            float point;
            String classSV;
             do {
                try {
                    System.out.print("Nhập classSV: ");
                    classSV = scanner.nextLine();
                    if(new checkInfor().checClassSV(classSV)) {
                        flag = true;
                        setClassSv(classSV);
                    }
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }while(!flag);
             flag =  false;
            do{
                try {
                     System.out.printf("MSV: ");
                     Msv = scanner.nextLine();
                     if(new checkInfor().checkMSV(Msv)){
                         flag = true;
                         setMsv(Msv);
                     }
                } catch (Exception e) {
                     System.out.println(e.getMessage());
                }
            }while(!flag);
            flag = false;
            do {                
                try {
                    System.out.printf("Age: ");
                    age = scanner.nextInt();
                    if(new checkInfor().checkAge(age)){
                        flag = true;
                        setAge(age);
                    }
                } catch (Exception e) {
                     System.out.println(e.getMessage());
                }
            } while (!flag);
            flag = false;
            
            do {                
                try {
                    System.out.printf("Point: ");
                    point =  scanner.nextFloat();
                    if(new checkInfor().checkDiem(point)){
                        flag = true;
                        setDiemTB(point);
                    }
                } catch (Exception e) {
                     System.out.println(e.getMessage());
                }
            } while (!flag);
            //
           
            flag = false;
           
        }while(flag);
         this.Rank();
    }
    
    
    public void Rank(){
        if (getDiemTB()>=8.0) {
            System.out.println("Được học bổng");
        }
    }
    
    @Override
    public String toString(){
        return "MSV: "+Msv+ "Age: "+age+"Point: "+diemTB+"ClassSV: "+classSv;
    }
}
