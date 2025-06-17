import java.awt.event.*;
import javax.swing.*;
public class pt23{
    public static void main(String[] args) {
        JFrame f = new JFrame("Button exxample");
        final JTextField tf = new JTextField();
        tf.setBounds(50,50,150,20);
        JButton b = new JButton("click here");
        b.setBounds(50,100,95,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                tf.setText("Welcome");
            }
        });
        f.add(b);
        f.add(tf);
        f.setLayout(null);
        f.setVisible(true);
    }
}


    

