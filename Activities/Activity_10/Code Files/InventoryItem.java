/**
*
*A program representing an inventory item in a store.
*
*
*Activity_10
*@author Tanner Bonds - COMP 1210
*@version 11-25-17
*
*/

public class InventoryItem {
   
   //instance variables
   
   protected String name = "";
   protected double price = 0;
   private static double taxRate = 0;
   
   
   //constructor
   
   /**
   *
   *Initializes values.
   *
   *@param nameIn used.
   *@param priceIn used.
   *
   */
   
   public InventoryItem(String nameIn, double priceIn) {
   
      price = priceIn;
      name = nameIn;
   
   
   }
   
   
   //methods
   
   /**
   *
   *Returns the customer name.
   *
   *@return getName
   *
   */
   
   public String getName() {
   
      return name;
   
   
   }
   
   /**
   *
   *Returns the price including tax.
   *
   *@return calculateCost
   *
   */
   
   public double calculateCost() {
   
      return price * (1 + taxRate);
   
   }
   
   
   
   /**
   *
   *Sets the tax rate.
   *
   *@param taxRateIn used
   *
   */
   
   public static void setTaxRate(double taxRateIn) {
   
      taxRate = taxRateIn;
   
   
   }
   
   /**
   *
   *Returns a string with name and price with tax.
   *
   *@return toString
   *
   */
   
   public String toString() {
   
      return name + ": $" + calculateCost();
   
   
   }
   
}