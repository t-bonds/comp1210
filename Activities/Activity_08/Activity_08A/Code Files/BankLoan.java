/**
*
*A program to determine bank loans using static methods.
*
*Activity_08A
*@author Tanner Bonds - COMP 1210
*@version 10-29-17
*
*/

public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0;
   
   /**
   *
   *Constructor to take in variables.
   *
   *@param customerNameIn used
   *@param interestRateIn used
   *
   */
   

   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

   /**
   *
   *Returns a boolean showing if the user has taken out a loan.
   *
   *@param amount used
   *@return wasLoanMade
   *
   */

   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

   /**
   *
   *Returns a double showing how much the user has paid the bank.
   *
   **@param amountPaid used
   *@return payBank
   *
   */

   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
   /**
   *
   *Returns the balance.
   *
   *@return balance
   *
   */
   
   public double getBalance() {
      return balance;
   }
   
   /**
   *
   *Returns a boolean setting the interest rate.
   *
   *@param interestRateIn used
   *@return setInterestRate
   *
   */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
   /**
   *
   *Returns the interest rate.
   *
   *@return interestRate
   *
   */
   
   public double getInterestRate() {
      return interestRate;
   }
   
   /**
   *
   *Calculates the interest of the loan.
   *
   */
   
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
   /**
   *
   *Returns a boolean determining if the loan is valid.
   *
   *@param amount used
   *@return isAmountValid
   *
   */
   
   public static boolean isAmountValid(double amount) {
   
      return amount >= 0;
   }
   
   /**
   *
   *Returns a boolean determining if the user is in debt.
   *
   *@param loan used
   *@return isInDebt
   *
   */
   
   public static boolean isInDebt(BankLoan loan) {
   
      if (loan.getBalance() > 0) {
      
         return true;
      
      }
      return false;
   
   
   }
   
   /**
   *
   *Returns the number of loans that have been created.
   *
   *@return loansCreated
   *
   */
         
   public static int getLoansCreated() {
   
      return loansCreated;
   
   }
   
   
   /**
   *
   *Resets the number of loans to 0.
   *
   */
   
   public static void resetLoansCreated() {
   
      loansCreated = 0;
   
   
   }
   
   
   /**
   *
   *Returns a string summary of all loan information.
   *
   *@return output
   *
   */

   
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
