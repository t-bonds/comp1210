import javax.swing.JOptionPane;

/**
*
*A main method to get a numerator and a denominator from the user.
*
*Activity_11
*@author Tanner Bonds - COMP 1210
*@version 12-3-17
*
*/

public class DivisionDriver {

/**
*Main method.
*
*@param args not used
*
*/

   public static void main(String[] args) {
   
      String numInput = JOptionPane.showInputDialog("Enter the numerator:");
      String denInput = JOptionPane.showInputDialog("Enter the denominator:");
   
      try {
      
         int num = Integer.parseInt(numInput);
         int den = Integer.parseInt(denInput);
      
         String result = "Integer division: \n"
               + Division.intDivide(num, den)
               + "\n\nFloating point division: \n"
               + Division.decimalDivide(num, den);
               
         JOptionPane.showMessageDialog(null, result, "Result",
            JOptionPane.PLAIN_MESSAGE);              
      } 
      
      catch (NumberFormatException e) {
      
         JOptionPane.showMessageDialog(null,
            "Invalid input: enter numerical integer values only.",
            "Error", JOptionPane.ERROR_MESSAGE);
      
      }
      
      catch (IllegalArgumentException e) {
      
         JOptionPane.showMessageDialog(null, 
            e, "Error", JOptionPane.ERROR_MESSAGE);
      
      
      }
   }




}