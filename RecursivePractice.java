import java.util.Scanner;

public class RecursivePractice { 
   // recursive elbow-bump method
   public static int elbowBump(int p) {
      if (p < 2) {
      return 0;
      }
     
      if (p == 2) {
         return 1;
      }
      else {
         int result = (p-1) + elbowBump(p-1);
         
         return result;
   }
}
         
    
   public static void main(String[] args) {
      Scanner fromUser = new Scanner(System.in);
     
      System.out.print("How many people are in the room? ");
      int people = fromUser.nextInt();
      
      int bumps = elbowBump(people);
      
      System.out.println("For " + people + " people there are " + bumps + " elbow bumps.");
      
      }
}  