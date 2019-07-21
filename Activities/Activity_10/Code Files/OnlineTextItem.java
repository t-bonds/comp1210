/**
*
*A class that represents an online text item.
*
*Activity_10
*@author Tanner Bonds - COMP 1210
*@version 11-25-17
*
*/

public abstract class OnlineTextItem extends InventoryItem {

//constructor

/**
*
*Initializes values.
*
*@param nameIn used
*@param priceIn used
*
*/


   public OnlineTextItem(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
   
   
   }

/**
*
*Overrides the calculateCost method.
*
*@return price
*
*/

   public double calculateCost() {
   
      return price;
   
   
   }


}