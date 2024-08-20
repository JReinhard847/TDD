package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fib0ShouldBe0() {
        assertEquals(0, Fibonacci.fib(0));
    }

    @Test
    void fib1ShouldBe1() {
        assertEquals(1, Fibonacci.fib(1));
    }

    @Test
    void fib2ShouldBe1() {
        assertEquals(1, Fibonacci.fib(2));
    }

    @Test
    void fib3ShouldBe2() {
        assertEquals(2, Fibonacci.fib(3));
    }

    @Test
    void fib4ShouldBe3() {
        assertEquals(3, Fibonacci.fib(4));
    }

    @Test
    void fib5ShouldBe5() {
        assertEquals(5, Fibonacci.fib(5));
    }

    @Test
    void fib6ShouldBe8() {
        assertEquals(8, Fibonacci.fib(6));
    }

    @Test
    void fib19ShouldBe4181() {
        assertEquals(4181, Fibonacci.fib(19));
    }

    @Test
    void fib41ShouldBe165580141() {
        assertEquals(165580141, Fibonacci.fib(41));
    }

    @Test
    void fibOverflow() {
        //fib(46)=1836311903<2^32<fib(47)=2971215073
        long fib46 = Fibonacci.fib(46);
        assertEquals(1836311903, fib46);
        long fib47 = Fibonacci.fib(47);
        //overflowt zu -1323752223 obwohl long erst bei 2^64 overflowen sollte?
        assertEquals(2971215073L, fib47);
    }

}