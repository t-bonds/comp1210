
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
*
*A class that stores the name of of the list and 
*  an array of Spherocylinder objects.
*
*Project_07
*@author Tanner Bonds - COMP 1210
*@version 10-25-17
*
*/

public class SpherocylinderList2 {

   //instance variables
   /**
   *
   *Holds the name of the list and an array of Spherocylinder objects.
   *
   */
   private String title = "";
   private Spherocylinder[] aList;
   private int numElements;

   //constructor
   
   /**
   *
   *Takes in the String and Arraylist parameters.
   *
   *@param listNameIn Command line arguments  - not used
   *@param aListIn Command line arguments - not used
   *@param numElementsIn Command line arguments - not used
   */
   
   public SpherocylinderList2(String listNameIn, Spherocylinder[] aListIn, 
      int numElementsIn) {
   
      title = listNameIn;
      aList = aListIn;
      numElements = numElementsIn;      
   }

   //methods

   /**
   *
   *Returns the name of the list.
   *
   *@return getName
   *
   */

   public String getName() {
   
      return title;
   
   }

    /**
   *
   *Returns the number of sphercylinder objects in the list.
   *
   *@return numElements
   *
   */

   public int numberOfSpherocylinders() {
   
      return numElements;
   
   }

    /**
   *
   *Returns the total surface areas for all objects in the list.
   *
   *@return totalSurfaceArea
   *
   */

   public double totalSurfaceArea() {
   
   
      double surfaceArea = 0;
      if (numElements != 0) {
      
         int index = 0;
         while (index < numElements) {
            surfaceArea += aList[index].surfaceArea();
            index++;
         
         }         
      }
      
      else {
      
         surfaceArea = 0;
      
      }
      return surfaceArea;
   }
   
    /**
   *
   *Returns the total volume for all objects in the list.
   *
   *@return totalVolume
   *
   */

   public double totalVolume() {
   
      double volume = 0;
      if (numElements != 0) {
      
         int index = 0;
         while (index < numElements) {
            volume += aList[index].volume();
            index++;
         
         }         
      }
      
      else {
      
         volume = 0;
      
      }
      return volume;
   
   
   
   }

    /**
   *
   *Returns the average surface area of all objects in the list.
   *
   *@return averageSurfaceArea
   *
   */

   public double averageSurfaceArea() {
   
      double avgSurfaceArea = 0;
      if (numElements != 0) {
      
         avgSurfaceArea = totalSurfaceArea() / numElements;
      }
      else {
      
         avgSurfaceArea = 0;
      
      }
      return avgSurfaceArea;
   
   }
   
    /**
   *
   *Returns the average volume of all objects in the list.
   *
   *@return averageVolume
   *
   */

   public double averageVolume() {
   
      double avgVolume = 0;
      if (numElements != 0) {
      
         avgVolume = totalVolume() / numElements;
      }
      else {
      
         avgVolume = 0;
      
      }
      return avgVolume;
   
   
   }
   
    /**
   *
   *Returns a string containing the name of the list followed 
   *  by each spherocylinder in the list.
   *
   *@return toString
   *
   */

   public String toString() {
   
      String output = title + "\n";
      
      
      
      int index = 0;
      if (numElements != 0) {
         while (index < numElements) {
            output += "\n" + aList[index] + "\n";
            index++;
         }
      
      }
      
      else {
      
         output = output;
      
      }  
          
      return output;
   
   }
   
    /**
   *
   *Returns a string with various summary items.
   *
   *@return sumInfo
   *
   */
   
   public String summaryInfo() {
   
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
   
      String sumInfo = "----- Summary for " + title + " -----" 
         + "\nNumber of Spherocylinders: " + numElements 
         + "\nTotal Surface Area: " + df1.format(totalSurfaceArea())
         + "\nTotal Volume: " + df1.format(totalVolume())
         + "\nAverage Surface Area: " + df1.format(averageSurfaceArea())
         + "\nAverage Volume: " + df1.format(averageVolume());
      return sumInfo;
   
   
   }
   
   /**
   *
   *Returns the ArrayList of spherocylinder objects.
   *
   *@return aList
   *
   */
   
   public Spherocylinder[] getList() {
   
      return aList;
   
   
   }
   
   /**  
   * Reads in spherocylinder data from file and creates a 
   * SpherocylinderList object.
   *
   * @param var for var to read
   * @return SpherocylinderList
   * @throws FileNotFoundException if the file cannot be opened.
   */   

   
   public SpherocylinderList2 readFile(String var) 
                                       throws FileNotFoundException {
                                       
      Scanner scanFile = new Scanner(new File(var));
      title = scanFile.nextLine();
      String labelIn = "";
      double radiusIn = 0;
      double cylinderHeightIn = 0;
      
      while (scanFile.hasNext()) {
         
         labelIn = scanFile.nextLine();
         radiusIn = Double.parseDouble(scanFile.nextLine());
         cylinderHeightIn = Double.parseDouble(scanFile.nextLine());
         
         Spherocylinder sphc1 = new Spherocylinder(labelIn, 
               radiusIn, cylinderHeightIn);
               
         aList[numElements] = sphc1;
         numElements++;        
      }
      
      scanFile.close(); 
   
      SpherocylinderList2 sphcList = new SpherocylinderList2(title, 
                                          aList, numElements);
      
      return sphcList;                               
                                       
   }
   
   /**
   *
   *Takes parameters, creates a new Spherocylinder object,
   *  and then adds them to the list.
   *
   *@param labelIn takes label
   *@param radiusIn takes radius
   *@param cylinderHeightIn takes cylinder height
   *
   */
      
   
   public void addSpherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
      
      Spherocylinder sphc = new Spherocylinder(labelIn, 
                                       radiusIn, cylinderHeightIn); 
                                       
      aList[numElements] = sphc;
      numElements++;
                                       
      
      
   }
   
   
   /**
   *
   *Returns a spherocylinder object from a given label.
   *
   *@param labelIn reads in label
   *@return labelfind
   *
   */
   
   
   public Spherocylinder findSpherocylinder(String labelIn) {
   
      int index = -1;
      Spherocylinder labelFind = null;
   
      for (index = 0; index < numElements; index++) {
         if (aList[index].getLabel().equalsIgnoreCase(labelIn)) {
            labelFind = aList[index];
                 
            break;
         }      
      }
      return labelFind;
   }
   
   /**
   *
   *Deletes a spherocylinder object.
   *
   *@param labelIn reads in label
   *@return labelDelete
   *
   */
   
   
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      
      
      Spherocylinder labelDelete = null;
      for (int index = 0; index < numElements; index++) {
         if (aList[index].getLabel().equalsIgnoreCase(labelIn)) {
         
         
            labelDelete = aList[index];
            for (int j = index; j < numElements - 1; j++) {
            
               aList[j] = aList[j + 1];
            }
            
            aList[numElements - 1] = null;
            numElements--;
            break;
         }    
      }  
         
      return labelDelete;
   }
   
   
   /**
   *
   *Edits spherocylinder values.
   *
   *@param labelIn reads label
   *@param radiusIn reads radius
   *@param cylinderHeightIn reads cylinder height
   *@return editSpherocylinder
   *
   */
   
   
           
   public boolean editSpherocylinder(String labelIn, 
            double radiusIn, double cylinderHeightIn) {
      int index = -1;
      Spherocylinder labelEdit = null;
      for (index = 0; index < numElements; index++) {
         
         if (aList[index].getLabel().equalsIgnoreCase(labelIn)) {
                     
         
         
            labelEdit = aList[index];
            labelEdit.setRadius(radiusIn);
            labelEdit.setCylinderHeight(cylinderHeightIn);
            return true;
         }
      }
      return false;
   }   
   
}