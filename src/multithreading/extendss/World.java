package multithreading.extendss;
// this is a way of extending
public class World extends Thread{
    @Override
    public void run() {
        for(;;){  // infinite loop
            System.out.println(Thread.currentThread().getName());  // it is run as thread-0
        }

    }
}
