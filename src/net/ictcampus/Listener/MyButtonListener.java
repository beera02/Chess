package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import com.sun.glass.events.MouseEvent;

import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.figures.Figur;

public class MyButtonListener implements ActionListener{
	private Figur[] figuren;
	
	public MyButtonListener(Figur[] figuren) {
		this.figuren = figuren;
	}
     @Override
     public void actionPerformed(ActionEvent e) {
          
     }

}
