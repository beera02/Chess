package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.ictcampus.Spieler.Spieler;

public class ButtonListener implements ActionListener {
	private JTextArea ta;
	private JTextField tf;
	private JButton b;
	private Spieler spieler1;
	private Spieler spieler2;
	private double randomStarter;
	private int runde = 1;
	
	public ButtonListener(JTextArea ta, JTextField tf, JButton b, Spieler spieler1, Spieler spieler2) {
		this.ta = ta;
		this.tf = tf;
		this.b = b;
		this.spieler1 = spieler1;
		this.spieler2 = spieler2;
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
			System.out.println(randomStarter);
			System.out.println(spieler1.getSpielerName());
			System.out.println(spieler2.getSpielerName());
			
			if(randomStarter == 1.0) {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler2.getSpielerName() + ": Sie wurden ausgewählt, das Spiel mit Weiss zu starten!");
			}
			else {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler1.getSpielerName() + ": Sie wurden ausgewählt, das Spiel mit Weiss zu starten!");
			}
			tf.setEnabled(false);
			b.setEnabled(false);
		}
	}
}
