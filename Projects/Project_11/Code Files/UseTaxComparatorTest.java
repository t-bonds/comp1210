import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*
*Test case for the UseTaxComparator.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/


public class UseTaxComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*
*Test of UseTaxComparator.
*
*@throws NegativeValueException used
*
*/

   @Test public void comparatorTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      UseTaxList v1List = new UseTaxList();
      UseTaxList v2List = new UseTaxList();
   
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
      Car car1Test = new Car("Alan Battle", "2000 Toyota Avalon",
         10000, true);    
      Truck truck1Test = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         15000, false, 1.5);
   
      
      vList.addVehicle(carTest);
      vList.addVehicle(truckTest);
      
      v1List.addVehicle(carTest);
      v1List.addVehicle(car1Test);
      
      v2List.addVehicle(truckTest);
      v2List.addVehicle(truck1Test);
      
      
      Assert.assertTrue("UseTaxComparator test", vList.listByUseTax()
         .contains("Use Tax"));
      Assert.assertTrue("UseTaxComparator1 test", v1List.listByUseTax()
         .contains("Use Tax"));
      Assert.assertTrue("UseTaxComparator2 test", v2List.listByUseTax()
         .contains("Use Tax"));
   
   
   
   }


   
}
