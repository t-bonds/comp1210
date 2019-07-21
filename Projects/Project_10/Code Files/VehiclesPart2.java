import java.io.FileNotFoundException;
/**
*
*A class with the main method for the vehicle class.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 11-30-17
*
*/

public class VehiclesPart2 {

/**
*
*Main method for the vehicles class.
*
*@param args used
*@throws FileNotFoundException used
*
*/

   public static void main(String[] args) throws FileNotFoundException {
   
      
      UseTaxList vehicles = new UseTaxList();
      vehicles.readVehicleFile(args[0]);
      
      System.out.println(vehicles.summary());
      System.out.println("\n" + vehicles.listByOwner());
      System.out.println("\n" + vehicles.listByUseTax());
      System.out.println("\n" + vehicles.excludedRecordsList());
   
   
   }





}