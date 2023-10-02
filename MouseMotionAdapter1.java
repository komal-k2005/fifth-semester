import java.awt.*;
import java.awt.event.*;

public class MouseMotionAdapter1 extends MouseMotionAdapter {
    Label l;

    public MouseMotionAdapter1() {
        Frame f = new Frame();
        l = new Label();
        f.add(l);
l.setBounds(50,150,100,50);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(null);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void mouseDragged(MouseEvent e) {
        l.setText("mouse dragged");
    }

    public static void main(String args[]) {
        new MouseMotionAdapter1();
    }
}
