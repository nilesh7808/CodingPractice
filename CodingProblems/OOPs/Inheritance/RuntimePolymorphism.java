package CodingProblems.OOPs.Inheritance;

class Vehicle {
    void vehicles(){
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle{
    void cars(){
        System.out.println("This is a vehicle car.");
    }
    @Override
    void vehicles(){
        System.out.println("This is from car.");
    }
}

class Bike extends Vehicle{
    void bikes(){
        System.out.println("This is a Vehicle Bike.");
    }
    @Override
    void vehicles(){
        System.out.println("This is from Bike Vehicles.");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        System.out.println("Below is a basic Inheritance Examples.");
        Car car = new Car();
        car.vehicles();
        car.cars();
        Bike bike = new Bike();
        bike.vehicles();
        bike.bikes();
        System.out.println("This is how we can achieve Runtime Polymorphism via Inheritance.");
        Vehicle vehicle = new Car();
        vehicle.vehicles();
        Vehicle vehicle1 = new Bike();
        vehicle1.vehicles();
    }
}
