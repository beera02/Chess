
package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import GameControl.ControlChess;
import net.ictcampus.figures.Figur;

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

                         control.getFeld().setAllButtonsToFalse();
                         control.getFeld().coloring();
                         figur.berechneFelder();
                         control.getFeld().graying();
                         break;
                    }
               }
          }

          else if (action.equals("set")) {
               int breaker = 0;
               action = "choose";
               button = (JButton) e.getSource();
               for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 8; j++) {
                         calcPosition = i * 8 + j;
                         if (button.getLocationOnScreen().getX() == control.getFeld()
                                   .getButtonPanel().getComponent(calcPosition)
                                   .getLocationOnScreen().getX()
                                   & button.getLocationOnScreen().getY() == control.getFeld()
                                             .getButtonPanel().getComponent(calcPosition)
                                             .getLocationOnScreen().getY()) {
                              System.out.println("i = " + i);
                              System.out.println("j = " + j);
                              for (Figur figur : control.getFiguren_schwarz()) {
                                   if (figur.equals(choosenFigure)) {
                                        control.bewegen(figur, j, i);
                                        control.getFeld().coloring();
                                        control.getFeld().setAllButtonsToFalse();
                                        control.wechsleSpieler("weiss");
                                        break;
                                   }
                              }
                              for (Figur figur : control.getFiguren_weiss()) {
                                   if (figur.equals(choosenFigure)) {
                                        control.bewegen(figur, j, i);
                                        control.getFeld().coloring();
                                        control.getFeld().setAllButtonsToFalse();
                                        control.wechsleSpieler("schwarz");
                                        break;
                                   }
                              }
                              breaker = 1;
                              break;

                         }
                    }
                    if (breaker == 1) {
                         break;
                    }
               }

          }

     }

}
