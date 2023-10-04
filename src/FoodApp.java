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
            System.out.println("We have Rice, Swallow and Fried Rice. WHat would you like among those? ");
            String ans3 = scanner.next();

            while(!ans3.equalsIgnoreCase("Rice") || !ans3.equalsIgnoreCase("Swallow") || !ans3.equalsIgnoreCase("Fried Rice")) {
                System.out.println("Sorry😓, You have to choose from the list. Try again!");
                ans3 = scanner.next();
            }
            if(ans3.equalsIgnoreCase("Rice") || ans3.equalsIgnoreCase("Swallow") || ans3.equalsIgnoreCase("Fried Rice")) {
                System.out.println("Would you like a drink with that?: ");
                String ans4 = scanner.next();

                while (!ans4.equalsIgnoreCase("yes") || !ans4.equalsIgnoreCase("no")) {
                    System.out.println("wrong command!");
                    ans4 = scanner.next();
                }

                if(ans4.equalsIgnoreCase("yes")) {
                    System.out.println("Would you like Sprite or Juice");
                }
            }
        } else {
            System.out.println("Alright, have a good day👋👋");
        }

        }


    }

