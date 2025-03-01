package multithreading.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// it highly used when reading is required very hugh and writing is less for ex 1000 for readining and 10 for write then only
public class Main {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        ReadWriteLock lock = new ReentrantReadWriteLock();   // here  ReadWriteLock  it is an interface and it needs to implement the ReentrantReadWriteLock()

        Thread th1 = new Thread(()->{
            resource.producer(lock);
        });

        Thread th2 = new Thread(()->{
            resource.producer(lock);
        });

        SharedResource resource1 = new SharedResource();
        Thread th3 = new Thread(()->{
            resource1.consumer(lock);
        });
        th1.start();
        th2.start();
        th3.start();
    }
}
