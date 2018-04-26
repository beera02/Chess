package net.ictcampus.figures;

import javax.swing.ImageIcon;

public abstract class Figur {
	public String figurFarbe;
	public String figurName;
	public int[][] position = new int[8][8];
	public ImageIcon bild;
	
	public Figur(String name, String farbe) {
	     this.figurFarbe = farbe;
	     this.figurName = name;
	}
	public abstract void bewegen();
}
