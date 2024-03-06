public class Circle extends Shape
{
   private double radius;
   
   public Circle(int x, int y, double r) {
      super(x,y);
      
      radius = r;
   }
   
   public double getPerimeter() {
      // the perimeter of a circle is its circumference
      
      return 2 * Math.PI * radius;
   }
   
   public double getArea() {
      return Math.PI * radius * radius;
   }
   
   public String toString() {
      return "A circle at " + super.toString() + " with radius = " + radius;
   }
}