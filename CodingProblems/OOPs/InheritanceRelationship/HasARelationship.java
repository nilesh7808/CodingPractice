package CodingProblems.OOPs.InheritanceRelationship;

class Engine{
    public void start(){
        System.out.println("Engine Started...");
    }
}

class Car{
    private final Engine engine; // car HAS-A relation
    public Car(){
        this.engine = new Engine();
    }
    public void startCar(){
        this.engine.start();
        System.out.println("Now Car is running...");
    }
}

public class HasARelationship {
    public static void main(String[] args) {
        System.out.println("This shows has-A relation");
        Car car = new Car();
        car.startCar();
    }
}
