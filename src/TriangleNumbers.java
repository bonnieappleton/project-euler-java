public class TriangleNumbers {
    public static long findFirstTriangleNumberWithNumberOfFactors(int numberOfFactors) {
        long triangleNumber = 0;
        long n = 1;
        while (getNumberOfFactors(triangleNumber) < numberOfFactors) {
            triangleNumber += n;
            n ++;
        }
        return triangleNumber;
    }

    public static long getNumberOfFactors(long number) {
        int count = 2;
        for (long i = 2; i <= number/2; i++) {
            if (number % i == 0) count ++;
        }
        return count;
    }
}
