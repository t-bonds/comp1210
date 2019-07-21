import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*Test of the Motorcycle class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
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
   *@throws NegativeValueException used
   *
   */
   
   @Test public void getSetMethodsTest() throws NegativeValueException {
   
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
   *@throws NegativeValueException used
   *
   */
   
   @Test public void useTaxTest() throws NegativeValueException {
   
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
   *@throws NegativeValueException used
   *
   */
   
   @Test public void toStringTest() throws NegativeValueException {
   
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
   *@throws NegativeValueException used
   *
   */
   
   @Test public void getResetCount() throws NegativeValueException  {
   
      Vehicle.resetVehicleCount();
   
      Motorcycle bike1 = new Motorcycle("Brando, Marlon",
         "1964 Harley-Davidson Sportster",
         14000, false, 750);    
   
      Assert.assertEquals("count test", 1, Vehicle.getVehicleCount());
   
   
   }

}
