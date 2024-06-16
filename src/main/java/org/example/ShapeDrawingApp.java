package org.example;

import javax.swing.*;
import java.awt.*;

public class ShapeDrawingApp extends JFrame {
    private JRadioButton ovalButton;
    private JRadioButton rectButton;
    private JRadioButton lineButton;
    private JCheckBox fillCheckBox;
    private DrawPanel drawPanel;

    public ShapeDrawingApp() {
        setTitle("Rysowanie figur");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawPanel = new DrawPanel();
        add(drawPanel, BorderLayout.CENTER);

        JPanel controlsPanel = new JPanel();
        ovalButton = new JRadioButton("Owal");
        rectButton = new JRadioButton("Prostokąt");
        lineButton = new JRadioButton("Linia");
        fillCheckBox = new JCheckBox("Wypełniony");

        ButtonGroup group = new ButtonGroup();
        group.add(ovalButton);
        group.add(rectButton);
        group.add(lineButton);

        controlsPanel.add(ovalButton);
        controlsPanel.add(rectButton);
        controlsPanel.add(lineButton);
        controlsPanel.add(fillCheckBox);

        ovalButton.addActionListener(e -> drawPanel.setShape("Owal"));
        rectButton.addActionListener(e -> drawPanel.setShape("Prostokąt"));
        lineButton.addActionListener(e -> drawPanel.setShape("Linia"));
        fillCheckBox.addActionListener(e -> drawPanel.setFilled(fillCheckBox.isSelected()));

        add(controlsPanel, BorderLayout.SOUTH);

        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ShapeDrawingApp();
    }

    class DrawPanel extends JPanel {
        private String shape = "Owal";
        private boolean filled = false;

        public void setShape(String shape) {
            this.shape = shape;
            repaint();
        }

        public void setFilled(boolean filled) {
            this.filled = filled;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            int width = getWidth();
            int height = getHeight();

            switch (shape) {
                case "Owal":
                    if (filled) {
                        g.fillOval(width / 4, height / 4, width / 2, height / 2);
                    } else {
                        g.drawOval(width / 4, height / 4, width / 2, height / 2);
                    }
                    break;
                case "Prostokąt":
                    if (filled) {
                        g.fillRect(width / 4, height / 4, width / 2, height / 2);
                    } else {
                        g.drawRect(width / 4, height / 4, width / 2, height / 2);
                    }
                    break;
                case "Linia":
                    g.drawLine(0, 0, width, height);
                    break;
            }
        }
    }
}
