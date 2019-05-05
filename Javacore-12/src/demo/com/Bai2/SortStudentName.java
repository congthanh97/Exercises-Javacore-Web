package demo.com.Bai2;

import java.util.Comparator;

public class SortStudentName implements Comparator<Student>{

    @Override
    public int compare(Student Student1, Student Student2) {
        return Student1.getName().compareTo(Student2.getName());
    }
}
