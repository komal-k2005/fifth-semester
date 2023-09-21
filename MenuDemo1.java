import java.awt.*;
import java.applet.*;
/*<applet code="MenuDemu1" width=300 height=400></applet> */
public class MenuDemo1 extends Applet {
 MenuBar mb;
 MenuItem m1,m2,m3,m4;
 Menu mn;
 MenuShortcut ms;
 MenuDemo1();   
 {
setTitle("MenuBAr Demo");
setSize(500,500);
setLayout(null);
ms=ne MenuShortcut(KeyEvent.VK_X);
mn=new Menu("File");
mb=new MenuBar();
m1=new MenuItem("New...");
m1=new MenuItem("Open...");
m1=new MenuItem("New...");

 }
}
