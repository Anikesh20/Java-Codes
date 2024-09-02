import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class Events implements ActionListener
{
   JFrame f1; 
   JButton b1;
   JTextField t1;

   Events(){
      f1 = new JFrame("bca");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f1.setSize(500, 500);
    f1.setLayout(null);

      t1 = new JTextField(10);
  
    t1.setBounds(150,150,200,30);
     
      f1.add(t1);

      b1 = new JButton("ok");
      b1.setBounds(250,200, 50, 20);
      f1.add(b1);
      b1.addActionListener(this);

    
      f1.setVisible(true);
   }

   public static void main(String[] args) {
      new Events();
   }

   public void actionPerformed(ActionEvent e){
    t1.setText("Hello");
   }
}