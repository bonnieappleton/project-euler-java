// Euler 5 //

import java.util.stream.IntStream;

public class EvenlyDivisibleNumbers {

    public static int getLowestNumberDivisibleByNumbersUpToMax(int max) {
        int testNumber = 2;
        for (int i = 2; i <= max; i++) {
            if (!isEvenlyDivisible(i, testNumber)) {
                for (int j = 2; j <= i; j++) {
                    int nextTestNumber = testNumber * j;
                    if (isEvenlyDivisible(i, nextTestNumber)) {
                        testNumber *= j;
                        break;
                    }
                }
            }
        }
        return testNumber;
    }

    public static boolean isEvenlyDivisible(int max, int i) {
        boolean evenlyDivisible = true;
        for (int j = 2; j <= max; j++) {
            if (!(i % j == 0)) {
                evenlyDivisible = false;
                break;
            }
        }
        return evenlyDivisible;
    }
}
