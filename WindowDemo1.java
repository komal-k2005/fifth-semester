
import java.awt.*;
import java.awt.event.*;

public class WindowDemo1{
    public WindowDemo1() {
        Frame f = new Frame("Window Adapter Example");
        f.setSize(400, 400);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                f.dispose();
            }
        });
f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new WindowDemo1();
    }
}

