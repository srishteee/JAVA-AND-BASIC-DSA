package Basics;

public class Fibonacci {
    static int fib(int n){
        if(n==0){
            return 0;
        } else if (n==1) {
            return 1;
        } else {
            return  fib(n-1)+ fib(n-2);  // recursive call last two no should be add
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci sequence to print

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
