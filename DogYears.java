import java.util.Scanner;

public class DogYears
{
   public static void main(String[] args) {
      Scanner fromUser = new Scanner(System.in);

      // declare variables
      String name;
      int year;
      int when;
      int age;
      int dog;
      // prompt for the dog's name
      System.out.print("What is the dog's name?");
      name = fromUser.nextLine();

      // prompt for the current year
      System.out.print("What is the current year?");
      year = fromUser.nextInt();

      // prompt for the dog's birth year
      System.out.print("What year was your dog born?");
      when = fromUser.nextInt();
 
      age = year - when;
      dog = age*7;

      // output the age in dog years  
      System.out.println(name + " is " + dog + " old in dog years.");
   }
}
  
  