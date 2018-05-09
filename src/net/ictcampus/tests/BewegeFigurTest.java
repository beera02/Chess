package net.ictcampus.tests;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import net.ictcampus.gamecontrol.ControlChess;


@SuppressWarnings("deprecation")
public class BewegeFigurTest {

     private static ControlChess control;
     
     @BeforeClass
     public static void initGame() {
          control = new ControlChess();
     }
     
     @Test
     public void bewegenTest() {
          control.bewegen(control.bauer2_weiss, 5, 4);
          Assert.assertEquals(true, control.bauer2_weiss.getyPos() == 4 && control.bauer2_weiss.getxPos() == 5);
     }
}
