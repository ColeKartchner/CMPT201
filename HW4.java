import java.util.Random;
import java.util.Scanner;
 
public class HW4
{
   public static void main(String[] args) {
   Random generator = new Random();
   Scanner fromUser = new Scanner(System.in);
// declare varibles
   int points;
   int inc = 0;
   int ino = 0;

   System.out.print("How many points would you like to generate?: \n");
   points = fromUser.nextInt();
   for (int i = 0; i < points; i++) {
      double x = Math.random();
      double y = Math.random();

   double test = Math.sqrt(x*x + y*y);
      if (test<=1){ 
         inc++;
      }
      else{
         ino++;  
      }
}
System.out.println("\n" + inc + " points were within the quarter circle");
System.out.println(ino + " points were outside the quarter circle");
   }      
}