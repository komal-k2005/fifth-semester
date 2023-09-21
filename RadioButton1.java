import java.awt.*;
import java.applet.*;
/* <applet code="RadioButton1" width=500 height=600></applet> */
public class RadioButton1 extends Applet{

    public void init(){
        CheckboxGroup ch0=new CheckboxGroup();
Checkbox ch=new Checkbox("Female",false,ch0);
Checkbox ch1=new Checkbox ("male" true,ch0);
add(ch);
add(ch1);
    }
}
