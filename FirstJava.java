import java.util.Scanner;

public class FirstJava
{
   public static void main(String[] args) {
      Scanner fromUser = new Scanner(System.in);

      // declare variables
      String name;
      String age;
      // prompt user for name
      System.out.print("Hello - please tell me your name:");
      name = fromUser.nextLine();

      // print out greeting
      System.out.println("Hello " + name + " - it is great to meet you!");

      // prompt for the user's age
      System.out.println("How old are you " + name + "?");
      age = fromUser.nextLine();

      // output closing remark 
      System.out.print(age + " is a wonderful age!");
   }
}
  
  