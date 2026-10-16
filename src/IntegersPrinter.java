import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class IntegersPrinter {

    static final int MAX_IN_LINE = 20;
    static final boolean WRITE_TO_FILE = false;

    private int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    void print(ArrayList<Integer> sequence){
        String out = "";
        for (int i = 1; i <= sequence.size(); i++) {
            int n=sequence.get(i-1);
            int maxLength=getNumberOfDigits(Collections.max(sequence));
            for (int j = 0; j < maxLength - getNumberOfDigits(n); j++) {
                out += " ";
            }
            out += Integer.toString(n);
            if (i < sequence.size()) {
                out += ", ";
            }
            if (i % MAX_IN_LINE == 0) {
                out += "\n";
            }
        }
        if (WRITE_TO_FILE) {
            try (FileWriter fr = new FileWriter("output/integers.txt")) {
                fr.write(out);
            } catch (IOException e) {
                System.out.println("Can't open file.");
            }
        } else {
            System.out.println(out);
        }
    }
}
