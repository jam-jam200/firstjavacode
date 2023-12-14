limport java.util.Scanner;

public class ArraysF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[5];
        String[] words = new String[3];

        for (int w = 0; w < words.length; w++) {
            System.out.println("Enter 5 words:guess " + (w + 1) + " : ");
            words[w] = scanner.next();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.println("Enter 5 druga numbers: " + (i + 1) + " : ");
            data[i] = scanner.nextInt();
        }

        System.out.println("You have entered the following numbers: ");
        for (int number : data) {
            System.out.println(number + 2);
        }

        System.out.println("You have entered the following numbers: ");
        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();

    }
}
