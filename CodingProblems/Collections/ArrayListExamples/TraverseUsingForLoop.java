package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class TraverseUsingForLoop {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        //traverse using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("The element is: " + list.get(i));
        }

    }

}
