import javax.swing.*;
import java.awt.*;

public class SimpleForm1 extends JFrame {
    public SimpleForm1() {
        setTitle("GridBagLayout Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new GridBagLayout());
        add(panel);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 0.5;
        constraints.gridx = 0;
        constraints.gridy = 0;
        
        JLabel nameLabel = new JLabel("Enter Name:");
        JTextField nameField = new JTextField(10);
        panel.add(nameLabel, constraints);
        
        constraints.gridy++;
        JLabel addressLabel = new JLabel("Enter add:");
        JTextField addressField = new JTextField(10);
        panel.add(addressLabel, constraints);
        
        constraints.gridy++;
        JLabel genderLabel = new JLabel("Select Gender:");
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(maleButton);
        group.add(femaleButton);
        panel.add(genderLabel, constraints);
        
        constraints.gridy++;
        JLabel cityLabel = new JLabel("City:");
        String[] cities = {"Biratnagar", "Kathmandu", "Bhaktapur", "Pokhara"};
        JComboBox<String> cityList = new JComboBox<>(cities);
        panel.add(cityLabel, constraints);
        
        constraints.gridy = 1;
        constraints.gridx++;
        panel.add(nameField, constraints);
        
        constraints.gridy++;
        panel.add(addressField, constraints);
        
        constraints.gridy++;
        panel.add(maleButton, constraints);
        constraints.gridy++;
        panel.add(femaleButton, constraints);
        
        constraints.gridy++;
        panel.add(cityList, constraints);
    }

    public static void main(String[] args) {
       
            SimpleForm1 form = new SimpleForm1();
            form.setVisible(true);
        
    }
}
