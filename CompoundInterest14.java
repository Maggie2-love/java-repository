public class CompoundInterest {
    public static void main(String[] args) {

        double principal = 1000.0;

        for (int ratePercent = 5; ratePercent <= 10; ratePercent++) {

            double rate = ratePercent / 100.0;

            System.out.println("\nInterest Rate: " + ratePercent + "%");
            System.out.println("Year\tAmount");

            for (int year = 1; year <= 10; year++) {

                double amount =
                    principal * Math.pow(1.0 + rate, year);

                System.out.printf("%d\t%.2f%n", year, amount);
            }
        }
    }
}
