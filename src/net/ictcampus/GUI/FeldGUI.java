
package net.ictcampus.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.OverlayLayout;

import GameControl.ControlChess;
import javafx.scene.layout.Border;
import net.ictcampus.Listener.ButtonListener;
import net.ictcampus.Spieler.Spieler;
import net.ictcampus.figures.Figur;

public class FeldGUI extends JFrame {

     private JButton buttonWeiss;
     private JButton buttonSchwarz;
     private JPanel spielfeldPanel = new JPanel();
     private JPanel spieleingabenPanel = new JPanel();
     private JPanel spielkontrollePanel = new JPanel();
     private JPanel northPanel = new JPanel();
     private JPanel buttonPanel = new JPanel();
     private JButton[] weisseFelder = new JButton[32];
     private JButton[] schwarzeFelder = new JButton[32];
     private Spieler spieler1 = new Spieler();
     private Spieler spieler2 = new Spieler();
     private Color hellBraun = new Color(220, 191, 157);
     private Color dunkelBraun = new Color(180, 92, 52);
     private Color transparent = new Color(0, 0, 0, 0);
     private JPanel overlay = new JPanel();
	 public JTextField tf1 = new JTextField();
	 public JButton okButton;
	 public JTextArea ta1 = new JTextArea();
	 private ControlChess control;

	private ButtonListener bl1;
     
     //Dies sind alle Felder, auf welcher möglicherweise eine Figur steht.
     private JPanel[][] felderJPanel = new JPanel[8][8];

     public FeldGUI(ControlChess control) {
          super();
          this.control = control;
          okButton = new JButton();
          bl1 = new ButtonListener(ta1, tf1, okButton, spieler1, spieler2, control);
          //this.setSize(800, 800);
          this.setResizable(false);
          erstelleSpielfeld();
          erstelleFigurenPanel();
          erstelleSpielkontrolleGUI();
          spielStart();
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
                    //buttonWeiss.setVisible(true);
                    buttonWeiss.setEnabled(false);
                    buttonWeiss.setBackground(hellBraun);
                    buttonSchwarz = new JButton();
                    buttonSchwarz.setPreferredSize(new Dimension(100, 100));
                    //buttonSchwarz.setVisible(true);
                    buttonSchwarz.setEnabled(false);
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
          buttonPanel.setLayout(new GridLayout(8, 8));
          for (int i = 0; i < 8; i++) {
               for (int j = 0; j < 8; j++) {
                    felderJPanel[j][i] = new JPanel();
                    felderJPanel[j][i].setOpaque(false);
                    buttonPanel.add(felderJPanel[j][i]);
               }
          }
          buttonPanel.setPreferredSize(new Dimension(800, 800));
          //buttonPanel.setVisible(true);
         
          buttonPanel.setOpaque(false);
          

     }
     public void erstelleSpielkontrolleGUI() {
    	 tf1.setPreferredSize(new Dimension(150, 25));
    	 ta1.setPreferredSize(new Dimension(350, 80));
    	 ta1.setForeground(Color.BLACK);
    	 ta1.setEditable(false);
    	 okButton.setPreferredSize(new Dimension(80, 25));
    	 okButton.setText("OK!");
    	 
    	 tf1.addActionListener(bl1);
    	 okButton.addActionListener(bl1);
    	 
    	 tf1.setVisible(true);
    	 ta1.setVisible(true);
    	 okButton.setVisible(true);
    	 
    	 spieleingabenPanel.setPreferredSize(new Dimension(400, 80));
    	 spieleingabenPanel.setVisible(true);
    	 spieleingabenPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    	 spieleingabenPanel.setBackground(Color.WHITE);
    	 
    	 spielkontrollePanel.setPreferredSize(new Dimension(400, 80));
    	 spielkontrollePanel.setVisible(true);
    	 spielkontrollePanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    	 spielkontrollePanel.setBackground(Color.WHITE);
    	 
    	 northPanel.setPreferredSize(new Dimension(800, 80));
    	 northPanel.setBackground(Color.WHITE);
    	 
    	 spieleingabenPanel.add(tf1);
    	 spieleingabenPanel.add(okButton);
    	 spielkontrollePanel.add(ta1);
    	 
    	 this.add(northPanel, BorderLayout.NORTH);
    	 northPanel.add(spieleingabenPanel, BorderLayout.WEST);
    	 northPanel.add(spielkontrollePanel, BorderLayout.EAST);
     }
     
     public void overlay() {
          overlay.setPreferredSize(new Dimension(800, 800));
          //overlay.setVisible(true);
          LayoutManager over = new OverlayLayout(overlay);
          overlay.setLayout(over);
          overlay.setBackground(null);
          overlay.add(buttonPanel);
          overlay.add(spielfeldPanel);
          this.add(overlay, BorderLayout.CENTER);
     }

     public void setzeFigur(Figur figur, int x, int y) {
          felderJPanel[x][y].add(new JLabel(figur.getSymbol()));
          //felderJPanel[x][y].setVisible(true);
     }

     public void play() {

     }  
     public void spielStart() {
    	 ta1.setText("Willkommen beim Spiel Chess!\nSpieler 1: Gib deinen Namen im Textfeld links ein!");
     }

     
     public JPanel[][] getFelderJPanel() {
          return felderJPanel;
     }

     
     public void setFelderJPanel(JPanel[][] felderJPanel) {
          this.felderJPanel = felderJPanel;
     }

     
     public JPanel getButtonPanel() {
          return buttonPanel;
     }

     
     public void setButtonPanel(JPanel buttonPanel) {
          this.buttonPanel = buttonPanel;
     }
	 public JPanel getSpielfeldPanel() {
		return spielfeldPanel;
	}

	public void setSpielfeldPanel(JPanel spielfeldPanel) {
		this.spielfeldPanel = spielfeldPanel;
	}

	public ControlChess getControl() {
		return control;
	}

	public void setControl(ControlChess control) {
		this.control = control;
	}
}
