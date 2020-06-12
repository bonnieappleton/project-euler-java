
public class LargeSum {

    private static StringBuilder sumString = new StringBuilder();

    public LargeSum(String[] numbers) {
        calculateSum(numbers);
    }

    public static void calculateSum(String[] numbers) {
        String workingString = "0";

        for (int index = numbers[0].length() - 1; index >= 0 ; index--) {
            Integer sum = Integer.parseInt(workingString);
            for (String number : numbers) {
                sum += Character.getNumericValue(number.charAt(index));
            }

            workingString = sum.toString();
            int stringLength = workingString.length();
            sumString.insert(0, workingString.charAt(stringLength - 1));
            if (stringLength > 1) {
                workingString = workingString.substring(0, stringLength - 1);
            } else {
                workingString = "0";
            }
        }
        if (!workingString.equals("0")) sumString = sumString.insert(0, workingString);
    }

    public static String getFirst10DigitsOfSum() {
        return sumString.substring(0, 10);
    }
}
