import java.util.ArrayList;

/**
*
*A class holding a set of integers representing daily temperatures.
*
*Activity_06
*@author Tanner Bonds - COMP 1210
*@version 10-15-17
*
*/

public class Temperatures {
   
      //instance variables
      
      /**
      *
      *Initializes the private variable Temperatures.
      *
      */
   
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
     
     
     //constructor
     
     /**
     *
     *Takes an ArrayList of integer values.
     *
     *@param temperaturesIn sets to temperature
     */
     
   public Temperatures(ArrayList<Integer> temperaturesIn) {
     
      temperatures = temperaturesIn;
     
   }
     
     //methods
    
    /**
    *
    * returns the lowest temperature value.
    *
    *@return getLowTemp
    *
    */
     
   public int getLowTemp() {
     
      if (temperatures.isEmpty()) {
         return 0;
      }
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
     
     /**
     *
     *Returns the highest temperature.
     *
     *@return getHighTemp
     *
     */
     
   public int getHighTemp() {
     
      if (temperatures.isEmpty()) {
         return 0;
      }
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   
     
     
   }
     
     /**
     *
     *Iterates through the list to find the lowest temperature.
     *
     *@return lowerMinimum
     *@param lowIn command line arguments not used
     *
     */
     
   public int lowerMinimum(int lowIn) {
     
     
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
     
   }
     
     /**
     *
     *Iterates through the list to find the highest temperature.
     *
     *@return higherMaximum
     *@param highIn command line arguments not used
     */
     
     
   public int higherMaximum(int highIn) {
     
      return highIn > getHighTemp() ? highIn : getHighTemp();
     
     
   }
   
      /**
      *
      *Returns a string value.
      *
      *@return toString
      *
      */
   
   public String toString() {
      
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
      
      
   }
   
   
}