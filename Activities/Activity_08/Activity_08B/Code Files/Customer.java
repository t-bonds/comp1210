/**
*
*A program to study and practice the use of implement interfaces
*  and overload methods.
*
*Activity_08B
*@author Tanner Bonds - COMP 1210
*@version 11-5-17
*
*/

public class Customer implements Comparable<Customer> {
   
   //instance variables
   
   private String name;
   private String location;
   private double balance;
   
   //constructor
   
   /**
   *
   *Sets the variables.
   *
   *@param nameIn used
   *
   */
   
   public Customer(String nameIn) {
   
      name = nameIn;
      location = "";
      balance = 0;
   
   
   }
   
   
   //methods
   
   /**
   *
   *Sets the location of the customer.
   *
   *@param locationIn used
   *
   */
   
   
   public void setLocation(String locationIn) {
   
      location = locationIn;
   
   
   }
   
   /**
   *
   *A second setLocation method for overload.
   *
   *@param city used
   *@param state used
   *
   */
   
   public void setLocation(String city, String state) {
   
      location = city + ", " + state;
   
   
   }
   
   /**
   *
   *Changes the customer's balance.
   *
   *@param amount used
   *
   */
   
   public void changeBalance(double amount) {
   
   
      balance += amount;
   
   
   }
   
   /**
   *
   *Gets the location of the user.
   *
   *@return location
   *
   */
   
   public String getLocation() {
   
   
      return location;
   
   }
   
   
   /**
   *
   *Gets the balance of the user.
   *
   *@return balance
   *
   */
   
   public double getBalance() {
   
   
      return balance;
   
   }
   
   /**
   *
   *Returns a toString method.
   *
   *@return toString
   *
   */
   
   
   public String toString() {
   
      String output = name + "\n" 
                    + getLocation() + "\n" 
                    + "$" + getBalance();
   
      return output;
   } 
   
   /**
   *
   *Compares an object of this class to another compatible object.
   *
   *@param obj used
   *@return compareTo
   *
   */
   
   public int compareTo(Customer obj) {
   
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      }   
      
      else if (this.balance < obj.getBalance()) {
      
         return -1;
      
      }
      
      else {
      
         return 1;
      
      }
   }
   
}