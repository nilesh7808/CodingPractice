package CodingProblems.Collection.Collections.OtherFunctionalities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassFunctionalities {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(14);
        list.add(54);
        list.add(37);

        System.out.println("Min Element in the list:" + Collections.min(list));
        System.out.println("Max element in the list: " + Collections.max(list));
        System.out.println("Frequency of element in the list: " + Collections.frequency(list,12));
        Collections.sort(list); // ascending order
        Collections.sort(list, Comparator.reverseOrder()); // reverse order sort

    }

}
