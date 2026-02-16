import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StartsWithLetter {

    public List<String> startsWithAnyLetter(List<String> names, String letter){
        List<String> finalList = new ArrayList<>();
        String searchLetter = letter.toUpperCase();
        for (String name : names){
            if(name.startsWith(searchLetter)){
                finalList.add(name);
                Collections.sort(finalList);
            }
        }
        System.out.println("List of names Starts with letter \""
                + letter
                + "\": ");
        return finalList;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("Artur");
        names.add("Nilesh");
        names.add("Shanu");
        names.add("Ankit");
        names.add("Vibhor");
        names.add("Rameez");
        names.add("Rajat");
        names.add("Niraj");
//        List<String> names = Arrays.asList("Ram", "Shyam", "Artur", "Arman", "Rahul", "Shanu", "Ankit", "Vibhor", "Nilesh");
        StartsWithLetter startsWithLetter = new StartsWithLetter();
        System.out.println(startsWithLetter.startsWithAnyLetter(names, "a"));
    }
}
