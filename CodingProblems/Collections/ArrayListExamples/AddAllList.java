package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class AddAllList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(600);
        newList.add(700);
        newList.add(800);
        System.out.println(newList);
        System.out.println(list);
        // adding all newList to the older list
        list.addAll(newList);
        System.out.println("Our List on adding all new list: " + list);
    }

}
