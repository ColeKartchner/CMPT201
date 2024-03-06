import java.util.Scanner;

public class isLeapYear
{
    public static int summation(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
    }

   public static void main(String[] args) {
      int year;
      Scanner fromUser = new Scanner(System.in);
      System.out.print("Enter a year:");
      //int year;
      year = fromUser.nextInt();
      
      if (year % 4 == 0 && year % 100 != 0) {
         System.out.println("Is a Leap Year");
      }
      if (year % 400 == 0) {
         System.out.println("Is a Leap Year");
      }
      else {
         System.out.println("Is not a Leap Year");
      }
   }
}
 

