
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Koenig, Unterklasse von Figur
 * Klasse um ein Koenig mit Farbe und Bild zu erstellen, und die begehbaren Felder zu aktivieren
 * @author beera
 * @version 1.0
 */
public class Koenig extends Figur {
	private Image koenig;
	
	/**
	 * Konstruktor der Klasse Koenig, der festlegt welche Eigenschaften beim erstellen einer Instanz mitgegeben werden müssen
	 * @param farbe
	 * @param field
	 */
	public Koenig(String farbe, FeldGUI field) {
		super(field);
		this.figurName = "König";
		this.figurFarbe = farbe;

		try {
			koenig = ImageIO.read(getClass().getResource("koenig_" + farbe + ".png"));
		} catch (IOException e) {
			System.out.println(e);
		}
		this.symbol = new ImageIcon(koenig);
	}
	
	/**
	 * Methode um alle begehbaren Felder des aktuell ausgewählten Koenigs aktiv zu machen
	 */
	public void berechneFelder() {
		if (yPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos, yPos - 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos, yPos - 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos + 1 < 8) {
			if (field.getFelderJPanel(xPos + 1, yPos).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos + 1, yPos).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (yPos + 1 < 8) {
			if (field.getFelderJPanel(xPos, yPos + 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos, yPos + 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos - 1, yPos).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos - 1, yPos).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos + 1 < 8 & yPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos + 1, yPos - 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos + 1, yPos - 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos + 1 < 8 & yPos + 1 < 8) {
			if (field.getFelderJPanel(xPos + 1, yPos + 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos + 1, yPos + 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos - 1 >= 0 & yPos + 1 < 8) {
			if (field.getFelderJPanel(xPos - 1, yPos + 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos - 1, yPos + 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
		if (xPos - 1 >= 0 & yPos - 1 >= 0) {
			if (field.getFelderJPanel(xPos - 1, yPos - 1).getComponents().length < 1) {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			} else if (field.getFelderJPanel(xPos - 1, yPos - 1).getComponents().length >= 1) {
				if (figurFarbe == "schwarz") {
					for (Figur figur : field.getControl().getFiguren_weiss()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				} else {
					for (Figur figur : field.getControl().getFiguren_schwarz()) {
						if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 1) * 111)
									.setEnabled(true);
						}
					}
				}
			}
		}
	}
}
