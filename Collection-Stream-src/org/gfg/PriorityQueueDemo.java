package org.gfg;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder()); // min heap --> asc order , max heap --> desc order
        queue.add(9);
        queue.add(3);
        queue.add(10);
        queue.add(7);
        queue.add(1);
        queue.add(13);
        queue.add(17);
        queue.poll();
//        queue.poll();
        System.out.println(queue);
    }
}
