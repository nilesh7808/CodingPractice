package CodingProblems;
import java.util.Scanner;

public class ReverseStringSimple {
    public static void main(String[] args) {
        System.out.print("Enter a name that you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        String reversedString = " ";
        for (int i = 0; i < originalString.length(); i++){
            reversedString = originalString.charAt(i) + reversedString;
        }
        System.out.println("Reversed String is : " + reversedString);
        System.out.println("Original String is Still same : " + originalString);
    }
}
