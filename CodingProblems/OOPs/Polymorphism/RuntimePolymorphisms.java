package CodingProblems.OOPs.Polymorphism;

class Animalia{
    void makeSound(){
        System.out.println("Animal Sound...");
    }
}

class Cat extends Animalia{
    @Override
    void makeSound() {
        System.out.println("Meow Meow ...");
    }
}

public class RuntimePolymorphisms {
    public static void main(String[] args) {
        Animalia animalia = new Cat(); // JVM decided this reference object at runtime.
        animalia.makeSound();
    }
}
