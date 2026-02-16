import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StartWithLetterWithStream {

    public List<String> letterWithStream(List<String> names, String letter){
        String searchLetter = letter.toUpperCase();
        return names.stream()
                .filter(name -> name.toUpperCase().startsWith(searchLetter))
                .sorted()
                .collect(Collectors.toList());
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
        names.add("Arman");
        StartWithLetterWithStream startWithLetterWithStream = new StartWithLetterWithStream();
        System.out.print("Enter your letter to search : ");
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();
        List<String> finalList = startWithLetterWithStream.letterWithStream(names, letter);
        System.out.println("List of names starts with letter \"" + letter + "\" : " + finalList);
    }
}
