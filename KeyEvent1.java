import java.awt.*;
import java.awt.event.*;
public class KeyEvent1 extends Frame implements KeyListener{
    Label l;
    public  KeyEvent1(){
        addKeyListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        l=new Label();
        l.setBounds(50,150,100,50);
        add(l);
    }
public void keyPressed(KeyEvent e){
    l.setText("Key Pressed");
}
public void  keyTyped(KeyEvent e){ 
}
public void keyReleased(KeyEvent e){
}
public static void main(String args[]){
    new KeyEvent1();
}
}

