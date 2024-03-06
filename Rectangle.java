public class Rectangle extends Shape
{
   private double height;
   private double width;
   
   public Rectangle(int x, int y, double h, double w) {
      // call the constructor in the parent/super class
      super(x,y);
      
      height = h;
      width = w;
   }
   
   public  double getArea() {
      return height * width;
   }
   
   public  double getPerimeter() {
      return (height * 2) + (width * 2);
   }
   
   public String toString() {
      return "A rectangle at " + super.toString() + " with height = " + height + " and width = " + width;
   }
}