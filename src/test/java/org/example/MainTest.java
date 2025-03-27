package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void add_shouldReturn5_WhenCalledWith2And3() {
        assertEquals(5, Main.add(2, 3));
    }

    @Test
    void add_shouldReturn110_WhenCalledWith60And50() {
        assertEquals(110, Main.add(60, 50));
    }

    @Test
    void isEven_ShouldReturnTrue_WhenCalledWithEvenNumber() {
        assertTrue(Main.isEven(4));
    }

    @Test
    void isEven_ShouldReturnFalse_WhenCalledWithUnevenNumber() {
        assertFalse(Main.isEven(7));
    }

    @Test
    void multiply_shouldReturn6_WhenCalledWith2And3() {
        assertEquals(6, Main.multiply(2, 3));
    }

    @Test
    void multiply_shouldReturn30_WhenCalledWith6And5() {
        assertEquals(30, Main.multiply(6, 5));
    }

    @Test
    void toUpper_shouldReturnHELLO_WhenCalledWithHello() {
        assertEquals("HELLO", Main.toUpper("Hello"));
    }

    @Test
    void toUpper_shouldReturnBONJOUR_WhenCalledWithBonjour() {
        assertEquals("BONJOUR", Main.toUpper("Bonjour"));
    }


    @Test
    void isPositive_shouldReturnTrue_WhenCalledWithPositiveNumber() {
        assertTrue(Main.isPositive(4));
    }

    @Test
    void isPositive_shouldReturnFalse_WhenCalledWithNegativeNumber() {
        assertFalse(Main.isPositive(-7));
    }
}