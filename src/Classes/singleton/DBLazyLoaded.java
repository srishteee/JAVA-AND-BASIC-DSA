package Classes.singleton;

import javax.swing.*;

public class DBLazyLoaded {
//    private static DBLazyLoaded conObject ;
//    private DBLazyLoaded(){
//
//    }
//    public static DBLazyLoaded getInstance(){
//        if(conObject== null){
//            conObject=new DBLazyLoaded();
//        }
//        return conObject;
//    }


    private static DBLazyLoaded obj1 = new DBLazyLoaded();

    private DBLazyLoaded(){

    }

    public static DBLazyLoaded getInstance(){
        if(obj1==null){
            obj1=new DBLazyLoaded();  // add lazyload inside the obj
        }
        return obj1;
    }
}
// when two threads is parallel it  will make 2 obj to over come synchronised is there


