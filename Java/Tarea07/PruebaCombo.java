package Tarea07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaCombo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MarcoCombo miMarco = new MarcoCombo();
            miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

class MarcoCombo extends JFrame {
    public MarcoCombo() {
        setTitle("Selector de Fuente");
        setBounds(558, 308, 558, 408);
        add(new LaminaCombo());
        setVisible(true); 
    }
}

class LaminaCombo extends JPanel {
    private JLabel texto;
    private JComboBox<String> micombo;

    public LaminaCombo() {
        setLayout(new BorderLayout());

        texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);

        JPanel lamina_norte = new JPanel();
        micombo = new JComboBox<>();
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");

        micombo.addActionListener(new EventoCombo());
        lamina_norte.add(micombo);
        add(lamina_norte, BorderLayout.NORTH);
    }

    private class EventoCombo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String fuenteSeleccionada = (String) micombo.getSelectedItem();
            texto.setFont(new Font(fuenteSeleccionada, Font.PLAIN, 18));
        }
    }
}