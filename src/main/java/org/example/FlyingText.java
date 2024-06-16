package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class FlyingText extends JFrame {
    private int x = 50;
    private int y = 50;
    private final String text = "Java is cool!";
    private final Random random = new Random();

    public FlyingText() {
        setTitle("Screen saver - flying texts");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GREEN);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        Thread textThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                x = random.nextInt(getWidth() - 100);
                y = random.nextInt(getHeight() - 50);
                repaint();
            }
        });

        textThread.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 24));
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FlyingText frame = new FlyingText();
            frame.setVisible(true);
        });
    }
}
