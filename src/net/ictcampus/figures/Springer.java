package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Springer, Unterklasse von Figur Klasse um einen Springer mit Farbe und
 * Bild zu erstellen, und die begehbaren Felder zu aktivieren
 * 
 * @author beera
 * @version 1.0
 */
public class Springer extends Figur {
	private Image springer;

	/**
	 * Konstruktor der Klasse Springer, der festlegt welche Eigenschaften beim
	 * erstellen einer Instanz mitgegeben werden müssen
	 * 
	 * @param farbe
	 * @param field
	 */
	public Springer(String farbe, FeldGUI field) {
		super(field);
		this.figurName = "Springer";
		this.figurFarbe = farbe;
		
		//Versucht das Bild des Springers hereinzuladen
		try {
			springer = ImageIO.read(getClass().getResource("springer_" + farbe + ".png"));
		} catch (IOException e) {
			System.out.println(e);
		}
		this.symbol = new ImageIcon(springer);
	}

	/**
	 * Methode um alle begehbaren Felder des aktuell ausgewählten Springers aktiv zu
	 * machen
	 */
	public void berechneFelder() {
		// Prüfen ob möglich 2 gegen rechts und 1 gegen oben zu gehen/schlagen
		if (xPos + 2 < 8 & yPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos + 2, yPos - 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			}
		}
		
		// Prüfen ob möglich 2 gegen rechts und 1 gegen unten zu gehen/schlage
		if (xPos + 2 < 8 & yPos + 1 < 8) {
			if (field.getFelderJPanel(xPos + 2, yPos + 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			}
		}
		
		// Prüfen ob möglich 2 gegen links und 1 gegen oben zu gehen/schlage
		if (xPos - 2 >= 0 & xPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos - 2, yPos - 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			}
		}
		
		//Prüfen ob möglich 2 gegen links und 1 gegen unten zu gehen/schlage
		if (xPos - 2 >= 0 & yPos + 1 < 8) {
			if (field.getFelderJPanel(xPos - 2, yPos + 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			}
		}
		//Prüfen ob möglich 2 gegen oben und 1 gegen rechts zu gehen/schlage
		if (yPos - 2 >= 0 & xPos + 1 < 8) {
			if (field.getFelderJPanel(xPos + 1, yPos - 2).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
			}
		}
		
		//Prüfen ob möglich 2 gegen oben und 1 gegen links zu gehen/schlage
		if (yPos - 2 >= 0 & xPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos - 1, yPos - 2).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
			}
		}
		
		//Prüfen ob möglich 2 gegen unten und 1 gegen rechts zu gehen/schlage
		if (yPos + 2 < 8 & xPos + 1 < 8) {
			if (field.getFelderJPanel(xPos + 1, yPos + 2).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
			}
		}
		//Prüfen ob möglich 2 gegen unten und 1 gegen links zu gehen/schlage
		if (yPos + 2 < 8 & xPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos - 1, yPos + 2).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111)
									.setEnabled(true);
						}
					}
				}
			} else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
			}
		}
	}
}
