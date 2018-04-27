package net.ictcampus.figures;

import java.awt.Color;

import javax.swing.ImageIcon;

public abstract class Figur{
	public String figurFarbe;
	public String figurName;
	public int xPos;
	public int yPos;
	public ImageIcon symbol;
	public Color myColor = new Color(242, 206, 103);
	
	public abstract void bewegen();


	
	//Getter & Setter
     


     
     public String getFigurFarbe() {
          return figurFarbe;
     }


     
     public String getFigurName() {
          return figurName;
     }


     
     public ImageIcon getSymbol() {
          return symbol;
     }



     
     public int getxPos() {
          return xPos;
     }



     
     public void setxPos(int xPos) {
          this.xPos = xPos;
     }



     
     public int getyPos() {
          return yPos;
     }



     
     public void setyPos(int yPos) {
          this.yPos = yPos;
     }
}
