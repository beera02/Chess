package net.ictcampus.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import net.ictcampus.Spieler.Spieler;

public class FeldGUI extends JFrame {
	private JButton[][] felder;
	private JButton buttonWeiss;
	private JButton buttonSchwarz;
	private JPanel spielfeldPanel = new JPanel();
	private JButton[] weisseFelder = new JButton[32];
	private JButton[] schwarzeFelder = new JButton[32];
	private Spieler spieler1;
	private Spieler spieler2;
	private Color hellBraun = new Color(220, 191, 157);
	private Color dunkelBraun = new Color(180, 92, 52);
	
	public FeldGUI() {
		erstelleSpielfeld();
	}
	public void erstelleSpielfeld() {
	     setDefaultCloseOperation(EXIT_ON_CLOSE);
          spielfeldPanel.setPreferredSize(new Dimension(1280, 640));
          spielfeldPanel.setVisible(true);
          spielfeldPanel.setLayout(new GridLayout(8,8));
          this.add(spielfeldPanel, BorderLayout.EAST);
          
          for (int i = 0; i < 8; i++) {
               for(int j = 0; j < 4; j++) {
                    buttonWeiss = new JButton();
                    buttonWeiss.setPreferredSize(new Dimension(80, 80));
                    buttonWeiss.setVisible(true);
                    buttonWeiss.setEnabled(false);
                    buttonWeiss.setBackground(hellBraun);
                    buttonSchwarz = new JButton();
                    buttonSchwarz.setPreferredSize(new Dimension(80, 80));
                    buttonSchwarz.setVisible(true);
                    buttonSchwarz.setEnabled(false);
                    buttonSchwarz.setBackground(dunkelBraun);
                    if(i % 2 == 0) {
                         spielfeldPanel.add(buttonSchwarz);
                         spielfeldPanel.add(buttonWeiss);
                         
                         weisseFelder[i] = buttonWeiss;
                         schwarzeFelder[i] = buttonSchwarz;
                    }
                    else {
                         spielfeldPanel.add(buttonWeiss);
                         spielfeldPanel.add(buttonSchwarz);
                         
                         schwarzeFelder[i] = buttonSchwarz;
                         weisseFelder[i] = buttonWeiss;
                    }
               }
          }
	}
     public void play() {
		
	}
}
