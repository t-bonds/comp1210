/**
*
*A class that inherits from InventoryItem.
*
*Activity_10
*@author Tanner Bonds - COMP 1210.
*@version 11-25-17
*
*/

public class ElectronicsItem extends InventoryItem {

//instance variables

   protected double weight = 0;
   
   /**
   *
   *Constant variable SHIPPING_COST.
   *
   */
   public static final double SHIPPING_COST = 1.5;

//constructor

/**
*
*Initializes the variables.
*
*@param nameIn used
*@param priceIn used
*@param weightIn used
*
*/

   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
   
      super(nameIn, priceIn);
      weight = weightIn;
   
   
   }

   /**
   *
   *Overrides the caluclateCost method.
   *
   *@return calculateCost
   *
   */

   public double calculateCost() {
   
      return super.calculateCost() + (SHIPPING_COST * weight);
   
   
   }

   

}