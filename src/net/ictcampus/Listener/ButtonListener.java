
package net.ictcampus.Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.ictcampus.Spieler.Spieler;
import net.ictcampus.figures.Figur;
import net.ictcampus.gamecontrol.ControlChess;

/**
 * Klasse ButtonListener, implementiert ActionListener Klasse um den Anfang
 * eines Spieles zu regeln und die Namen der Spieler festzulegen
 * 
 * @author beera
 * @version 1.0
 */
public class ButtonListener implements ActionListener {
	private JTextArea ta;
	private JTextField tf;
	private JButton b;
	private Spieler spieler1;
	private Spieler spieler2;
	private int runde = 1;
	private ControlChess control;
	
	/**
	 * Konstruktor um festzulegen welche Informationen bei der Erstellung einer Instanz mitgegeben werden m�ssen
	 * @param ta Textarea
	 * @param tf TextFeld
	 * @param b OK! Button
	 * @param spieler1 Erster SPieler
	 * @param spieler2 Zweiter SPieler
	 * @param control ControlChess Objekt
	 */
	public ButtonListener(JTextArea ta, JTextField tf, JButton b, Spieler spieler1, Spieler spieler2, ControlChess control) {
		this.ta = ta;
		this.tf = tf;
		this.b = b;
		this.spieler1 = spieler1;
		this.spieler2 = spieler2;
		this.control = control;
	}
	
	/**
	 * Methode welche auf den OK! Button h�rt und je nach dem in welcher Runde man sich befindet, anders handelt
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if((e.getActionCommand() == "OK!") & (runde == 1) & !(tf.getText().equals(""))) {
			spieler1.setSpielerName(tf.getText());
			tf.setText(null);
			runde = 2;
			ta.setText("Der Spieler 1 heisst nun " + spieler1.getSpielerName() + "!\nSpieler 2: Geben nun Sie Ihren Namen ein!");
			
		}
		if((e.getActionCommand() == "OK!") & (runde == 2) & !(tf.getText().equals(""))) {
			spieler2.setSpielerName(tf.getText());
			tf.setText(null);
			double randomStarter = Math.random();
			System.out.println(randomStarter);
			if(randomStarter >= 0.5) {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler2.getSpielerName() + ": Sie wurden ausgew�hlt, das Spiel mit Weiss zu starten!");
				spieler2.setSpielerFarbe("weiss");
				spieler1.setSpielerFarbe("schwarz");
			}
			else {
				ta.setText("Der Spieler 2 heisst nun " + spieler2.getSpielerName() + "!\n" + spieler1.getSpielerName() + ": Sie wurden ausgew�hlt, das Spiel mit Weiss zu starten!");
				spieler1.setSpielerFarbe("weiss");
                    spieler2.setSpielerFarbe("schwarz");
			}
			runde = 3;
			control.wechsleSpieler("weiss");
			b.setEnabled(false);
			tf.setEnabled(false);
		}

	}
}
