public class BankAccount
{
   private double balance;
   private int accountNumber;
   
   public BankAccount(double b, int a) {
      balance = b;
      accountNumber = a;
   }
   
   public void setBalance(double b) {
      balance = b;
   }
   
   public double getBalance() {
      return balance;
   }
   
   public void deposit(double amount) {
      balance = balance + amount;
   }
   
   public boolean withdraw(double amount) {
      if (amount < balance) {
         balance = balance - amount;
         return true;
         }
       else {
         return false;
         }
   }
   
   public String toString() {
      return "Account number: " + accountNumber + " Balance: " + balance;
   }
}