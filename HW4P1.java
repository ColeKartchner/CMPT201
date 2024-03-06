import java.util.Random;
import java.util.Scanner;
 
public class HW4P1
{
   public static void main(String[] args) {
   Random generator = new Random();
   Scanner fromUser = new Scanner(System.in);
// declare varibles
   double points;
   double inc = 0;
   double ino = 0;

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
   double pi = (inc/points)*4;
System.out.println("\n An estimate of pi is" + pi );
   }      
}