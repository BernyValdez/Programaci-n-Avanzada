package Tarea06;
import javax.swing.*;
import java.awt.*;

public class TipCalculator2 {
    public static void main(String[] args) {
        // Crear el marco principal
        JFrame frame = new JFrame("Tip Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout()); // Usamos GridBagLayout para mayor flexibilidad
        GridBagConstraints gbc = new GridBagConstraints();

        // Espaciado interno
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiqueta y campo de entrada para "Bill"
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        frame.add(new JLabel("Bill:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        JTextField billInput = new JTextField();
        frame.add(billInput, gbc);

        // Etiqueta para "Tip"
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Tip:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        JLabel tipOutput = new JLabel("0.00");
        frame.add(tipOutput, gbc);

        // Etiqueta para "Total"
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JLabel("Total:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        JLabel totalOutput = new JLabel("0.00");
        frame.add(totalOutput, gbc);

        // Etiqueta para "Tip Percentage"
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        frame.add(new JLabel("Tip Percentage:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        JLabel tipPercent = new JLabel("15%");
        frame.add(tipPercent, gbc);

        // Slider para el porcentaje de propina
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        JSlider tipPercentSlider = new JSlider(0, 100, 15);
        frame.add(tipPercentSlider, gbc);

        // Bot贸n de "15%"
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        JButton normalTipButton = new JButton("15%");
        frame.add(normalTipButton, gbc);

        // Bot贸n de "20%"
        gbc.gridx = 1;
        gbc.gridy = 5;
        JButton generousTipButton = new JButton("20%");
        frame.add(generousTipButton, gbc);

        // Bot贸n de "Round Down"
        gbc.gridx = 0;
        gbc.gridy = 6;
        JButton roundDownButton = new JButton("Round Down");
        frame.add(roundDownButton, gbc);

        // Bot贸n de "Round Up"
        gbc.gridx = 1;
        gbc.gridy = 6;
        JButton roundUpButton = new JButton("Round Up");
        frame.add(roundUpButton, gbc);

        // Hacer visible el marco
        frame.setVisible(true);
    }
}