import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
*
*A program that accepts coded ticket information to the moon and back as 
*  input that includes the date, time, category, price, 
*  and seat, followed by the description of the travel.
*  The program then outputs ticket information such as price
*  and seat number.
*
*
*Project_03
*@author Tanner Bonds - COMP 1210
*@version 9-19-17
*/

public class MoonTrip {

   static final double STUDENT_DISCOUNT = .40;
   static final double EMPLOYEE_DISCOUNT = .20;

/** 
*Reads data for a ticket to a destination 
*   in space and then interprets and prints the 
*   formatted ticket information.
*
*@param args Command line arguments - not used
*/

   public static void main(String[] args) {
   
   
      //constructors
      Scanner ticketInput = new Scanner(System.in);
      Random rand = new Random();
      DecimalFormat df1 = new DecimalFormat("$###,###.00");
      DecimalFormat df2 = new DecimalFormat("0000");
      
      //prompt user for ticket
      System.out.print("Enter ticket code: ");
      String ticket1 = ticketInput.nextLine();
      String ticket = ticket1.trim();
      
      //prints error and ends run if character is less than 26.
      int ticketValue = ticket.length();
      
      
      if (ticketValue < 26) {
      
         System.out.println("*** Invalid ticket code ***");
         System.out.println("Ticket code must have at least 26 characters.");
         return;
      }
        
      //ticket info   
      else {
      
         //substring values
         double cost = 0;
         String date = ticket.substring(0, 8);
         String time = ticket.substring(8, 12);
         char category = ticket.charAt(12);
         String price = ticket.substring(13, 22);
         String seat = ticket.substring(22, 25);
         String itinerary = ticket.substring(25);
         int prize = rand.nextInt(9999) + 1;
         
         
         //string to double
         double priceValue = Double.parseDouble(price);
         double priceValue1 = priceValue / 100; 
         if (category == 's') {
         
         
            cost = (priceValue - (priceValue * STUDENT_DISCOUNT)) / 100;
         
         }
         
         else if (category == 'e') {
         
            cost = (priceValue - (priceValue * EMPLOYEE_DISCOUNT)) / 100;
         
         }
         
         else {
         
            cost = priceValue / 100;
            
         
         }
         
         //further substrings
         String date1 = date.substring(0, 2);
         String date2 = date.substring(2, 4);
         String date3 = date.substring(4, 8);
         String time1 = time.substring(0, 2);
         String time2 = time.substring(2, 4);
         
         //ticket output
         System.out.println();
         System.out.print("Date: " + date1 + "/" + date2 
            + "/" + date3);
         System.out.print("   Time: " + time1 + ":" + time2);
         System.out.println("   Seat: " + seat);
         System.out.println("Itinerary: " + itinerary);
         System.out.print("Price: " + df1.format(priceValue1));
         System.out.print("   Category: " + category);
         System.out.println("   Cost: " + df1.format(cost));
         System.out.println("Prize Number: " + df2.format(prize));
         
                  
      }   
   }
}