/**
*
*A class that holds a main method for inventoryItem.
*
*Activity_10
*@author Tanner Bonds - COMP 1210
*@version 11-25-17
*
*/


public class InventoryListApp {
     
     /**
     *
     *A main method.
     *
     *@param args not used
     *
     */
    
   public static void main(String[] args) {
      
      ItemsList myItems = new ItemsList();
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
      
      
      
   }
     
     
     
     
     
     
}