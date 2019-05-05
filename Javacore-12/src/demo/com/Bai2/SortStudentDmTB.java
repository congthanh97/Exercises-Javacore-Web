/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.com.Bai2;

import java.util.Comparator;

public class SortStudentDmTB implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if (Student1.getDmTB() > Student2.getDmTB()) {
            return 1;
        }
        return -1;
    }
}