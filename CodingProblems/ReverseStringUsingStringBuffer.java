package CodingProblems;

import java.util.Scanner;

public class ReverseStringUsingStringBuffer {
    public static void main(String[] args) {

        System.out.print("Enter a name to reverse: ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        StringBuffer stringBuffer = new StringBuffer(originalString);
        stringBuffer.reverse();
        System.out.println("Reversed String is : " + stringBuffer);
        System.out.println("Original String is : " + originalString);

    }
}
