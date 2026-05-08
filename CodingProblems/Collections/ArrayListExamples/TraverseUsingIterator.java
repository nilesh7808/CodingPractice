package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseUsingIterator {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        //traverse using Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("Iterated Element is: " + it.next());
        }

    }

}
