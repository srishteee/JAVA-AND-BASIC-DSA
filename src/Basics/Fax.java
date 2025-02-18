package Basics;
import java.util.*;
public class Fax {
        public static int fib(int n ){
            if(n==0){
                return 0;
            } else if(n==1){
                return 1;
            } else{
                return fib(n-1)+fib(n-2);
            }
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner (System.in);
            int n = scn.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print(fib(i) + " ");
            }
    }}

