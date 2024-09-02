import javax.swing.*;
import java.awt.*;

public class SimpleForm extends JFrame {
    public SimpleForm() {
        setTitle("Simple Swing Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        add(panel);
        
        panel.setLayout(new GridLayout(8, 2));
        
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();
        
        JLabel addressLabel = new JLabel("Address:");
        JTextField addressField = new JTextField();
        
        JLabel telLabel = new JLabel("Telephone No:");
        JTextField telField = new JTextField();
        
        JLabel emailLabel = new JLabel("Email ID:");
        JTextField emailField = new JTextField();
        
        JLabel dobLabel = new JLabel("DOB:");
        JTextField dobField = new JTextField();

	JLabel ageLabel = new JLabel("Age:");
	JTextField ageField= 	new	JTextField();

	JLabel sexLabel=	new	JLabel	(	"Sex:"	)	;
	JRadioButton maleButton=	new	JRadioButton	(	"Male"	)	;
	JRadioButton femaleButton=	new	JRadioButton	(	"Female" );
	ButtonGroup group=new ButtonGroup();	
	group.add(maleButton);	
	group.add(femaleButton);

	JButton submitButton=new JButton ("Submit");
	JButton closeButton=new JButton ("Close");

	panel.add(nameLabel);	
	panel.add(nameField);	
	panel.add(addressLabel);	
	panel.add(addressField);	
	panel.add(telLabel);	
	panel.add(telField);	
	panel.add(emailLabel);	
	panel.add(emailField);
	panel.	add(dobLabel) ; 
panel.	add(dobField) ; 
panel.	add(ageLabel) ; 
panel.	add(ageField) ; 
panel.	add(sexLabel) ;
panel.	add(maleButton);
panel.	add(femaleButton);

panel .add(submitButton ) ;
panel .add(closeButton ) ;

    }

    public static void main(String[] args) {
	
	    SimpleForm form=	new	SimpleForm() ;
	    form.setVisible(true);

}
}
