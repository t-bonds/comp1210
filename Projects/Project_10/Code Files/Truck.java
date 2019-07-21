/**
*
*An extension of the vehicle class.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 11-30-17
*
*/


public class Truck extends Vehicle {
   
   //instance variables
   
   protected double tons = 0;
   /**Constant value for tax rate. */
   public static final double TAX_RATE = 0.02;
   /**Constant value for alternative fuel tax rate. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
   /**Constant value for the truck threshold. */
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
   /**Constant value for the large truck tax rate. */
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;
   
   //constructor
   
   
      /**
   *
   *Initializes values.
   *
   *@param ownerIn used
   *@param yearMakeModelIn used
   *@param valueIn used
   *@param altFuelIn used
   *@param tonsIn used
   *
   */
   
   public Truck(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean altFuelIn, double tonsIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);
      tons = tonsIn;
      
   }
   
   //methods
   
   
   /**
   *
   *Returns a double representing the tons field.
   *
   *@return tons
   *
   */
   
   public double getTons() {
   
      
   
      return tons;
   
   
   }
   
   /**
   *
   *Sets the tons field.
   *
   *@param tonsIn used
   *
   */
   
   public void setTons(double tonsIn) {
   
      tons = tonsIn;
   
   
   }
   
   /**
   *
   *Calculates the tax value.
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
   
      
   
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
      
         tax = tax + (value * LARGE_TRUCK_TAX_RATE);
      
      
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
   
      
   
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
      
         output = super.toString() + fuel + " Large Truck Tax Rate: "
            + LARGE_TRUCK_TAX_RATE;
      
      
      }
      
      else {
      
         output = super.toString() + fuel;
      
      
      }
   
      return output;
   
   }      
   
   
   
   
   
}