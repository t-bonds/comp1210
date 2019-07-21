/**
*
*A program containing two classes, with which the second class
*   contains a main method that uses the first class.
*
*Activity_04A
*@author Tanner Bonds - COMP 1210
*@version 9-22-17
*
*/ 

public class UserInfo {

/**
*
*initialization values for variables.
*
*@param args Command line arguments - not used
*
*/

// instance variables

   private String firstName = "";
   private String lastName = "";
   private String location = "";
   private int age = 0;
   private int status = 0;
   private static final int OFFLINE = 0, ONLINE = 1;
   
   
         
   // constructor
/**
   *
   *Creates an instance of UserInfo
   *  and initializes the fields.
   *
   *@param firstNameIn Command line arguments - not used
   *@param lastNameIn Command line arguments - not used
   *
   */

   
   public UserInfo(String firstNameIn, String lastNameIn) {
   
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   
   }

// methods 

   /**
   *
   *Returns a string representation of the object.
   *
   *@return toString
   *
   */


   public String toString() {
   
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      
      output += "Location: " + location + "\n"; 
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
      
         output += "Offline";
      
      }
      
      else {
      
         output += "Online";
      
      }
        
      return output;
   }

        
   /**
   *Sets the location of the user.
   *
   *@param locationIn Command line arguments - not used
   *
   */
   
   public void setLocation(String locationIn) {
   
   
      location = locationIn;
   
   }
   
  /**
  *
  *Sets the age of the user.
  *
  *@param ageIn Command line arguments - not used
  *@return isSet
  */ 
   
   public boolean setAge(int ageIn) {
   
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true; 
      }
      return isSet;
   }
   
  /**
  *
  *Returns the age of the user.
  *
  *@return Age Command line arguments - not used
  *
  */  
      
   
   public int getAge() {
   
      return age;
   
   }
   
   /**
  *
  *Returns the age of the user.
  *
  *@return location Command line arguments - not used
  *
  */ 
   
   
   public String getLocation() {
   
      return location;
      
   }
   
   /**
  *
  *Sets status of user as offline.
  *
  *Command line arguments - not used
  *
  */ 
   
   
   public void logOff() {
   
      status = OFFLINE;
   
   }
   
   /**
  *
  *Sets status of user as online.
  *
  *Command line arguments - not used
  *
  */ 
   
   
   public void logOn() {
   
      status = ONLINE;
   
   }
}

