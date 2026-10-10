public class TrianglePattern3 {
    public static void main(String[] args) {
    
    for (int row = 10; row >= 1; row--) {

    for (int space = 1; space <= 10 - row; space++) {
        System.out.print(" ");
    }

    for (int star = 1; star <= row; star++) {
        System.out.print("*");
    }

    System.out.println();
       }

   }

}
