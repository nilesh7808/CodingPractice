package CodingProblems.OOPs.Inheritance;

class Persons{
    void message(){
        System.out.println("Message from the Person Class.");
    }
}

class Employees extends Persons{
    @Override
    void message() {
        System.out.println("This is a Employee Class.");
    }

    void display(){
        message();
        super.message();
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.display();
    }
}
