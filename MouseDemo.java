import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code=MouseDemo width=300 height=300></applet> */
public class MouseDemo extends Applet implements MouseListener {
    Label l;

    public void init() {
        setLayout(null);
        l = new Label("Hello Mouse");
        l.setBounds(50, 150, 200, 100);
        add(l);
        addMouseListener(this);
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed no. of clicks: " + e.getClickCount() + " at position " + e.getX() + "," + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released; no. of clicks: " + e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked #of clicks: " + e.getClickCount());
    }
}
