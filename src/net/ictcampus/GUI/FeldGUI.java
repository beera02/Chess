
package net.ictcampus.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import javafx.scene.layout.Border;
import net.ictcampus.Spieler.Spieler;
import net.ictcampus.figures.Figur;

public class FeldGUI extends JFrame {

     private JButton[][] felder;
     private JButton buttonWeiss;
     private JButton buttonSchwarz;
     private JPanel spielfeldPanel = new JPanel();
     private JPanel buttonPanel = new JPanel();
     private JButton[] weisseFelder = new JButton[32];
     private JButton[] schwarzeFelder = new JButton[32];
     private Spieler spieler1;
     private Spieler spieler2;
     private Color hellBraun = new Color(220, 191, 157);
     private Color dunkelBraun = new Color(180, 92, 52);
     private JPanel overlay = new JPanel();

     public FeldGUI() {
          this.setSize(800, 800);
          this.setResizable(false);
          erstelleSpielfeld();
          erstelleFigurenPanel();
          overlay();
          setDefaultCloseOperation(EXIT_ON_CLOSE);
     }

     public void erstelleSpielfeld() {
          spielfeldPanel.setPreferredSize(new Dimension(800, 800));
          spielfeldPanel.setVisible(true);
          spielfeldPanel.setLayout(new GridLayout(8, 8));

          for (int i = 0; i < 8; i++) {
               for (int j = 0; j < 4; j++) {
                    buttonWeiss = new JButton();
                    buttonWeiss.setPreferredSize(new Dimension(100, 100));
                    buttonWeiss.setVisible(true);
                    buttonWeiss.setEnabled(true);
                    buttonWeiss.setBackground(hellBraun);
                    buttonSchwarz = new JButton();
                    buttonSchwarz.setPreferredSize(new Dimension(100, 100));
                    buttonSchwarz.setVisible(true);
                    buttonSchwarz.setEnabled(true);
                    buttonSchwarz.setBackground(dunkelBraun);
                    if (i % 2 == 0) {
                         spielfeldPanel.add(buttonSchwarz);
                         spielfeldPanel.add(buttonWeiss);

                         weisseFelder[i] = buttonWeiss;
                         schwarzeFelder[i] = buttonSchwarz;
                    } else {
                         spielfeldPanel.add(buttonWeiss);
                         spielfeldPanel.add(buttonSchwarz);

                         schwarzeFelder[i] = buttonSchwarz;
                         weisseFelder[i] = buttonWeiss;
                    }

               }
          }
     }

     public void erstelleFigurenPanel() {
          buttonPanel.setPreferredSize(new Dimension(800, 800));
          buttonPanel.setVisible(true);
          buttonPanel.setLayout(new GridLayout(8, 8));

     }
     
     public void overlay() {
          overlay.setPreferredSize(new Dimension(800, 800));
          overlay.setVisible(true);
          LayoutManager over = new OverlayLayout(overlay);
          overlay.setLayout(over);
          overlay.setOpaque(false);
          overlay.add(buttonPanel);
          overlay.add(spielfeldPanel);
          this.add(overlay, BorderLayout.CENTER);
     }

     public void setzeFigur(Figur figur, int x, int y) {

     }

     public void play() {

     }
}
