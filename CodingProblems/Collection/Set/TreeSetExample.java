package CodingProblems.Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        Set<Integer> items = new TreeSet<>();

        items.add(12);
        items.add(13);
        items.add(43);
        items.add(32);
        items.add(76);

        System.out.println(items);

        //removing element from the set
        System.out.println(items.remove(12));
        System.out.println(items);

        System.out.println(items.remove(12)); //return false as it has no elements with the desired input

        //element present or not in the set
        System.out.println(items.contains(13));
        System.out.println(items.contains(12));

        //set(items here in this case) is empty or not ?
        System.out.println(items.isEmpty());

        //size of the set
        System.out.println(items.size());
        //remove all elements from the set
        items.clear();
        System.out.println(items);

    }

}
