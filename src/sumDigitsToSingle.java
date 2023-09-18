public class sumDigitsToSingle {
    public static void main(String[] args){
        int num = 23;

        if (num < 10) {
           System.out.println(num);
        }

        String stringNum = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            sum += Character.getNumericValue(stringNum.charAt(i));
        }
        System.out.println("results is " + sum);

    }

}



