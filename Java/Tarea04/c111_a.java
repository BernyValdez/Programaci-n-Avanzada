package Tarea04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  //notice javax

/**
 * Write a description of class Frame1 here.
 * 
 * @author (Eric Y. Chou) 
 * @version (05/26/2016)
 */
public class c111_a extends JFrame
{
  JPanel pane = new JPanel();
  c111_a() // the frame constructor method
  {
    super("My Simple Frame"); 
    setBounds(100,100,300,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane); // add the panel to frame
    // customize panel here
    // pane.add(someWidget);
    setVisible(true); // display this frame
  }
  
  public static void main(String args[]) {
      new c111_a();
    }
}

