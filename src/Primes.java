import java.util.stream.LongStream;

public class Primes {

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static int nthPrime(int number) {
        int prime = 2;
        for (int primeCount = 1; primeCount < number; primeCount++) {
            int nextNumber = prime + 1;
            while(!isPrime(nextNumber)) {
                nextNumber ++;
            }
            prime = nextNumber;
        }
        return prime;
    }


    public static long sumOfPrimes(int max) {
        return LongStream.range(2, max).filter(n -> isPrime((int) n)).reduce((a, b) -> a+b).getAsLong();
    }
}
