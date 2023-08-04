import java.util.Scanner;
public class carSelector {
    public static void main(String [] args) {
        System.out.println("Do you want a car?");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();

        if(ans.equalsIgnoreCase("yes")){
            System.out.println("Pick a color between red, orange and yellow");
            String answer = scanner.next();

            if(answer.equals("red")){
                System.out.println("We have it, would you like to see it?");
                String ansRed = scanner.next();
                if(ansRed.equalsIgnoreCase("no")) {
                    System.out.println("We'll check for something else");
                }
                else {
                    System.out.println("Your car will be ready in a jiffy!");
                }
            }
            else if (answer.equalsIgnoreCase("orange")){
                System.out.println("Come take a look.");
            }
            else {
                System.out.println("We don't have it");
            }
        }
        else {
            System.out.println("Thank ypu for shopping with us, bye");
        }

    }
}
