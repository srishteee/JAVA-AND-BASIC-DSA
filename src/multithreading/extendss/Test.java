package multithreading.extendss;

public class Test {
    public static void main(String[] args) {

// to print world also you need to make an objector an instance here
        World world = new World();  // obj created
           world.start();
        for(;;){   //  infinite loop
            System.out.println(Thread.currentThread().getName()); // it is a main thread
        }
    }
}

// A new class World is created by extends the THread.
// the run() overridden in World class
// start method direct call to initiate the the thread because the class is extending from parent to child