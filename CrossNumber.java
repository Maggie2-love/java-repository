import java.util.Scanner;
public class CrossNumber{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter  first number:");
    int numberone =input.nextInt();
     System.out.print("Enter second number:");
int numbertwo =input.nextInt();


numberone = numberone + numbertwo;
numbertwo = numberone - numbertwo;
numberone = numberone - numbertwo;
System.out.println(numberone);
System.out.println(numbertwo);


}


}
