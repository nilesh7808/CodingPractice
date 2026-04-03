package CodingProblems.OOPs.Constructors;

class Br {
    String name;

    // Explicit no-argument constructor
    Br(){
        name = "Bihar";
    }

}

public class NoArgumentsConstructor {
    public static void main(String[] args) {
        Br br = new Br(); // Output: Br is created
        System.out.println(br.name); // Output: Bihar
    }
}
