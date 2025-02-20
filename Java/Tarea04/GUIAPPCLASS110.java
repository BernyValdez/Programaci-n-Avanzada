package Tarea04;
import javax.swing.JFrame; // Para la ventana principal
import javax.swing.JPanel; // Para el contenedor principal
import javax.swing.JLabel; // Para mostrar el texto
import java.awt.Font; // Para configurar la fuente del texto

public class GUIAPPCLASS110 {
    public static void main(String[] args) {
        // Crear la ventana principal (JFrame)
        JFrame frame = new JFrame("Simple JFrame Application");
        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crear un panel para organizar los componentes
        JPanel panel = new JPanel();
        // Crear una etiqueta con texto
        JLabel label = new JLabel("Simple JFrame application.");
        // Configurar la fuente de la etiqueta
        label.setFont(new Font("Serif", Font.PLAIN, 20));
        // Agregar la etiqueta al panel
        panel.add(label);
        // Agregar el panel al JFrame
        frame.add(panel);
        // Configurar el tamaño de la ventana
        frame.setSize(300, 250);
        // Centrar la ventana en la pantalla
        frame.setLocationRelativeTo(null);
        // Hacer visible la ventana
        frame.setVisible(true);
    }
}

