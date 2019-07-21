   /**
*
*An extension of the vehicle class.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 11-30-17
*
*/


public class Motorcycle extends Vehicle {
   
   //instance variables
   
   protected double size;
   /**COnstant for Tax rate. */
   public static final double TAX_RATE = 0.005;
   /**Constant for alternative fuel tax rate. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   /**Constant for large bike threshold. */
   public static final double LARGE_BIKE_CC_THRESHOLD = 499; 
   /**Constant for large bike tax rate. */
   public static final double LARGE_BIKE_TAX_RATE = .015;
   
   
   //constuctor
   
   /**
   *
   *Initializes fields.
   *
   *@param ownerIn used
*@param yearMakeModelIn used
*@param valueIn used
*@param altFuelIn used
*@param sizeIn used
*
*/

   public Motorcycle(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean altFuelIn, double sizeIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
      size = sizeIn;
      
   }

   
   /**
   *
   *Returns the engine size.
   *
   *@return size
   *
   */
   
   public double getEngineSize() {
   
      return size;
   
   
   }
   
   /**
   *
   *Sets the size field.
   *
   *@param sizeIn used
   *
   */
   
   public void setEngineSize(double sizeIn) {
   
      size = sizeIn;
   
   
   }
   
   /**
   *
   *Returns a double representing total tax use.
   *
   *@return tax
   *
   */
   
   public double useTax() {
   
      double tax = 0;
      
   
      if (altFuel) {
      
         tax = value * ALTERNATIVE_FUEL_TAX_RATE;
      
      }
      
      else {
      
         tax = value * TAX_RATE;
      
      }
   
      if (size > LARGE_BIKE_CC_THRESHOLD) {
      
         tax = tax + (value * LARGE_BIKE_TAX_RATE);
      
      
      }
      
      else {
      
         tax = tax;
      
      
      }
   
      return tax;
   
   }

   /**
   *
   *Returns a string summary.
   *
   *@return toString
   *
   */
   
   public String toString() {
   
               
      String output = "";
      double fuel = 0;
      if (altFuel) {
      
         fuel =  ALTERNATIVE_FUEL_TAX_RATE;
      
      }
      
      else {
      
         fuel = TAX_RATE;
      
      }
   
      
   
      if (size > LARGE_BIKE_CC_THRESHOLD) {
      
         output = super.toString() + fuel + " Large Bike Tax Rate: "
            + LARGE_BIKE_TAX_RATE;
      
      
      }
      
      else {
      
         output = super.toString() + fuel;
      
      
      }
   
      return output;
   
   }      
   
   
   
   
}