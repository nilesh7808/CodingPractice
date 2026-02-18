package CodingProblems;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        System.out.print("Enter a String or name that you want to reverse : ");
        Scanner sc = new Scanner(System.in);
        String originalString = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for(char c : originalString.toCharArray()){
            stack.push(c);
        }
//        String finalString = "";
//        while (!stack.isEmpty()){
//            finalString += stack.pop();
//        }
//        System.out.print(finalString);
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        System.out.print("The final reversed String will be : " + stringBuilder);
    }

}
