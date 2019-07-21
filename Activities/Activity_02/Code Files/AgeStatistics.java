import java.util.Scanner;

/**
*A program that displays someone's name,age and gender,
*  along with calculations for age in minutes and centuries
*  as well as max heart rate based on age and gender.
*
*Activity_02
@author Tanner Bonds - COMP 1210
@version 8-2-17
*/

public class AgeStatistics {
   
   /**
   *A program to to display and run calculations
   *on someones name, age and gender.
   *
   *@param args Command line arguments - not used
   */
   
   public static void main(String[] args) {
   
      Scanner userInput = new Scanner(System.in);
      String name = " ";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
   
      //Prompt the user for their name.
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
   
      //Prompt the user for their age.
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      //Prompt the user for their gender.
      System.out.print("Enter your gender (1 for female "
         + "and 0 for male): ");
      gender = userInput.nextInt();
      
      //convert age
      System.out.println("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
         
      System.out.println("\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      
      //display max heart rate
      System.out.print("Your max heart rate is ");
         
      if (gender == 1) {
         
         //display female MHR
         maxHeartRate = 209 - 0.7 * ageInYears;
         
      }
         
      else {
         
         //display male MHR
         maxHeartRate = 214 - 0.8 * ageInYears;
         
      }
         
      System.out.println(maxHeartRate + " beats per minute.");
             
   }
   
}