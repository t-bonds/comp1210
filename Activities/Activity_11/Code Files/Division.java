/**
*
*A program to handle and throw exceptions.
*
*Activity_11
*@author Tanner Bonds - COMP 1210
*@version 12-3-17
*
*/

public class Division {
   
   /**
   *
   *Returns the int of dividing the numerator by the denominator.
   *
   *@param num used
   *@param den used
   *@return intDivide
   *
   */
   
   public static int intDivide(int num, int den) {
   
      try {
      
         return num / den;
      
      }
      
      catch (ArithmeticException e) {
      
         return 0;
      
      }
   }
   
   
   /**
   *
   *Returns the result of dividing the numerator by the denominator.
   *
   *@param num used
   *@param den used
   *@return decimalDivide
   *
   */
   
   public static double decimalDivide(int num, int den) {
   
      if (den == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      }
   
   
      return (double) num / den;
   
   }
   
}