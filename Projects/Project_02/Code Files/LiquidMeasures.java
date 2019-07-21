import java.util.Scanner;

/**
*
*A program that allows the user to enter 
*  an amount of liquid in ounces, which must not 
*  exceed 1 billion, and then displays the number 
*  of barrels, gallons, quarts, and ounces.
*
*Project_02
*@author Tanner Bonds - COMP 1210
*@version 9-7-17
*/

public class LiquidMeasures {

/**
   *calculates the numbers of barrels, gallons, quarts, and ounces 
   *  in the number of liquid ounces 
   *  entered by the user.
   *
   *@param args Command line arguments - not used.
   */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in); 
      
            
      
      
      //Prompt user to enter amount of liquid.
      System.out.print("Enter amount of liquid in ounces: ");
      int ounces = userInput.nextInt();
      int max = 1000000000;
      
      //Outputs amount of liquid.
      if (ounces <= max) {
      
         int barrels = ounces / 5376;
         int gallons = ounces % 5376 / 128;
         int quarts = ounces % 5376 % 128 / 32;
         int ouncesRemain = ounces % 5376 % 128 % 32;
      
         System.out.println("Measures by volume:");
         System.out.println("\tBarrels: " + barrels);
         System.out.println("\tGallons: " + gallons);
         System.out.println("\tQuarts: " + quarts);
         System.out.println("\tOunces: " + ouncesRemain);
         System.out.println(ounces + " oz = (" + barrels 
            + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + ("
            + quarts + " qt * 32 oz) + (" + ouncesRemain + " oz)");
      }
      
      
      
      //Returns user and ends program if too large a number is entered.
      else {
      
         System.out.println("Amount must not exceed 1,000,000,000.");
         return;
      
      }
   }
    
}