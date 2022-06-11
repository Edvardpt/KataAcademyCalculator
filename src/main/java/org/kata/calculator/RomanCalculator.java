package org.kata.calculator;


import org.kata.exception.CalculationException;

import static org.kata.CalculationUtils.arabicToRoman;
import static org.kata.CalculationUtils.romanToArabic;


public class RomanCalculator extends Calculator {

    @Override
    public String calculate(String operand1, String operation, String operand2) {
        int result = super.calculate(
                romanToArabic(operand1),
                operation,
                romanToArabic(operand2));
        if (result < 1) {
            throw new CalculationException("В римской системе нет отрицательных чисел и 0");
        }
        return arabicToRoman(result);
    }

}