
package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse Bauer, Unterklasse von Figur Klasse um einen Bauer mit Farbe und Bild
 * zu erstellen, und die begehbaren Felder zu aktivieren
 * 
 * @author beera
 * @version 1.0
 */
public class Bauer extends Figur {

     private Image bauer;

     /**
      * Konstruktor der Klasse Bauer, der festlegt welche EIgenschaften beim
      * erstellen einer Instanz mitgegeben werden müssen
      * 
      * @param farbe
      * @param field
      */
     public Bauer(String farbe , FeldGUI field) {
          super(field);
          this.figurName = "Bauer";
          this.figurFarbe = farbe;

          // Versucht das Bild des Bauers hereinzuladen
          try {
               bauer = ImageIO.read(getClass().getResource("bauer_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          this.symbol = new ImageIcon(bauer);
     }

     /**
      * Methode um alle begehbaren Felder des aktuell ausgewählten Bauers aktiv zu
      * machen
      */
     public void berechneFelder() {
          int calcPos = 0;
          calcPos = 8 * yPos + xPos;
          field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
          // Wenn es ein schwarzer Bauer ist
          if (figurFarbe == "schwarz") {
               // Startzustand, entweder 2 oder 1 nach vorne
               if (yPos == 6 & field.getFelderJPanel(xPos, yPos - 1).getComponents().length < 1) {
                    if (field.getFelderJPanel(xPos, yPos - 2).getComponents().length < 1) {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111)
                                   .setEnabled(true);
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 - 2) * 111)
                                   .setEnabled(true);
                    } else {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111)
                                   .setEnabled(true);
                    }
               }
               // Schräg einen gegner schlagen
               if (yPos - 1 >= 0 & xPos - 1 >= 0) {
                    if (field.getFelderJPanel(xPos - 1, yPos - 1).getComponents().length >= 1) {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos - 1) {
                                   field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124,
                                             (yPos + 1 - 1) * 111).setEnabled(true);
                              }
                         }
                    }
               }
               // Schräg einen Gegner schlagen
               if (yPos - 1 >= 0 & xPos + 1 < 8) {
                    if (field.getFelderJPanel(xPos + 1, yPos - 1).getComponents().length >= 1) {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos - 1) {
                                   field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124,
                                             (yPos + 1 - 1) * 111).setEnabled(true);
                              }
                         }
                    }
               }
               // Ein Feld nach vorne bewegen
               if (yPos - 1 >= 0) {
                    if (field.getFelderJPanel(xPos, yPos - 1).getComponents().length < 1) {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 - 1) * 111)
                                   .setEnabled(true);
                    }
               }
          }
          // Wenn es ein weisser Bauer ist
          else if (figurFarbe == "weiss") {
               // Startzustand, entweder 1 oder 2 nach vorne
               if (yPos == 1 & field.getFelderJPanel(xPos, yPos + 1).getComponents().length < 1) {
                    if (field.getFelderJPanel(xPos, yPos + 2).getComponents().length < 1) {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111)
                                   .setEnabled(true);
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 + 2) * 111)
                                   .setEnabled(true);
                    } else {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111)
                                   .setEnabled(true);
                    }
               }
               // schräg einen Gegner schlagen
               if (yPos + 1 < 8 & xPos - 1 >= 0) {
                    if (field.getFelderJPanel(xPos - 1, yPos + 1).getComponents().length >= 1) {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == xPos - 1 & figur.getyPos() == yPos + 1) {
                                   field.getSpielfeldPanel().getComponentAt((xPos + 1 - 1) * 124,
                                             (yPos + 1 + 1) * 111).setEnabled(true);
                              }
                         }
                    }
               }
               // schräg einen Gegner schlagen
               if (yPos + 1 < 8 & xPos + 1 < 8) {
                    if (field.getFelderJPanel(xPos + 1, yPos + 1).getComponents().length >= 1) {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == xPos + 1 & figur.getyPos() == yPos + 1) {
                                   field.getSpielfeldPanel().getComponentAt((xPos + 1 + 1) * 124,
                                             (yPos + 1 + 1) * 111).setEnabled(true);
                              }
                         }
                    }
               }
               // ein Feld nach vorne bewegen
               if (yPos + 1 < 8) {
                    if (field.getFelderJPanel(xPos, yPos + 1).getComponents().length < 1) {
                         field.getSpielfeldPanel()
                                   .getComponentAt((xPos + 1) * 124, (yPos + 1 + 1) * 111)
                                   .setEnabled(true);
                    }
               }
          }
     }
}
