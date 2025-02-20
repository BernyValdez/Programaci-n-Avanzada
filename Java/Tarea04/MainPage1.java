package Tarea04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage1 extends JFrame {
    private JButton loginButton;
    private JPanel layout;

    public MainPage1() {
        // Configuración de la ventana
        setTitle("Login Page");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(81, 43, 223)); // Color de fondo
        
        // Crear el panel principal con BoxLayout
        layout = new JPanel();
        layout.setLayout(new BoxLayout(layout, BoxLayout.Y_AXIS));
        layout.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        layout.setOpaque(false); // Fondo transparente para heredar el color del JFrame
        
        // Etiqueta de título
        JLabel titleLabel = new JLabel("Please log in");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        titleLabel.setForeground(new Color(255, 255, 100));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Campo de texto para el usuario
        JLabel userLabel = new JLabel("Username");
        userLabel.setForeground(Color.WHITE);
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField userField = new JTextField(20);
        userField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        // Campo de texto para la contraseña
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(Color.WHITE);
        passwordLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JPasswordField passwordField = new JPasswordField(20);
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));

        // Botón de login
        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(0, 148, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFocusPainted(false);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Acción del botón
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Clicked!");
            }
        });

        // Añadir componentes al panel
        layout.add(titleLabel);
        layout.add(Box.createRigidArea(new Dimension(0, 20))); // Espaciado
        layout.add(userLabel);
        layout.add(userField);
        layout.add(Box.createRigidArea(new Dimension(0, 10)));
        layout.add(passwordLabel);
        layout.add(passwordField);
        layout.add(Box.createRigidArea(new Dimension(0, 20)));
        layout.add(loginButton);

        // Añadir el panel al JFrame
        add(layout);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
        	MainPage1 mainPage = new MainPage1();
            mainPage.setVisible(true);
        });
    }
}