import java.awt.*;
import java.awt.event.*;
public class WindowDemo{
    Frame f;
    WindowDemo(){
        f=new Frame("window adapter");
        f.addWindowListener(new WindowListener()) {
            
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        };
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(false);
    }
    public static void main(String args[]){
        new WindowDemo();
    }
}
