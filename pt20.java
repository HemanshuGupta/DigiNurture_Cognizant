//Registration Form
import javax.swing.*;
import java.awt.FlowLayout;

public class pt20 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration form");//Frame designed
        f.setVisible(true);
        f.setSize(300,300);
        f.setLayout(new FlowLayout());
        
        JLabel l1 = new JLabel("Name : ");//Name
        f.add(l1);
        JTextField t1 = new JTextField(20);
        f.add(t1);

        JLabel l2 = new JLabel("Year : ");//Year
        f.add(l2);
        JTextField t2 = new JTextField(20);
        f.add(t2);

        JLabel l3 = new JLabel("Gender : ");//Gender
        f.add(l3);
        JRadioButton r1 = new JRadioButton("M");
        f.add(r1);
        JRadioButton r2 = new JRadioButton("F");
        f.add(r2);
        r1.setBounds(75,50,100,30);    
        r2.setBounds(75,100,100,30); 
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);       

        JCheckBox c1 = new JCheckBox("Mathematics");//Courses
        f.add(c1);
        JCheckBox c2 = new JCheckBox("DSA");
        f.add(c2);
        JCheckBox c3 = new JCheckBox("OOPS in JAVA");
        f.add(c3);
        JCheckBox c4 = new JCheckBox("DBMS");
        f.add(c4);

        JButton b = new JButton("Submit");//Submit
        f.add(b);
    }
}
