package multithreading;

public class SharedResource {

    boolean isItemPresent = false;

    public synchronized void addItem(){
        isItemPresent = true;
        System.out.println("producer thread calling the notify all method");
        notifyAll(); // it wakes up all the methods which are   waiting
    }

    // synchronised put the monitor lock
    public synchronized void consumeItem(){


        System.out.println("consumer thread inside consumeItem method");

        // using while loop -> to avoid "spurious wakeup ", sometimes because of system noise
        while(!isItemPresent){
            try {
                System.out.println("consumer thread is waiting");
                wait();   // it realses all the monitor lock

            } catch (Exception e) {
                // throw new RuntimeException(e);
            }

        }
        System.out.println("Consumer thread consumed the item");


        isItemPresent= false;
    }
}
