import sequences.*;

public class Main {

    public static void main(String[] args) {
        IntegersPrinter printer = new IntegersPrinter();
        IntegersPrinter printerToFile = new IntegersPrinter("integers.txt");

        // Integers
        Integers integers=new Integers();
        printerToFile.print(integers.getSequence(), "Integers");

        // Squares
        Squares squares=new Squares();
        printerToFile.print(squares.getSequence(), "Squares");

        // Primes
        Primes primes=new Primes();
        printerToFile.print(primes.getSequence(), "Primes");

        // Fibonacci sequence
        Fibonacci fib=new Fibonacci();
        printerToFile.print(fib.getSequence(), "Fibonacci sequence");


    }
}