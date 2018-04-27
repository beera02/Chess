package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Dame extends Figur{
     

     // Instanzvariablen
     private Image dame;

     // Konstruktor
     public Dame(String farbe) {
          
          this.figurName = "Dame";
          this.figurFarbe = farbe;
          
          try {
               dame = ImageIO.read(getClass().getResource("dame_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(dame);
     }
	public void bewegen() {
		
	}
}
