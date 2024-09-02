import javax.swing.*;
import java.awt.*;
public class GridLayoutDemo
{
 JFrame f1;
 JLabel l1,l2;
 JButton b1,b2;
 JTextField t1,t2;
 JPasswordField p1,p2;
 GridLayoutDemo()
 {
 f1 = new JFrame(" grid layout");
 f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f1.setSize(400,400);
 f1.setLayout(new GridLayout(4,2,5,5));
 l1 = new JLabel(" Username");
 l2 = new JLabel(" Password");
 b1 = new JButton("OK");
 b2 = new JButton("Cancel");
 t1 = new JTextField();
 t2 = new JTextField();
 p1 = new JPasswordField();
 p2 = new JPasswordField();
 f1.add(l1);
 f1.add(l2);
 f1.add(b1);
 f1.add(b2);
 f1.add(t1);
 f1.add(p1);
 f1.add(t2);
 f1.add(p2);
 f1.setVisible(true);
 }
 public static void main(String args[])
 {
 new GridLayoutDemo();
 }
}