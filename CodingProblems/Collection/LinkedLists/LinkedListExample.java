package CodingProblems.Collection.LinkedLists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {

        List<Integer> enteries = new LinkedList<>();

        enteries.add(1);
        enteries.add(2);
        enteries.add(3);
        enteries.add(4);
        enteries.add(5);

        System.out.println(enteries);

        enteries.remove(1);
        System.out.println(enteries);

        enteries.add(1, 10);

        System.out.println(enteries);

        enteries.remove(Integer.valueOf(5));

        System.out.println(enteries);

        // Note all the methods in LinkedList will be same as the ArrayList's methods

    }

}
