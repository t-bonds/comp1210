import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*Test of the Truck class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/


public class TruckTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*
*Test of get and set methods.
*
*@throws NegativeValueException used
*
*/

   @Test public void getSetMethods() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
   
   
      truck1.setOwner("Bonds, Tanner");
      truck1.setYearMakeModel("2009 Toyota Tacoma");
      truck1.setValue(28000);
      truck1.setAlternativeFuel(true);
      truck1.setTons(1.0);
      
      Assert.assertEquals("owner test", "Bonds, Tanner", truck1.getOwner());
      Assert.assertEquals("yearMakeModel test", "2009 Toyota Tacoma",
         truck1.getYearMakeModel());
      Assert.assertEquals("value test", 28000, truck1.getValue(), .001);
      Assert.assertEquals("altFuel test", true, truck1.getAlternativeFuel());
      Assert.assertEquals("tons test", 1.0, truck1.getTons(), .001);
   
   
   }


   /**
   *
   *Test of useTax.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void useTaxTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
         40000, true, 2.5);
   
      Assert.assertEquals("useTax test", 600.00, truck1.useTax(), 0.01);
      Assert.assertEquals("altFueltax test", 1_600.00, truck2.useTax(), 0.01);
       
      
   
   
   }
   
   /**
   *
   *Test of toString.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void toStringTest() throws NegativeValueException {
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
      Truck truck2 = new Truck("Williams, Sam", "2010 Chevy Mack",
          40000, true, 2.5);         
   
      Assert.assertTrue("truck1 test", truck1.toString().contains("2012"));   
      Assert.assertTrue("truck2 test", truck2.toString()
         .contains("Alternative"));
   }
   
   
   /**
   *
   *Test of get and reset count.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void getResetCount() throws NegativeValueException {
   
      Vehicle.resetVehicleCount();
   
      Truck truck1 = new Truck("Williams, Jo", "2012 Chevy Silverado",
         30000, false, 1.5);
   
   
      Assert.assertEquals("count test", 1, Vehicle.getVehicleCount());
   
   
   }

}
