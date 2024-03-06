public class CheckingAccount extends BankAccount
{
   private int withdrawalCount = 0;
   public static final int WITHDRAWAL_LIMIT = 10;
   
   public CheckingAccount(double b, int a) {
      super(b, a);
   }
   
    public boolean withdraw(double amount) {
      if (super.withdraw(amount) == true) {
         withdrawalCount = withdrawalCount + 1;
         return true;
         }
      else {
         return false;
         }
   }
   
   public void deductFees() {
      super.setBalance(super.getBalance() - 2.50);
   }
   
   public String toString() {
      return super.toString() + " Amount deducted : " + withdrawalCount();
   }
}
   
   