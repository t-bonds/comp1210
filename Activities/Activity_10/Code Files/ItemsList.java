/**
*
*A class that holds an array of InventoryItem objects.
*
*Activity_10
*@author Tanner Bonds - COMP 1210
*@version 11-25-17
*
*/


public class ItemsList {
   
   //instance variables
   
   private InventoryItem[] inventory;
   private int count;
   
   
   
   //constructor
   
   /**
   *
   *Initializes values.
   *
   */
   
   public ItemsList() {
   
      inventory = new InventoryItem[20];
      count = 0;
   
   
   }
   
   //methods
   
   /**
   *
   *Adds an item.
   *
   *@param itemIn used
   *
   */
   
   public void addItem(InventoryItem itemIn) {
   
      inventory[count] = itemIn;
      count++;
      
      
   }
   
   /**
   *
   *Calculates the total.
   *
   *@param electronicsSurcharge used
   *@return calculateTotal
   *
   */
   
   public double calculateTotal(double electronicsSurcharge) {
   
      double total = 0;
      for (int i = 0; i < count; i++) {
      
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         
         }
         else {
         
            total += inventory[i].calculateCost();
         
         }
      
      }
      return total;
   
   }
   /**
   *
   *Creates a string output.
   *
   *@return output
   *
   */
   
   public String toString() {
   
      String output = "All inventory:\n\n";
   
      for (int i = 0; i < count; i++) {
         output += inventory[i] + "\n";
      }
   
      return output;
   
   
   
   }
   
   
   
}