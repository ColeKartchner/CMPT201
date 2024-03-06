
public class HW6_GrayScale
{
   public static void main(String[] args) {
      String fileName = FileChooser.pickAFile();
      Picture pict = new Picture(fileName);
      pict.explore();
      
      // get the individual pixels for the image
      Pixel[] pixels = pict.getPixels();
      
      // set each pixel to a gray scale
      for (int i = 0; i < pixels.length; i++) {
            int green = pixels[i].getGreen();
            int blue = pixels[i].getBlue();
            int red = pixels[i].getRed();
            
            int avg = (green + blue + red)/3;
            
            pixels[i].setGreen(avg);
            pixels[i].setBlue(avg);
            pixels[i].setRed(avg);
         }
      //       
      // redraw the picture with the changes
      pict.repaint();
   }
}