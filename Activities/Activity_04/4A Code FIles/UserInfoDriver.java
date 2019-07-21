/**
*
*A Program with a class and method that uses a 
*  class within another file.
*
*Activity_04A
*@author Tanner Bonds - COMP 1210
*@version 9-22-17
*
*/

public class UserInfoDriver {

/**
*
*A method containing two instances of UserInfo.
*
*@param args Command line arguments - not used
*
*/

   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}