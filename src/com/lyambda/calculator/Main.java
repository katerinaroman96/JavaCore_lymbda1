package com.lyambda.calculator;

public class Main {

    public static void main (String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.sum.apply(23, 42);
        int b = calculator.abs.apply(-2);
        boolean c = calculator.isPositive.test(-71);
        int d = calculator.sum.apply(1, 2);
        int e = calculator.subtraction.apply(1, 1);
        try {
            int f = calculator.division.apply(d, e);
            calculator.println.accept(f);
        } catch (ArithmeticException exception) {
            System.out.println("Деление на ноль!");
        }

    }
}
