import java.util.Scanner;
public class BasicTest {
    public static void main(String[] args){
        System.out.print("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(name + " you are welcome to the test. Test starts now...");

        System.out.println("Question 1: What is the capital city of Nigeria? ");
        String answ1 = scanner.next();

        while (!answ1.equals("Abuja")) {
            System.out.println("Answer is incorrect! Try again...");
            answ1 = scanner.next();
        }

        System.out.println("Good answer!");
        System.out.println("Question 1: What is my favourite fruit? ");

        String answ2 = scanner.next();
        while (!answ2.equalsIgnoreCase(
                "Banana")) {
            System.out.println("Answer is incorrect! Try again...");
            answ2 = scanner.next();
        }
        System.out.println("Good answer! Bye...");
    }
}
