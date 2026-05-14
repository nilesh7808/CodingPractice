package CodingProblems.lambdas;

import java.util.ArrayList;
import java.util.List;

public class SortingUsingLambda {

    public static void main(String[] args) {

        List<Integer> items = new ArrayList<>();
        items.add(10);
        items.add(15);
        items.add(11);
        items.add(1);
        items.add(7);

        items.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(items);

        /*
        items.sort(Integer::compareTo);
        System.out.println(items);
         */

    }

}
