package multithreading;

public class MyClass {

    public static void main(String[] args) {

        System.out.println("going inside main thred :"  + Thread.currentThread().getName());
        MultithreadingLearning unnableObj = new  MultithreadingLearning();
        Runnable runnableObj = null;
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("finish main thread : " +Thread.currentThread().getName());
    }
}
class MultithreadingLearning implements  Runnable {


    @Override
    public void run() {
        System.out.println("code executed by thread" + Thread.currentThread().getName());
    }
}

