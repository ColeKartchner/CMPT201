import java.util.Random;
import java.util.Scanner;

public class Collatz
{
   public static void main(String[] args) {
      Random generator = new Random();
      Scanner fromUser = new Scanner(System.in);
      int N;
      
      System.out.print("Enter a value for Collatz:");
      N = fromUser.nextInt();        
      while (N != 1) {
         System.out.println(N);
         
         if (N % 2 == 0)
            N = N / 2;
         else
            N = 3 * N + 1;
      }
      System.out.println(N);
   }
}