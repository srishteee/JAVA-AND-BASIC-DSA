package Basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        scn.close();
        int factorialResult = factorial(n);
        System.out.println(factorialResult);

    }
    public static int  factorial(int fac){
        int result = 1;
        for(int i=1;i<=fac;i++){
            result=result*i;
        }
        return result;
    }
    }
