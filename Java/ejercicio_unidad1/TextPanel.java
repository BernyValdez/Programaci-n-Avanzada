package ejercicio_unidad1;


import java.awt.*;
import javax.swing.*;

public class TextPanel extends JPanel {
	
	private JTextArea textArea;
	
	public TextPanel() {
		textArea = new JTextArea();
		setLayout(new BorderLayout());
		add(new JScrollPane(textArea), BorderLayout.CENTER);
	}
	
	public void append(String text) {
		textArea.append(text);
	}
	
}