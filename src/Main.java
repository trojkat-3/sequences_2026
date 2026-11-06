import sequences.*;

public class Main {

    public static void main(String[] args) {
        IntegersPrinter printer = new IntegersPrinter();
        IntegersPrinter printerToFile = new IntegersPrinter("integers.txt");

        // Integers
        printerToFile.print(new Integers());

        // Squares
        Sequence squares=new Squares();
        printerToFile.print(squares);

        // Primes
        Sequence primes=new Primes();
        printerToFile.print(primes);

        // Fibonacci sequence
        Sequence fib=new Fibonacci();
        printerToFile.print(fib);


    }
}