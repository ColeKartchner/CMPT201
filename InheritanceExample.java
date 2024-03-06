public class InheritanceExample
{
   public static void main(String[] args) {
      // we can create a Person
      
      Person marie = new Person("Marie", 22);
      
      Student isabel = new Student("Isabel", 20, 2171335, "Computer Science");
      
      // we can call a method that the Student class inherits from the parent class
      System.out.println(isabel.getAge());
      
      System.out.println(isabel);
   }
}