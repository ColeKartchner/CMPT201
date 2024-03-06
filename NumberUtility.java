public class NumberUtility
{
   private int number1;
   private int number2;
   
   public NumberUtility(int n1, int n2) {
      number1 = n1;
      number2 = n2;
   }
   
   
   // returns the larger of the two numbers
   public int larger() {
      if (number1 > number2) {
         return number1;
      }
      else {
         return number2;
      }
   }
   
   // returns the smaller of the two numbers 
   public int smaller() {
      if (number1 < number2) {
         return number1;
      }
      else {
         return number2;
      }
  }
   
   
   // returns true if the two numbers are both odd
   public boolean areEven() {
      if ( (number1 % 2 == 0) && (number2 % 2 == 0) ) {
         return true;
      }
      else {
         return false;
      }
   }
}
      