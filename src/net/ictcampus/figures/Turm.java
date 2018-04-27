
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Turm extends Figur {

     // Instanzvariablen
     private Image turm;

     // Konstruktor
     public Turm(String farbe) {
          
          this.figurName = "Turm";
          this.figurFarbe = farbe;
          
          try {
               turm = ImageIO.read(getClass().getResource("turm_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(turm);
     }

     public void bewegen() {

     }
}
