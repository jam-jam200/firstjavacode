public class sumDigitsToSingle {
    public static void main(String[] args){
        int num = 113;
        int result = sumDigits(num);
        System.out.println("results is " + result);

    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number < 10) {
            System.out.println(number);
        } else {
            String stringNum = String.valueOf(number);
            for (int i = 0; i < stringNum.length(); i++) {
                sum += Character.getNumericValue(stringNum.charAt(i));
            }
            return sum;
        }

        return  sum;
    }


}



