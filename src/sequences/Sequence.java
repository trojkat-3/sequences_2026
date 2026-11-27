package sequences;

import exceptions.CantDecomposeException;
import exceptions.OutOfBoundsException;

import java.util.ArrayList;
import java.util.Collections;

abstract public class Sequence {

    protected int max = 1000;

    public void setMax(int max) {
        this.max = max;
        sequence.clear();
        initialize();
    }

    protected String name;
    protected ArrayList<Integer> sequence = new ArrayList<>();

    public Sequence(String name) {
        this.name = name+", MAX: "+max;
    }

    abstract void initialize();

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    public int getSum(int n) throws OutOfBoundsException {
        if (n>sequence.size()){
            throw new OutOfBoundsException(n, name);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sequence.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> decompose(int n)
            throws CantDecomposeException {
        int nSrc = n;
        ArrayList<Integer> sqDesc = new ArrayList<>(sequence);
        Collections.sort(sqDesc, Collections.reverseOrder());
        ArrayList<Integer> ret = new ArrayList<>();
        int i = 0;
        while (n > 0 && i < sqDesc.size()) {
            if (sqDesc.get(i) <= n) {
                ret.add(sqDesc.get(i));
                n -= sqDesc.get(i);
            } else {
                i++;
            }
        }
        if (n > 0) {
            throw new CantDecomposeException(nSrc, name);
        }
        return ret;
    }
}
