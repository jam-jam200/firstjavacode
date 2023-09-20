public class sumDigitsToSingle {
    public static void main(String[] args){
        int num = 9875;
        int result = sumDigits(num);
        System.out.println("results is " + result);

    }

    public static int sumDigits(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            String stringNum = String.valueOf(number);
            int sum = 0;
            for (int i = 0; i < stringNum.length(); i++) {
                sum += Character.getNumericValue(stringNum.charAt(i));

                return sum;
            }
        }

        return number;
    }


}



