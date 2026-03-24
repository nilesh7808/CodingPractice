package CodingProblems.OOPs.Polymorphism;

class Animale{
    public Animale reproduce(){
        return new Animale();
    }
}

class Catie extends Animale{
    @Override
    public Catie reproduce(){
        return new Catie();
    }
}

class Doggie extends Animale{
    @Override
    public Doggie reproduce(){
        return new Doggie();
    }
}

public class CovariantReturnType {
    public static void main(String[] args) {
        Animale animale = new Catie();
        Catie catie = (Catie) animale.reproduce();
        System.out.println(catie);
    }
}
