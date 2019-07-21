import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class Triangle2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** Equalateral test 1. **/
   @Test public void equilateralTest() {
   
      Triangle2 t1 = new Triangle2(10, 10, 10);
   
      Assert.assertEquals("For sides 10, 10, 10: ", 
                           "equilateral", t1.getClassification());
   }
   
   @Test public void isocelesTest() {
      Triangle2 t = new Triangle2(5, 7, 5);
      
      Assert.assertEquals("Testing for isoceles with sides 5, 7, 5. ",
                           "isosceles", t.getClassification());
   }
   
   @Test public void scaleneAfterSetTest() {
      Triangle2 t = new Triangle2(5, 7, 5);
      t.setSides(3, 4, 5);
      Assert.assertEquals("scalene",t.getClassification());
   }  



//    /** A test that always fails. **/
   // @Test public void defaultTest() {
   // 
      // Assert.assertEquals("Default test added by jGRASP. Delete "
         //    + "this test once you have added your own.", 0, 1);
   // }
   
}
