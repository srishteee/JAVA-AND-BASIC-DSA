package exceptionss;

import java.util.*;

// compile time exception / checked exception
public class Prac2 {
//    public static void main(String[] args) throws ClassNotFoundException {
//            method1();  // it abruptly throws exception
//    }
//    public static void method1() throws ClassNotFoundException {   // it sends to the caller -> method 1 to handle it
//        throw new ClassNotFoundException();
//    }
// we can handle this via try and catch block
//    public static void main(String[] args) {
//        method1();
//    }
//
//    public static void method1(){
//
//        try{
//            throw new ClassNotFoundException();
//
//        }
//        catch (ClassNotFoundException exceptionObj){
//// handle this exception scenario like logging
//
//            exceptionObj.printStackTrace();
//        }
//
//    }

    //OR
//    public static void main(String[] args) {
//        try{
//method1();
//        }
//        catch (ClassNotFoundException obj){
//// handle it
//        }
//    }
//    public  static void method1() throws ClassNotFoundException{
//        throw new ClassNotFoundException();
//    }
//}
public static void sumOfTwoNo(int val1, int val2)throws ClassCastException{
    System.out.println(val1+val2);
}
    public static void main(String[] args) {
        sumOfTwoNo(10,'b');
    }}