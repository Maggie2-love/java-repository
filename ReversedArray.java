public class ReversedArray{
   public static void main(String [] args){
    int [][] reverseNumber = {{1,2,3}, {4,5,6}, {7,8,9}};
                                    
   
                             
            for(int row = 0; row<reverseNumber.length; row++){
            for(int index = 0; index <reverseNumber[row].length; index++){
            for(int column =0; column<reverseNumber[row].length; column++){
            
                if(reverseNumber[row][column] < reverseNumber[row][index]){
                int temp = reverseNumber[row][column];
                reverseNumber[row][column]=reverseNumber[row][index];
                reverseNumber[row][index] = temp;
              }
            }
          }
         }
         
        for(int index = 0; index<reverseNumber.length; index++){
        for(int count = 0; count<reverseNumber[index].length; count++){
            
              
              System.out.print(reverseNumber[index][count] + "   ");
          }
        System.out.println(); 
        } 
       
      }
   }
