import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
*
*A class that stores the name of of the list and 
*  an ArrayList of Spherocylinder objects.
*
*Project_06
*@author Tanner Bonds - COMP 1210
*@version 10-18-17
*
*/

public class SpherocylinderList {

   //instance variables
   /**
   *
   *Holds the name of the list and an ArrayList of Spherocylinder objects.
   *
   */
   private String title = "";
   private ArrayList<Spherocylinder> aList = new ArrayList<Spherocylinder>();

   //constructor
   
   /**
   *
   *Takes in the String and Arraylist parameters.
   *
   *@param listNameIn Command line arguments  - not used
   *@param aListIn Command line arguments - not used
   *
   */
   
   public SpherocylinderList(String listNameIn, ArrayList<Spherocylinder> 
      aListIn) {
   
      title = listNameIn;
      aList = aListIn;
            
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
   *@return numberOfSpherocylinders
   *
   */

   public int numberOfSpherocylinders() {
   
      return aList.size();
   
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
      if (aList.size() != 0) {
      
         int index = 0;
         while (index < aList.size()) {
            surfaceArea += aList.get(index).surfaceArea();
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
      if (aList.size() != 0) {
      
         int index = 0;
         while (index < aList.size()) {
            volume += aList.get(index).volume();
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
      if (aList.size() != 0) {
      
         avgSurfaceArea = totalSurfaceArea() / aList.size();
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
      if (aList.size() != 0) {
      
         avgVolume = totalVolume() / aList.size();
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
      if (aList.size() != 0) {
         while (index < aList.size()) {
            output += "\n" + aList.get(index) + "\n";
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
         + "\nNumber of Spherocylinders: " + aList.size() 
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
   
   public ArrayList<Spherocylinder> getList() {
   
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

   
   public SpherocylinderList readFile(String var) 
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
               
         aList.add(sphc1);        
      }
      
      scanFile.close(); 
   
      SpherocylinderList sphcList = new SpherocylinderList(title, aList);
      
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
                                       
      aList.add(sphc);                                 
      
      
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
   
      for (Spherocylinder sphc : aList) {
         if (sphc.getLabel().equalsIgnoreCase(labelIn)) {
            index = aList.indexOf(sphc);
         
            break;
         }
      }
      if (index >= 0) {
         labelFind = aList.get(index);
            
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
      
      int index = -1;
      Spherocylinder labelDelete = null;
      for (Spherocylinder sphc : aList) {
         if (sphc.getLabel().equalsIgnoreCase(labelIn)) {
            index = aList.indexOf(sphc);
            break;
         }
      }
      if (index >= 0) {
         labelDelete = aList.get(index);
         aList.remove(index);
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
      for (Spherocylinder sphc : aList) {
         
         if (sphc.getLabel().equalsIgnoreCase(labelIn)) {
            index = aList.indexOf(sphc);
            break;
         }
      }
      
      if (index >= 0) {
         labelEdit = aList.get(index);
         labelEdit.setRadius(radiusIn);
         labelEdit.setCylinderHeight(cylinderHeightIn);
         return true;
      }
      return false;
   }   
}