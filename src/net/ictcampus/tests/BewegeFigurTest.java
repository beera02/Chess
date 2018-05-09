
package net.ictcampus.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import net.ictcampus.gamecontrol.ControlChess;

@SuppressWarnings("deprecation")
/**
 * In diesem Test wird �berpr�ft, ob eine Figur an die richtige / eingegeben
 * Postion gesetzt wird, wenn man die Methode bewegen(Figur figur, int x, int y)
 * ausf�hrt.
 * 
 * @author weberyo
 *
 */
public class BewegeFigurTest {

     private static ControlChess control;

     @BeforeClass
     /**
      * Bereitet alles f�r den Test vor, initialisiert die control.
      */
     public static void initGame() {
          control = new ControlChess();
     }

     @Test
     /**
      * Hier wird der obene beschriebene Test durchgef�hrt.
      */
     public void bewegenTest() {
          control.bewegen(control.bauer2_weiss, 5, 4);
          Assert.assertEquals(true,
                    control.bauer2_weiss.getyPos() == 4 && control.bauer2_weiss.getxPos() == 5);
     }
}
