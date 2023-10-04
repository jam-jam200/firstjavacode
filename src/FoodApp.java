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

        System.out.println("Are you hungry? Yes or No: ");
        String ans2 = scanner.next();

        if (ans2.equalsIgnoreCase("yes")) {
            System.out.println("We have Indomie, Swallow and Jellof Rice. WHat would you like among those? ");
            String ans3 = scanner.next();
        } else {
            System.out.println("Alright, have a good day👋👋");
        }

        }


    }

