import java.awt.*;
import java.awt.event.*;
public class KeyEvent2 extends Frame implements KeyListener{
    Label l;
    public  KeyEvent2(){
        addKeyListener(this);
        setSize(400,400);
        setVisible(true);
        setLayout(null);
        l=new Label();
        l.setBounds(50,150,200,50);
        add(l);
    }
public void keyPressed(KeyEvent e){
    switch(e.getKeyCode()){
        case KeyEvent.VK_LEFT:
        l.setText("left");
        break;
        case KeyEvent.VK_RIGHT:
        l.setText("right");
        break;
        case KeyEvent.VK_UP:
        l.setText("up");
        break;
        case KeyEvent.VK_DOWN:
        l.setText("down");
        break;
        case KeyEvent.VK_F1:
        l.setText("f1");
        break;case KeyEvent.VK_F2:
        l.setText("f2");
        break;
        case KeyEvent.VK_F3:
        l.setText("f3");
        break;case KeyEvent.VK_F4:
        l.setText("f4");
        break;
        case KeyEvent.VK_F5:
        l.setText("f5");
        break;case KeyEvent.VK_F6:
        l.setText("f6");
        break;
        case KeyEvent.VK_F7:
        l.setText("f7");
        break;case KeyEvent.VK_F8:
        l.setText("f8");
        break;
        case KeyEvent.VK_F9:
        l.setText("f9");
        break;case KeyEvent.VK_F10:
        l.setText("f1p");
        break;
        default:
        l.setText("invalid function key/arrow key");
    }
}
public void  keyTyped(KeyEvent e){ 
}
public void keyReleased(KeyEvent e){
}
public static void main(String args[]){
    new KeyEvent2();
}
}


