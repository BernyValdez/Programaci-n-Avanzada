package Tarea04;

import javax.swing.*;
/**
 * Write a description of class helloApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
class helloApp {
	public static void main(String[] args){
		// create Frame and put my mainPanel in it
		JFrame f = new JFrame("title");
		f.setBounds(100,100,300,200);
		mainPanel p = new mainPanel();
		f.setContentPane(p);
		f.show();
	}
}
