import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
*
*A class that tests certain methods of the class BankLoan.
*
*Activity_08A
*@author Tanner Bonds - COMP 1210
*@version 10-29-17
*
*/

public class BankLoanTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /**
   *
   *Test of chargeInterest.
   *
   */


   @Test public void chargeInterestTest() {
   
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }


   

}
