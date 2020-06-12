import java.math.BigInteger;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class CollatzSequence {
    public static final BigInteger TWO = BigInteger.valueOf(2);
    public static final BigInteger ZERO = BigInteger.ZERO;
    public static final BigInteger ONE = BigInteger.ONE;
    public static final BigInteger THREE = BigInteger.valueOf(3);

    private HashMap<BigInteger, BigInteger > collatzSequences = new HashMap<>();

    private BigInteger lengthOfSequence(BigInteger number) {
        BigInteger count = ZERO;
        BigInteger currentNumber = number;
        while (!currentNumber.equals(ONE)) {
            if (currentNumber.compareTo(number) < 0) {
                return count.add(collatzSequences.get(currentNumber));
            } else {
                currentNumber = getNextCollatzNumber(currentNumber);
                count = count.add(ONE);
            }
        }
        return count.add(ONE);
    }

    private static BigInteger getNextCollatzNumber(BigInteger  number) {
        if (number.mod(TWO).equals(ZERO)) {
            return number.divide(TWO);
        } else {
            return number.multiply(THREE).add(ONE);
        }
    }

    public int longestSequence(Integer  max) {
        BigInteger bigMax = BigInteger.valueOf(max);
        populateCollatzNumbers(bigMax);
        return collatzSequences.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .get()
                .getKey()
                .intValue();
    }

    private void populateCollatzNumbers(BigInteger max) {
        for (BigInteger i = TWO; i.compareTo(max) < 0; i = i.add(ONE)) {
            BigInteger length = lengthOfSequence(i);
            collatzSequences.putIfAbsent(i, length);
        }
    }
}
