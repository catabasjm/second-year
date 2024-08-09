import java.awt.event.*;
import javax.swing.*;
//when i clicked the button the JTextField performed w action listener
public class Explore{
   public static void main(String[] a){
      JFrame f = new JFrame("Button");
      final JTextField tf = new JTextField();
      tf.setBounds(50,50,150,20);
      JButton b = new JButton("click here");
      b.setBounds(50,100,95,30);
      b.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
            tf.setText("Welcome, hi jhana!");
         }
      });
      f.add(b); f.add(tf);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
   }
}