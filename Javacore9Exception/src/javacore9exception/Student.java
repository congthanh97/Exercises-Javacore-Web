/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore9exception;

import java.util.Scanner;

public class Student{
    private String Msv;
    private float diemTB;
    private int age;
    private String classSv;
    public String XL;

    public Student() {
    }

    public Student(String Msv, float diemTB, int age,String classSv,String XL) {
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
        return XL;
    }
    
    public void setRank(String XL) {
        this.XL = XL;
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
                    System.out.print("Nhập ClassSV: ");
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
            this.XL();
            flag = false;
            
        }while(flag);
        
    }
    
    
   public void XL(){
       if(getDiemTB() >= 8 && getDiemTB()<=10) {
            setRank("Giỏi");
        }
        else if(getDiemTB() >=6 && getDiemTB()<8) {
            setRank("Khá");
        }
        else if(getDiemTB() >=4 &&  getDiemTB()<6) {
            setRank("Trung bình");
        }
        else if(getDiemTB() >=1 &&  getDiemTB()<4) {
            setRank("Kém");
        }
    }
    
    @Override
    public String toString(){
        return "MSV: "+Msv+ "\tAge: "+age+ "\tPoint: "+diemTB+ "\tClassSV: "+classSv+ "\tXếp loại: " + XL;
    }
}
