
package GameControl;

import java.awt.List;
import java.util.ArrayList;

import net.ictcampus.GUI.FeldGUI;
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

     public ControlChess() {
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

          
     }

     public void initField() {
          FeldGUI fg = new FeldGUI();
          fg.setSize(1000, 1000);
          fg.setVisible(true);
          fg.setzeFigur(figuren_schwarz.get(0), 1, 1);
     }

     public static void main(String[] args) {
          ControlChess control = new ControlChess();
     }
}
