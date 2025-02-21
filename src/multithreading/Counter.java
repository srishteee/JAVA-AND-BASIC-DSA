package multithreading;

public class Counter {

    private int count =0;

    public  synchronized  void increment () {   // this part of section known as critical section before when we are not using synchronised keyword this condition is callled race condiiton in which two thread shared one pobject and outcomes is not predictable
        // if you want only one in stance should be synchrnised then use synchronised block below:
        // synchronised(this){
    // count++}
        // Mutual exclusion, which is supported in the Java virtual machine via object locks, enables multiple threads to independently work on shared data without interfering with each other.
        count++;
    }
    public int  getCount(){
         return count;
    }
}
