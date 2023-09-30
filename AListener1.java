import java.awt.*;
import java.awt.event.*;
class AListener1 extends Frame implements ActionListener {
 TextField tf, tf1, tf2;
 Button b,b1,b2,b3;
 AListener1() {
 // create components
 tf = new TextField(15);
 tf1 = new TextField(15);
 tf2 = new TextField(15);
 b = new Button("ADD");
  b = new Button("SUB");
   b = new Button("DIV");
    b = new Button("MULTI");
 tf.setBounds(60, 150, 170, 20);
 tf.setBounds(60, 50, 170, 20);
 tf1.setBounds(60, 80, 170, 20);
 tf2.setBounds(60, 110, 170, 20);
 b.setBounds(100, 150, 80, 30);
 b1.setBounds(50, 150, 80, 30);
 b2.setBounds(100, 150, 80, 30);
 b3.setBounds(150, 150, 80, 30);
 // register listener
 b.addActionListener(this);
 b1.addActionListener(this);
 b2.addActionListener(this);
 b3.addActionListener(this);// passing current instance
 // add components and set size, layout and visibility
 add(b);
 add(b2);
 add(b3);
 add(b1);
 add(tf);
 add(tf1);
 add(tf2);
 setSize(300, 300);
 setLayout(null);
 setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
 {
 int a = Integer.parseInt(tf.getText());
 int b = Integer.parseInt(tf1.getText());
 int c = a + b;
 tf2.setText("" + c);
 }
 public static void main(String args[]) {
 new AListener1();
 }
}
