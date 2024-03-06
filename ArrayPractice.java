public class ArrayPractice
{
    public static void main(String[] args) {
       int[] fibonacci = {0,1,1,2,3,5,13,8};
       int largest = maximum(fibonacci);
       int smallest = minimum(fibonacci);
       System.out.println("The largest number is " + largest);
       System.out.println("The smallest number is " + smallest);
    }
    
    public static int maximum(int[] values){
       int max = values[0];
      
       int i;
     
      for (i = 1; i < values.length; i++){
              if (values[i] > max)
                  max = values[i];   
      }
      return max;
   }
   
   public static int minimum(int[] values){
      int min = values[0];
      
       int i;
     
      for (i = 1; i < values.length; i++){
              if (values[i] < min)
                  min = values[i];   
      }
      return min;
   }
}