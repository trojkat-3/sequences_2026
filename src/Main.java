import java.util.ArrayList;

public class Main {
    static final int MAX = 3000;

    public static void main(String[] args) {
        IntegersPrinter printer=new IntegersPrinter();
        IntegersPrinter printerToFile=new IntegersPrinter("integers.txt");

        // Integers
        ArrayList<Integer> sequence=new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
            sequence.add(i);
        }
        printerToFile.print(sequence);
        sequence.clear();
        // Squares
        for (int i = 1; i <= MAX; i++) {
            sequence.add(i*i);
        }
        printerToFile.print(sequence);
    }
}