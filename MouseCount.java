import java.awt.*;
import java.awt.event.*;
public class MouseCount extends Frame implements MouseListener{
    Label l;
    public  MouseCount(){
        addMouseListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        l=new Label("hello Mouse");
        l.setBounds(50,150,100,50);
        add(l);
    }
public void mouseClicked(MouseEvent e){
int count=e.getClickCount();
    l.setText("click count"+count);
}
public void mouseEntered(MouseEvent e){

}
public void mousePressed(MouseEvent e){

}
public void mouseReleased(MouseEvent e){

}
public void mouseExited(MouseEvent e){

}
public static void main(String args[]){
    new MouseCount();
}
}

