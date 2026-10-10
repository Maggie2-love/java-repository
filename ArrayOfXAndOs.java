import java.util.Scanner;

public class ArrayOfXandOs{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] game = new int[3][3];
        
        
        
      for(int row = 0; row < 3; row++){
      for(int column = 0; column < 3; column++){

        System.out.print("Enter character (x or o): ");
        char character = input.next().charAt(0);



if (character == 'x') {
            game[row][column] = 1;
        } else if (character == 'o') {
            game[row][column] = 0;
        }
      }
  }
      System.out.println("\nArray:");  
      for(int row = 0; row < 3; row++){
      for(int column = 0; column < 3; column++){
        
         System.out.print(game[row][column] + " ");      
           
        }
     System.out.println();   
        
}
        }
    
    }
