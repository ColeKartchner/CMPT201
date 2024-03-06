/**
 * Starting point for Homework 5 where you will
 * write a method longestQuote() that is passed
 * an array of String objects and it returns
 * the index in the array that contains
 * the longest String.
 */
public class HW5Revised{
   
   // Write the longestQuote() method here
   public static int longestQuote(String[] quotes) {
      int max = quotes[0].length();
      int maxPosition = 0;
            
      int i;
      
       for (i = 0; i < quotes.length; i++) {
            if (quotes[i].length() > max){
               max = quotes[i].length(); 
               maxPosition = i;
            }
   }
      return maxPosition;
} 
   public static void main(String[] args) {
      String[] quotes = new String[5];
      
      quotes[0] = "Only the mediocre are always at their best.";
      quotes[1] = "Why do they call it rush hour when nothing moves?";
      quotes[2] = "One advantage of tallking to yourself if somebody is always listening.";
      quotes[3] = "Between two evils, I always pick the one I've never tried before.";
      quotes[4] = "Get your facts first, then you can distort them later.";
      
      // call the longestQuote() method and output the String containing the longest quote
      int biggest = longestQuote(quotes);
         System.out.println("The longest quote is" + quotes[biggest]);
   }   
}