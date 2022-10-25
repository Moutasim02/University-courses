package com.data_structures_and_algorithms_CSC301.Lectures.Chapter_4;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_QueueDemo {
    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(); // Will be arranged in ascending order, unless we use a dedicated comparator or Collections.reverseOrder() as an argument
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(2.0);
        queue.offer(1.5);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        Queue<String> queue1 = new PriorityQueue<>(); // Will be arranged in ascending order, unless we use a dedicated comparator or Collections.reverseOrder() as an argument
        queue1.offer("A");
        queue1.offer("C");
        queue1.offer("E");
        queue1.offer("D");
        queue1.offer("B");

        while (!queue1.isEmpty()) {
            System.out.println(queue1.poll());
        }
    }
}
