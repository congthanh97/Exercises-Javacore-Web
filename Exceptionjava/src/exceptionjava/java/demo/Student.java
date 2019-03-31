
package exceptionjava.java.demo;

import java.util.Scanner;

public class Student {
    private String Msv;
    private float diemTB;
    private int age;
    private String classSv;
    public String XL;
    private int group;

    public Student() {
    }

    public Student(String Msv, float diemTB, int age, String XL, int group) {
        this.Msv = Msv;
        this.diemTB = diemTB;
        this.age = age;
        this.XL = XL;
        this.group = group;
    }

    public Student(String Msv, float diemTB, int age, String classSv) {
        this.Msv = Msv;
        this.diemTB = diemTB;
        this.age = age;
        this.classSv = classSv;
        this.calGroup();
    }
    private void calGroup() {
        if (this.diemTB >= 8)
            this.setGroup(1);
        else if (this.diemTB >= 6)
            this.setGroup(2);
        else if (this.diemTB >= 4)
            this.setGroup(3);
        else 
            this.setGroup(4);
    }
    
    public String getMsv() {
        return Msv;
    }

    public void setMsv(String Msv) {
        this.Msv = Msv;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
        this.calGroup();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassSv() {
        return classSv;
    }

    public void setClassSv(String classSv) {
        this.classSv = classSv;
    }

    public String getRank() {
        return XL;
    }
    
    public void setRank(String XL) {
        this.XL = XL;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
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
     public  String toString(){
         return "Student{"+ "msv+ "+ Msv;
     }
}
