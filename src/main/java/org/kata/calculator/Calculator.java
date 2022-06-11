package org.kata.calculator;

import org.kata.exception.CalculationException;

public abstract class Calculator {

    public abstract String calculate(String operand1, String operation, String operand2);

    protected int calculate(int operand1, String operation, int operand2) {
        switch (operation) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new CalculationException("Математическая операция не поддерживается");
        }
    }
}
