package multithreading.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = true;

    public  void producer(ReentrantLock lock){

        try{

            lock.lock();
            System.out.println("lock acquired by :"  +Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);

        } catch (Exception e) {
            //throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
            System.out.println("lock released" + Thread.currentThread().getName());
        }
    }


}
