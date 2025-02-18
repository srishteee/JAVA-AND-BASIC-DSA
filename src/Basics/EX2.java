package Basics;


// fibonnaci using recursion   -  done
// factorial   -- 3 = 3*2*1  done
// reverse a string  - done
// max min arr
// prime no  - a no divide by itself and 1 w/o remainder
// palindrome
// reverse an array

import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {

Scanner scn = new Scanner(System.in);
int n= scn.nextInt();
        System.out.println(primeNo(n));
}

public static boolean primeNo(int n ){

        if(n<0){
            System.out.println("not allow");
        }

        for(int i=1;i<n;i++){
            if(n%i==0){
                System.out.println("not a prime");
            }

        }

    return true;
}


}