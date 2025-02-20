package Tarea07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fejemplo_radio {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Marco_radio minarco = new Marco_radio();
            minarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

class Marco_radio extends JFrame {
    private Lamina_radio milamina;

    public Marco_radio() {
        setTitle("Selector de Tamaño de Fuente");
        setBounds(550, 500, 500, 550);
        milamina = new Lamina_radio();
        add(milamina);
        setVisible(true);
    }
}

class Lamina_radio extends JPanel {
    private JLabel texto;
    private JPanel lamina_botones;
    private ButtonGroup migrupo;

    public Lamina_radio() {
        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la Mancha cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        texto.setHorizontalAlignment(SwingConstants.CENTER);
        add(texto, BorderLayout.CENTER);

        lamina_botones = new JPanel();
        migrupo = new ButtonGroup();

        // Creando botones de opción
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 26);

        add(lamina_botones, BorderLayout.SOUTH);
    }

    private void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        migrupo.add(boton);
        lamina_botones.add(boton);

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font(texto.getFont().getName(), Font.PLAIN, tamagno));
            }
        });
    }
}