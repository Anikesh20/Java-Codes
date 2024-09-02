import javax.swing.*;
import java.awt.*;
 class GridBagDemo
{
   JFrame f1; 
   JButton b1,b2,b3,b4,b5,b6,b7,b8;
GridBagDemo(){

f1 = new JFrame();
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f1.setSize(400,400);
GridBagLayout g1 = new GridBagLayout();
f1.setLayout(g1);
GridBagConstraints gbc = new GridBagConstraints();



b1 = new JButton("Button1");
gbc.gridx = 0;
gbc.gridy = 0;
g1.setConstraints(b1,gbc);
f1.add(b1);

b2 = new JButton("Button2");
gbc.gridx = 1;
gbc.gridy = 0;
g1.setConstraints(b2,gbc);
f1.add(b2);

b3 = new JButton("Button3");
gbc.gridx = 2;
gbc.gridy = 0;
g1.setConstraints(b3,gbc);
f1.add(b3);

b4 = new JButton("Button4");
gbc.gridx = 0;
gbc.gridy = 1;
gbc.gridwidth = 2;
gbc.gridheight = 2;
gbc.fill = GridBagConstraints.BOTH;
g1.setConstraints(b4,gbc);
f1.add(b4);

b5 = new JButton("Button5");
gbc.gridx = 0;
gbc.gridy = 3;
gbc.gridwidth = 2;
gbc.gridheight = 1;
gbc.fill = GridBagConstraints.HORIZONTAL;
g1.setConstraints(b5,gbc);
f1.add(b5);

b6 = new JButton("Button6");
gbc.gridx = 2;
gbc.gridy = 1;
gbc.gridwidth = 1;
gbc.gridheight = 1;
g1.setConstraints(b6,gbc);
f1.add(b6);

b7 = new JButton("Button7");
gbc.gridx = 2;
gbc.gridy = 2;
g1.setConstraints(b7,gbc);
f1.add(b7);

b8 = new JButton("Button8");
gbc.gridx = 2;
gbc.gridy = 3;
g1.setConstraints(b8,gbc);
f1.add(b8);
f1.setVisible(true);
}
public static void main(String[] args) {
    new GridBagDemo();
}
}


