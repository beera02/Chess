package net.ictcampus.figures;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import net.ictcampus.GUI.FeldGUI;

public class Dame extends Figur{
     

     // Instanzvariablen
     private Image dame;

     // Konstruktor
     public Dame(String farbe, FeldGUI field) {
          super(field);
          this.figurName = "Dame";
          this.figurFarbe = farbe;
          
          try {
               dame = ImageIO.read(getClass().getResource("dame_" + farbe + ".png"));
          } catch (IOException e) {
               System.out.println(e);
          }
          
          this.symbol = new ImageIcon(dame);
     }
	public void berechneFelder() {
          int calcPos = (8 * yPos) + xPos;
          int xPosition = xPos;
          

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
               System.out.println("calcpos = "+calcPos);
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
               System.out.println("calcpos = "+calcPos);
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
          
          calcPos = 0;
          
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
