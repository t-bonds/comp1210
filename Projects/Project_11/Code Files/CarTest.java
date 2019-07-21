import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*jUnit test of the Car class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class CarTest {


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
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      car1.setOwner("Bonds, Tanner");
      car1.setYearMakeModel("2009 Toyota Tacoma");
      car1.setValue(28000);
      car1.setAlternativeFuel(true);
      
      Assert.assertEquals("owner test", "Bonds, Tanner", car1.getOwner());
      Assert.assertEquals("yearMakeModel test", "2009 Toyota Tacoma",
         car1.getYearMakeModel());
      Assert.assertEquals("value test", 28000, car1.getValue(), .001);
      Assert.assertEquals("altFuel test", true, car1.getAlternativeFuel()); 
   }

   /**
   *
   *Test of useTax.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void useTaxTest() throws NegativeValueException {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);         
   
      Assert.assertEquals("useTax test", 220.00, car1.useTax(), 0.01);
      Assert.assertEquals("altFueltax test", 110.00, car2.useTax(), 0.01);
      Assert.assertEquals("luxuryTax test", 3_300.00, car3.useTax(), 0.01);
   }


   /**
   *
   *Test of toString.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void toStringTest() throws NegativeValueException {
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      Car car3 = new Car("Smith, Pat", "2015 Mercedes-Benz Coupe",
         110000, false);
      Car car4 = new Car("Smith, Jack", "2015 Mercedes-Benz Coupe",
         110000, true);         
   
      Assert.assertTrue("car1 test", car1.toString().contains("2017"));   
      Assert.assertTrue("car2 test", car2.toString().contains("Alternative"));
      Assert.assertTrue("car3 test", car3.toString().contains("Luxury"));
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
   
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
   
      Assert.assertEquals("count test", 1, Vehicle.getVehicleCount());
   
   
   }


   /**
   *
   *Test of equals method.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void equalsTest() throws NegativeValueException {
   
      Car c1 = new Car("Tanner Bonds", "2009 Toyota Tacoma", 22000, false);
      Car c2 = new Car("Tanner Bonds", "2009 Toyota Tacoma", 22000, false);
      Car c3 = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      
   
      Assert.assertTrue("c1c2 test", c1.equals(c2));
      Assert.assertFalse("c1c3 test", c1.equals(c3));
      Assert.assertEquals("hashcode test", c1.hashCode(), c2.hashCode());
      Assert.assertFalse("instanceOf test", c3.equals("string"));
   }

}
