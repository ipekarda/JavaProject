import javax.swing.*;

public class UI {
    JFrame frame;

    // Components
    JLabel labelName, labelLastName, labelContinue, labelAge, labelWeight, labelEmail, labelEmailWrong, labelInfo;
    JTextField textFieldName, textFieldLastName, textFieldAge, textFieldWeight, textFieldEmail;

    // Constructor
    public UI() {
        // Frame
        frame = new JFrame();
        // Labels
        labelName = new JLabel("Enter your first name");
        labelName.setBounds(50,200, 200, 20);
        labelLastName = new JLabel("Enter your last name");
        labelLastName.setBounds(50,260, 200, 20);
        labelContinue = new JLabel("Hello blabla please continue..");
        labelContinue.setBounds(50,320, 200, 20);
        labelEmail = new JLabel("What is your email?");
        labelEmail.setBounds(50,350, 200, 20);
        labelEmailWrong = new JLabel("Your email is not in correct format");
        labelEmailWrong.setBounds(50,400, 200, 20);
        labelWeight = new JLabel("What is your weight? (in kg)");
        labelWeight.setBounds(50,430, 200, 20);
        labelAge = new JLabel("How old are you?");
        labelAge.setBounds(50,490, 200, 20);
        labelInfo = new JLabel("Name\nLast Name\nEmail\nWeight\nAge");
        labelInfo.setBounds(50, 550, 200, 100);
        // Textfields
        textFieldName = new JTextField();
        textFieldName.setBounds(50,220, 200,30);
        textFieldLastName = new JTextField();
        textFieldLastName.setBounds(50,280, 200,30);
        textFieldEmail = new JTextField();
        textFieldEmail.setBounds(50,370, 200,30);
        textFieldWeight = new JTextField();
        textFieldWeight.setBounds(50,450, 50,30);
        textFieldAge = new JTextField();
        textFieldAge.setBounds(50,510, 50,30);

        // Set frame
        frame.setSize(400, 900);
        frame.setLayout(null);
        frame.setVisible(true);
        // Adding components into the frame
        frame.add(labelName);
        frame.add(labelLastName);
        frame.add(labelContinue);
        frame.add(labelEmail);
        frame.add(labelEmailWrong);
        frame.add(labelAge);
        frame.add(labelWeight);
        frame.add(labelInfo);
        frame.add(textFieldName);
        frame.add(textFieldLastName);
        frame.add(textFieldAge);
        frame.add(textFieldWeight);
        frame.add(textFieldEmail);
    }



}
