import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Create scanner object
        Scanner inputUser = new Scanner(System.in);
        // Create profil object
        Profil arda = new Profil();

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

        // Ask for email as long it doesn't match
        while (!Profil.isValidEmail(email)) {
            System.out.println("Your email is not in correct format");
            email = inputUser.nextLine();
            if (Profil.isValidEmail(email)) {
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
