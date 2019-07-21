import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
*
*Presetns the user with a manu that allows for eight options.
*
*Project_06
*@author Tanner Bonds - COMP 1210
*@version 10-18-17
*
*/
public class SpherocylinderListMenuApp {

/**
 * 
 *A menu for interacting with the Spherocylinder classes.
 *
 *@param args - is not used.
 *@throws FileNotFoundException if the file cannot be opened.
 */
 
   public static void main(String[] args) throws FileNotFoundException {
   
      String aListName = "no list name";
      ArrayList<Spherocylinder> aList = new ArrayList<Spherocylinder>();
      SpherocylinderList sphcList = new SpherocylinderList(aListName, aList);
      String fileName = "no file name";
      
      double radiusIn, cylinderHeightIn;   
      String labelIn = "";
      String code = "";
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Spherocylinder List System Menu\n"
                       + "R - Read File and Create Spherocylinder List\n"
                       + "P - Print Spherocylinder List\n" 
                       + "S - Print Summary\n"    
                       + "A - Add Spherocylinder\n"
                       + "D - Delete Spherocylinder\n"
                       + "F - Find Spherocylinder\n"
                       + "E - Edit Spherocylinder\n"
                       + "Q - Quit");
                       
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         code = input.nextLine();
         if (code.length() == 0) {
            continue;
         
         }
         code = code.toUpperCase();
         char codeChar = code.charAt(0);
         switch(codeChar) {
            case 'R': 
               System.out.print("\tFile name: ");
               fileName = input.nextLine();
            
               sphcList = sphcList.readFile(fileName);
            
               System.out.println("\tFile read in and "
                              + "Spherocylinder List created\n");
               break; 
                    
            case 'P': 
               System.out.println("\n" + sphcList);
               break;
              
            case 'S':
               System.out.println("\n" + sphcList.summaryInfo() + "\n");
               break;   
                              
            case 'A': 
               System.out.print("\tLabel: ");
               labelIn = input.nextLine();
               System.out.print("\tRadius: ");
               radiusIn = Double.parseDouble(input.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeightIn = Double.parseDouble(input.nextLine());
            
               sphcList.addSpherocylinder(labelIn, radiusIn, cylinderHeightIn);
               System.out.println("\t*** Spherocylinder added ***\n");
               break;   
               
            case 'D': 
               System.out.print("\tLabel: ");
               labelIn = input.nextLine();
                              
               if (sphcList.deleteSpherocylinder(labelIn) == null) {
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
               else {
                  System.out.println("\t\"" + labelIn + "\" deleted\n");
               }
               break; 
               
            case 'F':
               System.out.print("\tLabel: ");
               labelIn = input.nextLine();
               
               if (sphcList.findSpherocylinder(labelIn) == null) {
               
                  System.out.println("\t\"" + labelIn + "\" not found\n");
               }
                  
               else {
                  System.out.println(sphcList.findSpherocylinder(labelIn)
                     .toString() 
                     + "\n");
                  
               }
                  
               break;
             
            case 'E':
               System.out.print("\tLabel: ");
               labelIn = input.nextLine();
               System.out.print("\tRadius: ");
               radiusIn = Double.parseDouble(input.nextLine());
               System.out.print("\tCylinder Height: ");
               cylinderHeightIn = Double.parseDouble(input.nextLine());
               
               if (sphcList.findSpherocylinder(labelIn) == null) {
               
                  System.out.println("\t\"" + labelIn + "\" not found");
               }
                 
               else {
                 
                  sphcList.editSpherocylinder(labelIn,
                              radiusIn, cylinderHeightIn);
                  System.out.println("\t\"" + labelIn + "\" successfully " 
                     + "edited\n");
               }
               break;    
                  
            case 'Q': 
               break;
               
            default:
               System.out.println("\t*** invalid code ***");  
               break; 
         }
      
      } while (!code.equalsIgnoreCase("Q"));   
      
   
   
   
   
   
   
   
   
   
   }
}