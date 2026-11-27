package Printers;

import sequences.Sequence;

import java.util.ArrayList;
import java.util.Collections;

public abstract class AbstractPrinter {
    static final int MAX_IN_LINE = 12;

    private int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    abstract void output(String str);

    public String print(Sequence sq){
        ArrayList<Integer> sequence=sq.getSequence();
        String out ="------ "+ sq.getName()+" ------\n";
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
            if (i % MAX_IN_LINE == 0 && i< sequence.size()) {
                out += "\n";
            }
        }
        out += "\n";
        output(out);
        return out;
    }
}
