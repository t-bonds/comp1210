import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*
*A jUnit test of the VehiclesPart3 class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-8-17
*
*/


public class VehiclesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**Test of main method.*/


   @Test public void mainTest() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles2.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   
   
   }

   /**Test of main method with bad file.*/
   @Test public void main1Test() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles.txt"};
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   
   
   }

   /**test of main method with no file.*/
   @Test public void main2Test() {
   
      VehiclesPart3 vPart3Obj = new VehiclesPart3(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {};
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   
   
   }


}
