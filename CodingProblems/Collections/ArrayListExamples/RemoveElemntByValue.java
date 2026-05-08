package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class RemoveElemntByValue {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(30)));

        System.out.println(list.remove(Integer.valueOf(300)));

        System.out.println(list);

        System.out.println(list.remove(Integer.valueOf(30)));
        System.out.println(list);


    }

}
