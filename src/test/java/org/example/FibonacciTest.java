package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fib0ShouldBe0(){
        assertEquals(0,Fibonacci.fib(0));
    }

    @Test
    void fib1ShouldBe1(){
        assertEquals(0,Fibonacci.fib(0));
    }
}