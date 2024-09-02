import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



 class Graph2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		        // Create a JFrame to hold the buttons
		        JFrame frame = new JFrame("Button Direction Demo");
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout(10,10));
		        // Create buttons
		        JButton buttonNorth = new JButton("North");
		        JButton buttonEast = new JButton("East");
		        JButton buttonWest = new JButton("West");
		        JButton buttonSouth = new JButton("South");
		        JButton buttonCenter = new JButton("Center");

		        // Add buttons to the frame with different directions
		        frame.add(buttonNorth, BorderLayout.NORTH);
		        frame.add(buttonEast, BorderLayout.EAST);
		        frame.add(buttonWest, BorderLayout.WEST);
		        frame.add(buttonSouth, BorderLayout.SOUTH);
		        frame.add(buttonCenter, BorderLayout.CENTER);

		        // Set frame size and make it visible
		        frame.setSize(300, 200);
		        frame.setVisible(true);
		    }
	}

