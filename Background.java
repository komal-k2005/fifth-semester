import java.awt.*;
import java.awt.event.*;
public class Background extends Frame implements MouseListener{
    Label l;
    public  Background(){
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        l=new Label("hello Mouse");
        l.setBounds(50,150,100,50);
        add(l);
    }
public void mouseClicked(MouseEvent e){
setBackground(Color.orange);
    l.setText("mouseClicked");
}
public void mouseEntered(MouseEvent e){
setBackground(Color.red);
    l.setText("mouseEntered");
}
public void mousePressed(MouseEvent e){
setBackground(Color.green);
    l.setText("mousePressed");
}
public void mouseReleased(MouseEvent e){
setBackground(Color.black);
    l.setText("mouseReleased");
}
public void mouseExited(MouseEvent e){
setBackground(Color.pink);
    l.setText("mouseExited");
}
public static void main(String args[]){
    new Background();
}
}
