public class SavingsAccount extends BankAccount
{
   private double interestRate;
   
   public double calculateInterest(double b, int a, double ir) {
      super(b, a);
      
      interestRate = ir;
      
      interest = balance * interestRate;
      return interest;
   }
   
   public void depositInterest() {
      balance = balance + interest;
   }
   
   public String toString() {
      return super.toString() + " Interest Earned: " + interest;
   }
}
   
   