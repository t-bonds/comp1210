import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*
*Test case for vehiclesPart2.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 12-1-17
*
*/


public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *
   *A test of the main method.
   *@throws FileNotFoundException used
   *
   */
   @Test public void mainTest() throws FileNotFoundException {
   
      VehiclesPart2 vPart2Obj = new VehiclesPart2(); // test constructor
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"};
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   
   
   }


}
