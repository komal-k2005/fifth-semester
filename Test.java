import java.awt. *;
import java.applet. *;
/*<applet code=Test.class height=200 width=200> </applet>*/
public class Test extends Applet
{
public void init()
{
List l= new List(2,true);
l.add("Tava");
l.add("c+ +");
l.add("Python");
add(l);
}
}
