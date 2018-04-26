package net.ictcampus.figures;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class Figur extends JButton {
	public String figurFarbe;
	public String figurName;
	public int[][] position = new int[8][8];
	public ImageIcon bild;
	
	
	public abstract void bewegen();
}
