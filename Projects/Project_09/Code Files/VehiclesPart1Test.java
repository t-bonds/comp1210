import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*Test of the VehiclesPart1 class.
*
*Project_09
*@author Tanner Bonds - COMP 1210
*@version 11-16-17
*
*/

public class VehiclesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   *
   *Tests that class variable was declared and inherited.
   *
   */
   
   @Test public void mainTest() {
   
      VehiclesPart1 vp1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals("Vehicle.vehicleCount should be 1. ",
         1, Vehicle.getVehicleCount());
   
   
   }
      
}
