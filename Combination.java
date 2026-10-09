public class Combination {

    public static long factorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static long combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    } 
 public static void main(String[] args) {

        long answer = combination(7, 5);

        System.out.println("7C5 = " + answer);
    }
   
}
