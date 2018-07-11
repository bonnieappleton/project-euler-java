// Euler 6 //

import java.util.stream.IntStream;

public class SumsAndSquares {


    public static int getSumOfSquaresUpToMax(int number) {
        return IntStream.range(1, number + 1).map(a -> a*a).reduce((a, b) -> a + b).getAsInt();
    }

    public static int getSquareOfSumUpToMax(int number) {
        int sum = IntStream.range(1, number + 1).reduce((a, b) -> a + b).getAsInt();
        return sum * sum;
    }

    public static int getDifference(int number) {
        return getSquareOfSumUpToMax(number) - getSumOfSquaresUpToMax(number);
    }
}
