import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

/**
*
*Test of the SemiTractorTrailer class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class SemiTractorTrailerTest {


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
   
   @Test public void getSetMethodsTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      semi1.setOwner("Bonds, Tanner");
      semi1.setYearMakeModel("2009 Toyota Tacoma");
      semi1.setValue(28000);
      semi1.setAlternativeFuel(true);
      semi1.setAxles(3);
      
      Assert.assertEquals("owner test", "Bonds, Tanner", semi1.getOwner());
      Assert.assertEquals("yearMakeModel test", "2009 Toyota Tacoma",
         semi1.getYearMakeModel());
      Assert.assertEquals("value test", 28000, semi1.getValue(), .001);
      Assert.assertEquals("altFuel test", true, semi1.getAlternativeFuel());
      Assert.assertEquals("axles test", 3, semi1.getAxles(), .001);
   }

   /**
   *
   *Test of useTax.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void useTaxTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertEquals("useTax test", 3_150.00, semi1.useTax(), 0.01);
   
   
   }

   /**
   *
   *Test of toString.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void toStringTest() throws NegativeValueException {
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
   
      Assert.assertTrue("semi1 test", semi1.toString().contains("Axle"));   
   
   
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
   
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Williams, Pat",
         "2012 International Big Boy", 45000, false, 5.0, 4);
              
      Assert.assertEquals("count test", 1, Vehicle.getVehicleCount());
   
   
   }


}
