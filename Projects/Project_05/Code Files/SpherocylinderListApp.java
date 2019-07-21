import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

/**
*
*A class with a main method that reads in the name of a data file
*  and creates spherocylinder objects, and prints the objects.
*
*Project_05
*@author Tanner Bonds - COMP 1210
*@version 10-6-17
*
*/

public class SpherocylinderListApp {
 
 /**
 *
 *Creates and prints Spherocylinder objects.
 *
 *@param args Command line arguments - not used.
 *@throws FileNotFoundException for main method
 *
 */
 
 
   public static void main(String[] args) 
      throws FileNotFoundException {
            
      Scanner input = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String var = input.nextLine();
      System.out.println();
      
      Scanner scanFile = new Scanner(new File(var));
      ArrayList<Spherocylinder> aList = new ArrayList<Spherocylinder>();
      
   
      String title = scanFile.nextLine();
      String labelIn = "";
      double radiusIn = 0;
      double cylinderHeightIn = 0;
      
      while (scanFile.hasNext()) {
         
         labelIn = scanFile.nextLine();
         radiusIn = Double.parseDouble(scanFile.nextLine());
         cylinderHeightIn = Double.parseDouble(scanFile.nextLine());
         
         Spherocylinder sphc1 = new Spherocylinder(labelIn, 
               radiusIn, cylinderHeightIn);
               
         aList.add(sphc1);        
      }
      
      scanFile.close(); 
   
      SpherocylinderList sphcList = new SpherocylinderList(title, aList);
   
   
      
      
      System.out.println(sphcList.toString());
      System.out.print("\n" + sphcList.summaryInfo());
      System.out.println();
      
   } 
}