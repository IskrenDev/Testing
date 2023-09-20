package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sum_whenNumber1PlusNumber2_thenReturnSum() {
        //GIVEN
        int number1 = 10;
        int number2 = 10;
        int expected = 20;
        //WHEN
        int actual = Main.sum(number1, number2);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void sum_whenNumber1NotEquals20_thenExpectAssertionError() {
        //GIVEN
        int number1 = 10;
        int number2 = 10;
        int expected = 20;
        //WHEN
        int actual = Main.sum(number1, number2);
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void check_ifNumber1EvenOrOdd_thenReturnMessageEvenOrOdd() {
        //GIVEN
        int number1 = 5;
        String expected = "Die Zahl ist gerade.";
        //WHEN
        String actual = Main.isEvenOrOdd(number1);
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void product_whenNumber1MultipliedNumber2_thenReturnProduct() {
        //GIVEN
        int number1 = 10;
        int number2 = 11;
        int expected = 110;
        //WHEN
        int actual = Main.product(number1, number2);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void
}