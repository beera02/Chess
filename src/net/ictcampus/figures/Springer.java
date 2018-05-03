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
	public void berechneFelder() {
		if(xPos + 2 < 8 & yPos - 1 >= 0) {
			if(field.getFelderJPanel(xPos + 2, yPos - 1).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos + 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos + 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 -1) * 111).setEnabled(true);
			}
		}
		if(xPos + 2 < 8 & yPos + 1 < 8) {
			if(field.getFelderJPanel(xPos + 2, yPos + 1).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos + 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos + 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			}
		}
		
		if(xPos - 2 >= 0 & xPos - 1 >= 0) {
			if(field.getFelderJPanel(xPos - 2, yPos - 1).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos - 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos - 2 & figur.getyPos() == yPos - 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
			}
		}
		if(xPos - 2 >= 0 & yPos + 1 < 8) {
			if(field.getFelderJPanel(xPos - 2, yPos + 1).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos - 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos - 2 & figur.getyPos() == yPos + 1) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 2) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
			}
		}
		if(yPos - 2 >= 0 & xPos + 1 < 8) {
			if(field.getFelderJPanel(xPos + 1, yPos - 2).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
			}
		}
		if(yPos - 2 >= 0 & xPos - 1 >= 0) {
			if(field.getFelderJPanel(xPos - 1, yPos - 2).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
			}
		}
		if(yPos + 2 < 8 & xPos + 1 < 8) {
			if(field.getFelderJPanel(xPos + 1, yPos + 2).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
			}
		}
		if(yPos + 2 < 8 & xPos - 1 >= 0) {
			if(field.getFelderJPanel(xPos - 1, yPos + 2).getComponents().length >= 1) {
				if(figurFarbe == "schwarz") {
					for(Figur figur:field.getControl().getFiguren_weiss()) {
						if(figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
						}
					}
				}
				else {
					for(Figur figur:field.getControl().getFiguren_schwarz()) {
						if(figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 2) {
							field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
						}
					}
				}
			}
			else {
				field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
			}
		}
	}
}
