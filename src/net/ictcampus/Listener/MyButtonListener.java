package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.function.Predicate;

import com.sun.glass.events.MouseEvent;

import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.figures.Figur;

public class MyButtonListener implements ActionListener{
	private Figur[] figuren;
	private FeldGUI field;
	
	public MyButtonListener(FeldGUI field) {
		this.field = field;
	}
     @Override
     public void actionPerformed(ActionEvent e) {
          field.repaint();
     }

}
