package multithreading.producerAndConsumerProblem;

public class Main {
    public static void main(String[] args) {

        ShareResource sharedBuffer = new ShareResource();

        // creating producer thread using lambda expn

        Thread producerThread = new Thread(()->{

            try{
                for(int i=1;i<=6;i++){
                    sharedBuffer.produce(i);
                }
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
        });

        Thread conumerThread = new Thread(()->{

            try{
                for(int i=1;i<=6;i++){
                    sharedBuffer.consume();
                }
            } catch (Exception e) {
//                throw new RuntimeException(e);
            }
        });
        producerThread.start();
        conumerThread.start();
    }
}
