public class UseTemperature
{
   public static void main(String[] args) {
      
      Temperature t1 = new Temperature(100);
      Temperature t2 = new Temperature(212);
      
      if (t1.equals(t2)) {
         System.out.println("The two temperatures are equal");
      }
      else {
         System.out.println("The two temperatures are not equal");
      }
      
   }
}