package CodingProblems.OOPs.Constructors;

class Builder{
    int id;
    String name;

    Builder(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(id + " and " + name);
    }

}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Builder builder = new Builder(1, "Rahul");
        Builder builder1 = new Builder(2, "Arman");

        builder.show();
        builder1.show();
}
}
