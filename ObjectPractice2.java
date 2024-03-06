import java.util.Random;
import java.awt.Color
public class ObjectPractice2 {

   public static void main(String[] args) {
      
      World forest;             
      Turtle david; 
      int length; 
      
   // create objects
      forest = new World();     
      david = new Turtle(forest);
      Color c = new Color(rgb);
      
      length = 80;
      
      for (int i = 0; i < 12; i++) {
         
         david.turn(-30);  
         david.forward(length);
         david.turn(180);
         david.forward(length);
         david.turn(180);
         setColor(c)
      }
      david.penUp();
      david.forward(length);
      david.forward(length);
   }
}