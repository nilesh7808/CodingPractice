package CodingProblems.OOPs.Inheritance;

class Animal {

    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

public class BasicInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
