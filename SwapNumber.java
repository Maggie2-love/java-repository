import java.util.Scanner;
public class NumberSwap{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter firstnumber: ");
int firstnumber = input.nextInt();
System.out.print("Enter secondnumber: ");
int secondnumber = input.nextInt();


firstnumber = firstnumber + secondnumber;
secondnumber = firstnumber- secondnumber;
firstnumber = firstnumber - secondnumber;
System.out.println(firstnumber);
System.out.println(secondnumber);

}

}
