import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static final int MAX = 3000;
    static final int MAX_IN_LINE = 20;
    static final int MAX_LENGTH = getNumberOfDigits(MAX);

    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    public static void main(String[] args) {
        try (FileWriter fr = new FileWriter("output/integers.txt")) {
            for (int i = 1; i <= MAX; i++) {
                for (int j = 0; j < MAX_LENGTH - getNumberOfDigits(i); j++) {
                    fr.write(" ");
                }
                fr.write(i+"");
                if (i < MAX) {
                    fr.write(", ");
                }
                if (i % MAX_IN_LINE == 0) {
                    fr.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Can't open file.");
        }
    }
}