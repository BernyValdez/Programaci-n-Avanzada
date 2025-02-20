package Tarea04;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

/**
 * Write a description of class Frame3 here.
 * 
 * @author (Eric Y. Chou) 
 * @version (05/26/2016)
 */
public class c111_c extends JFrame implements ActionListener
{
  JLabel answer = new JLabel("");
  JPanel pane = new JPanel(); // create pane object
  JButton pressme = new JButton("Press Me");
  
  c111_c()   // the constructor
  {
    super("Event Handler Demo"); 
    setBounds(100,100,300,200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container con = this.getContentPane(); // inherit main frame
    con.add(pane); 
    pressme.setMnemonic('P'); // associate hotkey (Alt-P)
    pressme.addActionListener(this);   // register button listener
    pane.add(answer); 
    pane.add(pressme); 
    pressme.requestFocus();
    setVisible(true); // make frame visible
  }
  
  // here is the basic event handler
  public void actionPerformed(ActionEvent event)
  {
    Object source = event.getSource();
    if (source == pressme)
    {
      answer.setText("Button pressed!");
      JOptionPane.showMessageDialog(null,"I hear you!","Message Dialog",JOptionPane.PLAIN_MESSAGE); 
      setVisible(true);  // show something
    }
  }
  
  public static void main(String args[]) {
      new c111_c();
    }
}
