package net.ictcampus.threads;

import net.ictcampus.GUI.FeldGUI;

/**
 * Klasse aktualisiereFeld, Unterklasse von Thread
 * Klasse um dauernd die Spielfiguren in den Vordergrund zu stellen
 * @author beera
 * @version 1.0
 */
public class aktualisiereFeld extends Thread {
	private FeldGUI field;
	/**
	 * Konstruktor der festlegt welche Eigenschaften beim erstellen einer Instanz mitgegeben werden müssen
	 * @param field
	 */
	public aktualisiereFeld(FeldGUI field) {
		this.field = field;
	}
	
	/**
	 * Methode die dauernd das Spielfeld neu lädt
	 */
	public void run() {
		while (true) {
			field.repaint();
		}
	}
}
