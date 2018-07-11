import java.util.stream.IntStream;

public class Euler1 {
    public static int sumOfMultiplesOf3And5BelowMax(int max) {
        return IntStream.range(0, max)
                .filter(n -> n % 5 == 0 || n % 3 == 0)
                .reduce(0, (a, b) -> a + b);
    }
}