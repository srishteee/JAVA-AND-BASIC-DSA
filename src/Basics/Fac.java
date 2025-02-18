package Basics;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();

        int facResult= facMethod(n);
        System.out.println(facResult);
    }
    public static int facMethod(int fac){
        int firstValue= 1;
        for(int i=1;i<=fac;i++){
            firstValue= firstValue*i;
        }
        return firstValue;
    }
}
