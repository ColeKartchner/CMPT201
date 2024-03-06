import java.util.Random;
import java.util.Scanner;

public class HW3
{
   public static int collatzSequenceLength(int n) {
      int counter = 1;
      while (n != 1) {
        counter++;
         
         if (n % 2 == 0)
            n = n / 2;
         else
            n = 3 * n + 1;
      }
      return counter;
   }

   public static void main(String[] args) {
      Random generator = new Random();
      Scanner fromUser = new Scanner(System.in);
      int N;
      
      System.out.print("Enter a value for Collatz:");
      N = fromUser.nextInt();        
      int result = collatzSequenceLength(N);
      System.out.println(result);
   }
}