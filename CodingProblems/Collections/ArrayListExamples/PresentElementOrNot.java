package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class PresentElementOrNot {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        System.out.println("10 is present or not: " + list.contains(10));

        System.out.println("1000 is present or not: " + list.contains(1000));

    }

}
