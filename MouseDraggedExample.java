import java.awt.*;
import java.awt.event.*;

public class MouseDraggedExample {
    public MouseDraggedExample() {
        Frame f = new Frame("Mouse Dragged Example");
        f.setSize(400, 400);

        f.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged at: " + e.getX() + ", " + e.getY());
            }
        });

        f.setVisible(true);
    }

    public static void main(String args[]) {
        new MouseDraggedExample();
    }
}
