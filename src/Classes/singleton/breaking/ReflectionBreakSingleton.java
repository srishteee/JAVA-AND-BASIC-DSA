package Classes.singleton.breaking;

import java.lang.reflect.Constructor;

public class ReflectionBreakSingleton {
    public static void main(String[] args) {
try{
    Singletonn instance1 = Singletonn.getInstance();
    System.out.println( instance1.hashCode());


    Constructor<Singletonn> constructor = Singletonn.class.getDeclaredConstructor();
    constructor.setAccessible(true); // Bypass private constructor
    Singletonn instance2 = constructor.newInstance();
    System.out.println(instance2.hashCode());



} catch (Exception e) {
    throw new RuntimeException(e);
}

    }
}
