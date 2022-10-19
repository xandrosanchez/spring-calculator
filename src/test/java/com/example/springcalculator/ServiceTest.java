package com.example.springcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServiceTest {

    public int[] expectedForAdd;
    public int[] expectedForSub;
    public int[] expectedForMultiplication;
    public int[] expectedForDivision;

    Service service = new ServiceImpl();

    @BeforeEach
    public void setUp() {
        expectedForAdd = new int[]{10, 5};
        expectedForSub = new int[]{4,10};
        expectedForMultiplication = new int[]{16,25};
        expectedForDivision = new int[]{7,14};
    }

    @Test
    public void additionTest() {
        int[] actual = new int[]{service.addition(5, 5),service.addition(2,3)};
        assertArrayEquals(expectedForAdd, actual);
    }

    @Test
    public void subtractionTest() {
        int[] actual = new int[]{service.subtraction(10, 6),service.subtraction(11,1)};
        assertArrayEquals(expectedForSub, actual);
    }

    @Test
    public void multiplicationTest() {
        int[] actual = new int[]{service.multiplication(8, 2),service.multiplication(5,5)};
        assertArrayEquals(expectedForMultiplication, actual);
    }

    @Test
    public void divisionTest() {
        int[] actual = new int[]{service.division(56,8),service.division(28,2)};
        assertArrayEquals(expectedForDivision, actual);
    }
    @Test
    public void divisionExceptionTest(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            service.division(5,0);
        });

        Assertions.assertEquals("java.lang.IllegalArgumentException", thrown.toString());
    }
}
