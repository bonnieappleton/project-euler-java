// Euler 4 //

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeProduct {


    public static int getHighestPalindromeFactors(int max, int min) {
        ArrayList<Integer> palindromes = new ArrayList<>();
        for (int i = max; i > min; i--) {
            for (int j = i; j > min; j--) {
                int product = i*j;
                if (isPalindrome(product)) {
                    palindromes.add(product);
                }
            }
        }
        return Collections.max(palindromes);
    }

    public static boolean isPalindrome(Integer number) {
        String numberString = number.toString();
        int maxIndex = numberString.length() - 1;
        for (int i = 0; i <= maxIndex/2; i++) {
            if (!(numberString.charAt(i) == numberString.charAt(maxIndex - i))) return false;
        }
        return true;
    }
}
