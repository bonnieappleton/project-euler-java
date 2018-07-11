import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class TestPrimes {
    @Test
    public void shouldReturnTrueIfPrime() {
        assertTrue(Primes.isPrime(19));
    }

    @Test
    public void shouldReturnFalseIfNotPrime() {
        assertFalse(Primes.isPrime(20));
    }

    @Test
    public void shouldReturnSixthPrime() {
        assertEquals(13, Primes.nthPrime(6));
    }

    @Test
    public void shouldReturn10001thPrime() {
        assertEquals(104743, Primes.nthPrime(10001));
    }

    @Test
    public void shouldReturnSumOfPrimesBelow10() {
        assertEquals(17, Primes.sumOfPrimes(10));
    }

    @Test
    public void shouldReturnSumOfPrimesBelowTwoMillion() {
        assertEquals(142913828922L, Primes.sumOfPrimes(2000000));
    }
}
