package CodingProblems;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndSortDifference {

    public static void main(String[] args) {

        // using sorted() from stream
        List<Integer> numbers = Arrays.asList(8, 7, 4, 9, 11, 12, 10, 6, 3, 5, 1, 2);
        System.out.println("Original List of numbers: " + numbers);
        List<Integer> sortedNumbers =  numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Numbers are : " + sortedNumbers);
        System.out.println("Original list will remain Unchanged after sorting also: " + numbers);

        // using sort() from arrays
        List<String> names = Arrays.asList("Raj","Nilesh", "Ankit", "Niraj", "Rajat");
        System.out.println("Original List of names are: " + names);
        names.sort(Comparator.naturalOrder());
        System.out.println("Now original list is changed : " + names);

    }
}
