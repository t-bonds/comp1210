import java.util.Scanner;
import java.text.DecimalFormat;
/**
*
*A program that calculates an expression for a value 
*  x of type double that is inputed from the keyboard,
*  and saves the result of the expression as type double.
*
*Project_03
*@author Tanner Bonds - COMP 1210
*@version 9-19-17
*/

public class ExpressionEvaluator {
 
 /**Computes the value generated by a
 *   specified expression. 
 *
 *@param args Command line arguments - not used
 */
   
   public static void main(String[] args) {
      
      //variables
      Scanner userInput = new Scanner(System.in);
      double var = 0;
      
         
      DecimalFormat deci = new DecimalFormat("#,##0.0####");
      
       
   
      //prompt user for value
      System.out.print("Enter a value for x: ");
      var = userInput.nextDouble();
      
      //expression
      double result = Math.sqrt(Math.abs(23.7 * Math.pow(var, 9)) - var)
         / (7.3 * Math.pow(var, 2) + (5.2 * var) + 3.1); 
   
      //Double to string conversion
      String result1 = Double.toString(result);
      int resultLeft = result1.indexOf(".");
      int resultRight = result1.length() - resultLeft - 1;
      
      //outputs
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: " 
         + resultLeft);
      System.out.println("# digits to right of decimal point: "
         + resultRight);   
      System.out.println("Formatted Result: " + deci.format(result)); 
   
   
   
   
   
   }  
}