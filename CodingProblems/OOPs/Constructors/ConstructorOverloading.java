package CodingProblems.OOPs.Constructors;

class Students{
    int rollNo;
    String name;

    Students(){
        this.rollNo = 1;
        this.name = "Nilesh";
    }

    Students(String name){
        this.name = name;
        this.rollNo = 2;
    }

    Students(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void display(){
        System.out.println("Name: " + name + " Roll Number: " + rollNo);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Students student = new Students();
        Students student1 = new Students("Shanu");
        Students student2 = new Students("Hector", 3);

        student.display();
        student1.display();
        student2.display();

    }
}
