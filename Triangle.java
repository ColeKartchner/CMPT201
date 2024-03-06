import java.lang.Math;

public class Triangle extends Shape 
{
   private double sideA;
   private double sideB;
   private double sideC;
   private double s;
   
   public Triangle(int x, int y, double a, double b, double c) {
      // call the constructor in the parent/super class
      super(x,y);
      
      sideA = a;
      sideB = b;
      sideC = c;
      
   }
   
   public double getArea() {
      // return the area of the triangle using Heron's algorithm
      s = ((sideA + sideB + sideC)/2);
      return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
   }
   
   public double getPerimeter() {
      return sideA + sideB + sideC;
   }
   
   public String toString() {
      return "A triangle at " + super.toString() + " where side a = " + sideA + " and side b = " + sideB + " and side b = " + sideC;
   }
}