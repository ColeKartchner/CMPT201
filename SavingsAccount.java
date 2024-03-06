public class SavingsAccount extends BankAccount
{
   private double interestRate;
   
   public SavingsAccount(double b, int a, double ir) {
      super(b, a);
      
      interestRate = ir;
   }
   
   public double calculateInterest() {
      double interest = super.getBalance() * interestRate;
      return interest;
   }
   
   public void depositInterest() {
      super.setBalance(super.getBalance() + calculateInterest());
   }
   
   public String toString() {
      return super.toString() + " Interest Earned: " + calculateInterest();
   }
}
   
   