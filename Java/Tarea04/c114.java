package Tarea04;
import java.awt.*; // Importa clases de diseño y componentes de AWT
import javax.swing.*; // Importa clases de Swing para la GUI

/**
 * Clase TestPanels: simula la vista frontal de un microondas con botones y un campo de texto.
 * 
 * @author (tu nombre)
 * @version (fecha o versión)
 */
public class c114 extends JFrame {

    public c114() {
        // Crear el panel p1 para los botones y configurar el diseño de cuadrícula (4 filas x 3 columnas)
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 3));

        // Añadir botones numéricos al panel
        for (int i = 1; i <= 9; i++) {
            p1.add(new JButton("" + i));
        }

        // Añadir los botones adicionales al panel
        p1.add(new JButton("" + 0));
        p1.add(new JButton("Start"));
        p1.add(new JButton("Stop"));

        // Crear el panel p2 para contener el campo de texto y el panel p1
        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        p2.add(p1, BorderLayout.CENTER);

        // Añadir los componentes al marco principal
        add(p2, BorderLayout.EAST); // Panel p2 se coloca en la parte derecha
        add(new JButton("Food to be placed here"), BorderLayout.CENTER); // Botón central
    }

    /** Método principal para ejecutar el programa */
    public static void main(String[] args) {
        // Crear una instancia del marco
        c114 frame = new c114();
        frame.setTitle("The Front View of a Microwave Oven"); // Título de la ventana
        frame.setSize(400, 250); // Dimensiones de la ventana
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar el programa al cerrar la ventana
        frame.setVisible(true); // Hacer visible la ventana
    }
}
