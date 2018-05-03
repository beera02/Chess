package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

public class Laeufer extends Figur{
     

     // Instanzvariablen
     private Image laeufer;

     // Konstruktor
     public Laeufer(String farbe, FeldGUI field) {
          super(field);
          this.figurName = "Läufer";
          this.figurFarbe = farbe;
          
          try {
               laeufer = ImageIO.read(getClass().getResource("laeufer_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(laeufer);
     }
     
	public void berechneFelder() {
		int calcPos = 0;
		int xPosition = xPos;
		
		// Check Diagonal North East
		for (int i = yPos - 1; i >= 0; i--) {
		     xPosition++;
		     calcPos = (8 * i) + xPosition;
		     if (field.getFelderJPanel(xPosition, i).getComponents().length < 1) {
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
		     }
		}
		
	}

     @Override
     public void bewegen() {
          // TODO Auto-generated method stub
          
     }
}
