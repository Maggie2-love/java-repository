public static long factorialOf(int number) {

    long factorial = 1;

    for (int count = 1; count <= number; count++) {

        factorial = factorial * count;
    }

    return factorial;
}
