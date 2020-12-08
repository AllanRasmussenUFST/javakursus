package dk.ufst.javakursus.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> studentsAl = new ArrayList<>();
        studentsAl.add(new Student(1, "Ranga"));
        studentsAl.add(new Student(100, "Adam"));
        studentsAl.add(new Student(2, "Eve"));
        System.out.println(studentsAl);
        Collections.sort(studentsAl);
        System.out.println(studentsAl);
    }
}
