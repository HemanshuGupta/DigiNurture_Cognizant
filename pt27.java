import javax.swing.*;
class pt27{
    pt27(){
        JFrame f1 = new JFrame("Simple Swing Application");
        f1.setSize(275,100);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l1 = new JLabel("Swing means powerful GUIs");
        f1.add(l1);
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new runnable(){
            public void run(){
                new pt27();
            }
        });
    }
}