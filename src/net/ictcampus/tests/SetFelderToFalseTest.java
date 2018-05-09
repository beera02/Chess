package net.ictcampus.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import net.ictcampus.GUI.FeldGUI;
import net.ictcampus.gamecontrol.ControlChess;


@SuppressWarnings("deprecation")
public class SetFelderToFalseTest {

     private static FeldGUI field;
     
     @BeforeClass
     public static void initField() {
          field = new FeldGUI(new ControlChess());
     }
     
     @Test
     public void setButtonFalseTest() {
          field.setAllButtonsToFalse();
          for (int i = 0; i < 64; i++) {
               Assert.assertEquals(false, field.getSpielfeldPanel().getComponent(i).isEnabled());
          }
     }

}

