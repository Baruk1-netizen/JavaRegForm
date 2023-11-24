package RegForm;

import javax.swing.*;

import java.awt.Font;
import java.awt.event.*;

public class TheRegForm {

    private JFrame frame;
    private JTextField name, username, email, phone, address;
    private JPasswordField password, confirmPassword;

    public TheRegForm() {
        frame = new JFrame("Registration Form");

        JLabel titleLabel = new JLabel("Register Form");
        titleLabel.setBounds(0, 10, 150, 20);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(titleLabel);

        createLabel("Name:", 10, 50, 150, 20);
        name = createTextField(50, 50, 150, 20);

        createLabel("Username:", 10, 75, 150, 20);
        username = createTextField(50, 75, 150, 20);

        createLabel("Password:", 10, 100, 150, 20);
        password = createPasswordField(50, 100, 150, 20);

        createLabel("Confirm Password:", 10, 125, 150, 20);
        confirmPassword = createPasswordField(50, 125, 150, 20);

        createLabel("Email:", 10, 150, 150, 20);
        email = createTextField(50, 150, 150, 20);

        createLabel("Phone:", 10, 175, 150, 20);
        phone = createTextField(50, 175, 150, 20);

        createLabel("Address:", 10, 200, 150, 20);
        address = createTextField(50, 200, 150, 20);

        JButton submit = createButton("Submit", 50, 250, 95, 30, e -> {
            // Code to insert data into the database
        });

        JButton reset = createButton("Reset", 155, 250, 95, 30, e -> {
            // Code to reset all fields
            clearFields();
        });

        JButton close = createButton("Close", 260, 250, 95, 30, e -> frame.dispose());

        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void createLabel(String labelText, int x, int y, int width, int height) {
        JLabel label = new JLabel(labelText);
        label.setBounds(x, y, width, height);
        frame.add(label);
    }

    private JTextField createTextField(int x, int y, int width, int height) {
        JTextField textField = new JTextField();
        textField.setBounds(x + 150, y, width, height);
        frame.add(textField);
        return textField;
    }

    private JPasswordField createPasswordField(int x, int y, int width, int height) {
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(x + 150, y, width, height);
        frame.add(passwordField);
        return passwordField;
    }

    private JButton createButton(String label, int x, int y, int width, int height, ActionListener listener) {
        JButton button = new JButton(label);
        button.setBounds(x, y, width, height);
        button.addActionListener(listener);
        frame.add(button);
        return button;
    }

    private void clearFields() {
        name.setText("");
        username.setText("");
        password.setText("");
        confirmPassword.setText("");
        email.setText("");
        phone.setText("");
        address.setText("");
    }

    public static void main(String[] args) {
        new TheRegForm();
    }
}
