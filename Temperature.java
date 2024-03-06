public class Temperature
{    
   private double temp;
   private char scale;
   
   
   public Temperature(){
      temp=0;
      scale = 'C';
      
   }  
   public Temperature(double t,char s){ 
      temp = t;
      scale = s;      
   } 
   public Temperature(double t){
      temp = t;
      scale = 'C';
   }
   public void setTemperature(double t){
      temp = t;  
   }
   public void setScale(char s){
      scale = s;
   }
   public double getTemperature(){
      return temp;
   }
   public char getScale(){
      return scale;
   }
   private double getConversion(double t, char s){
      if (s == 'C'){
         t = t *(9.0/5.0) + 32.0;
      }
      else{
         t = (t - 32.0)*(5.0/9.0);      
      }
      return t;
   }
   
   public String toString() {
      String result = "The temperature is " + temp + " and the scale was" + scale;
      
      return result;
   }
     
   public boolean equals(Object other){
      
      Temperature otherTemperature = (Temperature)other;
      
      
      if (this.temp == otherTemperature.temp) {
         return true;
      }
      else {
         return false;
      }
   }
}