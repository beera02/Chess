
package net.ictcampus.figures;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import net.ictcampus.GUI.FeldGUI;

public class Turm extends Figur {

     // Instanzvariablen
     private Image turm;

     // Konstruktor
     public Turm(String farbe , FeldGUI field) {
          super(field);
          this.figurName = "Turm";
          this.figurFarbe = farbe;

          try {
               turm = ImageIO.read(getClass().getResource("turm_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }

          this.symbol = new ImageIcon(turm);
     }

     public void berechneFelder() {
          
          int calcPos = 0;
          
          // Check Right Side
          for (int i = xPos + 1; i < 8; i++) {
               calcPos = (8 * (yPos)) + i ;
               if(field.getFelderJPanel(i, yPos).getComponents().length < 1) {
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
               }
               
               else {
                    if (figurFarbe == "schwarz") {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == i & figur.getyPos() == yPos) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         }
                    }
                    else {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == i & figur.getyPos() == yPos) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         } 
                    }
                    break;
               }
          }
          
          // Check Left Side
          int counter = 1;
          for (int i = xPos - 1; i >= 0; i--) {
               calcPos = (8 * (yPos)) + xPos - counter;
               if(field.getFelderJPanel(i, yPos).getComponents().length < 1){
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
                    counter++;
                 
               }
               
               else {
                    if (figurFarbe == "schwarz") {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == i & figur.getyPos() == yPos) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         }
                    }
                    else {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == i & figur.getyPos() == yPos) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         } 
                    }
                    break;
               }
          }
          
          // Check North Side
          for (int i = yPos - 1; i >= 0; i--) {
               calcPos = (8 * i) + xPos;
               if (field.getFelderJPanel(xPos, i).getComponents().length < 1) {
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
               }
               
               else {
                    if (figurFarbe == "schwarz") {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == xPos & figur.getyPos() == i) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         }
                    }
                    else {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == xPos & figur.getyPos() == i) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         } 
                    }
                    break;
               }
          }
          
          //Check South Side
          for (int i = yPos + 1; i < 8; i++) {
               calcPos = (8 * i) + xPos;
               if (field.getFelderJPanel(xPos, i).getComponents().length < 1) {
                    field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                    field.repaint();
               }
               
               else {
                    if (figurFarbe == "schwarz") {
                         for (Figur figur : field.getControl().getFiguren_weiss()) {
                              if (figur.getxPos() == xPos & figur.getyPos() == i) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         }
                    }
                    else {
                         for (Figur figur : field.getControl().getFiguren_schwarz()) {
                              if (figur.getxPos() == xPos & figur.getyPos() == i) {
                                   field.getSpielfeldPanel().getComponent(calcPos).setEnabled(true);
                              }
                         } 
                    }
                    break;
               }
          }
     }

     @Override
     public void bewegen() {
          // TODO Auto-generated method stub
          
     }
}
