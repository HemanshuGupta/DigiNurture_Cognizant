import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;

public class pt19 {
    public static void main(String[] args) {
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(300,130);
        f.setLayout(new FlowLayout());
        f.getContentPane().setBackground(Color.GRAY);

        JLabel l1 = new JLabel("Username : ");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);
        JLabel l2 = new JLabel("Password : ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton b = new JButton("Submit");
        f.add(b);
    }
}
