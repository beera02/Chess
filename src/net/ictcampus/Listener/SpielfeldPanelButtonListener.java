
package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import net.ictcampus.figures.Figur;
import net.ictcampus.gamecontrol.ControlChess;

public class SpielfeldPanelButtonListener implements ActionListener {

     static String action = "choose";
     static Figur choosenFigure;
     static int x = 0;
     static int y = 0;
     private ControlChess control;
     private JButton button;

     public SpielfeldPanelButtonListener(ControlChess control) {
          this.control = control;
     }

     @Override
     public void actionPerformed(ActionEvent e) {

          int calcPosition;
          if (action.equals("choose")) {
               action = "set";
               button = (JButton) e.getSource();
               for (Figur figur : control.getFiguren_weiss()) {
                    calcPosition = (figur.getyPos() * 8) + figur.getxPos();
                    if (button.getLocationOnScreen().getX() == control.getFeld().getSpielfeldPanel()
                              .getComponent(calcPosition).getLocationOnScreen().getX()
                              & button.getLocationOnScreen().getY() == control.getFeld()
                                        .getSpielfeldPanel().getComponent(calcPosition)
                                        .getLocationOnScreen().getY()) {
                         choosenFigure = figur;
                         control.getFeld().setAllButtonsToFalse();
                         control.getFeld().coloring();
                         figur.berechneFelder();
                         control.getFeld().graying();
                         break;
                    }
               }
               for (Figur figur : control.getFiguren_schwarz()) {
                    calcPosition = (figur.getyPos() * 8) + figur.getxPos();
                    if (button.getLocationOnScreen().getX() == control.getFeld().getSpielfeldPanel()
                              .getComponent(calcPosition).getLocationOnScreen().getX()
                              & button.getLocationOnScreen().getY() == control.getFeld()
                                        .getSpielfeldPanel().getComponent(calcPosition)
                                        .getLocationOnScreen().getY()) {
                         choosenFigure = figur;
                         control.getFeld().setAllButtonsToFalse();
                         control.getFeld().coloring();
                         figur.berechneFelder();
                         control.getFeld().graying();
                         break;
                    }
               }
          }

          else if (action.equals("set")) {
               int counterRemoveFigur = 0;
               int checkBackwards = 0;
               int breaker = 0;
               action = "choose";
               button = (JButton) e.getSource();
               checkBackwards = choosenFigure.getyPos() * 8 + choosenFigure.getxPos();
               if (button.getLocationOnScreen().getX() == control.getFeld().getButtonPanel()
                         .getComponent(checkBackwards).getLocationOnScreen().getX()
                         & button.getLocationOnScreen().getY() == control.getFeld().getButtonPanel()
                                   .getComponent(checkBackwards).getLocationOnScreen().getY()) {
                    control.getFeld().setAllButtonsToFalse();
                    control.getFeld().coloring();
                    control.wechsleSpieler(choosenFigure.figurFarbe);
               } else {
                    for (int i = 0; i < 8; i++) {
                         for (int j = 0; j < 8; j++) {
                              calcPosition = i * 8 + j;
                              if (button.getLocationOnScreen().getX() == control.getFeld()
                                        .getButtonPanel().getComponent(calcPosition)
                                        .getLocationOnScreen().getX()
                                        & button.getLocationOnScreen().getY() == control.getFeld()
                                                  .getButtonPanel().getComponent(calcPosition)
                                                  .getLocationOnScreen().getY()) {
                                   for (Figur figur : control.getFiguren_schwarz()) {
                                        if (figur.equals(choosenFigure)) {
                                             for (Figur f : control.getFiguren_weiss()) {
                                                  if (f.getxPos() == j && f.getyPos() == i) {
                                                       control.getFeld().entferneFigur(j, i);
                                                       control.getFiguren_weiss()
                                                                 .remove(counterRemoveFigur);
                                                       break;
                                                  }
                                                  counterRemoveFigur++;
                                             }
                                             control.bewegen(figur, j, i);
                                             control.getFeld().coloring();
                                             control.getFeld().setAllButtonsToFalse();
                                             if (control.getFiguren_weiss().isEmpty()) {
                                                  control.getFeld().setAllButtonsToFalse();
                                                  action = "finished";
                                                  control.getFeld().coloring();
                                                  if (control.getFeld().getSpieler1()
                                                            .getSpielerFarbe() == "schwarz") {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler1()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  } else {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler2()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  }
                                             } else if (!control.getFiguren_weiss()
                                                       .contains(control.koenig_weiss)) {
                                                  if (control.getFeld().getSpieler1()
                                                            .getSpielerFarbe() == "schwarz") {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler1()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  } else {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler2()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  }
                                                  control.getFeld().setAllButtonsToFalse();
                                                  action = "finished";
                                                  control.getFeld().coloring();
                                             } else {
                                                  control.wechsleSpieler("weiss");
                                             }
                                             break;
                                        }
                                   }
                                   for (Figur figur : control.getFiguren_weiss()) {
                                        if (figur.equals(choosenFigure)) {
                                             for (Figur f : control.getFiguren_schwarz()) {
                                                  if (f.getxPos() == j && f.getyPos() == i) {
                                                       control.getFeld().entferneFigur(j, i);
                                                       control.getFiguren_schwarz()
                                                                 .remove(counterRemoveFigur);
                                                       break;
                                                  }
                                                  counterRemoveFigur++;
                                             }
                                             control.bewegen(figur, j, i);
                                             control.getFeld().coloring();
                                             control.getFeld().setAllButtonsToFalse();
                                             if (control.getFiguren_schwarz().isEmpty()) {
                                                  System.out.println("weiss hat gewonnen");
                                                  control.getFeld().setAllButtonsToFalse();
                                                  action = "finished";
                                                  control.getFeld().coloring();
                                             } else if (!control.getFiguren_schwarz()
                                                       .contains(control.koenig_schwarz)) {
                                                  if (control.getFeld().getSpieler1()
                                                            .getSpielerFarbe() == "weiss") {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler1()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  } else {
                                                       JOptionPane.showMessageDialog(null,
                                                                 "Gratulation " + control.getFeld()
                                                                           .getSpieler2()
                                                                           .getSpielerName()
                                                                           + " sie haben Ihren Gegner Schachmatt gesetzt!");
                                                  }
                                                  control.getFeld().setAllButtonsToFalse();
                                                  action = "finished";
                                                  control.getFeld().coloring();
                                             } else {
                                                  control.wechsleSpieler("schwarz");
                                             }
                                             break;
                                        }
                                   }
                                   breaker = 1;
                                   break;

                              }
                         }
                         if (breaker == 1) {
                              control.getFeld().revalidate();
                              break;
                         }
                    }
               }
          }

     }

}
