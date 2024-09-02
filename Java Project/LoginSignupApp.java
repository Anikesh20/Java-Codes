import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginSignupApp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Login/Sign-up");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create UI components
        JLabel titleLabel = new JLabel("Welcome to the App");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(80, 30, 300, 30);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(100, 100, 100, 30);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBounds(200, 100, 100, 30);

        // Add components to the frame
        frame.add(titleLabel);
        frame.add(loginButton);
        frame.add(signupButton);

        // Add action listeners to the buttons
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform login logic here
                JOptionPane.showMessageDialog(frame, "Performing login...");
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform sign-up logic here
                JOptionPane.showMessageDialog(frame, "Performing sign-up...");
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}