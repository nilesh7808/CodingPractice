package CodingProblems.Collections.Queues;

import java.util.LinkedList;
import java.util.Queue;

public class LearningQueue {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Nilesh");
        queue.offer("Raj");
        queue.offer("Sinha");
        queue.offer("Shanu");
        queue.offer("Kumar");

        System.out.println("Queues: " + queue);

        System.out.println(queue.poll());

        System.out.println("Queues: " + queue);

        System.out.println(queue.peek());

        System.out.println("Queues: " + queue);

    }

}
