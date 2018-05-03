
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

public class Bauer extends Figur {

     // Instanzvariablen
     private Image bauer;

     // Konstruktor
     public Bauer(String farbe, FeldGUI field) {
          super(field);
          this.figurName = "Bauer";
          this.figurFarbe = farbe;
          
          try {
               bauer = ImageIO.read(getClass().getResource("bauer_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(bauer);
     }

     public void berechneFelder() {

     }

     @Override
     public void bewegen() {
          // TODO Auto-generated method stub
          
     }
     
}
