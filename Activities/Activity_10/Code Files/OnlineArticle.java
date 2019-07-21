/**
*
*A class that represents an online article.
*
*Activity_10
*@author Tanner Bonds - COMP 1210
*@version 11-25-17
*
*/


public class OnlineArticle extends OnlineTextItem {
   
   //instance variables
   private int wordCount;
   
   
   
   //constructor
   
   /**
   *
   *Initializes values.
   *
   *@param nameIn used
   *@param priceIn used
   *
   */
   
   public OnlineArticle(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      wordCount = 0;
   
   }
   
   /**
   *
   *Sets the word count.
   *
   *@param wordCountIn used
   *
   */
   
   public void setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
   
   
   }
   
}