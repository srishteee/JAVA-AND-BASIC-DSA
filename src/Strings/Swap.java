package Strings;

import java.util.Scanner;

// Write a Java Program to swap two numbers without using the third
//variable.

// 10 21 -> 21 10 , we cannot use temp -->
public class Swap {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();

        int b = scn.nextInt();

        swap(a,b);

    }
 // a11  b20

    public static void swap(int a , int b) {

        a = a + b; //31
        b = a - b;  // 11
        a = a - b; //20
        System.out.println("After swap: a = " + a + ", b = " + b);


    }

}



//