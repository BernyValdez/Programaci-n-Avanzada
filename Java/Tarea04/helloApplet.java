package Tarea04;

import java.awt.*;
import javax.swing.*;

/**
 * Class helloApplet - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class helloApplet extends JApplet
{	public void init(){
		// put my mainPanel in the Applet
		mainPanel p = new mainPanel();
		getContentPane().add(p);
	}
}

