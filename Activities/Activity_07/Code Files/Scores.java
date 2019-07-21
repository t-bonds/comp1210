/**
*
*A program that holds an array of numerical values and provides methods
*  that allow users to interact with the program.
*
*Activity_07
*@author Tanner Bonds - COMP 1210
*@version 10-21-17
*
*/

public class Scores {
 
   //instance variables
   
   private int[] numbers;
   
   //constructor
   
   
   
   /**
   *
   *Initalizes the variables.
   *
   *@param numbersIn used
   *
   */
   
   public Scores(int[] numbersIn) {
   
   
      numbers = numbersIn;
   
   }
   
   
   /**
   *
   *Returns an array of ints (evens).
   *
   *@return findEvens
   *
   */
   
   public int[] findEvens() {
   
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
   
      return evens;
   
   
   }
 
 
   /**
   *
   *Returns an array of ints (odds).
   *
   *@return findOdds
   *
   */
 
   public int[] findOdds() {
   
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
   
      return odds;
   
   
   
   }
 
 
   /**
   *
   *Returns the average of all scores.
   *
   *@return calculateAverage
   *
   */
 
   public double calculateAverage() {
   
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum = numbers[i];
      }
      
   
      return (double) sum / numbers.length;
   
   }
 
  /**
  *
  *Returns a string containing all scores.
  *
  *@return toString
  *
  */
 
   public String toString() {
   
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
      
         result += numbers[i] + "\t";
      
      }
   
   
      return result;
   
   }
   
   /**
   *
   *Returns a string containing all scores in reverse order.
   *
   *@return toStringInReverse
   *
   */
   
   public String toStringInReverse() {
   
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
      
         result += numbers[i] + "\t";
      
      
      
      }
   
   
      return result;
   
   }
 
}