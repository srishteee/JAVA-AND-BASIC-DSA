package multithreading.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;

    public void producer(ReadWriteLock lock){
        try{
            lock.readLock().lock();
            System.out.println("lock acquired" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(8000);

        } catch (Exception e) {
           // throw new RuntimeException(e);
        }
        finally {
            lock.readLock().unlock();
            System.out.println("read lock is released" + Thread.currentThread().getName());

        }
    }
    public void consumer(ReadWriteLock lock){
        try{

            lock.writeLock().lock();
            System.out.println("write lock is acquired" + Thread.currentThread().getName());
            isAvailable= false;

        } catch (Exception e) {
          //
        }
        finally {

            lock.writeLock().unlock();
            System.out.println("write lock is released" + Thread.currentThread().getName());

        }
    }
}
