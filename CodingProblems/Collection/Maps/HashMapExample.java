package CodingProblems.Collection.Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<Integer, String> numbers = new HashMap<>();

        //mapping values to the numbers with key, value pairs
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(5, "Five");

        System.out.println(numbers);

        //traversing through the map
        for (Map.Entry<Integer, String> e : numbers.entrySet()){
            System.out.println(e);
        }

        // want to update key or value
        if (numbers.containsKey(1)){
            System.out.println("Entry Already Exists.");
            // if want to update entry of 1 by other value simply write below line and comment above line
            // numbers.put(1,"234");
        } else {
            numbers.put(1, "One");
            // also can write
            numbers.putIfAbsent(1, "o N  e");
        }
        // INSTEAD OF IF-ELSE you can write one-liner code
        // numbers.putIfAbsent(1, "o N  e");


        //removing values from entries
        numbers.remove(2);
        System.out.println("After removing entry from map: " + numbers);

        //if you want key value separately
        for (Map.Entry<Integer, String> entry : numbers.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // If want separate keys and values you can write like this
        for (Integer key : numbers.keySet()){
            System.out.println(key);
        }

        for (String value : numbers.values()){
            System.out.println(value);
        }

        // Key present or not
        System.out.println(numbers.containsKey(1));
        System.out.println(numbers.containsKey(10));

        // Value present or not
        System.out.println(numbers.containsValue("One"));
        System.out.println(numbers.containsValue("Ten"));

        //empty or not
        System.out.println(numbers.isEmpty());
        // clear map
        numbers.clear();
        System.out.println(numbers);

    }

}
