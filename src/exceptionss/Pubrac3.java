//package exceptionss;
//
//import java.util.Scanner;
//
//public class Pubrac3 {
//
////    public static void sumOfTwoNo(Object val1, Object val2) throws IllegalArgumentException {
////        // Check if both inputs are integers
////        if (!(val1 instanceof Integer) || !(val2 instanceof Integer)) {
////            throw new IllegalArgumentException("Invalid input: Both inputs must be integers.");
////        }
////
////        // If inputs are valid, cast them to integers and calculate the sum
////        int num1 = (Integer) val1;
////        int num2 = (Integer) val2;
////        System.out.println(num1 + num2);
////    }
////
////    public static void main(String[] args) {
////        try {
////            // Test with valid integers
////            sumOfTwoNo(10, 20); // Output: 30
////
////            // Test with invalid inputs (should throw an exception)
////            sumOfTwoNo(10, "abc"); // Throws IllegalArgumentException
////        } catch (IllegalArgumentException e) {
////            System.out.println(e.getMessage()); // Output: Invalid input: Both inputs must be integers.
////        }
////    }
//
//
//
//
//    public static void sumOfTwo (int val1 , int val2) throws IllegalArgumentException{
//        System.out.println("sum :" + (val1+val2));
//    }
//
//    public static void main(String[] args) {
//
//        try{
//
//            sumOfTwo(10,"acv");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}
//
//
