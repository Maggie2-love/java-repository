import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    int[] numbers={2,7,11,15};
    System.out.print("Enter target: ");
    int target = input.nextInt();
    
    for(int i=0; i<numbers.length; i++){
    for(int j=1; j<numbers.length; j++){
   
    if(numbers[i]+ numbers[j] == target){
    
    System.out.println("The two numbers are: " + numbers[i] + "and" + numbers[j]);
    
    System.out.println("Their indexes are: " + i + "and" + j);
    }
    
    }
    
    }
     
    }
    
    }
