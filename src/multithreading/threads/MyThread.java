package multithreading.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Running");
        try {
            Thread.sleep(200); //this thread is sleep
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread();
        System.out.println(t1.getState()); // getstate() used to find the state of the thread which is NEW rn
        t1.start(); //
        System.out.println(t1.getState());  // RUNNABLE
        Thread.sleep(100); // this thread is sleep for 100 sec meanwhile the above thread willl run
        System.out.println(t1.getState()); // Timed waiting
        t1.join();  // it waits for t1 to finish so that it can run further
        System.out.println(t1.getState());

    }
}
