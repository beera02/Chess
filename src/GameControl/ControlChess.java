
package GameControl;

import java.awt.List;
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

public class ControlChess {

     private ArrayList<Figur> figuren_schwarz = new ArrayList<Figur>();
     private ArrayList<Figur> figuren_weiss = new ArrayList<Figur>();
     private FeldGUI feld;

     public ControlChess() {
          ausgangslage();
          feld = new FeldGUI(this);
          initField();

     }

     public void ausgangslage() {
          String black = "schwarz";
          String white = "weiss";

          Figur turm1_schwarz = new Turm(black);
          Figur turm2_schwarz = new Turm(black);
          Figur laeufer1_schwarz = new Laeufer(black);
          Figur laeufer2_schwarz = new Laeufer(black);
          Figur springer1_schwarz = new Springer(black);
          Figur springer2_schwarz = new Springer(black);
          Figur dame_schwarz = new Dame(black);
          Figur koenig_schwarz = new Koenig(black);
          Figur bauer1_schwarz = new Bauer(black);
          Figur bauer2_schwarz = new Bauer(black);
          Figur bauer3_schwarz = new Bauer(black);
          Figur bauer4_schwarz = new Bauer(black);
          Figur bauer5_schwarz = new Bauer(black);
          Figur bauer6_schwarz = new Bauer(black);
          Figur bauer7_schwarz = new Bauer(black);
          Figur bauer8_schwarz = new Bauer(black);

          Figur turm1_weiss = new Turm(white);
          Figur turm2_weiss = new Turm(white);
          Figur laeufer1_weiss = new Laeufer(white);
          Figur laeufer2_weiss = new Laeufer(white);
          Figur springer1_weiss = new Springer(white);
          Figur springer2_weiss = new Springer(white);
          Figur dame_weiss = new Dame(white);
          Figur koenig_weiss = new Koenig(white);
          Figur bauer1_weiss = new Bauer(white);
          Figur bauer2_weiss = new Bauer(white);
          Figur bauer3_weiss = new Bauer(white);
          Figur bauer4_weiss = new Bauer(white);
          Figur bauer5_weiss = new Bauer(white);
          Figur bauer6_weiss = new Bauer(white);
          Figur bauer7_weiss = new Bauer(white);
          Figur bauer8_weiss = new Bauer(white);
          
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
    	 if(farbe.equals("weiss")) {
             for (Figur figur : figuren_weiss) {
                 feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124, (figur.getyPos() + 1) * 111).setEnabled(true);
             }
             for (Figur figur : figuren_schwarz) {
            	 feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124, (figur.getyPos() + 1) * 111).setEnabled(false); 
             }
    	 }
    	 else {
             for (Figur figur : figuren_schwarz) {
            	 feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124, (figur.getyPos() + 1) * 111).setEnabled(true); 
             }
             for (Figur figur : figuren_weiss) {
            	 feld.getSpielfeldPanel().getComponentAt((figur.getxPos() + 1) * 124, (figur.getyPos() + 1) * 111).setEnabled(false);
             }
    	 }
     }
     
     public static void main(String[] args) {
    	 ControlChess control = new ControlChess();
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
