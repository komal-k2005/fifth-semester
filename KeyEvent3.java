import java.awt.*;
import java.awt.event.*;
public class KeyEvent3 extends Frame implements KeyListener{
    Label l,l1,l2;
TextField t,t1,t2;
Button b=new Button("multiply");
    public  KeyEvent3(){
        setSize(600,600);
        setVisible(true);
        setLayout(null);
        l=new Label("first no");
        l1=new Label("second no");
        l2=new Label("result");
        t=new TextField(15);
        t1=new TextField(15);
        t2=new TextField(15);
        t.setBounds(90,50,170,20);        
        t1.setBounds(90,80,170,20);
        t2.setBounds(90,110,170,20);        
        l.setBounds(20,50,70,20);
        l1.setBounds(20,80,70,20);        
        l2.setBounds(20,110,70,20);
        b.setBounds(90,150,170,20);
        add(b);
        add(l);
        add(l1);
        add(l2);
        add(t);
        add(t1);
        add(t2);
        b.addKeyListener(this);
    }
public void keyPressed(KeyEvent e){
    int a=Integer.parseInt(t.getText());
int b=Integer.parseInt(t1.getText());
int c=a*b;
t2.setText(""+c);


}
public void  keyTyped(KeyEvent e){ 
}
public void keyReleased(KeyEvent e){
}
public static void main(String args[]){
    new KeyEvent3();
}
}



