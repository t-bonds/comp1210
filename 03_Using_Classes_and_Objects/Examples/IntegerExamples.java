
/**
 * Shows differences between "int" and "Integer"
 * variables.
 */
public class IntegerExamples
{
 /**
  * Declare and initialize "int" and "Integer" 
  * variables. Set a breakpoint on first executable
  * statement, then examine variables as you 
  * step through main.
  *
  * @param args Command-line arguments (unused).   
  */
   public static void main(String[] args)
   {
      int i1 = 1; 
      int i2 = i1;
      int i3 = i2;
   
      Integer n1 = 1;
      Integer n2 = n1; 
      Integer n3 = n2;
   	
      i1 = 3;
      n1 = 3;
      n1 = 1;
      n1 = 3;
   }
}
