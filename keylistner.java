import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;


class keypressed extends JFrame implements KeyListener{
    
JFrame f1;
JLabel l1;
JTextField t1;

keypressed(){
    f1 = new JFrame ("BCA");
    f1.setSize(400,400);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setLayout(new GridLayout(4,2));

    t1 = new JTextField(10);
    t1.setEditable(false);

    l1 = new JLabel("Email");
    f1.add(l1);
    f1.add(t1);
    f1.setVisible(true);
    t1.addKeyListener((KeyListener)this);
}
public void keypressed(KeyEvent e){

    l1.setText("Key Pressed ");

}
public void keyReleased(KeyEvent e){

    l1.setText("Key Released ");
    
}
public void keytyped(KeyEvent e){

    l1.setText("Key type ");
    
}
public static void main(String args[]){
    new keypressed();
}
@Override
public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
}
@Override
public void keyPressed(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
}
}