import javax.swing.*;

public class GUI {
    public GUI() {
        // Instances
        JFrame f = new JFrame("Profile");
        JTextField tFName, tFLastname, tFAge, tFWeight, tFEmail;
        JLabel lblName, lblLastname, lblAge, lblWeight, lblEmail;

        lblName = new JLabel("Name:");
        lblLastname = new JLabel("Last name:");
        lblEmail = new JLabel("Email:");
        lblAge = new JLabel("Age:");
        lblWeight = new JLabel("Weight:");

        tFName = new JTextField();
        tFLastname = new JTextField();
        tFEmail = new JTextField();
        tFAge = new JTextField();
        tFWeight = new JTextField();

        // Set sizes
        tFName.setBounds(50, 100, 200, 30);
        tFLastname.setBounds(50, 150, 200, 30);
        tFEmail.setBounds(50, 200, 200, 30);
        tFWeight.setBounds(50, 250, 200, 30);
        tFAge.setBounds(50, 300, 200, 30);

        lblName.setBounds(50,70,200,30);
        lblLastname.setBounds(50,120,200,30);
        lblEmail.setBounds(50,170,200,30);
        lblWeight.setBounds(50,220,200,30);
        lblAge.setBounds(50,270,200,30);

        // Add textfields to frame
        f.add(tFName);
        f.add(tFLastname);
        f.add(tFAge);
        f.add(tFWeight);
        f.add(tFEmail);

        // Add labels to frame
        f.add(lblName);
        f.add(lblLastname);
        f.add(lblAge);
        f.add(lblWeight);
        f.add(lblEmail);

        // Set frame size and make it visible
        f.setSize(400, 800);
        f.setLayout(null);
        f.setVisible(true);
    }

}
