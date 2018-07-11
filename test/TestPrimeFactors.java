import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPrimeFactors {
    @Test
    public void shouldReturnHighestPrimeFactorOf13195As29() {
        assertEquals(29, PrimeFactors.getHighestFactor(13195));
    }

    @Test
    public void shouldReturnHighestPrimeFactorOf29As29() {
        assertEquals(29, PrimeFactors.getHighestFactor(29));
    }

    @Test
    public void shouldReturnHighestPrimeFactorOf600851475143As6857() {
        assertEquals(6857, PrimeFactors.getHighestFactor(600851475143L));
    }
}
