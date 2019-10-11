import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Application {
    private static int profileID = 1;           // Profile ID starting from 1
    private static boolean wrongInput = false;  // Detecting wrong inputs at submitting
    public static void main(String[] args) {
        // Create Profile object
        Profile arda = new Profile(profileID++);

        // User Interface
        UI myUI = new UI();
        myUI.textFieldName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        myUI.textFieldLastName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        myUI.textFieldEmail.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        myUI.textFieldWeight.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        myUI.textFieldAge.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        // Submit the forms of the new profile
        myUI.buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Insert data
                if (myUI.textFieldName.getText() != "") {
                    arda.setName(myUI.textFieldName.getText());
                    myUI.frame.remove(myUI.labelNameWrong);
                } else {
                    myUI.frame.add(myUI.labelNameWrong);
                    wrongInput = true;
                }
                if (myUI.textFieldName.getText() != "") {
                    arda.setLastName(myUI.textFieldLastName.getText());
                    myUI.frame.remove(myUI.labelLastNameWrong);
                } else {
                    myUI.frame.add(myUI.labelLastNameWrong);
                    wrongInput = true;
                }
                if (!arda.isValidEmail(myUI.textFieldEmail.getText())) {
                    myUI.frame.add(myUI.labelEmailWrong);
                    wrongInput = true;
                } else {
                    arda.setEmail(myUI.textFieldEmail.getText());
                    myUI.frame.remove(myUI.labelEmailWrong);
                }
                if (myUI.textFieldWeight.getText() != "") {
                    arda.setWeight(Double.parseDouble(myUI.textFieldWeight.getText()));
                    myUI.frame.remove(myUI.labelWeightWrong);
                } else {
                    myUI.frame.add(myUI.labelWeightWrong);
                    wrongInput = true;
                }
                if (myUI.textFieldAge.getText() != "") {
                    arda.setAge(Integer.parseInt(myUI.textFieldAge.getText()));
                    myUI.frame.remove(myUI.labelAgeWrong);
                } else {
                    myUI.frame.add(myUI.labelAgeWrong);
                    wrongInput = true;
                }
                if (!wrongInput)
                    System.out.println(arda.getAllInfo());
                else {
                    System.out.println("Submission failed due to wrong inputs!");
                    wrongInput = false;     // The fault may be corrected afterwards
                }
            }
        });

        /*
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

         */

    }
}
