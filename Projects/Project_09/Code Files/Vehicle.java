import java.text.DecimalFormat;

/**
*
*An abstract class that stores vehicle data
* and provides methods to access the data.
*
*Project_09
*@author Tanner Bonds - COMP 1210
*@version 11-15-17
*
*/

public abstract class Vehicle {
   
   //instance variables
   
   protected String owner;
   protected String yearMakeModel;
   protected double value;
   protected boolean altFuel;
   private static int vehicleCount;
   
   
   //constructor
   
   /**
   *
   *Initializes values.
   *
   *@param ownerIn used
   *@param yearMakeModelIn used
   *@param valueIn used
   *@param altFuelIn used
   *
   */
   
   public Vehicle(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean altFuelIn) {
      
      owner = ownerIn;
      yearMakeModel = yearMakeModelIn;
      value = valueIn;
      altFuel = altFuelIn;
      vehicleCount = 0;
      
      vehicleCount++;
   }
   
   //methods
   
   /**
   *
   *Returns a string representing the vehicle's owner.
   *
   *@return owner
   *
   */
   
   public String getOwner() {
   
      return owner;
   
   
   }
   
   
   /**
   *
   *Sets the field representing the owner.
   *
   *@param ownerIn used
   *
   */
   
   public void setOwner(String ownerIn) {
   
      owner = ownerIn;
   
   
   }
   
   /**
   *
   *Returns a string representing the yearMakeModel variable.
   *
   *@return yearMakeModel
   *
   */
   
   public String getYearMakeModel() {
   
      return yearMakeModel;
   
   
   
   }
   
   /**
   *
   *
   *Sets the field representing the yearMakeModel value.
   *
   *@param yearMakeModelIn used
   *
   */
   
   public void setYearMakeModel(String yearMakeModelIn) {
   
      yearMakeModel = yearMakeModelIn;
   
   }
   
   /**
   *
   *Returns the value of the vehicle.
   *
   *@return value
   *
   */
   
   public double getValue() {
   
      return value;
   
   
   }
   
   
   /**
   *
   *Sets the field representing value.
   *
   *@param valueIn used
   *
   */
   
   public void setValue(double valueIn) {
   
      value = valueIn;
   
   
   }
   
  /**
  *
  *Returns a boolean representing the altFuel field.
  *
  *@return altFuel
  *
  */
  
   public boolean getAlternativeFuel() {
   
      return altFuel;
   
   
   } 
  
  /**
  *
  *Sets the field representing the altFuel.
  *
  *@param altFuelIn used
  *
  */
  
  
   public void setAlternativeFuel(boolean altFuelIn) {
   
      altFuel = altFuelIn;
   
   
   }
  
  /**
  *
  *Returns an int representing the count.
  *
  *@return vehicleCount
  *
  */
  
   public static int getVehicleCount() {
   
      return vehicleCount;
   
   
   }
  
  
  /**
  *
  *Sets vehicleCount to 0.
  *
  */
  
   public static void resetVehicleCount() {
   
      vehicleCount = 0;
   
   
   }
  
  /**
  *
  *Represents the total amount for the vehicles use tax, will be overriden.
  *
  *@return nothing
  */
  
   public abstract double useTax();
   
   /**
   *
   *Returns a sting describing the vehicle.
   *
   *@return toString
   *
   */
   
   
   public String toString() {
   
      DecimalFormat df = new DecimalFormat("$#,##0.00");
   
      String alt = "";
   
      if (altFuel) {
      
         alt = " (Alternative Fuel) ";
      
      }
      
      else {
      
         alt = alt;
      
      }
   
   
      return getOwner() + ": " + this.getClass().getName() + " "
         + getYearMakeModel() + alt 
         + "\nValue: " + df.format(getValue()) + " Use Tax: "
         + df.format(useTax()) + "\nwith Tax Rate: ";
         
   
   
   } 
   
   
   
   
}