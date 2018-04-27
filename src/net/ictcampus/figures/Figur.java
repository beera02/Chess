package net.ictcampus.figures;

import java.awt.Color;

import javax.swing.ImageIcon;

public abstract class Figur{
	public String figurFarbe;
	public String figurName;
	public int[][] position = new int[8][8];
	public ImageIcon symbol;
	public Color myColor = new Color(242, 206, 103);
	
	public abstract void bewegen();


	
	//Getter & Setter
     
     public int[][] getPosition() {
          return position;
     }


     
     public void setPosition(int[][] position) {
          this.position = position;
     }

     
     public String getFigurFarbe() {
          return figurFarbe;
     }


     
     public String getFigurName() {
          return figurName;
     }


     
     public ImageIcon getSymbol() {
          return symbol;
     }
}
