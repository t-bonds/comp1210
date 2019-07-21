import java.text.DecimalFormat;

/**
*
*A class that defines spherocylinder objects.
*
*Project_06
*@author Tanner Bonds - COMP 1210
*@version 10-18-17
*
*/

   

public class Spherocylinder {
   
   /**
   *
   *initialization values for variables.
   *
   *@param args Command line arguments - not used
   *
   */

   // instance variables
   
   private String label = "";
   private double radius = 0;
   private double cylinderHeight = 0;
   
   // constructor
   /**
   *
   *Creates an instance of Spherocylinder
   *  and initializes the fields.
   *
   *@param labelIn Command line arguments - not used
   *@param radiusIn Command line arguments - not used
   *@param cylinderHeightIn Command line arguments - not used
   */

   public Spherocylinder(String labelIn, double radiusIn, 
      double cylinderHeightIn) {
   
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylinderHeightIn);
   }
  
  //methods
  
   /**
   *
   *Returns the string "label".
   *
   *@return label
   *
   */
   
   public String getLabel() {
   
      return label; 
       
   }
   
   /**
   *
   *Returns a false boolean value if the string value is "null". 
   *
   *@return isSetLabel
   *@param labelIn Command line arguments - not used
   *
   */
   
   public boolean setLabel(String labelIn) {
      boolean isSetLabel = false;
      if (labelIn == null) {
      
         
         return isSetLabel;
      
      }
      
      else {
      
         label = labelIn.trim();
         isSetLabel = true;
         return isSetLabel;
      
      }
   
   }
   
   /**
   *
   *Returns the value of the radius.
   *
   *@return radius
   *@param radiusIn
   *
   */
   
   
   public double getRadius() {
   
      return radius;
   
   }
   
   
   /**
   *
   *Returns a false boolean value if the radius is a negative number. 
   *
   *@param radiusIn Command line arguments - not used
   *@return isSetRadius
   *
   */

   
   public boolean setRadius(double radiusIn) {
      boolean isSetRadius = false;
      if (radiusIn < 0) {
         
         return isSetRadius;
      }
      
      else {
      
         radius = radiusIn;
         isSetRadius = true;
         return isSetRadius;
      }
   
      
   }
   
   /**
   *
   *Returns the value of cylinderHeight. 
   *
   *@return cylinderHeight
   *
   */

   
   public double getCylinderHeight() {
   
      return cylinderHeight;
   
   }
   
   /**
   *
   *Returns a false boolean value if the cylinder height is a negative number. 
   *
   *@return isSetCylinderHeight
   *@param cylinderHeightIn Command line arguments - not used
   *
   */

   
   public boolean setCylinderHeight(double cylinderHeightIn) {
   
      boolean isSetCylinderHeight = false;
      if (cylinderHeightIn < 0) {
      
         
         return isSetCylinderHeight;
         
      }
      
      else {
      
         cylinderHeight = cylinderHeightIn;
         isSetCylinderHeight = true;
         return isSetCylinderHeight;
      
      }
      
   }
   
   /**
   *
   *Computes and returns the circumference.
   *
   *@return circumference
   *
   */

   
   public double circumference() {
   
      return 2 * Math.PI * radius;
      
   }
   
   /**
   *
   *Computes and returns the surface area.
   *
   *@return surfaceArea
   *
   */

   
   public double surfaceArea() {
   
      return circumference()  
         * (2 * radius + cylinderHeight);
      
   }
   
   /**
   *
   *Computes and returns the volume.
   *
   *@return volume
   *
   */

   
   public double volume() {
   
      return Math.PI * Math.pow(radius, 2) 
         * (((4.0 / 3) * radius) + cylinderHeight);
      
   }
   
   
   
   /**
   *
   *Returns the final string output.
   *
   *@return output
   *
   */

   
   public String toString() {
   
      DecimalFormat df1 = new DecimalFormat("#,##0.0##");
   
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + cylinderHeight + " has: "
         + "\n\tcircumference = " + df1.format(circumference()) + " units"
         + "\n\tsurface area = " + df1.format(surfaceArea()) + " square units" 
         + "\n\tvolume = " + df1.format(volume()) + " cubic units"; 
        
   
      return output;
   }
}