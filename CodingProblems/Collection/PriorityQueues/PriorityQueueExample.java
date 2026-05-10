package CodingProblems.Collection.PriorityQueues;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();

        // adding element to the Priority Queue
        pq.offer(50);
        pq.offer(40);
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(3);

        System.out.println(pq);

        //removing element from priority queue
        System.out.println("Removed element: " + pq.poll());

        System.out.println(pq);

        //seeing element which is in the next to the queue
        System.out.println("Next element in the queue: " + pq.peek());

    }

}
