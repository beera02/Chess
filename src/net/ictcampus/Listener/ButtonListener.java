package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.ictcampus.Spieler.Spieler;
import net.ictcampus.figures.Figur;
import GameControl.ControlChess;

public class ButtonListener implements ActionListener {
	private JTextArea ta;
	private JTextField tf;
	private JButton b;
	private Spieler spieler1;
	private Spieler spieler2;
	private double randomStarter;
	private int runde = 1;
	private ControlChess control;
	
	public ButtonListener(JTextArea ta, JTextField tf, JButton b, Spieler spieler1, Spieler spieler2, ControlChess control) {
		this.ta = ta;
		this.tf = tf;
		this.b = b;
		this.spieler1 = spieler1;
		this.spieler2 = spieler2;
		this.control = control;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand() == "OK!") & (runde == 1) & !(tf.getText().equals(""))) {
			spieler1.setSpielerName(tf.getText());
			tf.setText(null);
			runde = 2;
			ta.setText("Der Spieler 1 heisst nun " + spieler1.getSpielerName() + "!\nSpieler 2: Geben nun Sie Ihren Namen ein!");
			
		}
		else if((e.getActionCommand() == "OK!") & (runde == 2) & !(tf.getText().equals(""))) {
			spieler2.setSpielerName(tf.getText());
			tf.setText(null);
			randomStarter = Math.round(Math.random());
			
			if(randomStarter == 1.0) {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler2.getSpielerName() + ": Sie wurden ausgewählt, das Spiel mit Weiss zu starten!");
			}
			else {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler1.getSpielerName() + ": Sie wurden ausgewählt, das Spiel mit Weiss zu starten!");
			}
			runde = 3;
		}
		else if(runde == 3) {
			runde = 4;
			for(Figur figurschwarz:control.getFiguren_schwarz()) {
				if(figurschwarz.equals(control.koenig_schwarz)) {
					for(Figur figurweiss:control.getFiguren_weiss()) {
						if(figurweiss.equals(control.koenig_weiss)) {
							while(figurweiss.equals(control.koenig_weiss)){
								if(runde == 4) {
									control.wechsleSpieler("weiss");
									for(Figur figurweiss1:control.getFiguren_weiss()) {
										
									}
									runde = 5;
									break;
								}
								if(runde == 5) {
									control.wechsleSpieler("schwarz");
									
									runde = 4;
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
