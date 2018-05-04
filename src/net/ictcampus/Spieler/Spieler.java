package net.ictcampus.Spieler;

/**
 * Klasse Spieler
 * Klasse um den Namen eines Spielers zu speichern
 * @author beera
 * @Version 1.0
 */
public class Spieler {
	private String spielerName;
	private String spielerFarbe;

	
     public String getSpielerName() {
		return spielerName;
	}

	public void setSpielerName(String spielerName) {
		this.spielerName = spielerName;
	}
     public String getSpielerFarbe() {
          return spielerFarbe;
     }

     
     public void setSpielerFarbe(String spielerFarbe) {
          this.spielerFarbe = spielerFarbe;
     }

}
