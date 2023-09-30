
import java.awt.event.*;
public class Window1 extends WindowAdapter{
        public void windowClosed(WindowEvent e){
        System.out.println("window closed");
    }
    public static void main(String args[]){
        new Window1();
    }
    }

