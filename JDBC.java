import java.awt.*;
import javax.swing.*;
class MyComboBox extends JFrame
{
    JRadioButton jb;
 String faculty[] = {"BBA", "BCA", "Bsc", "BBS","Sushan"};
 MyComboBox()
 {
 JComboBox cb = new JComboBox(faculty);
 add(cb); // adding JComboBox to frame
 jb=new JRadioButton("Male");
 add(jb);
 jb=new JRadioButton("Female");
 add(jb);
 setLayout(new FlowLayout());
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setSize(400,400);
 setVisible(true);
 }
 public static void main(String args[])
 {
 {
 new MyComboBox(); // Create an instance of your class
 }
 }
}
