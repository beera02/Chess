package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Springer extends Figur{
     

     // Instanzvariablen
     private Image springer;

     // Konstruktor
     public Springer(String farbe) {
          
          this.figurName = "Springer";
          this.figurFarbe = farbe;
          
          try {
               springer = ImageIO.read(getClass().getResource("springer_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(springer);
     }
	public void bewegen() {
		
	}
}
