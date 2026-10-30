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

    public static void main(String[] args) {
        //System.out.println(isPrime(1021));

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

    }
}