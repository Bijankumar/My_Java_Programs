package com.technoelivate.Assignment;

public class Fibonacci {

    // A recursive method to find the nth Fibonacci number
    public static int fib(int n) {
        // Base case: n is 0 or 1
        if (n <= 1) {
            return n;
        }
        // Recursive case: n is greater than 1
        else {
            return fib(n-1) + fib(n-2); // Add the previous two Fibonacci numbers
        }
    }

    public static void main(String[] args) {
        // Test the method with n = 5
        int n = 6;
        int result = fib(n);
        System.out.println("The Fibonacci of " + n + " is " + result);
    }
}
