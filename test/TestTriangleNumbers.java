import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestTriangleNumbers {
    @Test
    public void shouldReturnFirstTriangleNumberWithMoreThan5Factors() {
        assertEquals(28, TriangleNumbers.findFirstTriangleNumberWithNumberOfFactors(5));
    }

    @Test
    public void shouldReturnFirstTriangleNumberWithMoreThan500Factors() {
        assertEquals(28, TriangleNumbers.findFirstTriangleNumberWithNumberOfFactors(500));
    }

    @Test
    public void shouldReturnNumberOfFactors() {
        assertEquals(6, TriangleNumbers.getNumberOfFactors(28));
    }

}
