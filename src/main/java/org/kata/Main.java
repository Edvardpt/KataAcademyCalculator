package org.kata;

import org.kata.calculator.ArabicCalculator;
import org.kata.calculator.Calculator;
import org.kata.calculator.RomanCalculator;
import org.kata.exception.CalculationException;

import java.util.Scanner;

import static org.kata.CalculationUtils.isArabic;
import static org.kata.CalculationUtils.isRoman;
import static org.kata.Constants.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] splitInput = input.split(" ");
        validate(splitInput);
        Calculator calculator = isRoman(splitInput[0]) ? new RomanCalculator() : new ArabicCalculator();
        return calculator.calculate(splitInput[0], splitInput[1], splitInput[2]);
    }

    private static void validate(String[] splitInput) {
        if (splitInput.length != 3 || !operations.contains(splitInput[1])) {
            throw new CalculationException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        boolean arabicArg1 = isArabic(splitInput[0]);
        boolean arabicArg2 = isArabic(splitInput[2]);
        boolean romanArg1 = isRoman(splitInput[0]);
        boolean romanArg2 = isRoman(splitInput[2]);

        if (!(arabicArg1 && arabicArg2 || romanArg1 && romanArg2)) {
            throw new CalculationException("Нужно использовать только арабские или только римские числа от 1 до 10");
        }
    }

}
