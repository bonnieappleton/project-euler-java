import org.junit.Assert;
import org.junit.Test;

public class TestSumsAndSquares {
    @Test
    public void shouldReturnSumOfSquares() {
        Assert.assertEquals(385, SumsAndSquares.getSumOfSquaresUpToMax(10));
    }

    @Test
    public void shouldReturnSquareOfSum() {
        Assert.assertEquals(3025, SumsAndSquares.getSquareOfSumUpToMax(10));
    }

    @Test
    public void shouldReturnDifferenceBetweenSquareOfSumAndSumOfSquares() {
        Assert.assertEquals(2640, SumsAndSquares.getDifference(10));
    }

    @Test
    public void shouldReturnDifferenceBetweenSquareOfSumAndSumOfSquaresLargeNumber() {
        Assert.assertEquals(25164150, SumsAndSquares.getDifference(100));
    }
}
