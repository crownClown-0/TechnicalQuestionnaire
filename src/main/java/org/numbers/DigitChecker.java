package org.numbers;

public class DigitChecker {
    public boolean checkDigitsAndStartsWith(int number, int numDigits, int startsWith) {
        String numStr = String.valueOf(number);
        return numStr.length() == numDigits && numStr.startsWith(String.valueOf(startsWith));
    }
}
