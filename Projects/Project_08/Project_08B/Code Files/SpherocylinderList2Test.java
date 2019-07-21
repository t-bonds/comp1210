import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
/**
*
*Test cases for SpherocylinderList2.
*
*Project_08
*@author Tanner Bonds - COMP 1210
*@version 11-9-17
*
*/



public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   *
   *Test of getName.
   *
   */
   
   @Test public void getMethodsTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 3);
   
      Assert.assertEquals("getName test", "label", sphcList.getName());
      Assert.assertArrayEquals("getList test", aList, sphcList.getList());
   
   
   }

   /**
   *
   *Test of numberOfSpherocylinders.
   *
   */
   
   @Test public void numberOfSpherocylindersTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 3);
   
      Assert.assertEquals("numberOfSpherocylinders test", 3,
                         sphcList.numberOfSpherocylinders());
   
   
   }


   /**
   *
   *Test of totalSurfaceArea.
   *
   */
   
   @Test public void totalSurfaceAreaTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 2);
       
      Assert.assertEquals("totalSurfaceArea test",
         ((2 * Math.PI * 1) * ((2 * 1) + 2))
          + ((2 * Math.PI * 3) * ((2 * 3) + 4)),
         sphcList.totalSurfaceArea(), .001);
   
      
   
   }

   /**
   *
   *Test of totalSurfaceArea with null.
   *
   */

   @Test public void totalSurfaceAreaNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 0);
       
      Assert.assertEquals("totalSurfaceAreaNull test",
         0, sphcList.totalSurfaceArea(), .001);
   
   
   }
   

   /**
   *
   *Test of totalVolume.
   *
   */
   
   @Test public void totalVolumeTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList,
         0);
   
      Assert.assertEquals("totalVolume test", 0, sphcList.totalVolume(),
         .001);
   }

   /**
   *
   *Test of totalVolume with null.
   *
   */
   
   @Test public void totalVolumeNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 2);
   
      Assert.assertEquals("totalVolume test", (Math.PI * Math.pow(1, 2)  
          * (((4.0 / 3) * 1) + 2)) + (Math.PI * Math.pow(3, 2) 
          * (((4.0 / 3) * 3) + 4)), sphcList.totalVolume(), .001);
   }


   /**
   *
   *Test of averageSurfaceArea.
   *
   */
   
   @Test public void averageSurfaceAreaTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 2);
   
      Assert.assertEquals("averageSurfaceArea test",
             sphcList.totalSurfaceArea() / 2, sphcList.averageSurfaceArea(), 
             .001);
   
   
   }

   /**
   *
   *Test of averageSurfaceAreawith null.
   *
   */
   
   @Test public void averageSurfaceAreaNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 0);
   
      Assert.assertEquals("averageSurfaceAreaNull test",
             0, sphcList.averageSurfaceArea(), 
             .001);
   
   
   }

   /**
   *
   *Test of averageVolume.
   *
   */
   
   @Test public void averageVolumeTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 2);
   
      Assert.assertEquals("averageVolume test", 
         sphcList.totalVolume() / 2,
         sphcList.averageVolume(), .001);
   }

   /**
   *
   *Test of averageVolumewith null.
   *
   */
   
   @Test public void averageVolumeNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("Medium Example", 3, 4);
      aList[0] = sphc;
      aList[1] = sphc1;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 0);
   
      Assert.assertEquals("averageVolumeNull test", 
         0,
         sphcList.averageVolume(), .001);
   }

   /**
   *
   *Test of toString.
   *
   */

   @Test public void toStringTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      aList[0] = sphc;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 3);
   
      Assert.assertTrue("toString test", sphcList.toString()
         .contains("radius 1")); 
        
   
   }
   
   /**
   *
   *Test of toStringwith null.
   *
   */

   @Test public void toStringNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      aList[0] = sphc;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 0);
   
      Assert.assertTrue("toString test", sphcList.toString()
         .contains(""));      
   }


   /**
   *
   *Test of summaryInfo.
   *
   */

   @Test public void summaryInfoTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("Small Example", 1, 2);
      aList[0] = sphc;
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 1);
   
      Assert.assertTrue("summaryInfo test", sphcList.summaryInfo()
         .contains("Number of Spherocylinders: 1"));
   
   }

   /**
   *
   *Test of readFile.
   *
   *@throws IOException used
   *
   */
   
   @Test public void readFileTest() throws IOException {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      SpherocylinderList2 sphcList = new SpherocylinderList2("label", aList, 1);
   
      sphcList.readFile("spherocylinder_data_1.txt");
      Assert.assertEquals("readFile test", "Spherocylinder Test List",
         sphcList.getName());
   
   }

   /**
   *
   *Test of addSpherocylinder.
   *
   */
   
   @Test public void addSpherocylinderTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label", aList, 0);
      sphcList.addSpherocylinder("label1", 1, 2);
      Assert.assertEquals("addSpherocylinder test", 1, sphcList
         .numberOfSpherocylinders());
   
   
   }


   

   /**
   *
   *Test of findSpherocylinder.
   *
   */
   
   @Test public void findSpherocylinderTest() {
   
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label", aList, 3);
         
      Assert.assertEquals("finsSpherocylinder test", sphc2,
         sphcList.findSpherocylinder("label2"));
         
   
   }

   /**
   *
   *Test of findSpherocylinder with null.
   *
   */
   
   @Test public void findSpherocylinderNullTest() {
   
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label", aList, 0);
         
      Assert.assertEquals("findSpherocylinderNull test", null,
         sphcList.findSpherocylinder("label2"));
         
   
   }


   /**
   *
   *Test of deleteSpherocylinder.
   *
   */
   
   @Test public void deleteSpherocylinderTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label", aList, 3);
   
      sphcList.deleteSpherocylinder("label1");
   
      Assert.assertEquals("deleteSpherocylinder test", null, aList[2]);
   
   }

   /**
   *
   *Test of deleteSpherocylinderwith null.
   *
   */
   
   @Test public void deleteSpherocylinderNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      aList[0] = null;
      aList[1] = null;
      aList[2] = null;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label", aList, 0);
   
   
      
   
      Assert.assertEquals("deleteSpherocylinderNull test", null,
         sphcList.deleteSpherocylinder("label1"));
   
   }
      

   /**
   *
   *Test of editSpherocylinder.
   *
   */
   
   @Test public void editSpherocylinderTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 5, 6);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label1", aList, 3);
   
      sphcList.editSpherocylinder("label1", 3, 4);
   
      Assert.assertEquals("editSpherocylinder test", 3,
         aList[1].getRadius(), .001);
   }

    /**
   *
   *Test of editSpherocylinder with false.
   *
   */
   
   @Test public void editSpherocylinderFalseTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("label1", aList, 3);
   
   
      Assert.assertEquals("editSpherocylinderFalse test", false,
                  sphcList.editSpherocylinder("label5", 3, 4));
   }

   /**
   *
   *Test of findSpherocylinderWithShortestRadius.
   *
   */
   
   @Test public void findSpherocylinderWithShortestRadiusTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 3);
   
   
      Spherocylinder sphc3 = sphcList.findSpherocylinderWithShortestRadius();
   
   
      Assert.assertEquals("findSpherocylinderWithSmallestRadius test",
         sphc1, sphc3);
   
      
   }


   /**
   *
   *Test of findSpherocylinderWithLongestRadius.
   *
   */

   @Test public void findSpherocylinderWithLongestRadiusTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 5, 6);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 3);
         
      Spherocylinder sphc3 = sphcList.findSpherocylinderWithLongestRadius();
         
      Assert.assertEquals("findSpherocylinderWithLongestHeight test",
         sphc1, sphc3);
   
      
   
   
   
   }


   /**
   *
   *Test of findSpherocylinderWithSmallestVolume.
   *
   */
   
   @Test public void findSpherocylinderWithSmallestVolumeTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 3);
         
      Spherocylinder sphc3 = sphcList
         .findSpherocylinderWithSmallestVolume();
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolume test",
         sphc1, sphc3);
         
         
         
         
   }

   

   /**
   *
   *Test of findSpherocylinderWithLargestVolume.
   *
   */
   
   @Test public void findSpherocylinderWithLargestVolumeTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 5, 6);
      Spherocylinder sphc2 = new Spherocylinder("label2", 1, 2);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 3);
         
      Spherocylinder sphc3 = sphcList
         .findSpherocylinderWithLargestVolume();
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolume test",
         sphc1, sphc3);
         
   }

  /**
   *
   *Test of findSpherocylinderWithShortestRadius with null.
   *
   */
   
   @Test public void findSpherocylinderWithShortestRadiusNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("label1", 3, 4);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 0);
   
   
      Spherocylinder sphc3 = sphcList.findSpherocylinderWithShortestRadius();
   
   
      Assert.assertEquals("findSpherocylinderWithSmallestRadius test",
         null, sphc3);
   
      
   }

   /**
   *
   *Test of findSpherocylinderWithLongestRadius with null.
   *
   */

   @Test public void findSpherocylinderWithLongestRadiusNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 1, 2);
      Spherocylinder sphc1 = new Spherocylinder("label1", 3, 4);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 0);
         
      Spherocylinder sphc3 = sphcList.findSpherocylinderWithLongestRadius();
         
      Assert.assertEquals("findSpherocylinderWithLongestHeight test",
         null, sphc3);
   
      
   
   
   
   }

    /**
   *
   *Test of findSpherocylinderWithSmallestVolume with null.
   *
   */
   
   @Test public void findSpherocylinderWithSmallestVolumeNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 0);
         
      Spherocylinder sphc3 = sphcList
         .findSpherocylinderWithSmallestVolume();
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolume test",
         null, sphc3);
         
         
         
         
   }
   
   /**
   *
   *Test of findSpherocylinderWithLargestVolume with null.
   *
   */
   
   @Test public void findSpherocylinderWithLargestVolumeNullTest() {
   
      Spherocylinder[] aList = new Spherocylinder[20];
      Spherocylinder sphc = new Spherocylinder("label", 3, 4);
      Spherocylinder sphc1 = new Spherocylinder("label1", 1, 2);
      Spherocylinder sphc2 = new Spherocylinder("label2", 5, 6);
      aList[0] = sphc;
      aList[1] = sphc1;
      aList[2] = sphc2;
      SpherocylinderList2 sphcList = 
         new SpherocylinderList2("array", aList, 0);
         
      Spherocylinder sphc3 = sphcList
         .findSpherocylinderWithLargestVolume();
   
      Assert.assertEquals("findSpherocylinderWithSmallestVolume test",
         null, sphc3);
         
   }

   
}
