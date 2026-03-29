package CodingProblems.OOPs.Constructors;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }

}

public class CopyConstructor {

    public static void main(String[] args) {
        Student student = new Student("Nilesh", 26);
        Student s2 = new Student(student);
        s2.name = "Raj";

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);

        System.out.println("After Copy Constructor: " + s2.name);
        System.out.println("After Copy Constructor: " + s2.age);

    }

}
