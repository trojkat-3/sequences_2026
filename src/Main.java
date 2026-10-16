import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static final int MAX = 3000;

    public static void main(String[] args) {
        IntegersPrinter printer=new IntegersPrinter();

        // Integers
        ArrayList<Integer> sequence=new ArrayList<>();
        /*for (int i = 1; i <= MAX; i++) {
            sequence.add(i);
        }*/
        // Squares
        for (int i = 1; i <= MAX; i++) {
            sequence.add(i*i);
        }
        printer.print(sequence);
    }
}