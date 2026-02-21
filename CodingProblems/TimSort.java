package CodingProblems;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    int age;
    String name;

    Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return  age + " " + name;
    }
}

public class TimSort {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(22, "Rajat"));
        list.add(new Person(23,"Nilesh"));
        list.add(new Person(22,"Ankit"));
        list.sort(Comparator.comparingInt(p -> p.age)); // This is an example of TimSort
        System.out.println("Our output is: " + list);
    }
}

