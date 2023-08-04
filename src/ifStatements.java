import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
//        double num3 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("Num1 is greater than num 2");
        }

        else if(num1 == num2) {
            System.out.println("Num1 is equal to num2");
        }
        else {
            System.out.println("Sorry, num2 is greater than num1");
        }

        scanner.close();
    }
}
