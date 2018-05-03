
package net.ictcampus.figures;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

public class Turm extends Figur {

     // Instanzvariablen
     private Image turm;

     // Konstruktor
     public Turm(String farbe , FeldGUI field) {
          super(field);
          this.figurName = "Turm";
          this.figurFarbe = farbe;

          try {
               turm = ImageIO.read(getClass().getResource("turm_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }

          this.symbol = new ImageIcon(turm);
     }

     public void berechneFelder() {
          
          int calcPos = 0;
          
          // Check Right Side
          for (int i = xPos + 1; i < 8; i++) {
               if(field.getFelderJPanel(i, yPos).getComponents().length < 1) {
                    System.out.println(yPos);
                    calcPos = (8 * (yPos)) + i - xPos;
                    System.out.println(calcPos);
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
               }
               else {
                    System.out.println(yPos + " " + i);
                    System.out.println("Nope");
                    break;
               }
          }
     }
}
