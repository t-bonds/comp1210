/**
*
*An extension of the vehicle class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class Car extends Vehicle {

//instance variables

/**
*
*Final constants.
*
*/

   /**Constant for Tax Rate. */
   public static final double TAX_RATE = 0.01;
   /**Constant for Alternative fuel tax rate. */
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   /**Constant for the Luxury Threshold. */
   public static final double LUXURY_THRESHOLD = 50_000;
   /**Constant for the Luxury Tax Rate. */
   public static final double LUXURY_TAX_RATE = 0.02;

//constructor


   /**
   *
   *Initializes values.
   *
   *@param ownerIn used
   *@param yearMakeModelIn used
   *@param valueIn used
   *@param altFuelIn used
   *@throws NegativeValueException used
   *
   */

   public Car(String ownerIn, String yearMakeModelIn, double valueIn,
      boolean altFuelIn) throws NegativeValueException {
      
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn);  
      
   }

   //methods

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
   
      if (value > LUXURY_THRESHOLD) {
      
         tax = tax + (value * LUXURY_TAX_RATE);
      
      
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
   *@return output
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
   
      
   
      if (value > LUXURY_THRESHOLD) {
      
         output = super.toString() + fuel + " Luxury Tax Rate: "
            + LUXURY_TAX_RATE;
      
      
      }
      
      else {
      
         output = super.toString() + fuel;
      
      
      }
   
      return output;
   
   }      








}