import java.io.FileNotFoundException;
/**
*
*A class with the main method for the vehicle class.
*
*Project_11
*@author Tanner Bonds - COMP 1210
*@version 12-7-17
*
*/

public class VehiclesPart3 {

/**
*
*Main method for the vehicles class.
*
*@param args used
*@throws FileNotFoundException used
*
*/

   public static void main(String[] args) {
   
      try {
      
         if (args.length == 0) {
         
            System.out.println("*** File name not provided " 
               + "by command line argument.\nProgram ending.");
         
         }
         
         else {
         
         
            UseTaxList vehicles = new UseTaxList();
            vehicles.readVehicleFile(args[0]);
         
            System.out.println(vehicles.summary());
            System.out.println("\n" + vehicles.listByOwner());
            System.out.println("\n" + vehicles.listByUseTax());
            System.out.println("\n" + vehicles.excludedRecordsList());
         }
      }
      
               
      catch (FileNotFoundException e) {
      
         System.out.println("*** File not found.\nProgram ending.");
      
      
      } 
   
   
   }
}