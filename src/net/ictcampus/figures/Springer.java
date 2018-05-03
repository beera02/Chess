package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

public class Springer extends Figur{
     

     // Instanzvariablen
     private Image springer;

     // Konstruktor
     public Springer(String farbe, FeldGUI field) {
          super(field);
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
	public void brerechneFelder() {
		if(this.getxPos() + 2 < 8 & this.getyPos() - 1 >= 0) {
			if(field.getFelderJPanel())
		}
		if(this.getxPos() + 2 < 8 & this.getyPos() + 1 < 8) {
			
		}
		if(this.getxPos() - 2 >= 0 & this.getyPos() - 1 >= 0) {
			
		}
		if(this.getxPos() - 2 >= 0 & this.getyPos() + 1 < 8) {
			
		}
		if(this.getyPos() - 2 >= 0 & this.getxPos() + 1 < 8) {
			
		}
		if(this.getyPos() - 2 >= 0 & this.getxPos() - 1 >= 0) {
			
		}
		if(this.getyPos() + 2 < 8 & this.getxPos() + 1 < 8) {
			
		}
		if(this.getyPos() + 2 < 8 & this.getxPos() - 1 >= 0) {
			
		}
	}
}
