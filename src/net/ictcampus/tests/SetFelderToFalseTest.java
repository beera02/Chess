
package net.ictcampus.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.gamecontrol.ControlChess;

@SuppressWarnings("deprecation")
/**
 * In diesem Test wird �berpr�ft, ob wirklich alle Felder auf false gesetzt
 * werden, wenn die Methode setAllButtonsToFalse() ausgef�hrt wird.
 * 
 * @author weberyo
 * @version 1.0
 *
 */
public class SetFelderToFalseTest {

     private static FeldGUI field;

     @BeforeClass
     /**
      * Initialisiert das Feld. Vorbereitungen f�r den Test.
      */
     public static void initField() {
          field = new FeldGUI(new ControlChess());
     }

     @Test
     /**
      * F�hrt den oben beschriebenen Test durch.
      */
     public void setButtonFalseTest() {
          field.setAllButtonsToFalse();
          for (int i = 0; i < 64; i++) {
               Assert.assertEquals(false, field.getSpielfeldPanel().getComponent(i).isEnabled());
          }
     }

}
