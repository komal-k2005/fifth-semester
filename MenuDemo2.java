import java.awt.*;
import java.awt.event;

import com.sun.glass.events.KeyEvent;
public class MenuDemo2 extends Frame{
    MenuBar mb;
    MenuItem m1,m2,m3,m4;
    Menu mn;
    MenuShortcut ms;
    MenuDemo2()
    {
        setTitle("MenuBar Demo");
        setSize(500,500);
        setLayout(null);
ms=new MenuShortcut(KeyEvent.VK_X);
mb=new Menu("File");
mb=new MenuBar()
    }
    
}
