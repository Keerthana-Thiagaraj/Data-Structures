package SortingAlgo;

import java.util.Collections;
import java.util.PriorityQueue;

//Implementation of Max Heap using in-built Priority Queue class of Java

public class PriorityQueueImpl {

    public static void main(String[] args) {

        //Collections.reverseOrder() is to implement Max Heap by changing default Min Heap property of Priority Queue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        priorityQueue.add(5);
        priorityQueue.add(7);
        priorityQueue.add(18);

        System.out.println("Display of elements after insertion");
        for (Integer i : priorityQueue) {
            System.out.println(i);
        }
        System.out.println("Head or Root element using Peek function " + priorityQueue.peek());
        priorityQueue.poll();

        System.out.println("Display of elements after polling the head element with poll()");
        for (Integer j : priorityQueue) {
            System.out.println("" + j);
        }

    }
}
