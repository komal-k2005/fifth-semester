import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Color1 extends Frame implements ActionListener {
String currentColor= "white";
    Color1() {
        Button redButton = new Button("Red");
        Button greenButton = new Button("Green");
        Button blueButton = new Button("Blue");
        Button customButton = new Button("Custom Color");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        customButton.addActionListener(this);

        redButton.setBounds(50, 50, 80, 30);
        greenButton.setBounds(150, 50, 80, 30);
        blueButton.setBounds(250, 50, 80, 30);
        

        add(redButton);
        add(greenButton);
        add(blueButton);
        

        setSize(500, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

         if (command.equals("Green")) {
            currentColor = "green";
        } else if (command.equals("Blue")) {
            currentColor = "blue";
        } 
           else{repaint();}
    }

    public void paint(Graphics g) {
        Color color;

        switch (currentColor) {
            case "red":
                color = Color.RED;
                break;
            case "green":
                color = Color.GREEN;
                break;
            case "blue":
                color = Color.BLUE;
                break;
            default:
                color = Color.RED; // Default to red if invalid color
                break;
        }

        g.setColor(color);
        g.fillRect(200, 100, 100, 100);
    }

    public static String getColorString(Color color) {
        if (color.equals(Color.RED)) {
            return "red";
        } else if (color.equals(Color.GREEN)) {
            return "green";
        } else if (color.equals(Color.BLUE)) {
            return "blue";
        } else {
            return "custom";
        }
    }

    public static void main(String args[]) {
        new Color1();
    }
}
