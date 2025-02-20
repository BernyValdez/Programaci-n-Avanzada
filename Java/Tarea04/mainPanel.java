package Tarea04;

import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class mainPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class mainPanel extends JPanel {
	mainPanel(){
		setLayout(new FlowLayout());
		JButton b = new JButton("press me");
		add(b);
	}
}
