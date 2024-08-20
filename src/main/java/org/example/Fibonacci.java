package org.example;

public class Fibonacci {
    public static long  fib(int n) {
        if (n == 0) {
            return 0;
        }
        long small = 0;
        long large = 1;
        for (int i = 2; i <= n; i++) {
            long temp = large;
            large = small + large;
            small = temp;
        }
        return large;
    }
}