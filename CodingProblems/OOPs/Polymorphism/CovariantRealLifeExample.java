package CodingProblems.OOPs.Polymorphism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Flower{
    public String whatsYourName(){
        return "I have many names and types";
    }
}
class Rose extends Flower{
    @Override
    public String whatsYourName(){
        return "Rose";
    }
}
class Jasmine extends Flower{
    @Override
    public String whatsYourName(){
        return "Jasmine";
    }
}
class Lily extends Flower{
    @Override
    public String whatsYourName(){
        return "Lily";
    }
}

class Region{
    public Flower yourNationalFlower(){
        return new Flower();
    }
}

class Bihar extends Region{
    @Override
    public Rose yourNationalFlower(){
        return new Rose();
    }
}

class WestBengal extends Region{
    @Override
    public Jasmine yourNationalFlower(){
        return new Jasmine();
    }
}

class Hyderabad extends Region{
    @Override
    public Lily yourNationalFlower(){
        return new Lily();
    }
}

public class CovariantRealLifeExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine().trim();
        Region region = null;
        switch (s){
            case "WestBengal":
                region = new WestBengal();
                break;
            case "Bihar":
                region = new Bihar();
                break;
            case "Hyderabad":
                region = new Hyderabad();
                break;
        }
        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}
