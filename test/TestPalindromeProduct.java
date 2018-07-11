import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class TestPalindromeProduct {
    @Test
    public void shouldReturnTrueIfPalindrome() {
        assertTrue(PalindromeProduct.isPalindrome(9009));
    }

    @Test
    public void shouldReturnTrueIfPalindromeWithOddChars() {
        assertTrue(PalindromeProduct.isPalindrome(90009));
    }

    @Test
    public void shouldReturnFalseIfNotPalindrome() {
        assertFalse(PalindromeProduct.isPalindrome(899198));
    }

    @Test
    public void shouldReturnHighestTwoDigitFactorsOfPalindrome() {
        assertEquals(9009, PalindromeProduct.getHighestPalindromeFactors(99, 9));
    }

    @Test
    public void shouldReturnHighestThreeDigitFactorsOfPalindrome() {
        System.out.println(2*3*4*5*6*7);
        assertEquals(906609, PalindromeProduct.getHighestPalindromeFactors(999, 99));
    }
}
