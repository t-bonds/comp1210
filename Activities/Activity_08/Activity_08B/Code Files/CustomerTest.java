import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
*
*A jUnit test case of the Customer class.
*
*Activity_08B
*@author Tanner Bonds - COMP 1210
*@version 11-5-17
*
*/

public class CustomerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   *
   *A jUnit test of setLocation.
   *
   */

   @Test public void setLocationTest1() {
   
      Customer c = new Customer("Lane, Jane");
      c.setLocation("Boston, MA");
      Assert.assertEquals("Boston, MA", c.getLocation());
            
   }
   
   /**
   *
   *A second jUnit test of setLocation.
   *
   */
   
   @Test public void setLocationTest2() {
   
      Customer c = new Customer("Lane, Jane");
      c.setLocation("Atlanta, GA");
      Assert.assertEquals("Atlanta, GA", c.getLocation());
      
   }
   
   /**
   *
   *A jUnit test of changeBalance.
   *
   */
   
   @Test public void changeBalanceTest() {
   
      Customer c = new Customer("Lane, Jane");
      c.changeBalance(100);
      Assert.assertEquals(100, c.getBalance(), 0.000001);   
   }
   
   /**
   *
   *A jUnit test of toString.
   *
   */
   
   @Test public void toStringTest() {
   
      Customer c = new Customer("Lane, Jane");
      c.setLocation("Auburn, AL");
      c.changeBalance(999);
      Assert.assertEquals("Lane, Jane\nAuburn, AL\n$999.0", c.toString());   
   
   
   }
   
   /**
   *
   *A jUnit test of compareTo.
   *
   */
   
   @Test public void compareToTest1() {
   
      Customer c = new Customer("Lane, Jane");
      c.changeBalance(500);
   
      Customer c2 = new Customer("Lane, Lois");
      c2.changeBalance(500);
         
      Assert.assertTrue(c.compareTo(c2) == 0);
   
   
   }
   
   /**
   *
   *A second jUnit test of compareTo.
   *
   */


   @Test public void compareToTest2() {
   
      Customer c = new Customer("Lane, Jane");
      c.changeBalance(100);
   
      Customer c2 = new Customer("Lane, Lois");
      c2.changeBalance(500);
         
      Assert.assertTrue(c.compareTo(c2) < 0);
   
   
   
   }
   
   /**
   *
   *A third jUnit test of compareTo.
   *
   */


   @Test public void compareToTest3() {
   
      Customer c = new Customer("Lane, Jane");
      c.changeBalance(1000);
   
      Customer c2 = new Customer("Lane, Lois");
      c2.changeBalance(500);
         
      Assert.assertTrue(c.compareTo(c2) > 0);
   
   
   
   }



}
