import java.util.Random;
import java.util.Scanner;

public class collatzSequenceLength

public static int collatzSequenceLength(int n)
{
   public static void main(String[] args) {
      Random generator = new Random();
      Scanner fromUser = new Scanner(System.in);
      int N;
      
      System.out.print("Enter a value for Collatz:");
      N = fromUser.nextInt();        
      int counter = 0;
      while (N != 1) {
         
         if (N % 2 == 0)
            N = N / 2;
         else
            N = 3 * N + 1;
      counter++;
      }
      System.out.println(counter + 1);
   }
}