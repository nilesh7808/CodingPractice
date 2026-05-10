package CodingProblems.Collection.Set;

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

        Student s1 = new Student("Nil", 2);
        Student s2 = new Student("Nilu", 2);

        //this is for the testing purpose to understand the concept
//        Student s2 = new Student("Nilu", 3);
//        Student s2 = new Student("Nil", 2);

        System.out.println(s1 == s2); // false: because it will check the reference of newly class object created
        System.out.println(s1.equals(s2)); // true: because we are comparing object to make it equal based on the roll Number

    }

}
