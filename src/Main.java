import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static final int MAX = 3000;
    static final int MAX_IN_LINE = 20;
    static final int MAX_LENGTH = getNumberOfDigits(MAX);
    static final boolean WRITE_TO_FILE = false;

    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    public static void main(String[] args) {
        String out = "";
        for (int i = 1; i <= MAX; i++) {
            for (int j = 0; j < MAX_LENGTH - getNumberOfDigits(i); j++) {
                out += " ";
            }
            out += Integer.toString(i);
            if (i < MAX) {
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