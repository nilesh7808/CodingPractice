package CodingProblems.Collection.Collections.OtherFunctionalities;

import java.util.*;

public class StudentsImpl {

    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students("Nilesh", 1));
        studentsList.add(new Students("Raj", 4));
        studentsList.add(new Students("Shanu", 3));
        studentsList.add(new Students("Sinha", 2));

        Collections.sort(studentsList);
    /*
        Students s1 = new Students("Abc", 12);
        Students s2 = new Students("xyz", 32);

        System.out.println(s1.compareTo(s2));

     */

        // sorting based on roll number
        Collections.sort(studentsList);
        System.out.println("Sorting students based on roll Number: " + studentsList);

        // sorting based on name
       /* Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                //return 0;
                return o1.name.compareTo(o2.name);
            }
        });

        */
        // sorting based on name using lambda expressions
        Collections.sort(studentsList, (o1, o2) -> o1.name.compareTo(o2.name));
        System.out.println("Sorting students based on name: " + studentsList);

        // iterating values using iterator

        /*Iterator<Students> it =  studentsList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        */

        //using for-each loop
       /*
        for (Students s: studentsList){
            System.out.println(s);
        }
        */

    }

}
