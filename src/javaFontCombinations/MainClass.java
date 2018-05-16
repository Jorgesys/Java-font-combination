package javaFontCombinations;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainClass extends JPanel {

  public void paint(Graphics g) {
      Font f = new Font ("Serif", Font.PLAIN + Font.ROMAN_BASELINE, 14);
      g.setFont (f);
      g.drawString ("Jorgesys - PLAIN and ROMAN_BASELINE - 14", 10, 30);

      f = new Font ("Sanserif", Font.ITALIC + Font.PLAIN, 10);
      g.setFont (f);
      g.drawString ("Jorgesys - ITALIC and PLAIN - 10", 10, 60);

      f = new Font ("Monospaced",  Font.BOLD + Font.ITALIC, 14);
      g.setFont (f);
      g.drawString ("Jorgesys - BOLD and ITALIC - 14", 10, 90);

      f = new Font ("Dialog", Font.PLAIN | Font.TRUETYPE_FONT, 14);
      g.setFont (f);
      g.drawString ("Jorgesys - PLAIN and TRUETYPE_FONT - 14", 10, 120);

      f = new Font ("TimesRoman",  Font.BOLD | Font.PLAIN, 14);
      g.setFont (f);
      g.drawString ("Jorgesys - BOLD and PLAIN - 14", 10, 150);
      
      f = new Font ("DialogInput", Font.BOLD | Font.ITALIC, 12);
      g.setFont (f);
      g.drawString ("Jorgesys - BOLD and ITALIC - 12", 10, 180);
      
      
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.getContentPane().add(new MainClass());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500,300);
    frame.setVisible(true);
  }
  
}
           