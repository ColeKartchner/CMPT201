public abstract class Shape
{
   // All shapes have an (x,y) coordinate
   private int x;
   private int y;
   
   // extended classes all inherit these methods
   public Shape(int xValue, int yValue) {
      x = xValue;
      y = yValue;
   }
   
   public void setX(int xValue) {
      x = xValue;
   }
   
   public void setY(int yValue) {
      y = yValue;
   }
   
   public int getX() {
      return x;
   }
   
   public int getY() {
      return y;
   }
   
   public String toString() {
      return "(" + x + "," + y + ")";
   }
   
   
   // extended classes *must* implement the following methods
   public abstract double getArea();
   
   public abstract double getPerimeter();
}
   
   