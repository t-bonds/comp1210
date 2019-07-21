/**
*
*A program which holds an integer value and provides 
*  methods to perform various operations on that value.
*
*Activity_05
*@author Tanner Bonds
@version 10-2-17
*
*/
   
         
public class NumberOperations {
   
   //instance variables
   
   /**
   *
   *Holds the private variable number.
   */

   private int number;
   
   
   
   //constructor
   
   /**
   *
   *Takes the int parameter called numberIn.
   *
   *@param numberIn is taken in.
   *
   */
   
   public NumberOperations(int numberIn) {
   
      number = numberIn;
   
   }
   
   /**
   *
   *Returns an int value.
   *
   *@return getValue
   *
   */

   public int getValue() {
   
      return number;
   
   }
   
   
   /**
   *
   *Returns the string oddsUnder.
   *
   *@return oddsUnder
   *
   */

   
   public String oddsUnder() {
   
      String output = "";
      
      
      int i = 0;
      while (i < number) {
      
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
   /**
   *
   *returns the string powersTwoUnder.
   *
   *@return powersTwoUnder
   *
   */

   public String powersTwoUnder() {
   
      String output = "";
      int powers = 1;
      
      while (powers < number) {
      
         output += powers + "\t";
         powers = powers * 2;
      
      }
      return output;
   }
   
   /**
   *
   *Takes the int parameter compareNumber and returns an int.
   *
   *@param compareNumber is taken in.
   *@return isGreater
   *
   */

   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
         return 1;
      }
         
      else if (number < compareNumber) {
         return -1;
      }
         
      else {
         return 0;
         
      }      
   
   }
   
   /**
   *
   *Returns a string.
   *
   *@return toString
   *
   */

   public String toString() {
   
      return number + "";
   
   }
}