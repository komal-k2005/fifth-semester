import javax.swing.*;
import java.awt.*;
/*<applet code="Scrollpane" width=300 height=400></applet> */
public class Scrollpane extends JApplet {
    public void init() {
        Container c = getContentPane();
        JPanel j = new JPanel();
        j.setLayout(new GridLayout(10, 100));

        for (int i = 0; i < 10; i++) {
            for (int b = 0; b < 100; b++) {
                j.add(new JButton("" + b));
            }
        }

        int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
        int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
        JScrollPane s = new JScrollPane(j, v, h);
        c.add(s); // Add the scroll pane, not the panel.
    }
}
