package Tarea06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculator {

    public static void main(String[] args) {
     
        JFrame frame = new JFrame("Tip Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel billLabel = new JLabel("Bill:");
        JTextField billInput = new JTextField(10);
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(billLabel, gbc);
        gbc.gridx = 1;
        frame.add(billInput, gbc);

        JLabel tipLabel = new JLabel("Tip:");
        JLabel tipOutput = new JLabel("0.00");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(tipLabel, gbc);
        gbc.gridx = 1;
        frame.add(tipOutput, gbc);

        JLabel totalLabel = new JLabel("Total:");
        JLabel totalOutput = new JLabel("0.00");
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(totalLabel, gbc);
        gbc.gridx = 1;
        frame.add(totalOutput, gbc);

        JLabel tipPercentageLabel = new JLabel("Tip Percentage:");
        JLabel tipPercent = new JLabel("15%");
        JSlider tipPercentSlider = new JSlider(0, 100, 15);
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(tipPercentageLabel, gbc);
        gbc.gridx = 1;
        frame.add(tipPercent, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        frame.add(tipPercentSlider, gbc);

        JButton button15 = new JButton("15%");
        JButton button20 = new JButton("20%");
        JPanel buttonPanel1 = new JPanel(new FlowLayout());
        buttonPanel1.add(button15);
        buttonPanel1.add(button20);
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        frame.add(buttonPanel1, gbc);

        JButton roundDown = new JButton("Round Down");
        JButton roundUp = new JButton("Round Up");
        JPanel buttonPanel2 = new JPanel(new FlowLayout());
        buttonPanel2.add(roundDown);
        buttonPanel2.add(roundUp);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        frame.add(buttonPanel2, gbc);

        ActionListener calculateTip = e -> {
            try {
                double billAmount = Double.parseDouble(billInput.getText());
                int tipPercentage = tipPercentSlider.getValue();
                double tipAmount = billAmount * tipPercentage / 100;
                double totalAmount = billAmount + tipAmount;

                tipOutput.setText(String.format("%.2f", tipAmount));
                totalOutput.setText(String.format("%.2f", totalAmount));
                tipPercent.setText(tipPercentage + "%");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid bill amount.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        };

        tipPercentSlider.addChangeListener(e -> calculateTip.actionPerformed(null));
        button15.addActionListener(e -> tipPercentSlider.setValue(15));
        button20.addActionListener(e -> tipPercentSlider.setValue(20));
        roundDown.addActionListener(e -> {
            try {
                double total = Math.floor(Double.parseDouble(totalOutput.getText()));
                totalOutput.setText(String.format("%.2f", total));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Error rounding down.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        roundUp.addActionListener(e -> {
            try {
                double total = Math.ceil(Double.parseDouble(totalOutput.getText()));
                totalOutput.setText(String.format("%.2f", total));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Error rounding up.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}