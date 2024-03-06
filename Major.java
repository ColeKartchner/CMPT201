public class Major
{
   private String name;
   private int numberOfMajors;
   private double averageGPA;
   
   public Major(String n, int num, double avg) {
      name = n;
      numberOfMajors = num;
      averageGPA = avg;
   }
   
   
   public boolean equals(Object other) {
      
       Major otherMajor = (Major)other;
      
      // two circles are considered equal if they have the same radius
      if (this.numberOfMajors == otherMajor.numberOfMajors && this.averageGPA == otherMajor.averageGPA) {
         return true;
      }
      else {
         return false;
      }
   }
}