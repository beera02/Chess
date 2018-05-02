package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Laeufer extends Figur{
     

     // Instanzvariablen
     private Image laeufer;

     // Konstruktor
     public Laeufer(String farbe) {
          
          this.figurName = "Läufer";
          this.figurFarbe = farbe;
          
          try {
               laeufer = ImageIO.read(getClass().getResource("laeufer_" + farbe + ".png"));
               System.out.println("laeufer_"+farbe+".png");
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(laeufer);
     }
     
	public void bewegen() {
		
	}
}
