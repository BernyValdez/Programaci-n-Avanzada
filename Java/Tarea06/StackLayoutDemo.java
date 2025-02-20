package Tarea06;
import javax.swing.*;
import java.awt.*;

public class StackLayoutDemo extends JFrame {
    public StackLayoutDemo() {
        // Configuración del JFrame
        setTitle("StackLayout en Java Swing");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Layout principal

        // Panel para un diseño vertical
        JPanel verticalPanel = new JPanel();
        verticalPanel.setLayout(new BoxLayout(verticalPanel, BoxLayout.Y_AXIS));
        verticalPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Margen

        // Crear elementos (equivalentes a los BoxView en .NET MAUI)
        JLabel box1 = createBox(Color.LIGHT_GRAY, "Box 1");
        JLabel box2 = createBox(Color.BLUE, "Box 2");
        JLabel box3 = createBox(Color.DARK_GRAY, "Box 3");

        // Añadir espaciado entre componentes
        verticalPanel.add(box1);
        verticalPanel.add(Box.createRigidArea(new Dimension(0, 30))); // Espaciado vertical
        verticalPanel.add(box2);
        verticalPanel.add(Box.createRigidArea(new Dimension(0, 30)));
        verticalPanel.add(box3);

        // Añadir el panel vertical al JFrame
        add(verticalPanel, BorderLayout.CENTER);
    }

    // Método para crear una "caja" con color y texto
    private JLabel createBox(Color color, String text) {
        JLabel label = new JLabel(text, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(color);
        label.setPreferredSize(new Dimension(300, 40)); // Tamaño preferido
        label.setMaximumSize(new Dimension(300, 40)); // Tamaño máximo
        label.setAlignmentX(Component.CENTER_ALIGNMENT); // Centrar horizontalmente
        label.setForeground(Color.WHITE);
        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StackLayoutDemo frame = new StackLayoutDemo();
            frame.setVisible(true);
        });
    }
}