public class PythagoreanTriples {



    public static boolean isSquare(int number) {
        int squareRoot = (int) Math.sqrt(number);
        return (squareRoot * squareRoot == number);
    }

    public static boolean isPythagoreanTriple(int x, int y, int z) {
        return x*x == ((y*y) + (z*z)) || y*y == (x*x) + (z*z) || z*z == (x*x) + (y*y);
    }

    public static long findProductOfSpecialPythagorean() {
        for (int a = 1; a < 1000; a++) {
            for (int b = a; b < 1000; b++) {
                int c = 1000 - a - b;
                if (isPythagoreanTriple(a, b, c)) return a*b*c;
            }
        }
        return 0;
    }
}
