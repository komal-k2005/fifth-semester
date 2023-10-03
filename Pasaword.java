import javax.swing.*;
import java.awt.event.*;

public class Pasaword implements ActionListener{
    public Pasaword() {
        JFrame f = new JFrame("Custom Password Field Example");
        JPasswordField j = new JPasswordField();
        
        // Set the echo character to '#'
        j.setEchoChar('#');
        
        JButton b = new JButton("Submit");

        b.addActionListener(this);
        f.setLayout(new java.awt.FlowLayout());
        f.add(j);
        f.add(b);

        f.setSize(300, 100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
public void actionPerformed( ActionEvent e){
j.setEchoChar('*');
}
    public static void main(String[] args) {
        new Pasaword();
    }
}
