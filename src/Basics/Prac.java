package Basics;

import java.util.Scanner;




public class Prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking range input from the user
        System.out.print("Enter the value of n ");
        int start = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between  1 to " + n + ":");
        for (int i = start; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to square root
            if (num % i == 0) {
                return false; // Not prime if divisible by any number
            }
        }
        return true; // Prime if no divisors found
    }
}

