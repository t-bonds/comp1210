
public class Rectangle  
		implements TwoDShape, Comparable<Rectangle>
{
   private double width, height;  
   
   public Rectangle(double widthIn, double heightIn) 
   {
      width = widthIn;
      height = heightIn;    
   }

   public boolean isSquare() {  
      return width == height;
   } 
   
   public double getArea() {
      return width * height;
   }
   
   public int getNumberSides() {
      return 4;
   }
   
   public double getPerimeter() {
      return width * 2 + height * 2;
   }
   
   public int compareTo(Rectangle other) {   
     // Consider using an if-else statement.
     // Consider the optional use of the this reference.
   
      //if (this.getArea() < ((Rectangle) other).getArea()) {
      if (this.getArea() < other.getArea()) {
         return -1; 
      }
      else if (this.getArea() == other.getArea()) {
         return 0;
      }
      else {
         return 1;
      }
      
     // Consider providing result with a value based on the
     // difference btween the two areas accurate to 4 decimal places.
      
      //return (int) ((this.getArea() - other.getArea()) * 10000);
   }
  
   public String toString() {  
      String output = "Rectangle Information:\r\n"
         + "   Width: " + width + "\r\n"
         + "   Height: " + height + "\r\n";
      if (isSquare()) {
         output += "   (Square)\r\n";
      }
      return output; 
   } 
}
