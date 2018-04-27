
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Koenig extends Figur {

     // Instanzvariablen
     private Image koenig;

     // Konstruktor
     public Koenig(String farbe) {

          this.figurName = "König";
          this.figurFarbe = farbe;

          try {
               koenig = ImageIO.read(getClass().getResource("koenig_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }

          this.symbol = new ImageIcon(koenig);
     }

     public void bewegen() {

     }
}
