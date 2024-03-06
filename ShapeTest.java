import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ShapeTest 
{

   @Test
   public void testCircle() {
      Shape c1 = new Circle(5,10, 35);
   
      // the perimeter/circumference of a circle with radius 35 should be 219.91   
      assertEquals(219.91, c1.getPerimeter(), 0.01);
      
      // the area of a circle with radius 35 should be 3848.45  
      assertEquals(3848.45, c1.getArea(), 0.01);
   }
   
   @Test
   public void testRectangle() {
      Shape r1 = new Rectangle(5,10, 10, 12);
      
      // the perimeter of a rectangle with with sides of length 10 and 12 should be 44  
      assertEquals(44.0, r1.getPerimeter(), 0.01);
      
      // the area of a rectangle with with sides of length 10 and 12 should be 120 
      assertEquals(120.0, r1.getArea(), 0.01);
   }
   
   @Test
   public void testTriangle() {
      Shape t1 = new Triangle(5,10, 4, 13, 15);
      
      // the perimenter of a triangle with sides of length 4, 13, and 15 should be 32
      assertEquals(32.0, t1.getPerimeter(), 0.01);
      
      // the area of a triangle with sides of length 4, 13, and 15 should be 24
      assertEquals(24.0, t1.getArea(), 0.01);
   }
   
}