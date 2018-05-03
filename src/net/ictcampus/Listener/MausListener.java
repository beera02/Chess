package net.ictcampus.Listener;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.MouseEvent;

import net.ictcampus.GUI.FeldGUI;

public class MausListener extends MouseAdapter{

     private FeldGUI field;
     
     public MausListener(FeldGUI field) {
          this.field = field;
     }
     public void mouseClicked(MouseEvent e) {
          field.repaint();
     }



}
