import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestEuler2 {

    @Test
    public void shouldReturnSumOfEvenFibonacciNumbersBelow10() {
        Euler2 euler2 = new Euler2(10);
        Assert.assertEquals(10, euler2.sumOfEvenFibonacciNumbers());
    }

    @Test
    public void shouldReturnSumOfEvenFibonacciNumbersBelow4000000() {
        Euler2 euler2 = new Euler2(4000000);
        Assert.assertEquals(4613732, euler2.sumOfEvenFibonacciNumbers());
    }

    @Test
    public void shouldReturnArrayOfFibonacciNumbersUpToMax() {
        Euler2 euler2 = new Euler2(10);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        Assert.assertEquals(expected, euler2.getFibonacciNumbers());
    }
}
