package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Bauer, Unterklasse von Figur
 * Klasse um einen Bauer mit Farbe und Bild zu erstellen, und die begehbaren Felder zu aktivieren
 * @author beera
 * @version 1.0
 */
public class Bauer extends Figur {
     private Image bauer;
     
     /**
      * Konstruktor der Klasse Bauer, der festlegt welche EIgenschaften beim erstellen einer Instanz mitgegeben werden müssen
      * @param farbe
      * @param field
      */
     public Bauer(String farbe, FeldGUI field) {
          super(field);
          this.figurName = "Bauer";
          this.figurFarbe = farbe;
          
          try {
               bauer = ImageIO.read(getClass().getResource("bauer_" + farbe + ".png"));
          }
          catch (IOException e) {
               System.out.println(e);
          }
          this.symbol = new ImageIcon(bauer);
     }
     
     /**
      * Methode um alle begehbaren Felder des aktuell ausgewählten Bauers aktiv zu machen
      */
     public void berechneFelder() {
    	 if(figurFarbe == "schwarz") {
    		 if(yPos == 6 & field.getFelderJPanel(xPos, yPos - 1).getComponents().length < 1) {
    			 if(field.getFelderJPanel(xPos, yPos - 2).getComponents().length < 1) {
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 2) * 111).setEnabled(true);
    			 }
    			 else {
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
    			 }
    		 }
    		 if(yPos - 1 >= 0 & xPos - 1 >= 0) {
    			 if(field.getFelderJPanel(xPos - 1, yPos - 1).getComponents().length >= 1) {
    				 for (Figur figur : field.getControl().getFiguren_weiss()) {
                         if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 1) {
                        	 field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
                         }
    				 }
    			 }
    		 }
    		 if(yPos - 1 >= 0 & xPos + 1 < 8) {
    			 if(field.getFelderJPanel(xPos + 1, yPos - 1).getComponents().length >= 1) {
    				 for (Figur figur : field.getControl().getFiguren_weiss()) {
                         if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 1) {
                        	 field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true);
                         }
    				 }
    			 }
    		 }
    		 if(yPos - 1 >= 0) {
    			 if(field.getFelderJPanel(xPos, yPos - 1).getComponents().length < 1) {
        			 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111).setEnabled(true); 
    			 }
    		 }
    	 }
    	 else if(figurFarbe == "weiss") {
    		 if(yPos == 1 & field.getFelderJPanel(xPos, yPos + 1).getComponents().length < 1) {
    			 if(field.getFelderJPanel(xPos, yPos + 2).getComponents().length < 1) {
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 2) * 111).setEnabled(true);
    			 }
    			 else {
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
    			 }
    		 }
    		 if(yPos + 1 < 8 & xPos - 1 >= 0) {
    			 if(field.getFelderJPanel(xPos - 1, yPos + 1).getComponents().length >= 1) { 
    				 for (Figur figur : field.getControl().getFiguren_schwarz()) {
                         if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 1) {
                        	 field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
                         }
    				 }
    			 }
    		 }
    		 if(yPos + 1 < 8 & xPos + 1 < 8) {
    			 if(field.getFelderJPanel(xPos + 1, yPos + 1).getComponents().length >= 1) {
    				 for (Figur figur : field.getControl().getFiguren_schwarz()) {
                         if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 1) {
                        	 field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);
                         }
    				 }
    			 }
    		 }
    		 if(yPos + 1 < 8) {
    			 if(field.getFelderJPanel(xPos, yPos + 1).getComponents().length < 1) {
    				 field.getSpielfeldPanel().getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111).setEnabled(true);	 
    			 }
    		 }
    	 }
     }     
}
