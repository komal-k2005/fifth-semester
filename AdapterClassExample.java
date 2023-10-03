import java.awt.event.*;
import java.awt.*;

public class AdapterClassExample {
    Label l;
    public AdapterClassExample() {
        l=new Label();
        Frame f = new Frame("Adapter Class Example");
        f.setSize(400, 400);

        f.addMouseListener(new MListener());
f.setLayout(null);
        f.setVisible(true);
        l.setBounds(50,80,110,300);
        f.add(l);
    }
    class MListener extends MouseAdapter {
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
}

    public static void main(String args[]) {
        new AdapterClassExample();
    }
}
