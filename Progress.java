import javax.swing.*;
import java.awt.event.*;

public class Progress {
    private static JProgressBar progressBar;
    private static JButton startButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Bar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create a progress bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        // Create a button
        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                simulateProcess();
            }
        });

        JPanel panel = new JPanel();
        panel.add(progressBar);
        panel.add(startButton);

        frame.add(panel);
        frame.setVisible(true);
    }

    private static void simulateProcess() {
        // Simulate a process (for example, a loop)
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50); // Simulate some work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progressBar.setValue(i); // Update the progress bar value
        }

        // Process completed, reset the progress bar
        progressBar.setValue(0);
    }
}
