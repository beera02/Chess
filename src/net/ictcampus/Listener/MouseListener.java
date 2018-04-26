package net.ictcampus.Listener;

import java.awt.event.MouseAdapter;

import com.sun.glass.events.MouseEvent;

import net.ictcampus.GUI.FeldGUI;

public class MouseListener extends MouseAdapter{
	private Feld feld;
	
	public MouseListener(Feld feld) {
		this.feld = feld;
	}
	public void mouseClicked(MouseEvent e) {

	}

}
