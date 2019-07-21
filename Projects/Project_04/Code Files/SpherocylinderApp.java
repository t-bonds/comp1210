import java.util.Scanner;

/**
*
*A class with a main method that reads in values for radius,
*  label, and cylinder height, creates a Spherocylinder object,
*   and then prints the object.
*
*Project_04
*@author Tanner Bonds - COMP 1210
*@version 9-26-17
*/

public class SpherocylinderApp {

   /**
   *
   *Reads in values and prints a spherocylinder object.
   *
   *@param args Command line arguments - not used.
   *
   */
   
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter label, radius, and cylinder height "
         + "for a spherocylinder. ");
        
      String labelIn = "";
      double radiusIn = 0;
      double cylinderHeightIn = 0;
       
      
                  
      System.out.print("\tlabel: ");
      labelIn = input.nextLine();
      System.out.print("\tradius: ");
      radiusIn = input.nextDouble();
               
      
      if (radiusIn < 0) { 
      
         System.out.println("Error: radius must be non-negative.");
      
      }
      
               
      else {
         System.out.print("\tcylinder height: ");
         cylinderHeightIn = input.nextDouble();
      
      
      
         if  (cylinderHeightIn < 0)    {
         
            System.out.println("Error: cylinder height must be non-negative.");
         
         }
            
         else {   
         
         
            Spherocylinder spch1 = new Spherocylinder(labelIn, 
               radiusIn, cylinderHeightIn);
            System.out.println("\n" + spch1);
         }
      }
   
   }





}