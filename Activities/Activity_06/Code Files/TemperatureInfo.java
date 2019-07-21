import java.util.Scanner;
import java.util.ArrayList;

/**
*
*A class with a main method that allows users to interact 
*  with the tempeerature class.
*
*Acivity_06
*@author Tanner Bonds - COMP 1210 
*@version 10-15-17
*
*/


public class TemperatureInfo {
   
   /**
   *
   *Allows for user interface with the temperatures class.
   *
   *@param args Command line arguments - not used
   *
   */
   
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = input.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
            
         }
      } while (!tempInput.equals(""));
         
      Temperatures temps = new Temperatures(tempsList);
      
      
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, " 
            + "[P]rint, [E]nds: ");
         choice = input.nextLine().toUpperCase().charAt(0);
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
               
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
               
            case 'P':
               System.out.println(temps);
               break;
               
            case 'E':
               System.out.println("\tDone");
               break;
               
            default:
               System.out.println("\tInvalid choice:");
               
         }
               
      } while (choice != 'E');         
                  
         
      
   }
   
}