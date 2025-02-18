package comparableAndComparator;

import java.util.PriorityQueue;

public class PracticeNo1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> minPQ = new PriorityQueue<>(); // min pq by default- ascending order

        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(3);
        minPQ.add(1);

        // lets print all the values
        minPQ.forEach((Integer val)-> System.out.println(val));

        // remove top element from the PQ and print

        while(!minPQ.isEmpty()){

            int val = minPQ.poll();
            System.out.println("remove from top "+ val);
        }

    }
}
