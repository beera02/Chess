package net.ictcampus.figures;

import javax.swing.ImageIcon;

public abstract class Figur {
	public String figurFarbe;
	public String figurName;
	public int[][] position = new int[8][8];
	public ImageIcon bild;
	
	public abstract void bewegen();
}
