import java.awt.*;
import javax.swing.*;
public class TicTacToe extends JFrame{
JFrame j;
public TicTacToe(){
    j=new JFrame("Tic Tac Toe game");
    j.setLayout(new GridLayout(3,3));
    j.setSize(500,500);
    j.setVisible(true);
    j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(j);
}
public static void main(String args[]){
    new TicTacToe();
}
}