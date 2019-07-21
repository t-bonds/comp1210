/**
 * Represents a polygon with a specified number of sides
 * lengths. The polygon is classified based on its number of sides.
 */
public class Polygon {
   
   private double[] sideLengths;

   public Polygon(double[] sidesIn) {
      setSides(sidesIn); 
   }
   
   public void setSides(double[] sidesIn) {  
      sideLengths = sidesIn != null ? sidesIn : sideLengths;
   }

   public double[] getSides() {  
      return sideLengths;
      //return java.util.Arrays.copyOf(sideLengths, sideLengths.length);
   }
   
   public String toString() {
      switch (sideLengths.length) {
         case 0: case 1: case 2:
            return "non-polygon";
         case 3:
            return "triangle";
         case 4:
            //return "rectangle";
            return "quadralateral";
         case 5:
            return "pentagon";
         case 6:
            return "hexagon";
         case 7:
            return "heptagon";
         case 8:
            return "octagon";
         default:
            return "n-gon";
      }   
   }   
   
   boolean deleteSide(double x) {
      
      for (int i = 0; i < sideLengths.length; i++) {
         if (x == sideLengths[i]) {
            for (int j = i; j < sideLengths.length - 1; j++) {
               sideLengths[i] = sideLengths[i + 1];
            }
            double[] newSideLengths = 
               java.util.Arrays.copyOf(sideLengths, sideLengths.length - 1);
            sideLengths = newSideLengths;
            return true;
         }
      }
      return false;
   }
}
