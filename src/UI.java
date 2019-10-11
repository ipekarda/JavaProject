import javax.swing.*;
import java.util.ArrayList;

public class UI {
    // Frame
    JFrame frame;
    // Components of frame
    JLabel labelTitle, labelName, labelLastName, labelAge, labelWeight, labelEmail;
    JLabel labelNameWrong, labelLastNameWrong, labelAgeWrong, labelWeightWrong, labelEmailWrong;
    JTextField textFieldName, textFieldLastName, textFieldAge, textFieldWeight, textFieldEmail;
    JButton buttonSubmit;
    // Array lists make things easier thanks to loops
    ArrayList<JLabel> listLabels;
    ArrayList<JLabel> listLabelsWrong;
    ArrayList<JTextField> listTextFields;

    // Constructor
    public UI() {
        // Frame
        frame = new JFrame();
        // Labels
        labelTitle = new JLabel("Create a new profile:");
        labelTitle.setBounds(100, 20, 200, 30);
        labelName = new JLabel("Enter your first name");
        labelName.setBounds(100,50, 200, 20);
        labelNameWrong = new JLabel("Please enter a valid name");
        labelNameWrong.setBounds(100,100, 200, 20);
        labelLastName = new JLabel("Enter your last name");
        labelLastName.setBounds(100,120, 200, 20);
        labelLastNameWrong = new JLabel("Please enter a valid name");
        labelLastNameWrong.setBounds(100,170, 200, 20);
        labelEmail = new JLabel("What is your email?");
        labelEmail.setBounds(100,190, 200, 20);
        labelEmailWrong = new JLabel("Your email is not in correct format");
        labelEmailWrong.setBounds(100,240, 200, 20);
        labelWeight = new JLabel("What is your weight? (in kg)");
        labelWeight.setBounds(100,260, 200, 20);
        labelWeightWrong = new JLabel("Please enter a valid weight");
        labelWeightWrong.setBounds(100,310, 200, 20);
        labelAge = new JLabel("How old are you?");
        labelAge.setBounds(100,330, 200, 20);
        labelAgeWrong = new JLabel("Please enter a valid age");
        labelAgeWrong.setBounds(100,380, 200, 20);
        // Text fields
        textFieldName = new JTextField();
        textFieldName.setBounds(100,70, 200,30);
        textFieldLastName = new JTextField();
        textFieldLastName.setBounds(100,140, 200,30);
        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(100,210, 200,30);
        textFieldWeight = new JTextField();
        textFieldWeight.setBounds(100,280, 50,30);
        textFieldAge = new JTextField();
        textFieldAge.setBounds(100,350, 50,30);
        // Button
        buttonSubmit = new JButton("Submit");
        buttonSubmit.setBounds(150, 400, 100, 50);
        // Lists
        listLabels = new ArrayList<JLabel>();
        listLabelsWrong = new ArrayList<JLabel>();
        listTextFields = new ArrayList<JTextField>();
        // Add components into the list
        listLabels.add(labelTitle);
        listLabels.add(labelName);
        listLabels.add(labelLastName);
        listLabels.add(labelEmail);
        listLabels.add(labelWeight);
        listLabels.add(labelAge);
        listLabelsWrong.add(labelNameWrong);
        listLabelsWrong.add(labelLastNameWrong);
        listLabelsWrong.add(labelEmailWrong);
        listLabelsWrong.add(labelWeightWrong);
        listLabelsWrong.add(labelAgeWrong);
        listTextFields.add(textFieldName);
        listTextFields.add(textFieldLastName);
        listTextFields.add(textFieldEmail);
        listTextFields.add(textFieldWeight);
        listTextFields.add(textFieldWeight);
        listTextFields.add(textFieldAge);
        // Set frame
        frame.setSize(400, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        // Adding components into the frame
        addComponents();
        // Make the warning labels invisible at first
        unableWarningLabels();
    }
    // Add all components into the frame
    private void addComponents() {
        listLabels.forEach((label) -> frame.add(label));
        listLabelsWrong.forEach((label) -> frame.add(label));
        listTextFields.forEach((textField) -> frame.add(textField));
        frame.add(buttonSubmit);
    }
    // Since there is no fault in the beginning, there must be no warning either
    private void unableWarningLabels() {
        listLabelsWrong.forEach((label) -> label.setVisible(false));
    }
}
