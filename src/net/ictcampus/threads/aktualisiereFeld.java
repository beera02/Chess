package net.ictcampus.threads;

import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.Listener.MausListener;

public class aktualisiereFeld extends Thread {

     private FeldGUI field;
     private MausListener listener;
     
     public aktualisiereFeld(FeldGUI field) {
          this.field = field;
     }
     
     public void run() {
          while (true) {
               field.repaint();
          }
     }
}
