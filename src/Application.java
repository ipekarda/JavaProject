import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Create scanner object
        Scanner inputUser = new Scanner(System.in);
        // Create Profile object
        Profile arda = new Profile();

        // Ask for his/her name
        System.out.println("Enter your first name");
        // Set first name
        arda.setName(inputUser.nextLine());

        System.out.println("Enter your last name");
        // Set last name
        arda.setLastName(inputUser.nextLine());
        // Output the input
        System.out.println("Hello " + arda.getFullName() + " please continue...");

        System.out.println("What is your email?");
        // Check if email is valid with regex
        String email = inputUser.nextLine();
        arda.setEmail(email);
        // Ask for email as long it doesn't match
        while (!Profile.isValidEmail(email)) {
            System.out.println("Your email is not in correct format");
            email = inputUser.nextLine();
            if (Profile.isValidEmail(email)) {
                arda.setEmail(email);
                break;
            }
        }

        System.out.println("How old are you?");
        arda.setAge(inputUser.nextInt());

        System.out.println("What is your weight? (in kg)");
        arda.setWeight(inputUser.nextDouble());

        // Output all info with
        System.out.println(arda.getAllInfo());
    }
}
