package INTERFACE;

public interface ExDefault {
    public void canFly();   // abstract method

    default int getMinFly(){
        return 100;
    }

}
