package CodingProblems;

import java.util.*;

public class ReverseStringUsingCollections {
    public static void main(String[] args) {
        System.out.print("Enter a name to reverse: ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        char[] characterArray = originalString.toCharArray();
        List<Character> charactersList = new ArrayList<>();
        for (char c : characterArray){
            charactersList.add(c);
        }
        Collections.reverse(charactersList);
        ListIterator it = charactersList.listIterator();
        System.out.print("The reversed string is : ");
        while (it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();
        System.out.print("The original string is : " + originalString);
    }
}
