/**
*
*A class to extend the Exception class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class NegativeValueException extends Exception {
   
      /**
      *
      *Initializes values.
      *
      */
      
   public NegativeValueException() {
      
      super("Numeric values must be nonnegative ");
      
      
   }
   
   
}