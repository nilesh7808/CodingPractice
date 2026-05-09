package CodingProblems.Collections.Stacks;

import java.util.Stack;

public class BasicStacks {

    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        // use add as it returns void if no values are present and will throw Exception better to use
        // push()
//        books.add("Hindi");
//        books.add("English");
//        books.add("Maths");
//        books.add("Biology");
//        books.add("Physics");

        books.push("Hindi");
        books.push("English");
        books.push("Maths");
        books.push("Biology");
        books.push("Physics");

        System.out.println("Stacks of books: " + books);

        System.out.println(books.peek());

        System.out.println(books.pop());

        System.out.println("Stacks of books After pop 1 item: " + books);




    }

}
