package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Bauer extends Figur{
     public Bauer(String farbe) {
          this.figurName = "Bauer";
          this.figurFarbe = farbe; 
          this.bild = new ImageIcon("bauer_"+farbe+".png");
     }
	public void bewegen() {
		
	}
}
