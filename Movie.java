public class Movie
{
   private String Title;
   private int YearOfRealease;
   private double BoxOfficeRevenue;
   
   
    public Movie(String t, int year, double rev) {
      Title = t;
      YearOfRealease = year;
      BoxOfficeRevenue = rev;
   }

      public String toString() {
      String result =  "Movie :" + Title + " Released :" + YearOfRealease + " Revenue (in millions)" + BoxOfficeRevenue;
      
      return result;
   }

}