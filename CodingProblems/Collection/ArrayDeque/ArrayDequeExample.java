package CodingProblems.Collection.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        //adding element 1 by 1
        adq.offer(12);
        adq.offer(13);
        adq.offer(14);
        adq.offer(15);

        System.out.println(adq);

        //adding element at the front
        adq.offerFirst(16);
        System.out.println(adq);
        adq.offerFirst(24);
        System.out.println(adq);

        // adding element to the last/end
        adq.offerLast(9);
        System.out.println(adq);
        adq.offerLast(4);
        System.out.println(adq);

        //removing element
        System.out.println(adq.poll());
        System.out.println(adq);
        //removing first element
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        // removing element from last
        System.out.println(adq.pollLast());
        System.out.println(adq);

        //peeking element from adq
        System.out.println(adq.peek());
        System.out.println(adq);
        //peeking element from adq
        System.out.println(adq.peekFirst());
        System.out.println(adq);
        //peeking element from last
        System.out.println(adq.peekLast());
        System.out.println(adq);

    }

}
