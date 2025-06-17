import javax.swing.*;
import java.awt.FlowLayout;

public class pt25 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Registration");
        f.setVisible(true);
        f.setSize(800,400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("First Name : ");
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);

        JLabel l2 = new JLabel("Last Name : ");
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JLabel l3 = new JLabel("Email ID : ");
        f.add(l3);
        JTextField t3 = new JTextField(20);
        f.add(t3);

        JLabel l4 = new JLabel("Phone no. : ");
        f.add(l4);
        JTextField t4 = new JTextField(20);
        f.add(t4);

        JButton b1 = new JButton("Register");
        f.add(b1);
        JButton b2 = new JButton("Clear");
        f.add(b2);
    }    
}
