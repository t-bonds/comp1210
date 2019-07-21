import java.util.Scanner;

/**
*
*A program that calculates the base and slant height of a pyramid
*  and then calculates the area of the pyramid.
*
*Project_02
*@author Tanner Bonds - COMP 1210
*@version 9-7-17
*/

public class AreaOfPyramid {
   
   /**
   *
   *Determines the area of a pyramid given the base
   *  and slant height.
   *
   *@param args Command line arguments - not used
   */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      double base = 0;
      double slantHeight = 0;
      
      //Prompt user to enter values for pyramid.
      System.out.println("Enter values for base and slant "
         + "height of a pyramid.");
      
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      System.out.println();
      
      //formula for area of a 4-sided pyramid.
      double area = base * base + 4 * (base * slantHeight / 2);
      
      //Prints area of 4-sided pyramid.
      System.out.println("A pyramid with base = " + base 
         + " and slant height = " + slantHeight);
      System.out.println("has an area of " + area + " square units.");
   
   }
}