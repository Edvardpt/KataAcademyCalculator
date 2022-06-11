package org.kata;

import static org.kata.Constants.*;

public class CalculationUtils {

    public static boolean isArabic(String number) {
        return arabicNumerals.contains(number);
    }

    public static boolean isRoman(String number) {
        return romanNumerals.contains(number);
    }

    public static int romanToArabic(String number) {
        return romanNumerals.indexOf(number) + 1;
    }

    public static String arabicToRoman(int number) {
        StringBuilder sb = new StringBuilder();
        while (number >= 100) {
            sb.append("C");
            number -= 100;
        }
        while (number >= 90) {
            sb.append("XC");
            number -= 90;
        }
        while (number >= 50) {
            sb.append("L");
            number -= 50;
        }
        while (number >= 40) {
            sb.append("XL");
            number -= 40;
        }
        while (number >= 10) {
            sb.append("X");
            number -= 10;
        }
        while (number >= 9) {
            sb.append("IX");
            number -= 9;
        }
        while (number >= 5) {
            sb.append("V");
            number -= 5;
        }
        while (number >= 4) {
            sb.append("IV");
            number -= 4;
        }
        while (number >= 1) {
            sb.append("I");
            number -= 1;
        }
        return sb.toString();
    }
}
