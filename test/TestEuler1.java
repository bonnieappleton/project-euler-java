import org.junit.Assert;
import org.junit.Test;

public class TestEuler1 {
    @Test
    public void shouldReturnSumOfMultiplesOf3And5Below10() {
        Assert.assertEquals(23, Euler1.sumOfMultiplesOf3And5BelowMax(10));
    }

    @Test
    public void shouldReturnSumOfMultiplesOf3And5Below1000() {
        Assert.assertEquals(233168, Euler1.sumOfMultiplesOf3And5BelowMax(1000));
    }
}
