import java.util.Scanner;

public class ArraysF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        int[] data = new int[5];

        for (int i = 0; i <= data.length; i++) {
            System.out.println("Enter 5 numbers: " + (i + 1) + " : ");
            data[i] = scanner.nextInt();
        }
        System.out.println(data);
//        i'm back people

    }
}
