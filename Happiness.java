// write a method that collects 2 numbers >76.2, between 50 and 76.2, <50

public class Happiness{
public static String averageOf(double a, double b){
double sum = a + b;
double average = sum / 2; 
if(average > 76.2){
  return "Proficient";
  }
else if(average >= 50 &&average <= 76.2){
  return "You are getting there";
  }
else {
  return "Get better";
  }
 } 
  public static void main(String[] args){
System.out.println(averageOf(70,30.0 ));
}
}
