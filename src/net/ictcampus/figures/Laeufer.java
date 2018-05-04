package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Laeufer, Unterklasse von Figur
 * Klasse um einen Laeufer mit Farbe und Bild zu erstellen, und die begehbaren Felder zu aktivieren
 * @author beera
 * @version 1.0
 */
public class Laeufer extends Figur {

	private Image laeufer;
	
	/**
	 * Konstruktor der Klasse Laeufer, der festlegt welche Eigenschaften beim erstellen einer Instanz mitgegeben werden müssen
	 * @param farbe
	 * @param field
	 */
	public Laeufer(String farbe, FeldGUI field) {
		super(field);
		this.figurName = "Läufer";
		this.figurFarbe = farbe;
		
		//Versucht das Bild des Laeufers hereinzuladen
		try {
			laeufer = ImageIO.read(getClass().getResource("laeufer_" + farbe + ".png"));
		} catch (IOException e) {
			System.out.println(e);
		}
		this.symbol = new ImageIcon(laeufer);
	}
	
	/**
	 * Methode um alle begehbaren Felder des aktuell ausgewählten Laeufers aktiv zu machen
	 */
	public void berechneFelder() {
		int calcPos = 0;
		int xPosition = xPos;
          calcPos = 8 * yPos + xPos;
          field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
		// Check Diagonal North East
		for (int i = yPos - 1; i >= 0; i--) {
			xPosition++;
			if (xPosition >= 8) {
				break;
			}
			calcPos = (8 * i) + xPosition;
			if (field.getFelderJPanel(xPosition, i).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
				field.repaint();
			}

			else {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				}
				break;
			}
		}

		// Check Diagonal North West
		xPosition = xPos;
		for (int i = yPos - 1; i >= 0; i--) {
			xPosition--;
			if (xPosition < 0) {
				break;
			}
			calcPos = (8 * i) + xPosition;
			System.out.println(calcPos + "postion");
			if (field.getFelderJPanel(xPosition, i).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
				field.repaint();
			}

			else {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				}
				break;
			}

		}

		// Check Diagonal South East
		xPosition = xPos;
		for (int i = yPos + 1; i < 8; i++) {
			xPosition++;
			if (xPosition >= 8) {
				break;
			}
			System.out.println("i = " + i);
			calcPos = (8 * i) + xPosition;
			System.out.println("calcpos = " + calcPos);
			if (field.getFelderJPanel(xPosition, i).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
				field.repaint();
			}

			else {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				}
				break;
			}
		}

		// Check Diagonal South West
		xPosition = xPos;
		for (int i = yPos + 1; i < 8; i++) {
			xPosition--;
			if (xPosition < 0) {
				break;
			}
			System.out.println("i = " + i);
			calcPos = (8 * i) + xPosition;
			System.out.println("calcpos = " + calcPos);
			if (field.getFelderJPanel(xPosition, i).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
				field.repaint();
			}

			else {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPosition & figur.getyPos() == i) {
							field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
						}
					}
				}
				break;
			}
		}
	}

}
