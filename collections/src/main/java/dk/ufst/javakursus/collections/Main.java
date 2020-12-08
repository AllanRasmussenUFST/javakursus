package dk.ufst.javakursus.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student(1, "Ranga"),
                new Student(100, "Adam"),
                new Student(2, "Eve")
        );
        List<Student> studentsAll = new ArrayList<>(students);
        System.out.println(studentsAll);
        Collections.sort(studentsAll);
        System.out.println(studentsAll);
    }
}
