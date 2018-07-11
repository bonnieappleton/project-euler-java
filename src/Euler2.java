import java.util.ArrayList;

public class Euler2 {

    private final ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

    public ArrayList<Integer> getFibonacciNumbers() {
        return fibonacciNumbers;
    }

    public Euler2(int max) {
        populateFibonacciNumbers(0, 1, max);
    }

    public int sumOfEvenFibonacciNumbers() {
        return fibonacciNumbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a,b) -> a+b)
                .get();
    }

    public ArrayList<Integer> populateFibonacciNumbers(int a, int b, int max) {
        int nextNumber = a + b;

        if (nextNumber <= max) {
            fibonacciNumbers.add(nextNumber);
            populateFibonacciNumbers(b, nextNumber, max);
        }

        return fibonacciNumbers;
    }
}
