public class UseCircle
{
   public static void main(String[] args) {
   
      /**
       * Create two Circle objects c1 and c2
       * use the constructor that sets the radius to a
       * specfified value and the other that uses the
       * "default" constructor with a radius of 0.
       */
       
      Circle c1, c2;

      c1 = new Circle(15);
      c2 = new Circle();
      c2.setRadius(15);
      
      if (c1.equals(c2)) {
         System.out.println("The two circles are equal");
      }
      else {
         System.out.println("The two circles are not equal");
      }
      
   }
}