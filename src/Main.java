import java.util.ArrayList;

public class Main {
    static final int MAX = 3000;

    private static boolean isPrime(int p) {
        if (p < 2) {
            return false;
        }
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int fibonacci(int n, ArrayList<Integer> fib) {
        if (n < fib.size()) {
            return fib.get(n);
        }
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1, fib) + fibonacci(n - 2, fib);
        }
    }

    public static void main(String[] args) {
        IntegersPrinter printer = new IntegersPrinter();
        IntegersPrinter printerToFile = new IntegersPrinter("integers.txt");

        // Integers
        ArrayList<Integer> sequence = new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
            sequence.add(i);
        }
        printerToFile.print(sequence, "Integers");
        sequence.clear();

        // Squares
        for (int i = 1; i * i <= MAX; i++) {
            sequence.add(i * i);
        }
        printerToFile.print(sequence, "Squares");
        sequence.clear();

        // Primes
        int p = 1;
        while (p <= MAX) {
            if (isPrime(p)) {
                sequence.add(p);
            }
            p++;
        }
        printerToFile.print(sequence, "Primes");
        sequence.clear();

        // Fibonacci sequence
        int i=0;
        int f;
        while ((f=fibonacci(i,sequence))<=MAX) {
            sequence.add(f);
            i++;
        }
        printerToFile.print(sequence, "Fibonacci sequence");


    }
}