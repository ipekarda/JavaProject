import javax.swing.*;
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
                wrongInput = changed(myUI.textFieldName);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldName);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldName);
            }
        });
        myUI.textFieldLastName.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldLastName);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldLastName);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldLastName);
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
                wrongInput = changed(myUI.textFieldWeight);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldWeight);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldWeight);
            }
        });
        myUI.textFieldAge.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldAge);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldAge);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                wrongInput = changed(myUI.textFieldAge);
            }
        });
        // Submit the forms of the new profile
        myUI.buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(wrongInput);
                // Insert data
                if (!myUI.textFieldName.getText().equals("")) {
                    arda.setName(myUI.textFieldName.getText());
                    myUI.labelNameWrong.setVisible(false);
                } else {
                    myUI.labelNameWrong.setVisible(true);
                    wrongInput = true;
                }
                if (!myUI.textFieldLastName.getText().equals("")) {
                    arda.setLastName(myUI.textFieldLastName.getText());
                    myUI.labelLastNameWrong.setVisible(false);
                } else {
                    myUI.labelLastNameWrong.setVisible(true);
                    wrongInput = true;
                }
                if (!arda.isValidEmail(myUI.textFieldEmail.getText())) {
                    System.out.println("Email input wrong!");
                    myUI.labelEmailWrong.setVisible(true);
                    wrongInput = true;
                } else {
                    arda.setEmail(myUI.textFieldEmail.getText());
                    System.out.println("Email input correct");
                    myUI.labelEmailWrong.setVisible(false);
                }
                if (!myUI.textFieldWeight.getText().equals("")) {
                    arda.setWeight(Double.parseDouble(myUI.textFieldWeight.getText()));
                    myUI.labelWeightWrong.setVisible(false);
                } else {
                    myUI.labelWeightWrong.setVisible(true);
                    wrongInput = true;
                }
                if (!myUI.textFieldAge.getText().equals("")) {
                    arda.setAge(Integer.parseInt(myUI.textFieldAge.getText()));
                    myUI.labelAgeWrong.setVisible(false);
                } else {
                    myUI.labelAgeWrong.setVisible(true);
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


        /* First starting off as a console programme
         *
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
    // Text in the text field may have changed and contains a fault
    private static boolean changed(JTextField textField) {
        if (textField.getText().equals(""))
            return true;
        return false;
    }
}
