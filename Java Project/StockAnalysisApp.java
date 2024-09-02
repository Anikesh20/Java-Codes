import javax.swing.*;

public class StockAnalysisApp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Stock Analysis and Prediction");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create UI components
        JLabel titleLabel = new JLabel("Stock Analysis and Prediction");
        titleLabel.setBounds(100, 20, 200, 30);

        JLabel stockLabel = new JLabel("Enter Stock Symbol:");
        stockLabel.setBounds(50, 70, 150, 30);

        JTextField stockTextField = new JTextField();
        stockTextField.setBounds(200, 70, 150, 30);

        JButton analyzeButton = new JButton("Analyze");
        analyzeButton.setBounds(150, 120, 100, 30);

        // Add components to the frame
        frame.add(titleLabel);
        frame.add(stockLabel);
        frame.add(stockTextField);
        frame.add(analyzeButton);

        // Display the frame
        frame.setVisible(true);
    }
}