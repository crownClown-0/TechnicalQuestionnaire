package org.numbers;

public class Main {
    public static void main(String[] args) {

        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        primeNumberFinder.findPrimes(3, 5);

        // If you want a simpler code, you can also look at the section below. Thanks

        /*
        public class PrimeNumbers {

            public static void main(String[] args) {
                displayPrimeNumbers();
            }

            public static void displayPrimeNumbers() {
                for (int number = 500; number <= 599; number++) {
                    if (isPrime(number)) {
                        System.out.println(number);
                    }
                }
            }

            public static boolean isPrime(int number) {
                if (number <= 1) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }*/

    }
}