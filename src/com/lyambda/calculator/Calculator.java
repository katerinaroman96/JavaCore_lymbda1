package com.lyambda.calculator;

import java.util.function.*;

public class Calculator {

    /*public Calculator() {

    }*/

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> sum = (x, y) -> x + y;
    BinaryOperator<Integer> subtraction = (x, y) -> x - y;
    BinaryOperator<Integer> multiplication = (x, y) -> x * y;
    BinaryOperator<Integer> division = (x, y) -> x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
