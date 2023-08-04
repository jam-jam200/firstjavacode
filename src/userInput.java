import java.util.Scanner;
public class userInput {
    public static void main (String args[]) {

        String sentence = "Hello, my name is ";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println(sentence + name);


    }
}
