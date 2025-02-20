package Tarea04;

import javax.swing.*;
public class MyFrameWithComponent {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);
    
    // with contentPane()
    frame.getContentPane().add(new JButton("OK"));
    // without contentPane()
    //frame.add(new JButton("NO Way"));

    frame.setVisible(true);
    frame.setDefaultCloseOperation(
      JFrame.EXIT_ON_CLOSE);
  }
   }
