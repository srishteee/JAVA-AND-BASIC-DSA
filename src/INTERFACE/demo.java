package INTERFACE;

public class demo {
    public interface Bird {
        public void fly();
    }

    public static class Eagle implements Bird {
        @Override
        public void fly() {
            System.out.println("Eagles are flying");
        }
    }

    public static class Pigeon implements Bird {
        @Override
        public void fly() {
            System.out.println("Pigeons are flying");
        }
    }

    public static void main(String[] args) {
        Bird birdObj1 = new Eagle();
        Bird birdObj2 = new Pigeon();

        birdObj1.fly();  // Output: Eagles are flying
        birdObj2.fly();  // Output: Pigeons are flying
    }
}