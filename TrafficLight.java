import java.util.Scanner;
public class TrafficLight{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter any color:");
    String color=input.next();
    
    if(color.equalsIgnoreCase("Green")){
    
    System.out.println("Go");
    } 
    else
    
    if(color.equalsIgnoreCase("Yellow")){
    
    System.out.println("Get ready");
    } 
    else
    
    if(color.equalsIgnoreCase("Red")){
    
    System.out.println("Stop");
    } 
    else
     System.out.println("Invalid");
    
    }
    
    }
