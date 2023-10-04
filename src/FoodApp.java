import java.util.Objects;
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
            System.out.println("We have rice, garri and beans. What would you like among those? ");
            String ans3 = scanner.next();

            while(!ans3.equalsIgnoreCase("rice") && !ans3.equalsIgnoreCase("beans") && !ans3.equalsIgnoreCase("garri")) {
                System.out.println("Sorry😓, You have to choose from the list. Try again!");
                ans3 = scanner.next();
            } if(ans3.equalsIgnoreCase("rice") || ans3.equalsIgnoreCase("beans") || ans3.equalsIgnoreCase("garri")) {
                System.out.println("Would you like a drink with that?: ");
                String ans4 = scanner.next();

                while (!ans4.equalsIgnoreCase("yes") && !ans4.equalsIgnoreCase("no")) {
                    System.out.println("wrong command!");
                    ans4 = scanner.next();
                }

                if(ans4.equalsIgnoreCase("yes")) {
                    System.out.println("Would you like Sprite or Juice");
                    String ans5 = scanner.next();

                    while (!ans5.equalsIgnoreCase("Sprite") && !ans5.equalsIgnoreCase("Juice")) {
                        System.out.println("Sorry😓, You have to choose from the list. Try again!");
                        ans5 = scanner.next();
                    }

                    if(ans5.equalsIgnoreCase("Sprite") || ans5.equalsIgnoreCase("Juice")) {
                        System.out.println("You have ordered " + ans3 + " with a bottle of " + ans5 + "\n To proceed enter password again: ");

                        String pass2 = scanner.next();
                        //while (!pass2.equals(pass1)) {
                          //  System.out.println("Wrong Password. Try again!");
                            //pass2 = scanner.next();
                        //}

                        if(pass2.equals(pass1)) {
                            System.out.println("Order is Ready: 🍺🍚 \nThanks for ordering here😊😊");
                        } else {
                            System.out.println("Wrong Password. Try again!");
                            pass2 = scanner.next();
                        }

                    }
                } else{
                    String pass2 = scanner.next();

                    if(pass2.equals(pass1)) {
                        System.out.println("Order is Ready: 🍺🍚 \nThanks for ordering here😊😊");
                    } else {
                        System.out.println("Wrong Password. Try again!");
                        pass2 = scanner.next();
                    }
                }
            }
        } else {
            System.out.println("Alright, have a good day👋👋");
        }

        }


    }

