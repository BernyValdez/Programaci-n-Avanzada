package Tarea04;

import javax.swing.*;
import java.awt.*;

public class c117_a extends JFrame {

    // Constructor para configurar la ventana
    public c117_a() {
        setTitle("Ventana Gráfica");
        setSize(500, 400);
        setLocationRelativeTo(null); // Centrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Añadir el panel personalizado al JFrame
        add(new DrawingPanel());
    }

    // Clase interna para manejar los gráficos
    private static class DrawingPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); // Llama al método de la superclase para mantener el comportamiento predeterminado

            // Coloca aquí los objetos gráficos y las llamadas a métodos de dibujo
            g.setColor(Color.BLUE);
            g.fillRect(50, 50, 100, 100); // Dibujar un rectángulo azul

            g.setColor(Color.RED);
            g.drawString("Texto dibujado aquí", 70, 200); // Dibujar texto rojo
        }
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	c117_a frame = new c117_a();
            frame.setVisible(true); // Hacer visible la ventana
        });
    }
}