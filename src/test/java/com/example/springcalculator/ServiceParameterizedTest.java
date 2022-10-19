package com.example.springcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


class ServiceParameterizedTest {

    private final Service service = new ServiceImpl();

    public static Stream<Arguments> provideParamsForAdditionTest() {
        return Stream.of(
                Arguments.of(5, 5,10),
                Arguments.of(3, 2,5),
                Arguments.of(17, 6,23),
                Arguments.of(7, 14,21)
        );
    }

    public static Stream<Arguments> provideParamsForSubtractionTest() {
        return Stream.of(
                Arguments.of(4, 3,1),
                Arguments.of(14, 10,4),
                Arguments.of(6, 3,3),
                Arguments.of(22, 14,8)
        );
    }

    public static Stream<Arguments> provideParamsForDivisionTest() {
        return Stream.of(
                Arguments.of(20, 4,5),
                Arguments.of(60, 10,6),
                Arguments.of(25, 25,1),
                Arguments.of(6, 2,3)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplicationTest() {
        return Stream.of(
                Arguments.of(10, 7,70),
                Arguments.of(3, 10,30),
                Arguments.of(16, 5,80),
                Arguments.of(8, 14,112)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForAdditionTest")
    public void additionTest(int num1, int num2, int expected) {
        assertEquals(expected,service.addition(num1,num2));

    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTest")
    public void subtractionTest(int num1, int num2, int expected) {
        assertEquals(expected,service.subtraction(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTest")
    public void multiplicationTest(int num1, int num2, int expected) {
        assertEquals(expected,service.multiplication(num1,num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTest")
    public void divisionTest(int num1, int num2, int expected) {
        assertEquals(expected,service.division(num1,num2));
    }


}