import java.util.Scanner;

public class FoodApp {
    public static void main(String[] args) {
        System.out.println("Welcome to My Mini food App❤️! \nTo proceed you would need to create a password. \nType yes to continue or no to exit program ");
        Scanner scanner = new Scanner(System.in);
        String ans = scanner.next();

        if( ans.equalsIgnoreCase("yes")) {
            System.out.println("Thank you please create password☺️☺️: ");
        } else {
            System.exit(0);
        }

        String pass1 = scanner.next();
        System.out.println("Your password is: " + pass1);



    }
}
