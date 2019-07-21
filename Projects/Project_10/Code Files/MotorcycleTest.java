import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*Test of the Motorcycle class.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 11-30-17
*
*/

public class MotorcycleTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   
   /**
   *
   *Test of the get and set methods.
   *
   */
   
   @Test public void getSetMethodsTest() {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
         14000, false, 750);
      
      
      bike1.setOwner("Bonds, Tanner");
      bike1.setYearMakeModel("2009 Toyota Tacoma");
      bike1.setValue(28000);
      bike1.setAlternativeFuel(true);
      bike1.setEngineSize(700);
      
      Assert.assertEquals("owner test", "Bonds, Tanner", bike1.getOwner());
      Assert.assertEquals("yearMakeModel test", "2009 Toyota Tacoma",
         bike1.getYearMakeModel());
      Assert.assertEquals("value test", 28000, bike1.getValue(), .001);
      Assert.assertEquals("altFuel test", true, bike1.getAlternativeFuel());
      Assert.assertEquals("size test", 700, bike1.getEngineSize(), .001);
   
   }
   
   /**
   *
   *Test of useTax.
   *
   */
   
   @Test public void useTaxTest() {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
         14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, true, 200); 
   
      Assert.assertEquals("useTax test", 280.00, bike1.useTax(), .001);
      Assert.assertEquals("altUsetax test", 35.00, bike2.useTax(), .001);
      
   }
   
   /**
   *
   *Test of toString.
   *
   */
   
   @Test public void toStringTest() {
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
         14000, false, 750);
      Motorcycle bike2 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster", 14000, true, 200); 
   
      Assert.assertTrue("toString test", bike1.toString().contains("Bike"));
      Assert.assertTrue("altToString test", bike2.toString()
         .contains("Alternative"));
   }
   
   /**
   *
   *Test of get and reset count.
   *
   */
   
   @Test public void getResetCount() {
   
      Vehicle.resetVehicleCount();
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
         14000, false, 750);    
   
      Assert.assertEquals("count test", 1, Vehicle.getVehicleCount());
   
   
   }

}
