
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bauer extends Figur {

     // Instanzvariablen
     private Image bauer;

     // Konstruktor
     public Bauer(String farbe) {
          
          this.figurName = "Bauer";
          this.figurFarbe = farbe;
          
          try {
               bauer = ImageIO.read(getClass().getResource("bauer_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(bauer);
     }

     public void bewegen() {

     }
     
     public static void main(String[] args) {
     }
}
