import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestEvenlyDivisibleNumbers {
    @Test
    public void shouldReturnLowestNumberEvenlyDivisibleByNumbersUpTo10() {
        assertEquals(2520, EvenlyDivisibleNumbers.getLowestNumberDivisibleByNumbersUpToMax(10));
    }

    @Test
    public void shouldReturnLowestNumberEvenlyDivisibleByNumbersUpTo20() {
        int expected = 232792560;
        assertEquals(expected, EvenlyDivisibleNumbers.getLowestNumberDivisibleByNumbersUpToMax(20));
    }

    @Test
    public void shouldReturnTrueIfEvenlyDivisible() {
        int number = 16 * 9 * 5 * 7 * 11 * 13 * 17 * 19;
        System.out.println(number);
        assertEquals(true, EvenlyDivisibleNumbers.isEvenlyDivisible(20, number));
    }
}
