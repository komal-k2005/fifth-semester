import java.awt.*;
import java.awt.event.*;
public class MouseMotion1 extends Frame implements MouseMotionListener{
    Label l;
    public  MouseMotion1(){
        addMouseMotionListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        l=new Label();
        l.setBounds(50,150,100,50);
        add(l);
    }
public void mouseDragged(MouseEvent e){
    l.setText("mouseDragged");
}
public void mouseMoved(MouseEvent e){
    l.setText("mouseMoved");
}
public static void main(String args[]){
    new MouseMotion1();
}
}

