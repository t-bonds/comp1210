import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
*
*A jUnit test of the NegativeValueException class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-8-17
*
*/


public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

/**
*
*Test of the NegativeValueException method.
*
*@throws NegativeValueException used
*
*/
         
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
   
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false);
      }
          
      catch (NegativeValueException e) { 
      
         thrown = true;
      
      }
      
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
         thrown);       
   }



   
}
