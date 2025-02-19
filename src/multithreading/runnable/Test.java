package multithreading.runnable;

public class Test {
    public static void main(String[] args) {

        World world = new  World ();
        Thread t1 = new Thread(world);  // you need to write inside the constructor what needs to be print and thread instance
        // why w e do this bec in extending we directly we extend the parent class to child one but in implements we need to make the instance of the thread and pass it on constructor then start the thread
        t1.start();
        for(;;){
            System.out.println("hello");
        }
    }
}

// A new class World is created that is implements runnable.
// the run () overriden to define the code in World class
// both world and thread  obj is created by passing an instance of myRunnable.
// start method is call on the thread obj that initiate the new thread.
