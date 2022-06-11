package org.kata.calculator;

public class ArabicCalculator extends Calculator {

    @Override
    public String calculate(String operand1, String operation, String operand2) {
        return String.valueOf(super.calculate(
                Integer.parseInt(operand1),
                operation,
                Integer.parseInt(operand2)));
    }
}
