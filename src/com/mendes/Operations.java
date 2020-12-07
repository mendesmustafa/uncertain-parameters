package com.mendes;

/**
 * Created by mendesmustafa on 07.12.2020.
 */

public class Operations {

    public static int sum(int... parameters) {
        int sum = 0;
        for (int operations : parameters) {
            sum = sum + operations;
        }
        return sum;
    }

    public static int subtract(int... parameters) {
        int subtract = parameters[0];
        for (int i = 1; i < parameters.length; i++) {
            subtract = subtract - parameters[i];
        }
        return subtract;
    }

    public static int multiply(int... parameters) {
        int multiply = 1;
        for (int operations : parameters) {
            multiply = multiply * operations;
        }
        return multiply;
    }

    public static double divide(double... parameters) {
        double divide = parameters[0];
        for (int i = 1; i < parameters.length; i++) {
            if (parameters[i] != 0) {
                divide = divide / parameters[i];
            } else {
                System.out.println("Parametrelerden biri sıfır olamaz...");
                break;
            }
        }
        return divide;
    }
}