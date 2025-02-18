package Queues.deQueue;

import java.util.ArrayDeque;

public class Practice1 {

    public static void main(String[] args) {
        // creation of array dequeu
        ArrayDeque<Integer> arrDequeuAsQueue = new ArrayDeque<>();

        // Insterion FIFO
        arrDequeuAsQueue.addLast(1);
        arrDequeuAsQueue.addLast(7);
        arrDequeuAsQueue.addLast(9);

         // deletion
        int element = arrDequeuAsQueue.removeFirst();
        System.out.println(element);

        //LIFO -- STACK

        ArrayDeque<Integer> arrayDequeuAsStack = new ArrayDeque<>();

        arrayDequeuAsStack.addFirst(15);
        arrayDequeuAsStack.addFirst(17);
        arrayDequeuAsStack.addFirst(8);
        // deletion
        int e = arrayDequeuAsStack.removeFirst();
        System.out.println(e);

    }
    // time and complexity 0(1) amortised sometimes O(n)-- when queue is full it make resize double the queue then O(n)
   // space O(n)
}
