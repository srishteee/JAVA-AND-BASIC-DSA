package INTERFACE;

public interface Birds  {

    void canSwim (); // abstract method -> this is equivalent to-> public abstract void canSwim();

    public default void minSwimmer(){
   myPrivatMethod();  // pvt call
   myStaticPublicMethod();  // static call
   myStaticPrivateMethod();  // private static call
    }
    static void myStaticPublicMethod(){
  myStaticPrivateMethod();  // from static we can call another static method only
    }
    private void myPrivatMethod(){
      // implementation private method
    }
  private static void myStaticPrivateMethod(){
   // private static method implementtation
      myStaticPublicMethod();
    }
}

// non static method can call static static as well as non static
