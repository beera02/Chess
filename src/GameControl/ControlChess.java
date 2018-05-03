package GameControl;

import java.awt.Color;
import java.util.ArrayList;

import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.Listener.ButtonListener;
import net.ictcampus.figures.Bauer;
import net.ictcampus.figures.Dame;
import net.ictcampus.figures.Figur;
import net.ictcampus.figures.Koenig;
import net.ictcampus.figures.Laeufer;
import net.ictcampus.figures.Springer;
import net.ictcampus.figures.Turm;
import net.ictcampus.threads.aktualisiereFeld;
import sun.management.ConnectorAddressLink;

public class ControlChess {

     private ArrayList<Figur> figuren_schwarz = new ArrayList<Figur>();
     private ArrayList<Figur> figuren_weiss = new ArrayList<Figur>();
     private FeldGUI feld;
     private aktualisiereFeld thread;

     String black = "schwarz";
     String white = "weiss";

     public Figur turm1_schwarz;
     public Figur turm2_schwarz;
     public Figur laeufer1_schwarz;
     public Figur laeufer2_schwarz;
     public Figur springer1_schwarz;
     public Figur springer2_schwarz;
     public Figur dame_schwarz;
     public Figur koenig_schwarz;
     public Figur bauer1_schwarz;
     public Figur bauer2_schwarz;
     public Figur bauer3_schwarz;
     public Figur bauer4_schwarz;
     public Figur bauer5_schwarz;
     public Figur bauer6_schwarz;
     public Figur bauer7_schwarz;
     public Figur bauer8_schwarz;

     public Figur turm1_weiss;
     public Figur turm2_weiss;
     public Figur laeufer1_weiss;
     public Figur laeufer2_weiss;
     public Figur springer1_weiss;
     public Figur springer2_weiss;
     public Figur dame_weiss;
     public Figur koenig_weiss;
     public Figur bauer1_weiss;
     public Figur bauer2_weiss;
     public Figur bauer3_weiss;
     public Figur bauer4_weiss;
     public Figur bauer5_weiss;
     public Figur bauer6_weiss;
     public Figur bauer7_weiss;
     public Figur bauer8_weiss;

     public ControlChess() {
          ausgangslage();
          feld = new FeldGUI(this);
          ausgangslage();
          initField();
          thread = new aktualisiereFeld(feld);
          thread.start();
     }

     public void ausgangslage() {

          turm1_schwarz = new Turm(black, feld);
          turm2_schwarz = new Turm(black, feld);
          laeufer1_schwarz = new Laeufer(black, feld);
          laeufer2_schwarz = new Laeufer(black, feld);
          springer1_schwarz = new Springer(black, feld);
          springer2_schwarz = new Springer(black, feld);
          dame_schwarz = new Dame(black, feld);
          koenig_schwarz = new Koenig(black, feld);
          bauer1_schwarz = new Bauer(black, feld);
          bauer2_schwarz = new Bauer(black, feld);
          bauer3_schwarz = new Bauer(black, feld);
          bauer4_schwarz = new Bauer(black, feld);
          bauer5_schwarz = new Bauer(black, feld);
          bauer6_schwarz = new Bauer(black, feld);
          bauer7_schwarz = new Bauer(black, feld);
          bauer8_schwarz = new Bauer(black, feld);

          turm1_weiss = new Turm(white, feld);
          turm2_weiss = new Turm(white, feld);
          laeufer1_weiss = new Laeufer(white, feld);
          laeufer2_weiss = new Laeufer(white, feld);
          springer1_weiss = new Springer(white, feld);
          springer2_weiss = new Springer(white, feld);
          dame_weiss = new Dame(white, feld);
          koenig_weiss = new Koenig(white, feld);
          bauer1_weiss = new Bauer(white, feld);
          bauer2_weiss = new Bauer(white, feld);
          bauer3_weiss = new Bauer(white, feld);
          bauer4_weiss = new Bauer(white, feld);
          bauer5_weiss = new Bauer(white, feld);
          bauer6_weiss = new Bauer(white, feld);
          bauer7_weiss = new Bauer(white, feld);
          bauer8_weiss = new Bauer(white, feld);

          figuren_schwarz.add(turm1_schwarz);
          figuren_schwarz.add(springer1_schwarz);
          figuren_schwarz.add(laeufer1_schwarz);
          figuren_schwarz.add(dame_schwarz);
          figuren_schwarz.add(koenig_schwarz);
          figuren_schwarz.add(laeufer2_schwarz);
          figuren_schwarz.add(springer2_schwarz);
          figuren_schwarz.add(turm2_schwarz);
          figuren_schwarz.add(bauer1_schwarz);
          figuren_schwarz.add(bauer2_schwarz);
          figuren_schwarz.add(bauer3_schwarz);
          figuren_schwarz.add(bauer4_schwarz);
          figuren_schwarz.add(bauer5_schwarz);
          figuren_schwarz.add(bauer6_schwarz);
          figuren_schwarz.add(bauer7_schwarz);
          figuren_schwarz.add(bauer8_schwarz);

          figuren_weiss.add(turm1_weiss);
          figuren_weiss.add(springer1_weiss);
          figuren_weiss.add(laeufer1_weiss);
          figuren_weiss.add(dame_weiss);
          figuren_weiss.add(koenig_weiss);
          figuren_weiss.add(laeufer2_weiss);
          figuren_weiss.add(springer2_weiss);
          figuren_weiss.add(turm2_weiss);
          figuren_weiss.add(bauer1_weiss);
          figuren_weiss.add(bauer2_weiss);
          figuren_weiss.add(bauer3_weiss);
          figuren_weiss.add(bauer4_weiss);
          figuren_weiss.add(bauer5_weiss);
          figuren_weiss.add(bauer6_weiss);
          figuren_weiss.add(bauer7_weiss);
          figuren_weiss.add(bauer8_weiss);

          turm1_schwarz.setxPos(0);
          turm1_schwarz.setyPos(7);
          springer1_schwarz.setxPos(1);
          springer1_schwarz.setyPos(7);
          laeufer1_schwarz.setxPos(2);
          laeufer1_schwarz.setyPos(7);
          dame_schwarz.setxPos(3);
          dame_schwarz.setyPos(7);
          koenig_schwarz.setxPos(4);
          koenig_schwarz.setyPos(7);
          laeufer2_schwarz.setxPos(5);
          laeufer2_schwarz.setyPos(7);
          springer2_schwarz.setxPos(6);
          springer2_schwarz.setyPos(7);
          turm2_schwarz.setxPos(7);
          turm2_schwarz.setyPos(7);

          turm1_weiss.setxPos(0);
          turm1_weiss.setyPos(0);
          springer1_weiss.setxPos(1);
          springer1_weiss.setyPos(0);
          laeufer1_weiss.setxPos(2);
          laeufer1_weiss.setyPos(0);
          dame_weiss.setxPos(3);
          dame_weiss.setyPos(0);
          koenig_weiss.setxPos(4);
          koenig_weiss.setyPos(0);
          laeufer2_weiss.setxPos(5);
          laeufer2_weiss.setyPos(0);
          springer2_weiss.setxPos(6);
          springer2_weiss.setyPos(0);
          turm2_weiss.setxPos(7);
          turm2_weiss.setyPos(0);

          bauer1_schwarz.setxPos(0);
          bauer1_schwarz.setyPos(6);
          bauer2_schwarz.setxPos(1);
          bauer2_schwarz.setyPos(6);
          bauer3_schwarz.setxPos(2);
          bauer3_schwarz.setyPos(6);
          bauer4_schwarz.setxPos(3);
          bauer4_schwarz.setyPos(6);
          bauer5_schwarz.setxPos(4);
          bauer5_schwarz.setyPos(6);
          bauer6_schwarz.setxPos(5);
          bauer6_schwarz.setyPos(6);
          bauer7_schwarz.setxPos(6);
          bauer7_schwarz.setyPos(6);
          bauer8_schwarz.setxPos(7);
          bauer8_schwarz.setyPos(6);

          bauer1_weiss.setxPos(0);
          bauer1_weiss.setyPos(1);
          bauer2_weiss.setxPos(1);
          bauer2_weiss.setyPos(1);
          bauer3_weiss.setxPos(2);
          bauer3_weiss.setyPos(1);
          bauer4_weiss.setxPos(3);
          bauer4_weiss.setyPos(1);
          bauer5_weiss.setxPos(4);
          bauer5_weiss.setyPos(1);
          bauer6_weiss.setxPos(5);
          bauer6_weiss.setyPos(1);
          bauer7_weiss.setxPos(6);
          bauer7_weiss.setyPos(1);
          bauer8_weiss.setxPos(7);
          bauer8_weiss.setyPos(1);

     }

     public void initField() {
          feld.setSize(1000, 1000);

          for (Figur figur : figuren_schwarz) {
               feld.setzeFigur(figur, figur.getxPos(), figur.getyPos());
          }
          for (Figur figur : figuren_weiss) {
               System.out.println(figur.getFigurName());
               feld.setzeFigur(figur, figur.getxPos(), figur.getyPos());
          }
          feld.setVisible(true);
     }

     public void wechsleSpieler(String farbe) {
          if (farbe.equals("weiss")) {
               for (Figur figur : figuren_weiss) {
                    feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124,
                              (figur.getyPos() + 1) * 111).setEnabled(true);
               }
               for (Figur figur : figuren_schwarz) {
                    feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124,
                              (figur.getyPos() + 1) * 111).setEnabled(false);
                    
               }
          } else {
               for (Figur figur : figuren_schwarz) {
                    feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124,
                              (figur.getyPos() + 1) * 111).setEnabled(true);
               }
               for (Figur figur : figuren_weiss) {
                    feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124,
                              (figur.getyPos() + 1) * 111).setEnabled(false);
               }
               feld.repaint();
               
          }
     }

     public void bewegen(Figur figur, int x, int y) {
          feld.entferneFigur(figur.getxPos(), figur.getyPos());
          feld.setzeFigur(figur, x, y);

     }

     public static void main(String[] args) {
          ControlChess control = new ControlChess();
//          control.bewegen(control.turm1_schwarz, 2, 2);
//          control.turm1_schwarz.berechneFelder();
//          control.springer1_schwarz.berechneFelder();
          
//          control.bewegen(control.turm1_weiss, 3, 4);
//          control.turm1_weiss.berechneFelder();

//            control.bewegen(control.dame_schwarz, 3, 5);
//            control.dame_schwarz.berechneFelder();
          
          control.bewegen(control.koenig_weiss, 3, 5);
          control.koenig_weiss.berechneFelder();

//          control.bewegen(control.springer1_schwarz, 4, 5);
//          control.bewegen(control.bauer1_weiss, 3, 3);
//          control.bewegen(control.bauer2_weiss, 5, 3);
//          control.springer1_schwarz.berechneFelder();
//          control.bewegen(control.bauer4_weiss, 0, 5);
//          control.bewegen(control.bauer5_weiss, 1, 5);
//          control.bewegen(control.bauer6_weiss, 2, 5);
//          control.bewegen(control.bauer7_weiss, 3, 5);
//          control.bewegen(control.bauer4_schwarz, 0, 2);
//          control.bewegen(control.bauer5_schwarz, 1, 2);
//          control.bewegen(control.bauer6_schwarz, 2, 2);
//          control.bewegen(control.bauer7_schwarz, 3, 2);
//          control.bewegen(control.bauer8_schwarz, 6, 1);
//          control.bewegen(control.bauer2_schwarz, 6, 2);

//          control.bauer1_schwarz.berechneFelder();
//          control.bauer3_schwarz.berechneFelder();
//          control.bauer8_schwarz.berechneFelder();
//          control.bauer1_weiss.berechneFelder();
//          control.bauer3_weiss.berechneFelder();
          
//          control.bewegen(control.laeufer1_weiss, 5, 4);
//          control.laeufer1_weiss.berechneFelder();
          control.feld.graying();

     }

     public ArrayList<Figur> getFiguren_schwarz() {
          return figuren_schwarz;
     }

     public void setFiguren_schwarz(ArrayList<Figur> figuren_schwarz) {
          this.figuren_schwarz = figuren_schwarz;
     }

     public ArrayList<Figur> getFiguren_weiss() {
          return figuren_weiss;
     }

     public void setFiguren_weiss(ArrayList<Figur> figuren_weiss) {
          this.figuren_weiss = figuren_weiss;
     }

}
