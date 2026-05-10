package CodingProblems.Collection.Collections.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysFunctionalities {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = Arrays.binarySearch(arr, 6);
        System.out.println("The searched key is present at index: " + index);

        Integer[] array = {199, 24, 32, 4, 37, 28, 10};
        Arrays.sort(array);
        System.out.print("Sorted Element in Ascending Order: ");
        for (Integer i : array){
            System.out.print(i + " ");
        }
        System.out.println(" ");
        Integer[] newArr = {199, 24, 32, 4, 37, 28, 10};
        Arrays.sort(array, Comparator.reverseOrder());
        System.out.print("Sorted Element in Descending Order: ");
        for (Integer i : array){
            System.out.print(i + " ");
        }

        System.out.println();
        // replacing all values with 15 using Arrays.fill(int[], number_to_fill)
        Arrays.fill(array, 15);
        for (Integer i : array){
            System.out.print(i + " ");
        }

    }

}
