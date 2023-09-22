public class sumDigitsToSingle {
    public static void main(String[] args) {
        int num = 1143;
        int result = sumDigits(num);
        System.out.println("Result is of " + result);
    }

    public static int sumDigits(int number) {
        int sum = 0;
        String stringNum = String.valueOf(number);

        for (int i = 0; i < stringNum.length(); i++) {
            sum += Character.getNumericValue(stringNum.charAt(i));
        }

        return sum;
    }
}
