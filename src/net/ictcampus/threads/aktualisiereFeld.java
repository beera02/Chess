package net.ictcampus.threads;

import net.ictcampus.GUI.FeldGUI;

public class aktualisiereFeld extends Thread {

     private FeldGUI field;
     
     public aktualisiereFeld(FeldGUI field) {
          this.field = field;
     }
     
     public void run() {
          while (true) {
               field.repaint();
          }
     }
}
