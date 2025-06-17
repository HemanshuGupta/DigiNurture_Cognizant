import java.awt.FlowLayout;

import javax.swing.*;

public class pt21 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("First number : ");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);

        JLabel l2 = new JLabel("Second number : ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JButton b1 = new JButton("ADD");
        f.add(b1);
        JButton b2 = new JButton("SUB");
        f.add(b2);
        JButton b3 = new JButton("MUL");
        f.add(b3);
        JButton b4 = new JButton("RESET");
        f.add(b4);

        JLabel l3 = new JLabel("Result : ");
        f.add(l3);
        JTextField t3 = new JTextField(20);
        f.add(t3);
    }
}
