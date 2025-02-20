package Tarea04;

import javax.swing.*;
import java.awt.*;

public class BasicDraw extends JFrame {

    public BasicDraw() {
        // Configure the JFrame
        setTitle("Dutch Flag");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call the superclass's paint method

        // Define the base point (lower-left corner)
        int baseX = 10;
        int baseY = 300;

        // Define the dimensions of the flag
        int width = 300;
        int height = 200;

        // Draw the outline of the flag using 4 lines
        g.drawLine(baseX, baseY, baseX + width, baseY);             // Bottom line
        g.drawLine(baseX, baseY, baseX, baseY - height);           // Left line
        g.drawLine(baseX + width, baseY, baseX + width, baseY - height); // Right line
        g.drawLine(baseX, baseY - height, baseX + width, baseY - height); // Top line

        // Set color to red and draw the top rectangle
        g.setColor(Color.PINK);
        g.fillRect(baseX, baseY - 66, width, 66);

        // Set color to white (default background color)
        g.setColor(Color.BLUE);
        g.fillRect(baseX, baseY - 132, width, 66);

        // Set color to blue and draw the bottom rectangle
        g.setColor(Color.WHITE);
        g.fillRect(baseX, baseY - 200, width, 66);
    }

    public static void main(String[] args) {
        // Create and display the JFrame
        BasicDraw frame = new BasicDraw();
        frame.setVisible(true);
    }
}


