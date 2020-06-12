import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCollatzSequence {
    private CollatzSequence collatzSequence;

    @Before
    public void setUp() throws Exception {
        collatzSequence = new CollatzSequence();
    }

    @Test
    public void shouldReturnLongestCollatzSequenceStartNumberBelow5() {
        assertEquals(3, collatzSequence.longestSequence(5));
    }

    @Test
    public void shouldReturnLongestCollatzSequenceStartNumberBelow1000000() {
        assertEquals(837799, collatzSequence.longestSequence(1000000));
    }
}
