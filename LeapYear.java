import java.util.Scanner;

public class LeapYear
{
   public static void main(String[] args) {
      int year;
      Scanner fromUser = new Scanner(System.in);
      System.out.print("Enter a year:");
      //int year;
      year = fromUser.nextInt();
      
      if (year % 4 == 0 && year % 100 != 0) {
         System.out.println("Is a Leap Year");
      }
      else {
         System.out.println("Is not a Leap Year");
      }
   }
}