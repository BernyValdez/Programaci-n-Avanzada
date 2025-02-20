package Tarea11;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lblIntentos, lblCorrectos, lblPregunta;
    private JTextField txtRespuesta;
    private JButton btnIniciar, btnSalir;
    private JCheckBox chkSuma, chkResta, chkMultiplicacion, chkDivision;
    private JRadioButton[] botonesFactor;
    private JRadioButton temporizadorApagado, temporizadorArriba, temporizadorAbajo;
    private ButtonGroup grupoFactor, grupoTemporizador;
    private Random random;
    private int num1, num2, respuesta, intentos = 0, correctos = 0;
    
    public MainFrame() {
        setTitle("Flash Card Math");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        random = new Random();

        JPanel panelSuperior = new JPanel(new GridLayout(1, 2));
        lblIntentos = new JLabel("Tried: 0", SwingConstants.CENTER);
        lblCorrectos = new JLabel("Correct: 0", SwingConstants.CENTER);
        lblIntentos.setOpaque(true);
        lblCorrectos.setOpaque(true);
        lblIntentos.setBackground(Color.RED);
        lblCorrectos.setBackground(Color.RED);
        lblIntentos.setForeground(Color.WHITE);
        lblCorrectos.setForeground(Color.WHITE);
        panelSuperior.add(lblIntentos);
        panelSuperior.add(lblCorrectos);
        add(panelSuperior, BorderLayout.NORTH);

        lblPregunta = new JLabel("", SwingConstants.CENTER);
        lblPregunta.setFont(new Font("Arial", Font.BOLD, 24));
        lblPregunta.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        add(lblPregunta, BorderLayout.CENTER);

        JPanel panelConfiguracion = new JPanel(new GridLayout(1, 3));
        
        JPanel panelTipo = new JPanel(new GridLayout(4, 1));
        panelTipo.setBorder(BorderFactory.createTitledBorder("Type:"));
        chkSuma = new JCheckBox("Addition", true);
        chkResta = new JCheckBox("Subtraction");
        chkMultiplicacion = new JCheckBox("Multiplication");
        chkDivision = new JCheckBox("Division");
        panelTipo.add(chkSuma);
        panelTipo.add(chkResta);
        panelTipo.add(chkMultiplicacion);
        panelTipo.add(chkDivision);
        panelConfiguracion.add(panelTipo);

        JPanel panelFactor = new JPanel(new GridLayout(5, 2));
        panelFactor.setBorder(BorderFactory.createTitledBorder("Factor:"));
        botonesFactor = new JRadioButton[10];
        grupoFactor = new ButtonGroup();
        botonesFactor[0] = new JRadioButton("Random", true);
        panelFactor.add(botonesFactor[0]);
        grupoFactor.add(botonesFactor[0]);
        for (int i = 1; i <= 9; i++) {
            botonesFactor[i] = new JRadioButton(String.valueOf(i));
            grupoFactor.add(botonesFactor[i]);
            panelFactor.add(botonesFactor[i]);
        }
        panelConfiguracion.add(panelFactor);

        JPanel panelTemporizador = new JPanel(new GridLayout(3, 1));
        panelTemporizador.setBorder(BorderFactory.createTitledBorder("Timer:"));
        temporizadorApagado = new JRadioButton("Off", true);
        temporizadorArriba = new JRadioButton("On-Count Up");
        temporizadorAbajo = new JRadioButton("On-Count Down");
        grupoTemporizador = new ButtonGroup();
        grupoTemporizador.add(temporizadorApagado);
        grupoTemporizador.add(temporizadorArriba);
        grupoTemporizador.add(temporizadorAbajo);
        panelTemporizador.add(temporizadorApagado);
        panelTemporizador.add(temporizadorArriba);
        panelTemporizador.add(temporizadorAbajo);
        panelConfiguracion.add(panelTemporizador);
        
        add(panelConfiguracion, BorderLayout.SOUTH);

        JPanel panelBotones = new JPanel();
        btnIniciar = new JButton("Start Practice");
        btnSalir = new JButton("Exit");
        panelBotones.add(btnIniciar);
        panelBotones.add(btnSalir);
        add(panelBotones, BorderLayout.SOUTH);

        btnSalir.addActionListener(e -> System.exit(0));
        btnIniciar.addActionListener(e -> iniciarPractica());

        txtRespuesta = new JTextField(10);
        panelBotones.add(txtRespuesta);
        txtRespuesta.addActionListener(e -> verificarRespuesta());
    }

    private void iniciarPractica() {
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        if (chkSuma.isSelected()) {
            lblPregunta.setText(num1 + " + " + num2 + " = ?");
            respuesta = num1 + num2;
        } else if (chkResta.isSelected()) {
            lblPregunta.setText(num1 + " - " + num2 + " = ?");
            respuesta = num1 - num2;
        } else if (chkMultiplicacion.isSelected()) {
            lblPregunta.setText(num1 + " * " + num2 + " = ?");
            respuesta = num1 * num2;
        } else if (chkDivision.isSelected()) {
            lblPregunta.setText(num1 + " / " + num2 + " = ?");
            respuesta = num1 / num2;
        }
    }

    private void verificarRespuesta() {
        intentos++;
        int respuestaUsuario = Integer.parseInt(txtRespuesta.getText());
        if (respuestaUsuario == respuesta) {
            correctos++;
        }
        lblIntentos.setText("Tried: " + intentos);
        lblCorrectos.setText("Correct: " + correctos);
        txtRespuesta.setText("");
        iniciarPractica();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlashCardMath().setVisible(true));
    }
}