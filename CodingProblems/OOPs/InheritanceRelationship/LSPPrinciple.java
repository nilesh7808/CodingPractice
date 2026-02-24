package CodingProblems.OOPs.InheritanceRelationship;

class Rectangle{
    protected double width;
    protected double height;
    void setWidth(double w){
        width = w;
    }
    void setHeight(double h){
        height = h;
    }
    double getArea(){
        return height * width;
    }
}

class Square extends Rectangle{
    @Override
    void setWidth(double w){
        width = height = w;
    }
    @Override
    void setHeight(double h){
        width = height = h;
    }
}

public class LSPPrinciple {

    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        r.setWidth(5);
//        r.setHeight(10);
//        System.out.println("Area: " + r.getArea());

        Rectangle r = new Square(); // Runtime polymorphism but this obey Liskov Substitution Principle
        r.setWidth(5);
        r.setHeight(10);
        System.out.println("Area: " + r.getArea()); // output will be 100 as it take both eight and width as 10
        // and its output depends on order of element so that's why it disobeys Liskov Substituion Principle
    }
}
