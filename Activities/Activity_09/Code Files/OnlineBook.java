/**
*
*A class that represents an online book.
*
*Activity_09
*@author Tanner Bonds - COMP 1210
*@version 11-12-17
*
*/


public class OnlineBook extends OnlineTextItem {
   
   //instance variables
   protected String author;
   
   
   
   //constructor
   
   /**
   *
   *Initializes values.
   *
   *@param nameIn used
   *@param priceIn used
   *
   */
   
   public OnlineBook(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      author = "Author Not Listed";
   
   }
   
   /**
   *
   *Sets the author.
   *
   *@param authorIn used
   *
   */
   
   public void setAuthor(String authorIn) {
   
      author = authorIn;
   
   
   } 
   
   
   /**
   *
   *Overrides the toString method.
   *
   *@return toString
   *
   */
   
   public String toString() {
   
      return name + " - " + author + ": $" + super.calculateCost();
   
   
   }     
}