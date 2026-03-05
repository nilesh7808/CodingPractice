package CodingProblems.OOPs.Polymorphism;

class Calculator{
    int add(int a, int b){
         return a + b;

    }
    double add(double a, double b){
        double c = a + b;
        return c;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(12, 34));
        System.out.println(calculator.add(12.33, 23.00));
    }
}
