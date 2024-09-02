import javax.swing.*;
import java.awt.*;

public class GenomeBrowserUI extends JFrame {
    private JPanel mainPanel;
    private JLabel titleLabel;
    private JButton zoomInButton;
    private JButton zoomOutButton;

    public GenomeBrowserUI() {
        // Set up the main frame
        setTitle("Genome Browser");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create the main panel
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create a title label
        titleLabel = new JLabel("Genome Browser");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));

        // Create zoom buttons
        zoomInButton = new JButton("Zoom In");
        zoomOutButton = new JButton("Zoom Out");

        // Add components to the main panel
        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(zoomInButton, BorderLayout.WEST);
        mainPanel.add(zoomOutButton, BorderLayout.EAST);

        // Add the main panel to the frame
        add(mainPanel);
    }

    public static void main(String[] args) {
        // Create and display the UI
        SwingUtilities.invokeLater(() -> {
            GenomeBrowserUI browserUI = new GenomeBrowserUI();
            browserUI.setVisible(true);
        });
    }
}