package CodingProblems.OOPs.Constructors;

class Ar{

    double id;
    String name;

    // No constructor defined here; compiler provides the default constructor
    void display(){
        System.out.println("Id is: " + id + " Name is: " + name);
    }

}
public class DefaultConstructor {
    public static void main(String[] args) {
        // Calls the implicit default constructor
        Ar ar = new Ar();
        ar.display();
    }
}
