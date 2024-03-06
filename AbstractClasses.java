public class AbstractClasses
{
   public static void main(String[] args) {
   	  // Circle "is-a" Shape
      Shape c1 = new Circle(5,10, 3);
      Shape r1 = new Rectangle(5,10, 3, 8);
      Shape t1 = new Triangle(5,10, 4, 6, 4);
      
      System.out.println(c1);
      System.out.println("Area = " + c1.getArea());
      System.out.println("Perimeter = " + c1.getPerimeter());
      
      System.out.println(r1);
      System.out.println("Area = " + r1.getArea());
      System.out.println("Perimeter = " + r1.getPerimeter());
      
      System.out.println(t1);
      System.out.println("Area = " + t1.getArea());
      System.out.println("Perimeter = " + t1.getPerimeter());
   }
}