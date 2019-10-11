import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        // Create Profile object
        Profile arda = new Profile();

        // Create scanner object
        Scanner inputUser = new Scanner(System.in);

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
        while (!Profile.isValidEmail(email) || email.isEmpty()) {
            System.out.println("Your email is not in correct format");
            email = inputUser.nextLine();
            if (Profile.isValidEmail(email)) {
                arda.setEmail(email);
                break;
            }
        }

        System.out.println("How old are you?");
        arda.setAge(inputUser.nextInt());

        // Output all info with
        System.out.println(arda.getAllInfo());

        // Ask for the course they want to follow
        System.out.println("Which course would you like to follow?");
        arda.displayCourses();
        // store the the selected course
        arda.setSelectedCourse(arda.getSelectedCourseByIndex(inputUser.nextInt()));

        System.out.println("Do you have right for a scholarship?");
        System.out.printf("Type Yes or No please: ");

        // skip the new line
        // this a workaround I found on stack overflow
        // https://stackoverflow.com/questions/7877529/java-string-scanner-input-does-not-wait-for-info-moves-directly-to-next-stateme?rq=1
        inputUser.nextLine();

        arda.checkYesOrNo(inputUser.nextLine());

        System.out.println(arda.confirmSubscription());

    }
}
