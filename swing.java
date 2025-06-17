import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("unused")
public class swing extends JFrame {
    // GUI components
    private JLabel nameLabel, emailLabel, passwordLabel, confirmPasswordLabel, addressLabel, phoneLabel;
    private JTextField nameField, emailField, addressField;
    private JPasswordField passwordField, confirmPasswordField;
    private JTextField phoneField;
    private JButton submit, reset;

    // constructor
    public swing() {
        // create GUI components
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");
        passwordLabel = new JLabel("Password:");
        confirmPasswordLabel = new JLabel("Confirm Password:");
        addressLabel = new JLabel("Address:");
        phoneLabel = new JLabel("Phone:");
        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();
        confirmPasswordField = new JPasswordField();
        addressField = new JTextField();
        phoneField = new JTextField();
        submit = new JButton("Submit");
        reset = new JButton("Reset");

        // add action listener for submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle submit button action
                JOptionPane.showMessageDialog(null, "Registration successful!");
            }
        });

        // add action listener for reset button
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // handle reset button action
                nameField.setText("\n");
                emailField.setText("\n");
                passwordField.setText("\n");
                confirmPasswordField.setText("\n");
                addressField.setText("\n");
                phoneField.setText("\n");
            }
        });

        // set layout and add components to the frame
        setLayout(new GridLayout(7, 3));
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(addressLabel);
        add(addressField);
        add(phoneLabel);
        add(phoneField);
        add(submit);
        add(reset);

        // set frame properties
        setTitle("Registration Form");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String[] args) {
        new swing();
    }
}