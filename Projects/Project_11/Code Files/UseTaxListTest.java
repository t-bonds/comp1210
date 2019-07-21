import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
*
*Test case for UseTaxList.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/



public class UseTaxListTest {


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
   
      
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
      String[] exclude = new String[0];
      
      vList.addVehicle(carTest);
      
                
             
      vList.setTaxDistrict("Tax District 48");
    
      Assert.assertEquals("taxDistrict test", "Tax District 48",
         vList.getTaxDistrict());
    
      Assert.assertEquals("getVehicleList test", carTest,
         vList.getVehicleList()[0]);
      Assert.assertArrayEquals("getExcludedRecords test", exclude,
         vList.getExcludedRecords()); 
   }

  /**
  *
  *Test of readVehicleFile.
  *
  *@throws FileNotFoundException used
  *@throws NegativeValueException used
  *
  */
  
   @Test public void readVehicleFileTest() throws FileNotFoundException {
   
      UseTaxList vList = new UseTaxList();
      vList.readVehicleFile("vehicles2.txt");
   
      Assert.assertTrue("readVehicleFile test",
         vList.listByOwner().contains("Honda"));
   
   
   } 

   /**
   *
   *Test of addVehicle.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void addVehicleTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      
      vList.addVehicle(carTest);
   
      Assert.assertEquals("addVehicle test", carTest,
         vList.getVehicleList()[0]);
   
   }

   /**
   *
   *Test of addExcludedRecord.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void addExcludedRecordTest() {
   
      UseTaxList vList = new UseTaxList();
      String[] exclude = new String[0];
      
   
      Assert.assertArrayEquals("addExcludedRecords test", exclude,
         vList.getExcludedRecords());
   
   
   }

   /**
   *
   *Test of toString.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void toStringTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      vList.addVehicle(carTest);
      
      Assert.assertTrue("toString test", vList.toString().contains("Toyota"));
   
   }

   /**
   *
   *Test of Summary.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void summaryTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
   
      Assert.assertTrue("summary test", vList.summary().contains("Number"));
   
   }

   /**
   *
   *Test of calculateTotalUseTax.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void calculateTotalUseTaxTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
      
      vList.addVehicle(carTest);
      vList.addVehicle(truckTest);
   
   
      Assert.assertEquals("calculateTotalUseTax test", 290,
         vList.calculateTotalUseTax(), .001);
   
   }

   /**
   *
   *Test of calculateTotalValue.
   *
   *@throws NegativeValueException used
   *
   */
   
   @Test public void calculateTotalValueTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
         
      vList.addVehicle(carTest);
      vList.addVehicle(truckTest);
   
   
      Assert.assertEquals("calculateTotalValue test", 22000,
         vList.calculateTotalValue(), .001);
   
   }

 /**
 *
 *Test of listByOwner.
 *
 *@throws NegativeValueException used
 *
 */
 
   @Test public void listByOwnerTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
   
      vList.addVehicle(carTest);
      vList.addVehicle(truckTest);
   
      Assert.assertTrue("listByOwner test", vList.listByOwner()
         .contains("Owner"));
   
   }

/**
*
*Test of listByUseTax.
*
*@throws NegativeValueException used
*
*/

   @Test public void listByUsetaxTest() throws NegativeValueException {
   
      UseTaxList vList = new UseTaxList();
      Car carTest = new Car("Alan Battle", "2000 Toyota Avalon", 10000, true);
      Truck truckTest = new Truck("Tanner Bonds", "2009 Toyota Tacoma",
         12000, false, 1.5);
   
      vList.addVehicle(carTest);
      vList.addVehicle(truckTest);
   
      Assert.assertTrue("listByUseTax test", vList.listByUseTax()
         .contains("Tax"));
   
   }

   /**Test of excludedRecordsList.*/
   @Test public void excludedRecordsListTest() {
   
      UseTaxList vList = new UseTaxList();
      vList.addExcludedRecord("Firetruck");
      
      Assert.assertTrue("excludedRecordsList test", vList.excludedRecordsList()
         .contains("Excluded"));
   
   }

}
