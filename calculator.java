import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class CalculatorApp extends JFrame implements ActionListener {
    private JTextField num1TextField;
    private JTextField num2TextField;
    private JTextField resultTextField;

    public CalculatorApp() {
        // Set up the JFrame
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        // Create the components
        JLabel num1Label = new JLabel("Number 1:");
        num1TextField = new JTextField(10);

        JLabel num2Label = new JLabel("Number 2:");
        num2TextField = new JTextField(10);

        JLabel resultLabel = new JLabel("Result:");
        resultTextField = new JTextField(10);
        resultTextField.setEditable(false);

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);

        JButton subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);

        JButton diviButton = new JButton("Division");
      diviButton.addActionListener(this);

       JButton mulButton = new JButton("Multiply");
      mulButton.addActionListener(this);

        // Add the components to the JFrame
        add(num1Label);
        add(num1TextField);
        add(num2Label);
        add(num2TextField);
        add(resultLabel);
        add(resultTextField);
        add(addButton);
        add(subtractButton);
        add(diviButton);
        add(mulButton);

        // Set JFrame properties
        pack();
        setVisible(true);
    }

   
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText());
            double result = num1 + num2;
            resultTextField.setText(String.valueOf(result));
        } else if (e.getActionCommand().equals("Subtract")) {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText());
            double result = num1 - num2;
            resultTextField.setText(String.valueOf(result));
        }
        else if (e.getActionCommand().equals("Division")) {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText()); 
            double result = num1 / num2;
            resultTextField.setText(String.valueOf(result));
    }
      else if (e.getActionCommand().equals("Multiply")) {
            double num1 = Double.parseDouble(num1TextField.getText());
            double num2 = Double.parseDouble(num2TextField.getText()); 
            double result = num1 * num2;
            resultTextField.setText(String.valueOf(result));
    }
}

    public static void main(String[] args) {
        {
                new CalculatorApp();
       
    }
}
 }