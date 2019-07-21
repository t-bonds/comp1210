import java.util.Comparator;

/**
*
*Implements the comparator interface for vehicle objects.
*
*Project_10
*@author Tanner Bonds - COMP 1210
*@version 11-30-17
*
*/

public class UseTaxComparator implements Comparator<Vehicle> {


/**
*
*Defines the ordering from lowest to highest based on the use tax.
*
*@return compare
*@param v1 used
*@param v2 used
*
*/

   public int compare(Vehicle v1, Vehicle v2) {
   
      if (v1.useTax() > v2.useTax()) {
      
         return 1;
           
      } 
      else if (v1.useTax() < v2.useTax()) {
         return -1;
         
      }
      
      return 0;
      
   }


}



