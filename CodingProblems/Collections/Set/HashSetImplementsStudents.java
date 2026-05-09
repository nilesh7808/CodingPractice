package CodingProblems.Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementsStudents {

    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Nilesh", 1));
        studentSet.add(new Student("Raj", 4));
        studentSet.add(new Student("Shanu", 3));
        studentSet.add(new Student("Sinha", 2));

        System.out.println(studentSet);

    }

}
