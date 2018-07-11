// Euler 3 //

import java.util.HashSet;

public class PrimeFactors {
    public static long getHighestFactor(long number) {
        for (long i = 2; i < number/2; i++) {
            if (number % i == 0) return getHighestFactor(number / i);
        }
        return number;
    }


}
