
public class HW6_NegateRevised 
{
   public static void main(String[] args) {
      String fileName = FileChooser.pickAFile();
      Picture pict = new Picture(fileName);
      pict.explore();
      
      // get the individual pixels for the image
      Pixel[] pixels = pict.getPixels();
      
      // negate each pixel
      for (int i = 0; i < pixels.length; i++) {
            int green = pixels[i].getGreen();
            
            green = 255 - green;
            
            pixels[i].setGreen(green);
         }
      for (int i = 0; i < pixels.length; i++) {
            int red = pixels[i].getRed();
            
            red = 255 - red;
            
            pixels[i].setRed(red);
         }
      for (int i = 0; i < pixels.length; i++) {
            int blue = pixels[i].getBlue();
            
            blue = 255 - blue;
            
            pixels[i].setBlue(blue);
         }
      // redraw the picture with the changes
      pict.repaint();
   }
}