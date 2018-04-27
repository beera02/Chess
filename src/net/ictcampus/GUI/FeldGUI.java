
package net.ictcampus.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.OverlayLayout;

import javafx.scene.layout.Border;
import net.ictcampus.Spieler.Spieler;
import net.ictcampus.figures.Figur;

public class FeldGUI extends JFrame {

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
     private Color transparent = new Color(0, 0, 0, 0);
     private JPanel overlay = new JPanel();
     
     //Dies sind alle Felder, auf welcher möglicherweise eine Figur steht.
     public JPanel p00 = new JPanel();
     public JPanel p01 = new JPanel();
     public JPanel p02 = new JPanel();
     public JPanel p03 = new JPanel();
     public JPanel p04 = new JPanel();
     public JPanel p05 = new JPanel();
     public JPanel p06 = new JPanel();
     public JPanel p07 = new JPanel();
     public JPanel p10 = new JPanel();
     public JPanel p11 = new JPanel();
     public JPanel p12 = new JPanel();
     public JPanel p13 = new JPanel();
     public JPanel p14 = new JPanel();
     public JPanel p15 = new JPanel();
     public JPanel p16 = new JPanel();
     public JPanel p17 = new JPanel();
     public JPanel p20 = new JPanel();
     public JPanel p21 = new JPanel();
     public JPanel p22 = new JPanel();
     public JPanel p23 = new JPanel();
     public JPanel p24 = new JPanel();
     public JPanel p25 = new JPanel();
     public JPanel p26 = new JPanel();
     public JPanel p27 = new JPanel();
     public JPanel p30 = new JPanel();
     public JPanel p31 = new JPanel();
     public JPanel p32 = new JPanel();
     public JPanel p33 = new JPanel();
     public JPanel p34 = new JPanel();
     public JPanel p35 = new JPanel();
     public JPanel p36 = new JPanel();
     public JPanel p37 = new JPanel();
     public JPanel p40 = new JPanel();
     public JPanel p41 = new JPanel();
     public JPanel p42 = new JPanel();
     public JPanel p43 = new JPanel();
     public JPanel p44 = new JPanel();
     public JPanel p45 = new JPanel();
     public JPanel p46 = new JPanel();
     public JPanel p47 = new JPanel();
     public JPanel p50 = new JPanel();
     public JPanel p51 = new JPanel();
     public JPanel p52 = new JPanel();
     public JPanel p53 = new JPanel();
     public JPanel p54 = new JPanel();
     public JPanel p55 = new JPanel();
     public JPanel p56 = new JPanel();
     public JPanel p57 = new JPanel();
     public JPanel p60 = new JPanel();
     public JPanel p61 = new JPanel();
     public JPanel p62 = new JPanel();
     public JPanel p63 = new JPanel();
     public JPanel p64 = new JPanel();
     public JPanel p65 = new JPanel();
     public JPanel p66 = new JPanel();
     public JPanel p67 = new JPanel();
     public JPanel p70 = new JPanel();
     public JPanel p71 = new JPanel();
     public JPanel p72 = new JPanel();
     public JPanel p73 = new JPanel();
     public JPanel p74 = new JPanel();
     public JPanel p75 = new JPanel();
     public JPanel p76 = new JPanel();
     public JPanel p77 = new JPanel();

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
          buttonPanel.setOpaque(false);
          

     }
     
     public void overlay() {
          overlay.setPreferredSize(new Dimension(800, 800));
          overlay.setVisible(true);
          LayoutManager over = new OverlayLayout(overlay);
          overlay.setLayout(over);
          overlay.setBackground(null);
          overlay.add(buttonPanel);
          overlay.add(spielfeldPanel);
          this.add(overlay, BorderLayout.CENTER);
     }

     public void setzeFigur(Figur figur, int x, int y) {
     }

     public void play() {

     }
}
