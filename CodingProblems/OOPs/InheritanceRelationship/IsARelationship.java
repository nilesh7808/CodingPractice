package CodingProblems.OOPs.InheritanceRelationship;

class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{ // Dog IS-A Animal and it shows is-a relationship as it belongs to Animal
    void bark(){
        System.out.println("Barking...");
    }
}

public class IsARelationship {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
    }
}
