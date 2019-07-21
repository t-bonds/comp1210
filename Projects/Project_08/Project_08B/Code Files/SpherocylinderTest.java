import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
*Test cases for Spherocylinder.
*
*Project_08
*@author Tanner Bonds - COMP 1210
*@version 11-9-17
*
*/


public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**
   *
   *Test of circumference().
   *
   */

   @Test public void circumferenceTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
                              
      Assert.assertEquals("circumference test", 2 * Math.PI * 10.8,
                           sphc1.circumference(), .001);             
   
   
   }
   
   /**
   *
   *Test of surfaceArea().
   *
   */
   
   @Test public void surfaceAreaTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
   
      Assert.assertEquals("surface area test", (2 * Math.PI * 10.8) 
                        * (2 * 10.8 + 10.1), sphc1.surfaceArea(), .001);
                        
                                          
   }
   
   /**
   *
   *Test of volume().
   *
   */
   
   @Test public void volumeTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
                              
      Assert.assertEquals("volume test", Math.PI * Math.pow(10.8, 2) 
         * (((4.0 / 3) * 10.8) + 10.1), sphc1.volume(), .001);
         
   }
                           
   /**
   *
   *Test of toString().
   *
   */
     
   @Test public void toStringTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
      
      Assert.assertTrue("toString test", sphc1.toString()
         .contains("\"Medium Example\" with radius 10.8 and "
          + "cylinder height 10.1"));
   
   
   }   

   /**
   *
   *Test of getCount().
   *
   */   


   @Test public void getCountTest() {
   
      
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
      sphc1.resetCount();
                                
      Assert.assertEquals("getCount test", 0, sphc1.getCount());
   
   
   }

   /**
   *
   *Test of setCount().
   *
   */
   
   @Test public void resetCountTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
      sphc1.resetCount();
      Assert.assertEquals("resetCount test", 0, sphc1.getCount());
   
   
   }

   /**
   *
   *Test of equals().
   *
   */
   
   @Test public void equalsTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
                              
      String falseEquals = "";
      Spherocylinder sphc2 = sphc1;
      Assert.assertTrue("equals test", sphc1.equals(sphc2));
      Assert.assertFalse("equals test", sphc1.equals(falseEquals));
      
      Spherocylinder sphc3 = new Spherocylinder("label1", 10, 12);
      Assert.assertEquals("equals false test", false, sphc1.equals(sphc3));
      
      Spherocylinder sphc4 = new Spherocylinder("Medium Example", 10, 12);
      Assert.assertEquals("equals false test", false, sphc1.equals(sphc4));
      
      Spherocylinder sphc5 = new Spherocylinder("Medium Example", 10.8, 12);
      Assert.assertEquals("equals false test", false, sphc1.equals(sphc5));
   
      
   }


   /**
   *
   *Test of hashCode().
   *
   */
   
   @Test public void hashCodeTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
      Assert.assertEquals("hashCode test", 0, sphc1.hashCode());
   
   
   }
   
   
   
   /**
   *
   *Test of all "get" methods.
   *
   */
   
   @Test public void getMethodsTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
   
      Assert.assertEquals("getLabel test", "Medium Example", sphc1.getLabel());
         
      Assert.assertEquals("getRadius test", 10.8, sphc1.getRadius(), .001);
         
      Assert.assertEquals("getCylinderHeight test", 10.1,
             sphc1.getCylinderHeight(), .001);
             
   }
   
   
   /**
   *
   *Test of all "set methods.
   *
   */
   
   @Test public void setMethodsTest() {
   
      Spherocylinder sphc1 = new Spherocylinder("Medium Example",
                              10.8, 10.1);
   
      Assert.assertTrue("setLabel test", sphc1.setLabel("label"));
      Assert.assertFalse("setLabel test", sphc1.setLabel(null));
      
      Assert.assertTrue("setRadius test", sphc1.setRadius(1));
      Assert.assertFalse("setRadius test", sphc1.setRadius(-1));
      
      Assert.assertTrue("setCylinderHeight test", sphc1.setCylinderHeight(1));
      Assert.assertFalse("setCylinderHeight test", sphc1.setCylinderHeight(-1));
   
   
   
   }
   
}
