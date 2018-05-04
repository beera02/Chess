package net.ictcampus.figures;

import java.awt.Color;

import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Figur, Oberklasse von allen Figuren
 * Oberklasse um Methodenimplementationen zu erzwingen, und gemeinsame Eigenschaften der Figuren zu speichern
 * @author beera
 * @version 1.0
 */
public abstract class Figur {
	public String figurFarbe;
	public String figurName;
	public int xPos;
	public int yPos;
	public ImageIcon symbol;
	public Color myColor = new Color(242, 206, 103);
	public FeldGUI field;
	
	/**
	 * Konstruktor der Klasse Figur, der festlegt welche Eigenschaften beim erstellen einer Instanz mitgegeben werden müssen
	 * @param field
	 */
	public Figur(FeldGUI field) {
		this.field = field;
	}
	
	/**
	 * Erzwingt die Unterklassen zur Erstellung der Methode berechneFelder()
	 */
	public abstract void berechneFelder();
	
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
