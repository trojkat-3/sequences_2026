import Printers.PrinterFile;
import Printers.PrinterStdOut;
import exceptions.CantDecomposeException;
import exceptions.OutOfBoundsException;
import sequences.*;

public class Main {

    public static void main(String[] args) {
        PrinterStdOut printer = new PrinterStdOut();
        PrinterFile printerToFile = new PrinterFile("integers.txt");

        // Integers
        printerToFile.print(new Integers());

        // Squares
        Sequence squares = new Squares();
        squares.setMax(10000);
        printerToFile.print(squares);
        try {
            printer.printDecomposition(squares.decompose(4500));
            //System.out.println(squares.decompose(4500));
        } catch (CantDecomposeException e) {
            throw new RuntimeException(e);
        }

        // Primes
        Sequence primes = new Primes();
        printerToFile.print(primes);
        try {
            System.out.println(primes.getSum(100));
            printer.printDecomposition(primes.decompose(2025));
            printer.printDecomposition(primes.decompose(44));
        } catch (CantDecomposeException ex) {
            System.out.println(ex.getMessage());
            // ex.printStackTrace();
        } catch (OutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }
        // Arithmetic sequence
        Sequence a=new Arithmetic(2,7);
        printerToFile.print(a);
        try {
            System.out.println(a.getSum(2000));

        } catch (OutOfBoundsException ex){
            System.out.println("This should never happen!");
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