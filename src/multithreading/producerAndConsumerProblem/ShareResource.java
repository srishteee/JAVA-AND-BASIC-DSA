package multithreading.producerAndConsumerProblem;

import java.util.Queue;

public class ShareResource {

    private Queue<Integer> sharedBuffer ;
    private int bufferSize;

    public synchronized void produce(int item)throws  Exception{

        while(sharedBuffer.size()==bufferSize){
            System.out.println("buffer size is fulll , producer waiting for conusmer .");
            wait();

        }
        sharedBuffer.add(item);
        System.out.println("Produced" + item);
        notify();
    }

    public synchronized int consume() throws  Exception{
        while (sharedBuffer.isEmpty()){
            System.out.println("buffer is empty, Consumer waiting for producer.");
            wait();
        }

        int item = sharedBuffer.poll();
        System.out.println("Consumed" +item);
        notify();
        return item;

    }

}
