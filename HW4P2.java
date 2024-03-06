import java.util.Random;
import java.util.Scanner;

public class HW4P2{

   public static double estimatepi(int n){
      double inc = 0;
      double ino = 0;
      double pi;
      for (double i = 0; i < n; i++) {
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
   
      pi = 4*(inc/n);
      return pi;
   }

   public static void main(String[] args) {
      Random generator = new Random();
      Scanner fromUser = new Scanner(System.in);
    // declare varibles
      int points;
      double pi;
   
      System.out.print("How many points would you like to generate?: \n");
      points = fromUser.nextInt();
      
      pi = estimatepi(points);
      
      System.out.println("An estimate of pi is " + pi);
   
   }      
}
 

