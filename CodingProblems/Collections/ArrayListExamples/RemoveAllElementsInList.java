package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllElementsInList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.clear();
        System.out.println(list);

    }

}
