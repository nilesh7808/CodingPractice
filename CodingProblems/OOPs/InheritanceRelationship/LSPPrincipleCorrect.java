package CodingProblems.OOPs.InheritanceRelationship;

abstract class Shape{

    abstract double getArea();

}

class Rectangles extends Shape{
    protected double width;
    protected double height;

    public Rectangles(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea(){
        return height * width;
    }
}

class Squares extends Shape{
    protected double side;

    public Squares(double side){
        this.side = side;
    }

    @Override
    double getArea(){
        return side * side;
    }

}

public class LSPPrincipleCorrect {

    public static void main(String[] args) {
        Shape rectangle = new Rectangles(2,3);
        System.out.println("Area of a Rectangle is : " + rectangle.getArea());
        Shape square = new Squares(2);
        System.out.println("Area of a Square is : " + square.getArea());
    }

}
