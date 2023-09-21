import javax.swing.*;    
public class Bar extends JFrame{    
JProgressBar jb;    
 
Bar(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(40,40,160,30);         
jb.setValue(2000);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);    
}    

public static void main(String[] args) {    
    Bar m=new Bar();    
    m.setVisible(true);    
    
}    
}    
