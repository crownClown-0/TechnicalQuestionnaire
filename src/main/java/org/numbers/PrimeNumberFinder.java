package org.numbers;

import static java.lang.Math.*;

public class PrimeNumberFinder {
    private PrimeChecker primeChecker = new PrimeChecker();
    private DigitChecker digitChecker = new DigitChecker();

    public void findPrimes(int numDigits, int startsWith) {
        int startRange = (int) pow(10, numDigits - 1);
        int endRange = (int) pow(10, numDigits) - 1;

        for (int i = startRange; i <= endRange; i++) {
            if (digitChecker.checkDigitsAndStartsWith(i, numDigits, startsWith) && primeChecker.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
