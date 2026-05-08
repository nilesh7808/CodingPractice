package CodingProblems.Collections.ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class TraverseUsingForEachLoop {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);

        //traverse using for-each loop
        for (Integer element : list){
            System.out.println("For each Iteration element: " + element);
        }

    }

}
