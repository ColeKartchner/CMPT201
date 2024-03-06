import java.util.Random;

public class SumOfArray
{
   public static void main(String[] args) {
      int[] fibonacci = {0,1,1,2,3,5,8,13};
      
      int[] random = new int[10];
      
      fillArray(random);
      
      for (int i = 0; i < random.length; i++) {
         System.out.println(random[i]);
      }
      //sum(addition);
      
   }


// populate an array of double values with random values
  
   public static void fillArray(int[] values) {
      Random gen = new Random();
      
      for (int i = 0; i < values.length; i++) {
         values[i] = gen.nextInt();
      }
   }
}
 // public static int sum(int[] values) {
   public static int sum(int n) {
        int total = 0;

        for (int i = 1; i <= n; i++) {
            total += i;
        }

        return total;
   
   
//}
