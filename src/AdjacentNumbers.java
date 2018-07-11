public class AdjacentNumbers {

    private String number;

    public AdjacentNumbers(String number) {
        this.number = number;
    }

    public long findAdjacentProductOfLength(int length) {
        long largestProduct = 1;
        for (int index = 0; index < (number.length() - length); index++) {
            long currentProduct = 1;
            for (int i = 0; i < length; i++) {
                int indexOfMultiplier = index + i;
                currentProduct *= Character.getNumericValue(number.charAt(indexOfMultiplier));
            }
            if (currentProduct > largestProduct) largestProduct = currentProduct;
        }
        return largestProduct;
    }
}
