package Tarea07;
import javax.swing.*;
import java.awt.*;
public class Sintaxis_radio {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Marco_radio_sintaxis minarco = new Marco_radio_sintaxis();
            minarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

class Marco_radio_sintaxis extends JFrame {
    public Marco_radio_sintaxis() {
        setTitle("Selector de Opciones");
        setBounds(350, 300, 500, 300);
        add(new Lamina_radio_sintaxis());
        setVisible(true);
    }
}

class Lamina_radio_sintaxis extends JPanel {
    private JRadioButton botonAzul, botonRojo, botonVerde, botonMasculino, botonFemenino;
    private ButtonGroup grupoColores, grupoGenero;

    public Lamina_radio_sintaxis() {
        setLayout(new GridLayout(0, 1));

        JPanel panelColores = new JPanel();
        grupoColores = new ButtonGroup();

        botonAzul = new JRadioButton("Azul", false);
        botonRojo = new JRadioButton("Rojo", true);
        botonVerde = new JRadioButton("Verde", false);

        grupoColores.add(botonAzul);
        grupoColores.add(botonRojo);
        grupoColores.add(botonVerde);

        panelColores.add(new JLabel("Colores:"));
        panelColores.add(botonAzul);
        panelColores.add(botonRojo);
        panelColores.add(botonVerde);

        JPanel panelGenero = new JPanel();
        grupoGenero = new ButtonGroup();

        botonMasculino = new JRadioButton("Masculino", false);
        botonFemenino = new JRadioButton("Femenino", false); 

        grupoGenero.add(botonMasculino);
        grupoGenero.add(botonFemenino);

        panelGenero.add(new JLabel("Género:"));
        panelGenero.add(botonMasculino);
        panelGenero.add(botonFemenino);

        add(panelColores);
        add(panelGenero);

        botonAzul.addActionListener(e -> cambiarColor(Color.BLUE));
        botonRojo.addActionListener(e -> cambiarColor(Color.RED));
        botonVerde.addActionListener(e -> cambiarColor(Color.GREEN));
    }

    private void cambiarColor(Color color) {
        setBackground(color);
        repaint();
    }
}