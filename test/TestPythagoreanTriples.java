import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPythagoreanTriples {
    @Test
    public void shouldReturnTrueIfSquare() {
        assertTrue(PythagoreanTriples.isSquare(9));
    }

    @Test
    public void shouldReturnFalseIfNotSquare() {
        assertFalse(PythagoreanTriples.isSquare(10));
    }

    @Test
    public void shouldReturnTrueIfPythagoreanTriple() {
        assertTrue(PythagoreanTriples.isPythagoreanTriple(3, 4, 5));
    }

    @Test
    public void shouldReturnFalseIfNotPythagoreanTriple() {
        assertFalse(PythagoreanTriples.isPythagoreanTriple(2, 4, 5));
    }

    @Test
    public void shouldReturnProductOfSpecialPythagorean() {
        assertEquals(31875000, PythagoreanTriples.findProductOfSpecialPythagorean());
    }
}
