package multithreading;

public class Main {
    public static void main(String[] args) {


        SharedResource sharedResourceObj = new SharedResource();   // monitor lock on the obj
        // using lambda expn to implements the run method
        // below both the thread are using the above sharedresource then we have to use syncronization  to avaoid conflict
        Thread producerThread = new Thread(()->{
            try{
                Thread.sleep(4000);
            } catch (Exception e) {
              //  throw new RuntimeException(e);
            }

            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(()->{
            sharedResourceObj.consumeItem();
        });
        producerThread.start();
        consumerThread.start();
    }
}
