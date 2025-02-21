package multithreading;

public class MyThread1 extends Thread {

    private Counter counter;

    public MyThread1(Counter counter){
      this.counter= counter;

    }

    @Override
    public void run() {
       for(int i=0;i<1000;i++){
           counter.inrement();
       }
    }
}
