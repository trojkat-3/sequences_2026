import exceptions.CantDecomposeException;
import exceptions.OutOfBoundsException;
import sequences.*;

public class Main {

    public static void main(String[] args) {
        IntegersPrinter printer = new IntegersPrinter();
        IntegersPrinter printerToFile = new IntegersPrinter("integers.txt");

        // Integers
        printerToFile.print(new Integers());

        // Squares
        Sequence squares = new Squares();
        squares.setMax(10000);
        printerToFile.print(squares);
        try {
            System.out.println(squares.decompose(4500));
        } catch (CantDecomposeException e) {
            throw new RuntimeException(e);
        }

        // Primes
        Sequence primes = new Primes();
        printerToFile.print(primes);
        try {
            System.out.println(primes.getSum(500));
            System.out.println(primes.decompose(2025));
            System.out.println(primes.decompose(44));
        } catch (CantDecomposeException ex) {
            System.out.println(ex.getMessage());
            // ex.printStackTrace();
        } catch (OutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }


        // Fibonacci sequence
        Sequence fib = new Fibonacci();
        fib.setMax(100000);
        printerToFile.print(fib);

        fib = new Fibonacci(-3, 2);
        fib.setMax(100000);
        printerToFile.print(fib);

    }
}