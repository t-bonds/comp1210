   /**
*
*An extension of the truck class which is an extension of the vehicle class.
*
*Project_09
*@author Tanner Bonds - COMP 1210
*@version 11-15-17
*
*/


public class SemiTractorTrailer extends Truck {
   
   //instance variables
   
   protected int axles;
   /**Constant for the per axle tax rate. */
   public static final double PER_AXLE_TAX_RATE = 0.005;
   
   //constructor
   
   /**
   *
   *Initializes fields.
   *
   *@param ownerIn used
   *@param yearMakeModelIn used
   *@param valueIn used
   *@param altFuelIn used
   *@param tonsIn used
   *@param axlesIn used
   *
   */
   
   public SemiTractorTrailer(String ownerIn, String yearMakeModelIn,
      double valueIn, boolean altFuelIn, double tonsIn, int axlesIn) {
      
      super(ownerIn, yearMakeModelIn, valueIn, altFuelIn, tonsIn);
      axles = axlesIn;
      
      
   }

   //methods

   /**
   *
   *Returns the number of axles.
   *
   *@return axles
   *
   */
   
   public int getAxles() {
   
      return axles;
   
   
   }
   
   /**
   *
   *Sets the axle field.
   *
   *@param axlesIn used
   *
   */
   
   public void setAxles(int axlesIn) {
   
      axles = axlesIn;
   
   
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
      
      tax = super.useTax() + (value * PER_AXLE_TAX_RATE * axles);
   
   
            
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
   
      return super.toString() + " Axle Tax Rate: "
                + (PER_AXLE_TAX_RATE * axles);
   
   
   
   
   }
   
   
}